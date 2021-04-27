package com.vaibhav.chess.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a chess board, it contains list of all 64 cells.
 * The instance of this class is responsible for holding all the cells on chess board.
 */
public class Board {
    private static final int COLUMNS = 8;
    private static final int ROWS = 8;

    private static final List<Cell> cells = new ArrayList<>();

    static {
        for (int i = 0; i < ROWS; i++) {
            // ASCII value is used to assign a cell with a definite identifier, starting from 65
            int identifier = 65 + i;
            for (int j = 0; j < COLUMNS; j++) {
                cells.add(new Cell(i, j, identifier));
            }
        }
    }

//    public void initializeBoard() {
//        for (int i = 0; i < ROWS; i++) {
//            // ASCII value is used to assign a cell with a definite identifier, starting from 65
//            int identifier = 65 + i;
//            for (int j = 0; j < COLUMNS; j++) {
//                cells.add(new Cell(i, j, identifier));
//            }
//        }
//    }

    public List<Cell> getCells() {
        return cells;
    }
}
