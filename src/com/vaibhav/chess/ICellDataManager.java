package com.vaibhav.chess;

import com.vaibhav.chess.game.Cell;

import java.util.List;

public interface ICellDataManager {
    Cell getCellById(String identifier);

    Cell getCellByPosition(int x, int y);

    List<String> getIdentifiers(List<Cell> cells);
}
