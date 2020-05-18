package com.company;

public class WhiteBishop extends PlayingPiece {

    public WhiteBishop() {
        this.setColor("white");
        this.setFigureAppearance("\u2657");
    }

    @Override
    public boolean isMoveLegal(int posX, int posY, int newPosX, int newPosY, int turn, PlayingPiece[][] board) {

        if (turn == 2) return false;

        String color = this.getColor();

        boolean isUpperLeftMoveLegal = PlayingPiece.isUpperLeftMoveLegal(posX, posY, newPosX, newPosY, board, color);
        boolean isDownwardLeftMoveLegal = PlayingPiece.isDownwardLeftMoveLegal(posX, posY, newPosX, newPosY, board, color);
        boolean isUpperRightMoveLegal = PlayingPiece.isUpperRightMoveLegal(posX, posY, newPosX, newPosY, board, color);
        boolean isDownwardRightMoveLegal = PlayingPiece.isDownwardRightMoveLegal(posX, posY, newPosX, newPosY, board, color);

        return isDownwardLeftMoveLegal || isDownwardRightMoveLegal || isUpperLeftMoveLegal || isUpperRightMoveLegal;

    }
}
