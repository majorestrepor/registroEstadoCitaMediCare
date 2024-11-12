package co.edu.uco.utilidades.mappers;

import co.edu.uco.DAO.CitaEntity;
import co.edu.uco.DTO.CitaDTO;
import java.util.ArrayList;

public class CitaMapper {

    // Convierte un CitaEntity a CitaDTO
    public static CitaDTO ConvertFromEntity(CitaEntity entity) {
        if (entity == null) {
            return null;
        }
        return new CitaDTO(
                entity.getId(),
                entity.getFechaCita(),
                entity.getPacienteId(),         // Asegúrate de pasar pacienteId
                entity.getNombrePaciente(),
                entity.getEstadoId(),
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
                dto.getId(),
                dto.getFechaCita(),
                dto.getPacienteId(),
                dto.getNombrePaciente(),
                dto.getEstadoId(),
                dto.getEstadoNombre(),
                dto.getFechaCita(),         // Asegúrate de pasar la fecha del estado aquí
                dto.getMedicoNombre()
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