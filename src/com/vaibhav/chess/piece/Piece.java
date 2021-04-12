package com.vaibhav.chess.piece;

import com.vaibhav.chess.ICellDataManager;
import com.vaibhav.chess.exception.GameException;
import com.vaibhav.chess.game.Cell;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {
    protected ICellDataManager cellDataManager;

    public void setCellDataManager(ICellDataManager dataManager) {
        this.cellDataManager = dataManager;
    }

    public abstract List<Cell> possibleMoves(Cell cell) throws GameException;

    public abstract boolean canMove(Cell startCell, Cell endCell);

    private boolean isValidCellMovement(int x, int y) {
        return x >= 0 && y >= 0 && x < 8 && y < 8;
    }

    protected List<Cell> tracePossibleMovesIteratively(Cell cell, int[] xMoves, int[] yMoves) throws GameException {
        List<Cell> possibleMoves = new ArrayList<>();
        if(cell != null) {
            for (int i = 0; i < xMoves.length; i++) {
                int xNextPosition = cell.getXPosition() + xMoves[i];
                int yNextPosition = cell.getYPosition() + yMoves[i];
                while (isValidCellMovement(xNextPosition, yNextPosition)) {
                    possibleMoves.add(cellDataManager.getCellByPosition(xNextPosition, yNextPosition));
                    xNextPosition += xMoves[i];
                    yNextPosition += yMoves[i];
                }
            }
        } else {
            throw new GameException("CELL_NOT_FOUND", "Input cell not found on the board");
        }
        return possibleMoves;
    }

    protected List<Cell> tracePossibleMoves(Cell cell, int[] xMoves, int[] yMoves) throws GameException {
        List<Cell> possibleMoves = new ArrayList<>();
        if(cell != null) {
            for (int i = 0; i < xMoves.length; i++) {
                int xNextPosition = cell.getXPosition() + xMoves[i];
                int yNextPosition = cell.getYPosition() + yMoves[i];
                if(isValidCellMovement(xNextPosition, yNextPosition)) {
                    possibleMoves.add(cellDataManager.getCellByPosition(xNextPosition, yNextPosition));
                }
            }
        } else {
            throw new GameException("CELL_NOT_FOUND", "Input cell not found on the board");
        }
        return possibleMoves;
    }
 }
