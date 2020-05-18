package com.company;

public class ChessBoard {

    private int turn = 1;

    public PlayingPiece[][] board;

    public ChessBoard(PlayingPiece[][] board) {
        this.board = board;
    }

    public int getTurn() {
        return turn;
    }

    public void printBoard (){
        System.out.println("    1\t     2\t     3\t     4\t     5\t     6\t     7\t     8\t");
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j <this.board[i].length ; j++) {
                System.out.print("| \t");
                if (this.board[i][j] == null) System.out.print("  \t");
                else System.out.print(this.board[i][j].getFigureAppearance() + " \t");

            }
            System.out.print("|");
            System.out.print((i+1));
            System.out.println();
        }
        System.out.println();
    }

    public void makeMove(int posX, int posY, int newPosX, int newPosY, int turn){

        if ((posX <8 && posY <8 && newPosX <8 && newPosY< 8 ) && (posX >= 0  && posY >= 0 && newPosX >= 0 && newPosY >= 0 ) && this.board[posX][posY] != null){
            if (this.board[posX][posY].isMoveLegal(posX, posY, newPosX, newPosY, turn, this.board)){
                PlayingPiece movingPiece = this.board[posX][posY];
                this.board[posX][posY] = null;
                this.board[newPosX][newPosY] = movingPiece;
                this.turn = this.turn==1?2:1;
            } else System.out.println("Cant do that action");
            System.out.println();
        } else {
            System.out.println("Cant do that action");
        }
    }

    public static boolean isThereCheck(int posX, int posY, int newPosX, int newPosY, PlayingPiece[][] board, String color) {
        return false;
    }
}
