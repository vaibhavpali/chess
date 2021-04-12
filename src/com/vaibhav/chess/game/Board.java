package com.vaibhav.chess.game;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private static final int COLUMNS = 8;
    private static final int ROWS = 8;

    List<Cell> cells = new ArrayList<>();

    public void initializeBoard() {
        for (int i = 0; i < ROWS; i++) {
            int identifier = 65 + i;
            for (int j = 0; j < COLUMNS; j++) {
                cells.add(new Cell(i, j, identifier));
            }
        }
    }

    public List<Cell> getCells() {
        return cells;
    }
}
