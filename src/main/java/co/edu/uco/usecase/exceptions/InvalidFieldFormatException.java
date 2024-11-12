package co.edu.uco.usecase.exceptions;

public class InvalidFieldFormatException extends RuntimeException {
    public InvalidFieldFormatException(String message) {
        super(message);
    }
}
