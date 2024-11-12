package co.edu.uco.servicios;

import co.edu.uco.DAO.postgres.RegistroEstadoCitaDAO;
import co.edu.uco.DAO.RegistroEstadoCitaEntity;
import co.edu.uco.DTO.RegistroEstadoCitaDTO;
import co.edu.uco.usecase.exceptions.RegistroEstadoCitaException;
import co.edu.uco.usecase.responses.AsignarEstadoCitaRes;
import co.edu.uco.utilidades.mappers.RegistroEstadoCitaMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.sql.SQLException;
import java.util.ArrayList;

public class ServicioRegistroEstadoCita {
    private RegistroEstadoCitaDAO registroEstadoCitaDAO;
    public ServicioRegistroEstadoCita() throws SQLException {
        registroEstadoCitaDAO = new RegistroEstadoCitaDAO();
    }
    public ResponseEntity<AsignarEstadoCitaRes> asignarEstadoCita(RegistroEstadoCitaDTO registroEstadoCitaDTO) throws SQLException {
        try{
            if (registroEstadoCitaDTO.getIdAnteriorEstado().equals(registroEstadoCitaDTO.getIdNuevoEstado())) {
                throw new RegistroEstadoCitaException("No se puede cambiar una cita a su mismo estado");
            }
            RegistroEstadoCitaEntity entity = RegistroEstadoCitaMapper.ConvertFromDTO(registroEstadoCitaDTO);
            registroEstadoCitaDAO.crear(entity);
            AsignarEstadoCitaRes res = new AsignarEstadoCitaRes("Registro creado correctamente");
            return ResponseEntity.ok(res);
        } catch(Exception e){
            AsignarEstadoCitaRes res = new AsignarEstadoCitaRes("Error: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(res);
        }
    }
}
