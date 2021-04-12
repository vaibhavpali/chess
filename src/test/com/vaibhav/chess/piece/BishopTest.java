package com.vaibhav.chess.piece;

import com.vaibhav.chess.BaseTest;
import com.vaibhav.chess.PieceFactory;
import com.vaibhav.chess.exception.GameException;
import com.vaibhav.chess.game.Cell;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BishopTest extends BaseTest {

    @Before
    public void setUp() {
        super.setUp();
        setUpPiece("BISHOP");
    }

    @Test
    public void testNullPiece() {
        piece = PieceFactory.getPiece(null, cellDataManager);
        assertNull(piece);
    }

    @Test
    public void testDummyPieceName() {
        piece = PieceFactory.getPiece("dummy", cellDataManager);
        assertNull(piece);
    }

    @Test
    public void possibleMoveMiddleTest() throws GameException {
        Cell cell = cellDataManager.getCellById("D5");
        List<Cell> possibleMoves = piece.possibleMoves(cell);
        assertNotNull(possibleMoves);
        assertEquals(13, possibleMoves.size());
    }

    @Test
    public void possibleMove1stRowTest() throws GameException {
        Cell cell = cellDataManager.getCellById("A1");
        List<Cell> possibleMoves = piece.possibleMoves(cell);
        assertNotNull(possibleMoves);
        assertEquals(7, possibleMoves.size());
    }

    @Test
    public void canMove() {
        Cell startCell = cellDataManager.getCellById("A1");
        Cell endCell = cellDataManager.getCellById("C3");
        assertFalse(piece.canMove(startCell, endCell));
    }
}