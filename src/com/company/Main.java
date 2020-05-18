package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ChessBoard chessBoard = startGame();

        Scanner input = new Scanner(System.in);

        while (true) {
            int posX = input.nextInt() - 1;
            int posY = input.nextInt() - 1;
            int newPosX = input.nextInt() - 1;
            int newPosY = input.nextInt() - 1;

            chessBoard.makeMove(posX, posY, newPosX, newPosY, chessBoard.getTurn());

            chessBoard.printBoard();
        }

    }

    public static ChessBoard startGame() {
        PlayingPiece[][] board = new PlayingPiece[8][8];

        ChessBoard chessBoard = new ChessBoard(constructFirstChessBoard(board));

        chessBoard.printBoard();

        return chessBoard;
    }

    public static PlayingPiece[][] constructFirstChessBoard(PlayingPiece[][] board) {
        for (int i = 0; i < board[1].length; i++) {
            board[1][i] = new BlackPawn();
            board[6][i] = new WhitePawn();
        }

        board[0][0] = new BlackRook();
        board[0][7] = new BlackRook();

        board[0][1] = new BlackKnight();
        board[0][6] = new BlackKnight();

        board[0][2] = new BlackBishop();
        board[0][5] = new BlackBishop();

        board[0][3] = new BlackQueen();
        board[0][4] = new BlackKing();


        board[7][0] = new WhiteRook();
        board[7][7] = new WhiteRook();

        board[7][1] = new WhiteKnight();
        board[7][6] = new WhiteKnight();

        board[7][2] = new WhiteBishop();
        board[7][5] = new WhiteBishop();

        board[7][3] = new WhiteQueen();
        board[7][4] = new WhiteKing();

        return board;
    }
}
