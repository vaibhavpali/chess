package com.vaibhav.chess.piece;

import com.vaibhav.chess.exception.GameException;
import com.vaibhav.chess.game.Cell;

import java.util.List;

public class Pawn extends Piece {

    @Override
    public List<Cell> possibleMoves(Cell cell) throws GameException {
        int[] xMoves = {1, 1, 1};
        int[] yMoves = {0, 1, -1};
        return tracePossibleMoves(cell, xMoves, yMoves);
    }

    @Override
    public boolean canMove(Cell startCell, Cell endCell) {
        return false;
    }
}