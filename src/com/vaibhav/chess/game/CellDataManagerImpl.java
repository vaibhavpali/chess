package com.vaibhav.chess.game;

import com.vaibhav.chess.ICellDataManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation class for {@code ICellDataManager}
 */
public class CellDataManagerImpl implements ICellDataManager {
    private final List<Cell> cells;

    public CellDataManagerImpl(List<Cell> cells) {
        this.cells = cells;
    }

    @Override
    public Cell getCellById(String identifier) {
        return cells.stream().filter(cell -> cell.getIdentifier().equals(identifier)).findFirst().orElse(null);
    }

    @Override
    public Cell getCellByPosition(int x, int y) {
        return cells.stream().filter(cell -> cell.getXPosition() == x && cell.getYPosition() == y).findFirst().orElse(null);
    }

    @Override
    public List<String> getIdentifiers(List<Cell> cells) {
        List<String> identifiers = new ArrayList<>();
        for (Cell c : cells) {
            identifiers.add(c.getIdentifier());
        }
        return identifiers;

        // Alternate solution:
        // TODO: It doesn't maintain the order of the actual list.
        // Map<String, List<Cell>> collect = cells.stream().collect(Collectors.groupingBy(Cell::getIdentifier));
        //return new ArrayList<>(collect.keySet());
    }
}
