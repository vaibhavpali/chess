package com.vaibhav.chess.piece;

import com.vaibhav.chess.BaseTest;
import com.vaibhav.chess.exception.GameException;
import com.vaibhav.chess.game.Cell;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class KingTest extends BaseTest {

    @Before
    public void setUp() {
        super.setUp();
        setUpPiece("KING");
    }

    @Test
    public void possibleMovesMiddleTest() throws GameException {
        Cell cell = cellDataManager.getCellById("E3");
        List<Cell> cells = piece.possibleMoves(cell);
        assertNotNull(cell);
        assertEquals(8, cells.size());
    }

    @Test
    public void possibleMovesRowTest() throws GameException {
        Cell cell = cellDataManager.getCellById("A1");
        List<Cell> cells = piece.possibleMoves(cell);
        assertNotNull(cell);
        assertEquals(3, cells.size());
    }

    @Test(expected = GameException.class)
    public void possibleMovesCellNull() throws GameException {
        piece.possibleMoves(null);
    }

    @Test
    public void canMoveTest() {
        Cell startCell = cellDataManager.getCellById("A1");
        Cell endCell = cellDataManager.getCellById("A2");
        assertFalse(piece.canMove(startCell, endCell));
    }
}