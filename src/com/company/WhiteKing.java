package com.company;

public class WhiteKing extends PlayingPiece {

    public WhiteKing() {
        this.setColor("white");
        this.setFigureAppearance("\u2654");
    }

    @Override
    public boolean isMoveLegal(int posX, int posY, int newPosX, int newPosY, int turn, PlayingPiece[][] board) {
        if (turn == 2) return false;

        String color = this.getColor();

        return isKingMoveLegal(posX, posY, newPosX, newPosY, board, color);
    }
}
