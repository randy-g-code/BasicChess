package Pieces;

import Game.Player;

public class Queen extends Piece
{
    PieceType type;

    /**
     * @return Type of Piece
     */
    @Override
    public PieceType getPiece() {
        return null;
    }

    @Override
    public void canCapture(int finalx, int finaly) {

    }

    @Override
    public boolean canMove(int finalx, int finaly) {
        return false;
    }

    /**
     * @param x the Queen's Horizonal location
     * @param y the Queen's Vertical location
     * @param player the Queen's assigned player
     */
    public Queen(int x, int y, Player player)
    {
        super(x, y, player);
        type = PieceType.Queen;
    }
}
