package co.edu.uco.utilidades.mappers;

import co.edu.uco.DAO.CitaEntity;
import co.edu.uco.DAO.TipoEstadoCitaEntity;
import co.edu.uco.DTO.TipoEstadoCitaDTO;

import java.util.ArrayList;

public class TipoEstadoCitaMapper {
    public static TipoEstadoCitaDTO ConvertFromEntity(TipoEstadoCitaEntity entity) {
        if (entity == null) {
            return null;
        }
        TipoEstadoCitaDTO dto = new TipoEstadoCitaDTO(
                entity.getId(),
                entity.getNombre()
        );
        return dto;
    }

    public static ArrayList<TipoEstadoCitaDTO> ConvertListFromEntity(ArrayList<TipoEstadoCitaEntity> entities) {
        ArrayList<TipoEstadoCitaDTO> dtos = new ArrayList<TipoEstadoCitaDTO>();
        for (TipoEstadoCitaEntity entity : entities) {
            dtos.add(ConvertFromEntity(entity));
        }
        return dtos;
    }
}

