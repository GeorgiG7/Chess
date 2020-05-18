package com.company;

public class WhiteQueen extends PlayingPiece {
    public WhiteQueen() {
        this.setColor("white");
        this.setFigureAppearance("\u2655");
    }

    @Override
    public boolean isMoveLegal(int posX, int posY, int newPosX, int newPosY, int turn, PlayingPiece[][] board) {

        if (turn == 2) return false;

        String color = this.getColor();

        boolean isLeftMoveLegal = PlayingPiece.isLeftMoveLegal(posX, posY, newPosX, newPosY, board, color);
        boolean isDownwardMoveLegal = PlayingPiece.isDownwardMoveLegal(posX, posY, newPosX, newPosY, board, color);
        boolean isUpperMoveLegal = PlayingPiece.isUpperMoveLegal(posX, posY, newPosX, newPosY, board, color);
        boolean isRightMoveLegal = PlayingPiece.isRightMoveLegal(posX, posY, newPosX, newPosY, board, color);
        boolean isUpperLeftMoveLegal = PlayingPiece.isUpperLeftMoveLegal(posX, posY, newPosX, newPosY, board, color);
        boolean isDownwardLeftMoveLegal = PlayingPiece.isDownwardLeftMoveLegal(posX, posY, newPosX, newPosY, board, color);
        boolean isUpperRightMoveLegal = PlayingPiece.isUpperRightMoveLegal(posX, posY, newPosX, newPosY, board, color);
        boolean isDownwardRightMoveLegal = PlayingPiece.isDownwardRightMoveLegal(posX, posY, newPosX, newPosY, board, color);


        return isDownwardLeftMoveLegal || isDownwardRightMoveLegal || isUpperLeftMoveLegal || isUpperRightMoveLegal || isDownwardMoveLegal || isLeftMoveLegal || isUpperMoveLegal || isRightMoveLegal;

    }
}
