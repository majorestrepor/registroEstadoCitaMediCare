package co.edu.uco.usecase.validators;

import co.edu.uco.usecase.exceptions.InvalidFieldFormatException;

public class CitaFieldValidator {

    // Validación del campo "estado" de la cita
    public static void validateEstado(String estado) {
        if (!estado.equals("programada") && !estado.equals("completada") && !estado.equals("cancelada")) {
            throw new InvalidFieldFormatException("El estado proporcionado no es válido: " + estado);
        }
    }
}
