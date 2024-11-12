package co.edu.uco.servicios;

import co.edu.uco.DAO.postgres.RegistroEstadoCitaDAO;
import co.edu.uco.DAO.RegistroEstadoCitaEntity;
import co.edu.uco.DTO.RegistroEstadoCitaDTO;
import co.edu.uco.utilidades.mappers.RegistroEstadoCitaMapper;

import java.sql.SQLException;

public class ServicioRegistroEstadoCita {
    private RegistroEstadoCitaDAO registroEstadoCitaDAO;
    public ServicioRegistroEstadoCita() throws SQLException {
        registroEstadoCitaDAO = new RegistroEstadoCitaDAO();
    }
    public void asignarEstadoCita(RegistroEstadoCitaDTO registroEstadoCitaDTO) throws SQLException {
        RegistroEstadoCitaEntity entity = RegistroEstadoCitaMapper.ConvertFromDTO(registroEstadoCitaDTO);
        registroEstadoCitaDAO.crear(entity);
    }
}
