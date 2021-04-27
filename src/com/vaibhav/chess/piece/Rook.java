package com.vaibhav.chess.piece;

import com.vaibhav.chess.game.Cell;

import java.util.List;

public class Rook extends Piece {

    @Override
    public List<Cell> possibleMoves(Cell cell) {
        // Below are the 4 crossed directions where Rook can move on a chessboard.
        int[] xMoves = {0, 1, 0, -1};
        int[] yMoves = {1, 0, -1, 0};
        return tracePossibleMovesIteratively(cell, xMoves, yMoves);
    }

    @Override
    public boolean canMove(Cell startCell, Cell endCell) {
        return false;
    }
}