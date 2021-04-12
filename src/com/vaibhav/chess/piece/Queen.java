package com.vaibhav.chess.piece;

import com.vaibhav.chess.exception.GameException;
import com.vaibhav.chess.game.Cell;

import java.util.List;

public class Queen extends Piece {
    @Override
    public List<Cell> possibleMoves(Cell cell) throws GameException {
        int[] xMoves = {0, 1, 1, 1, 0, -1, -1, -1};
        int[] yMoves = {1, 1, 0, -1, -1, -1, 0, 1};
        return tracePossibleMovesIteratively(cell, xMoves, yMoves);
    }

    @Override
    public boolean canMove(Cell startCell, Cell endCell) {
        return false;
    }
}
