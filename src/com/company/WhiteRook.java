package com.company;

public class WhiteRook extends PlayingPiece {

    public WhiteRook() {
        this.setColor("white");
        this.setFigureAppearance("\u2656");
    }

    @Override
    public boolean isMoveLegal(int posX, int posY, int newPosX, int newPosY, int turn, PlayingPiece[][] board) {

        if (turn == 2) return false;

        String color = this.getColor();

        boolean isLeftMoveLegal = PlayingPiece.isLeftMoveLegal(posX, posY, newPosX, newPosY, board, color);
        boolean isDownwardMoveLegal = PlayingPiece.isDownwardMoveLegal(posX, posY, newPosX, newPosY, board, color);
        boolean isUpperMoveLegal = PlayingPiece.isUpperMoveLegal(posX, posY, newPosX, newPosY, board, color);
        boolean isRightMoveLegal = PlayingPiece.isRightMoveLegal(posX, posY, newPosX, newPosY, board, color);

        return isDownwardMoveLegal || isLeftMoveLegal || isUpperMoveLegal || isRightMoveLegal;
    }
}
