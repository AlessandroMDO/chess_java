package application;

import boardgame.Board;
import chess.ChessMate;

public class Program {
    public static void main(String[] args) {

        ChessMate chessMatch = new ChessMate();
        UI.printBoard(chessMatch.getPieces());



    }
}
