package com.vaibhav.chess.piece;

import com.vaibhav.chess.exception.GameException;
import com.vaibhav.chess.game.Cell;

import java.util.List;

public class Horse extends Piece {

    @Override
    public List<Cell> possibleMoves(Cell cell) {
        // Below are 8 positions with 2.5 cell distance apart where a Horse can move on a chessboard.
        int[] xMoves = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] yMoves = {1, 2, 2, 1, -1, -2, -2, -1};
        return tracePossibleMoves(cell, xMoves, yMoves);
    }

    @Override
    public boolean canMove(Cell startCell, Cell endCell) {
        return false;
    }
}