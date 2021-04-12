package com.vaibhav.chess.game;

import com.vaibhav.chess.BaseTest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CellDataManagerImplTest extends BaseTest {

    @Test
    public void getCellByIdTest() {
        Cell cell = cellDataManager.getCellById("D5");
        assertEquals("D5", cell.getIdentifier());
        assertEquals(3, cell.getXPosition());
        assertEquals(4, cell.getYPosition());
    }

    @Test
    public void getCellByPositionTest() {
        Cell cell = cellDataManager.getCellByPosition(4, 4);
        assertEquals("E5", cell.getIdentifier());
        assertEquals(4, cell.getXPosition());
        assertEquals(4, cell.getYPosition());
    }

    @Test
    public void getIdentifierTest() {
        List<Cell> pawnPositions = new ArrayList<>();
        pawnPositions.add(new Cell(4, 3, 69));
        pawnPositions.add(new Cell(4, 2, 69));
        pawnPositions.add(new Cell(4, 4, 69));
        assertNotNull(cellDataManager.getIdentifiers(pawnPositions));
    }
}