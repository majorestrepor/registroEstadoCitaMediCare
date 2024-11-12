package co.edu.uco.utilidades.mappers;

import co.edu.uco.DAO.CitaEntity;
import co.edu.uco.DTO.CitaDTO;
import java.util.ArrayList;
import java.util.UUID;

public class CitaMapper {

    // Convierte un CitaEntity a CitaDTO
    public static CitaDTO ConvertFromEntity(CitaEntity entity) {
        if (entity == null) {
            return null;
        }
        return new CitaDTO(
                entity.getId().toString(),
                entity.getFechaCita(),
                entity.getPacienteId().toString(),         // Asegúrate de pasar pacienteId
                entity.getNombrePaciente(),
                entity.getEstadoId().toString(),
                entity.getEstadoNombre(),
                entity.getMedicoNombre()
        );
    }

    // Convierte un CitaDTO a CitaEntity
    public static CitaEntity ConvertFromDTO(CitaDTO dto) {
        if (dto == null) {
            return null;
        }
        return new CitaEntity(
                UUID.fromString(dto.getId()),
                dto.getFecha(),
                UUID.fromString(dto.getPacienteId()),
                dto.getPaciente(),
                UUID.fromString(dto.getEstadoId()),
                dto.getEstadoActual(),
                dto.getFecha(),         // Asegúrate de pasar la fecha del estado aquí
                dto.getDoctor()
        );
    }

    // Convierte una lista de CitaEntity a una lista de CitaDTO
    public static ArrayList<CitaDTO> ConvertListFromEntity(ArrayList<CitaEntity> entities) {
        ArrayList<CitaDTO> dtos = new ArrayList<>();
        for (CitaEntity entity : entities) {
            dtos.add(ConvertFromEntity(entity));
        }
        return dtos;
    }
}
