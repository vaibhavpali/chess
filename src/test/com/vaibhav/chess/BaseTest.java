package com.vaibhav.chess;

import com.vaibhav.chess.game.Board;
import com.vaibhav.chess.game.CellDataManagerImpl;
import com.vaibhav.chess.piece.Piece;
import org.junit.Before;

public class BaseTest {
    protected Board board;
    protected ICellDataManager cellDataManager;
    protected Piece piece;

    @Before
    public void setUp() {
        setBoard();
    }

    protected void setUpPiece(String pieceName) {
        //setBoard();
        piece = PieceFactory.getPiece(pieceName, cellDataManager);
    }

    private void setBoard() {
        board = new Board();
        board.initializeBoard();
        cellDataManager = new CellDataManagerImpl(board.getCells());
    }
}
