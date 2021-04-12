package com.vaibhav.chess.game;

import com.vaibhav.chess.piece.King;
import com.vaibhav.chess.piece.Piece;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CellTest {

    private Cell cell;
    private Piece piece;

    @Before
    public void setUp() {
        cell = new Cell(3, 4, 67);
        piece = new King();
        cell.setPiece(piece);
    }

    @Test
    public void initTest() {
        cell = new Cell(4, 4, 888);
        assertNotNull(cell);
    }

    @Test
    public void getPieceTest() {
        assertEquals(piece, cell.getPiece());
    }

    @Test
    public void getPositionTest() {
        cell = new Cell(4, 4, 69);
        assertEquals(4, cell.getXPosition());
        assertEquals(4, cell.getYPosition());
        assertEquals("E5", cell.getIdentifier());
    }
}