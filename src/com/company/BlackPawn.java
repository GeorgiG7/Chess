package com.company;

public class BlackPawn extends PlayingPiece {

    public BlackPawn() {
        this.setColor("black");
        this.setFigureAppearance("\u265F");
    }


    @Override
    public boolean isMoveLegal(int posX, int posY, int newPosX, int newPosY, int turn, PlayingPiece[][] board) {
        if (turn == 1) return false;

        String color = this.getColor();

        return isPawnMoveLegal(posX, posY, newPosX, newPosY, board, color);
    }
}
