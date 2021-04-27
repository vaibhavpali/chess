package com.vaibhav.chess.piece;

import com.vaibhav.chess.game.Cell;

import java.util.List;

public class King extends Piece {

    @Override
    public List<Cell> possibleMoves(Cell cell) {
        // Below are 8 directions where a king can move 1 step on a chessboard.
        int[] xMoves = {0, 1, 1, 1, 0, -1, -1, -1};
        int[] yMoves = {1, 1, 0, -1, -1, -1, 0, 1};
        return tracePossibleMoves(cell, xMoves, yMoves);
    }

    @Override
    public boolean canMove(Cell startCell, Cell endCell) {
        return false;
    }
}