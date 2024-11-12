package co.edu.uco.usecase.rules;

import co.edu.uco.usecase.validators.CitaFieldValidator;
import co.edu.uco.DTO.CitaDTO;

public class RegistroCitaRules {


    public void actualizarEstado(CitaDTO citaDTO, String nuevoEstado) {
        CitaFieldValidator.validateEstado(nuevoEstado);


        if (citaDTO.getEstadoActual().equals(nuevoEstado)) {
            throw new IllegalArgumentException("El nuevo estado no puede ser el mismo que el estado actual.");
        }

        citaDTO.setEstadoActual(nuevoEstado);

    }
}

