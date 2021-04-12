package com.vaibhav.chess.game;

import com.vaibhav.chess.piece.Piece;

public class Cell {

    private Piece piece;

    private final int xPosition, yPosition;
    private final String identifier;

    public Cell(int x, int y, int valueInAscii) {
        xPosition = x;
        yPosition = y;
        this.identifier = computeIdentifier(valueInAscii);
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public String getIdentifier() {
        return identifier;
    }

    private String computeIdentifier(int valueInascii) {
        return (char) valueInascii + Integer.toString(yPosition + 1);
    }
}
