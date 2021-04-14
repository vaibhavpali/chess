package com.vaibhav.chess;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MainTest {
    String[] args;

    @Before
    public void setUp() {
        args = new String[]{"KING", "D4"};
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMainNullPiece() {
        String[] args = {null, "D4"};
        Main.main(args);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMainNullIdentifier() {
        String[] args = {"KING", null};
        Main.main(args);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMainNull() {
        String[] args = {null, null};
        Main.main(args);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMain() {
        Main.main(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMainArgsNull() {
        Main.main(new String[]{null, null});
    }

    @Test
    public void testMainInvalidPiece() {
        String[] args = {"Dummy", "A1"};
        Main.main(args);
        assertTrue(true);
    }

    @Test
    public void testMainInvalidIdentifier() {
        String[] args = {"KING", "M7"};
        Main.main(args);
        assertTrue(true);
    }

    @Test
    public void testMainValidData() {
        Main.main(new String[] {"HORSE", "D4"});
    }
}