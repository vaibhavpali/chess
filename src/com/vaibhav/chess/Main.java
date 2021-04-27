package com.vaibhav.chess;

import com.vaibhav.chess.exception.GameException;
import com.vaibhav.chess.game.Board;
import com.vaibhav.chess.game.Cell;
import com.vaibhav.chess.game.CellDataManagerImpl;
import com.vaibhav.chess.piece.Piece;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Checks if user input is received properly or not
        if (args == null || args.length != 2 || isEmpty(args[0]) || isEmpty(args[1])) {
            throw new IllegalArgumentException("INVALID_INPUT");
        }
        String pieceName = args[0];
        String identifier = args[1];

        Board chessBoard = new Board();

        // Defining CellDataManager, which is used to fetch the required data for a cell
        ICellDataManager cellDataManager = new CellDataManagerImpl(chessBoard.getCells());

        Piece piece = PieceFactory.getPiece(pieceName, cellDataManager);
        Cell cell = cellDataManager.getCellById(identifier);

        try {
            if (piece == null) {
                throw new GameException("INVALID_PIECE_NAME", "Please enter valid Piece name, like: " +
                        "KING, QUEEN, HORSE, BISHOP, ROOK, PAWN");
            }
            if (cell == null) {
                throw new GameException("INVALID_IDENTIFIER", identifier + " not found, please enter valid input");
            }

            // Checks for all possible moves of a particular piece
            List<Cell> possibleMoves = piece.possibleMoves(cell);
            List<String> listOfMoves = cellDataManager.getIdentifiers(possibleMoves);

            System.out.println(Arrays.toString(listOfMoves.toArray()) + " :: Count = " + listOfMoves.size());
        } catch (GameException e) {
            e.printStackTrace();
            System.out.println(e.getErrorString());
        }
    }

    private static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }
}
