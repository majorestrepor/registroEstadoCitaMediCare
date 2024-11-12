package co.edu.uco.servicios;

import co.edu.uco.DAO.CitaEntity;
import co.edu.uco.DAO.TipoEstadoCitaEntity;
import co.edu.uco.DAO.postgres.TipoEstadoCitaDAO;
import co.edu.uco.DTO.CitaDTO;
import co.edu.uco.DTO.TipoEstadoCitaDTO;
import co.edu.uco.utilidades.mappers.CitaMapper;
import co.edu.uco.utilidades.mappers.TipoEstadoCitaMapper;

import java.sql.SQLException;
import java.util.ArrayList;

public class ServicioTipoEstadoCita {

    private TipoEstadoCitaDAO tipoEstadoCitaDAO;
    public ServicioTipoEstadoCita() {
        tipoEstadoCitaDAO = new TipoEstadoCitaDAO();
    }

    public ArrayList<TipoEstadoCitaDTO> obtenerEstadosCita() throws SQLException {
        ArrayList<TipoEstadoCitaEntity> tiposEstadoCitaEntity = tipoEstadoCitaDAO.obtenerTodosLosEstados();
        ArrayList<TipoEstadoCitaDTO> tiposEstadoCitaDTO = TipoEstadoCitaMapper.ConvertListFromEntity(tiposEstadoCitaEntity);
        return tiposEstadoCitaDTO;
    }
}