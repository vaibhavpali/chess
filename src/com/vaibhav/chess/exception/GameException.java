package com.vaibhav.chess.exception;

/**
 * Wrapper exception class for all exception throws from chess package.
 */
public class GameException extends Throwable {
    private final String errorString;

    public GameException(String errorString, String message) {
        super(message);
        this.errorString = errorString;
    }

    public GameException(String errorCode, String message, Throwable throwable) {
        super(message, throwable);
        this.errorString = errorCode;
    }

    public String getErrorString() {
        return this.errorString;
    }

    @Override
    public String toString() {
        return "GameException{" + "Error Code = '" + errorString + '\'' +
                ", Error message = '" + getMessage() + '\'' +
                '}';
    }
}
