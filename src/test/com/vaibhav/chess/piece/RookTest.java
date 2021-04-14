package com.vaibhav.chess.piece;

import com.vaibhav.chess.BaseTest;
import com.vaibhav.chess.exception.GameException;
import com.vaibhav.chess.game.Cell;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RookTest extends BaseTest {
    @Before
    public void setUp() {
        super.setUp();
        setUpPiece("ROOK");
    }

    @Test
    public void possibleMovesMiddleTest() throws GameException {
        Cell cell = cellDataManager.getCellById("D4");
        List<Cell> cells = piece.possibleMoves(cell);
        assertNotNull(cell);
        assertEquals(14, cells.size());
    }

    @Test
    public void possibleMovesRowTest() throws GameException {
        Cell cell = cellDataManager.getCellById("A1");
        List<Cell> cells = piece.possibleMoves(cell);
        assertNotNull(cell);
        assertEquals(14, cells.size());
    }

    @Test
    public void canMoveTest() {
        Cell startCell = cellDataManager.getCellById("A1");
        Cell endCell = cellDataManager.getCellById("H1");
        assertFalse(piece.canMove(startCell, endCell));
    }
}