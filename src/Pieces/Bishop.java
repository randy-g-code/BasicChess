package Pieces;

import Game.Player;

public class Bishop extends Piece
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
     * @param x the Bishop's Horizonal location
     * @param y the Bishop's Vertical location
     * @param player the Bishop's assigned player
     */
    public Bishop(int x, int y, Player player)
    {
        super(x, y, player);
        type = PieceType.Bishop;
    }
}
