package com.vaibhav.chess.exception;

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
        final StringBuilder sb = new StringBuilder("GameException{");
        sb.append("Error Code = '").append(errorString).append('\'');
        sb.append(", Error message = '").append(getMessage()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
