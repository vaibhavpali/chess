package com.vaibhav.chess.piece;

import com.vaibhav.chess.ICellDataManager;
import com.vaibhav.chess.exception.GameException;
import com.vaibhav.chess.game.Cell;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstraction for all pieces on the chessboard. Instance of this class performs required operations for a {@code Piece}
 */
public abstract class Piece {
    protected ICellDataManager cellDataManager;

    /**
     * Implementation of {@code ICellDataManager} is injected to perform various operations on cell. This interface can
     * be implemented by any consumer of {@code Piece} package.
     * @param dataManager Instance of {@code ICellDataManager}
     */
    public void setCellDataManager(ICellDataManager dataManager) {
        this.cellDataManager = dataManager;
    }

    /**
     * Get possible moves of specific {@code Piece} on a empty chessboard
     * @param cell Holds the current position of a piece on a board.
     * @return {@code List<Cell> List of all possible moves}
     * @throws GameException with below error code:
     *  <ul>
     *      <li>CELL_NOT_FOUND</li>
     *  </ul>
     */
    public abstract List<Cell> possibleMoves(Cell cell) throws GameException;

    /**
     * This method is responsible to determine whether current move for a cell is valid or not,
     * considering blockages in the running game.
     * @param startCell a cell from where piece needs to be moved.
     * @param endCell destination cell where piece can be placed
     * @return {@code true} if move is valid
     */
    public abstract boolean canMove(Cell startCell, Cell endCell);

    /*
    Determines if give (x,y) position is valid board cell or not.
     */
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
