package com.company;

public abstract class PlayingPiece implements isMovable {

    private String figureAppearance;
    private String color;

    protected String getFigureAppearance() {
        return figureAppearance;
    }

    protected void setFigureAppearance(String figureAppearance) {
        this.figureAppearance = figureAppearance;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    public static boolean isUpperMoveLegal(int posX, int posY, int newPosX, int newPosY, PlayingPiece[][] board, String color) {
        if (newPosX < posX && posY == newPosY) {
            while (newPosX != posX) {
                posX--;
                if (board[posX][posY] == null) {
                    continue;
                } else if (posX == newPosX && !board[posX][posY].getColor().equals(color)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isDownwardMoveLegal(int posX, int posY, int newPosX, int newPosY, PlayingPiece[][] board, String color) {
        if (newPosX > posX && posY == newPosY) {
            while (newPosX != posX) {
                posX++;
                if (board[posX][posY] == null) {
                    continue;
                } else if (posX == newPosX && !board[posX][posY].getColor().equals(color)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isLeftMoveLegal(int posX, int posY, int newPosX, int newPosY, PlayingPiece[][] board, String color) {
        if (newPosX == posX && posY > newPosY) {
            while (newPosY != posY) {
                posY--;
                if (board[posX][posY] == null) {
                    continue;
                } else if (posY == newPosY && !board[posX][posY].getColor().equals(color)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isRightMoveLegal(int posX, int posY, int newPosX, int newPosY, PlayingPiece[][] board, String color) {
        if (newPosX == posX && posY < newPosY) {
            while (newPosY != posY) {
                posY++;
                if (board[posX][posY] == null) {
                    continue;
                } else if (posY == newPosY && !board[posX][posY].getColor().equals(color)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isUpperLeftMoveLegal(int posX, int posY, int newPosX, int newPosY, PlayingPiece[][] board, String color) {
        if (newPosX < posX && newPosY < posY) {
            if (posX - newPosX != posY - newPosY) return false;
            while (posX != newPosX) {
                posX--;
                posY--;
                if (board[posX][posY] == null) {
                    continue;
                } else if (posX == newPosX && !board[posX][posY].getColor().equals(color)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isUpperRightMoveLegal(int posX, int posY, int newPosX, int newPosY, PlayingPiece[][] board, String color) {
        if (newPosX < posX && newPosY > posY) {
            if (posX - newPosX != newPosY - posY) return false;
            while (posX != newPosX) {
                posX--;
                posY++;
                if (board[posX][posY] == null) {
                    continue;
                } else if (posX == newPosX && !board[posX][posY].getColor().equals(color)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isDownwardLeftMoveLegal(int posX, int posY, int newPosX, int newPosY, PlayingPiece[][] board, String color) {
        if (newPosX > posX && newPosY < posY) {
            if (posX - newPosX != newPosY - posY) return false;
            while (posX != newPosX) {
                posX++;
                posY--;
                if (board[posX][posY] == null) {
                    continue;
                } else if (posX == newPosX && !board[posX][posY].getColor().equals(color)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isDownwardRightMoveLegal(int posX, int posY, int newPosX, int newPosY, PlayingPiece[][] board, String color) {
        if (newPosX > posX && newPosY > posY) {
            if (newPosX - posX != newPosY - posY) return false;
            while (posX != newPosX) {
                posX++;
                posY++;
                if (board[posX][posY] == null) {
                    continue;
                } else if (posX == newPosX && !board[posX][posY].getColor().equals(color)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isPawnMoveLegal(int posX, int posY, int newPosX, int newPosY, PlayingPiece[][] board, String color) {
        int firstPosition = color.equals("white") ? 6 : 1;
        int pawnDirectionByColor = color.equals("white") ? 1 : -1;

        if (board[newPosX][newPosY] != null) {
            if (posX - newPosX == pawnDirectionByColor && posY - newPosY == pawnDirectionByColor && !board[newPosX][newPosY].getColor().equals(color)) {
                return true;
            } else return false;
        } else if (posX == firstPosition) {
            return (posX - newPosX) == pawnDirectionByColor || (posX - newPosX) == 2 * pawnDirectionByColor;
        } else if (posX != 0) {
            return posX - newPosX == pawnDirectionByColor;
        } else {
            return false;
        }
    }

    public static boolean isKnightMoveLegal(int posX, int posY, int newPosX, int newPosY, PlayingPiece[][] board, String color) {

        int diffX = Math.abs(posX - newPosX);
        int diffY = Math.abs(posY - newPosY);

        if ((diffX == 1 && diffY == 2) || (diffY == 1 && diffX == 2)) {
            if (board[newPosX][newPosY] == null) {
                return true;
            } else if (board[newPosX][newPosY] != null && !board[newPosX][newPosY].getColor().equals(color)) {
                return true;
            }
        }

        return false;
    }

    public static boolean isKingMoveLegal(int posX, int posY, int newPosX, int newPosY, PlayingPiece[][] board, String color) {

        int diffX = Math.abs(posX - newPosX);
        int diffY = Math.abs(posY - newPosY);

        if ((diffX == 0 && diffY == 1) || (diffY == 0 && diffX == 1) || (diffX == 1 && diffY == 1)) {
            if (board[newPosX][newPosY] == null) {
                return true;
            } else if (board[newPosX][newPosY] != null && !board[newPosX][newPosY].getColor().equals(color)) {
                return true;
            }
        }

        return false;
    }
}
