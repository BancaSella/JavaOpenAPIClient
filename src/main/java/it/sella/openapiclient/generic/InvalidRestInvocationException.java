package it.sella.openapiclient.generic;

public class InvalidRestInvocationException extends RuntimeException {
    public InvalidRestInvocationException(final String message,
            final Throwable cause) {
        super(message, cause);
    }

    public InvalidRestInvocationException(final String message) {
        super(message);
    }
}
