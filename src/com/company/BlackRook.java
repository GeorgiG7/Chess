package com.company;

public class BlackRook extends PlayingPiece {

    public BlackRook() {
        this.setColor("black");
        this.setFigureAppearance("\u265C");
    }

    @Override
    public boolean isMoveLegal(int posX, int posY, int newPosX, int newPosY, int turn, PlayingPiece[][] board) {
        if (turn == 1) return false;

        String color = this.getColor();

        boolean isLeftMoveLegal = PlayingPiece.isLeftMoveLegal(posX, posY, newPosX, newPosY, board, color);
        boolean isDownwardMoveLegal = PlayingPiece.isDownwardMoveLegal(posX, posY, newPosX, newPosY, board, color);
        boolean isUpperMoveLegal = PlayingPiece.isUpperMoveLegal(posX, posY, newPosX, newPosY, board, color);
        boolean isRightMoveLegal = PlayingPiece.isRightMoveLegal(posX, posY, newPosX, newPosY, board, color);

        return isDownwardMoveLegal || isLeftMoveLegal || isUpperMoveLegal || isRightMoveLegal;
    }
}
