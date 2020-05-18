package com.company;

public class BlackKnight extends PlayingPiece {

    public BlackKnight() {
        this.setColor("black");
        this.setFigureAppearance("\u265E");
    }


    @Override
    public boolean isMoveLegal(int posX, int posY, int newPosX, int newPosY, int turn, PlayingPiece[][] board) {
        if (turn == 1) return false;

        String color = this.getColor();

        return isKnightMoveLegal(posX, posY, newPosX, newPosY, board, color);
    }
}
