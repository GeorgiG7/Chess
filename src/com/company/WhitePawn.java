package com.company;

public class WhitePawn extends PlayingPiece {

    public WhitePawn() {
        this.setColor("white");
        this.setFigureAppearance("\u2659");
    }

    @Override
    public boolean isMoveLegal(int posX, int posY, int newPosX, int newPosY, int turn, PlayingPiece[][] board) {
        if (turn == 2) return false;

        String color = this.getColor();

        return isPawnMoveLegal(posX, posY, newPosX, newPosY, board, color);
    }
}
