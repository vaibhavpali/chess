package com.vaibhav.chess;

import com.vaibhav.chess.game.Cell;

import java.util.List;

/**
 * Manages various operations performed on cell, this interface is even exposed to outer package such that, it's methods
 * can be used to fetch the cell, irrespective of callee to know about the details of board and pieces placement.
 */
public interface ICellDataManager {
    /**
     * Fetches the cell by its identifier
     *
     * @param identifier if can be any valid identifier of a cell, like 'A4'
     * @return Instance of {@code Cell}
     */
    Cell getCellById(String identifier);

    /**
     * Fetches the cell by its position on the chessboard
     *
     * @param x x-position of a cell(Row)
     * @param y y-position of a cell(Column)
     * @return Instance of {@code Cell}
     */
    Cell getCellByPosition(int x, int y);

    /**
     * Fetches all the identifiers for a given list of positions
     *
     * @param cells - positions of cell.
     * @return {@code List<String>} Cell identifiers in string format.
     */
    List<String> getIdentifiers(List<Cell> cells);
}
