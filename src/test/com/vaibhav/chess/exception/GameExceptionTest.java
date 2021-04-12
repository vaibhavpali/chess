package com.vaibhav.chess.exception;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GameExceptionTest {

    GameException ex;

    private static final String CODE_INVALID_INPUT = "INVALID_INPUT";
    private static final String CODE_INVALID_PIECE = "INVALID_PIECE";
    private static final String MESSAGE_INVALID_INPUT = "User input is invalid";

    @Test
    public void getErrorString() {
        ex = new GameException(CODE_INVALID_INPUT, MESSAGE_INVALID_INPUT, new Throwable());
        assertEquals(CODE_INVALID_INPUT, ex.getErrorString());
    }

    @Test
    public void getStringErrorTest() {
        ex = new GameException(CODE_INVALID_PIECE, MESSAGE_INVALID_INPUT);
        assertEquals(CODE_INVALID_PIECE, ex.getErrorString());
        assertNotNull(ex.toString());
    }
}