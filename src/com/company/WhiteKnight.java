package com.company;

public class WhiteKnight extends PlayingPiece {



    public WhiteKnight() {
        this.setColor("white");
        this.setFigureAppearance("\u2658");
    }



    @Override
    public boolean isMoveLegal(int posX, int posY, int newPosX, int newPosY, int turn, PlayingPiece[][] board) {
        if (turn == 2) return false;

        String color = this.getColor();

        return isKnightMoveLegal(posX, posY, newPosX, newPosY, board, color);
    }
}
