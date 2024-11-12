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

@Service
public class ServicioCita {

    private final CitaDAO citaDAO;
    private final RegistroCitaRules registroCitaRules;

    public ServicioCita() {
        citaDAO = new CitaDAO();
        registroCitaRules = new RegistroCitaRules();
    }


    public ArrayList<CitaDTO> obtenerCitas() throws SQLException {
        ArrayList<CitaEntity> citasEntity = citaDAO.obtenerTodasLasCitas();
        return CitaMapper.ConvertListFromEntity(citasEntity);
    }


    public void actualizarEstadoCita(CitaDTO citaDTO, String nuevoEstado) throws InvalidFieldFormatException, SQLException {
        registroCitaRules.actualizarEstado(citaDTO, nuevoEstado);


        CitaEntity citaEntity = CitaMapper.ConvertFromDTO(citaDTO);
        citaDAO.actualizarEstado(citaEntity);
    }
}
