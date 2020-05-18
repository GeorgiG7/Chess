package com.company;

public class BlackKing extends PlayingPiece {

    public BlackKing() {
        this.setColor("black");
        this.setFigureAppearance("\u265A");
    }


    @Override
    public boolean isMoveLegal(int posX, int posY, int newPosX, int newPosY, int turn, PlayingPiece[][] board) {
        if (turn == 1) return false;

        String color = this.getColor();

        return isKingMoveLegal(posX, posY, newPosX, newPosY, board, color);
    }
}
