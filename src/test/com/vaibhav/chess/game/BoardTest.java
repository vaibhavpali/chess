package com.vaibhav.chess.game;

import com.vaibhav.chess.BaseTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BoardTest extends BaseTest {

    @Test
    public void getCellsTest() {
        assertNotNull(board.getCells());
        assertEquals(64, board.getCells().size());
    }

}