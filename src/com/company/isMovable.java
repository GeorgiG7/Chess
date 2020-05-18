package com.company;

public interface isMovable {

    boolean isMoveLegal(int posX, int posY, int newPosX, int newPosY, int turn, PlayingPiece[][] board);
}
