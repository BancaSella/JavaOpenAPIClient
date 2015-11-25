package it.sella.openapiclient.api;

public class InvalidJsonRequestException extends RuntimeException {

    public InvalidJsonRequestException(final String message,
            final Throwable cause) {
        super(message, cause);
    }

    public InvalidJsonRequestException(final String message) {
        super(message);
    }
}
