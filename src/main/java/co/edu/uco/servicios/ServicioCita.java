package co.edu.uco.servicios;

import co.edu.uco.DAO.CitaEntity;
import co.edu.uco.DAO.postgres.CitaDAO;
import co.edu.uco.DTO.CitaDTO;
import co.edu.uco.usecase.rules.RegistroCitaRules;
import co.edu.uco.usecase.exceptions.InvalidFieldFormatException;
import co.edu.uco.utilidades.mappers.CitaMapper;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;

@Service // Colocamos la anotación aquí, a nivel de clase
public class ServicioCita {

    private final CitaDAO citaDAO;
    private final RegistroCitaRules registroCitaRules;

    public ServicioCita() {
        citaDAO = new CitaDAO();
        registroCitaRules = new RegistroCitaRules(); // Inicia las reglas
    }

    // Método para obtener todas las citas
    public ArrayList<CitaDTO> obtenerCitas() throws SQLException {
        ArrayList<CitaEntity> citasEntity = citaDAO.obtenerTodasLasCitas();
        return CitaMapper.ConvertListFromEntity(citasEntity);
    }

    // Método para actualizar el estado de una cita
    public void actualizarEstadoCita(CitaDTO citaDTO, String nuevoEstado) throws InvalidFieldFormatException, SQLException {
        // Aplicamos las reglas para actualizar el estado
        registroCitaRules.actualizarEstado(citaDTO, nuevoEstado);

        // Convertimos el DTO a Entity y persistimos el cambio en la base de datos
        CitaEntity citaEntity = CitaMapper.ConvertFromDTO(citaDTO); // Convertimos el DTO a entidad
        citaDAO.actualizarEstado(citaEntity); // Llamamos a la función de DAO para persistir el cambio
    }
}
