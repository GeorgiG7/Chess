package com.company;

public class BlackBishop extends PlayingPiece {

    public BlackBishop() {
        this.setColor("black");
        this.setFigureAppearance("\u265D");
    }

    @Override
    public boolean isMoveLegal(int posX, int posY, int newPosX, int newPosY, int turn, PlayingPiece[][] board) {

        if (turn == 1) return false;

        String color = this.getColor();

        boolean isUpperLeftMoveLegal = PlayingPiece.isUpperLeftMoveLegal(posX, posY, newPosX, newPosY, board, color);
        boolean isDownwardLeftMoveLegal = PlayingPiece.isDownwardLeftMoveLegal(posX, posY, newPosX, newPosY, board, color);
        boolean isUpperRightMoveLegal = PlayingPiece.isUpperRightMoveLegal(posX, posY, newPosX, newPosY, board, color);
        boolean isDownwardRightMoveLegal = PlayingPiece.isDownwardRightMoveLegal(posX, posY, newPosX, newPosY, board, color);

        return isDownwardLeftMoveLegal || isDownwardRightMoveLegal || isUpperLeftMoveLegal || isUpperRightMoveLegal;

    }
}
