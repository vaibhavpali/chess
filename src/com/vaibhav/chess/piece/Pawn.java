package com.vaibhav.chess.piece;

import com.vaibhav.chess.exception.GameException;
import com.vaibhav.chess.game.Cell;

import java.util.List;

public class Pawn extends Piece {

    @Override
    public List<Cell> possibleMoves(Cell cell) {
        // Considering only forward movement of Pawn 1 step forward and 1-1 step diagonal.
        // Hence, below are the 3 directions where a Pawn can move on a chessboard.
        int[] xMoves = {1, 1, 1};
        int[] yMoves = {0, 1, -1};
        return tracePossibleMoves(cell, xMoves, yMoves);
    }

    @Override
    public boolean canMove(Cell startCell, Cell endCell) {
        return false;
    }
}