package com.vaibhav.chess.piece;

import com.vaibhav.chess.game.Cell;

import java.util.List;

public class Bishop extends Piece {
    @Override
    public List<Cell> possibleMoves(Cell cell) {
        // Below are 4 diagonal directions where a Bishop can move on a chessboard.
        int[] xMoves = {1, 1, -1, -1};
        int[] yMoves = {1, -1, -1, 1};
        return tracePossibleMovesIteratively(cell, xMoves, yMoves);
    }

    @Override
    public boolean canMove(Cell startCell, Cell endCell) {
        return false;
    }
}
