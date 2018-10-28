package Pieces;

import Game.Player;

public class King extends Piece
{
    PieceType type;

    /**
     * @return Type of Piece
     */
    @Override
    public PieceType getPiece() {
        return type;
    }

    @Override
    public void canCapture(int finalx, int finaly) {

    }

    @Override
    public boolean canMove(int finalx, int finaly) {
        return false;
    }

    /**
     * @param x the King's Horizonal location
     * @param y the King's Vertical location
     * @param player the King's assigned player
     */
    public King(int x, int y, Player player)
    {
        super(x, y, player);
        type = PieceType.King;
    }
}
