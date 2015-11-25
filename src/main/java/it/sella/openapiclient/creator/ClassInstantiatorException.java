package it.sella.openapiclient.creator;

public class ClassInstantiatorException extends RuntimeException {

    public ClassInstantiatorException(final String message,
            final Throwable cause) {
        super(message, cause);
    }

    public ClassInstantiatorException(final String message) {
        super(message);
    }
}
