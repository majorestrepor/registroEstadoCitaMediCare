package co.edu.uco.usecase.rules;

import co.edu.uco.usecase.validators.CitaFieldValidator;
import co.edu.uco.DTO.CitaDTO;

public class RegistroCitaRules {

    // Método para actualizar el estado de la cita
    public void actualizarEstado(CitaDTO citaDTO, String nuevoEstado) {
        // Validación del nuevo estado de la cita
        CitaFieldValidator.validateEstado(nuevoEstado);

        // Actualización del estado en el DTO
        citaDTO.setEstadoNombre(nuevoEstado);

        // Lógica adicional para registrar la actualización en la base de datos puede ir aquí.
        // Por ejemplo, podrías llamar a un DAO o servicio que guarde el cambio en la base de datos.
    }
}
