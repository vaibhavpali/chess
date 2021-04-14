package com.vaibhav.chess;

import com.vaibhav.chess.piece.*;

/**
 * This factory class is used to initialize the chess piece
 */
public class PieceFactory {
    private static final String BISHOP = "BISHOP";
    private static final String HORSE = "HORSE";
    private static final String KING = "KING";
    private static final String PAWN = "PAWN";
    private static final String QUEEN = "QUEEN";
    private static final String ROOK = "ROOK";

    public static Piece getPiece(String name, ICellDataManager dataManager) {
        Piece piece = null;
        if (name != null && name.length() > 0) {
            switch (name) {
                case KING:
                    piece = new King();
                    break;
                case HORSE:
                    piece = new Horse();
                    break;
                case QUEEN:
                    piece = new Queen();
                    break;
                case BISHOP:
                    piece = new Bishop();
                    break;
                case ROOK:
                    piece = new Rook();
                    break;
                case PAWN:
                    piece = new Pawn();
                    break;
                default:
                    return null;
            }
            piece.setCellDataManager(dataManager);
        }
        return piece;
    }
}
