package co.edu.uco.utilidades.mappers;

import co.edu.uco.DAO.RegistroEstadoCitaEntity;
import co.edu.uco.DTO.RegistroEstadoCitaDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class RegistroEstadoCitaMapper {
    public static RegistroEstadoCitaEntity ConvertFromDTO(RegistroEstadoCitaDTO dto) {
        if (dto == null) {
            return null;
        }
        RegistroEstadoCitaEntity entity = new RegistroEstadoCitaEntity(
                UUID.fromString(dto.getIdEstado()),
                UUID.fromString(dto.getIdCita()),
                UUID.randomUUID(),
                LocalDateTime.now()
        );
        return entity;
    }
}
