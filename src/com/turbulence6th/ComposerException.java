package com.turbulence6th;

public class ComposerException extends RuntimeException {

    public ComposerException() {
        super();
    }

    public ComposerException(String message) {
        super(message);
    }

    public ComposerException(String message, Throwable cause) {
        super(message, cause);
    }

    public ComposerException(Throwable cause) {
        super(cause);
    }

    protected ComposerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
