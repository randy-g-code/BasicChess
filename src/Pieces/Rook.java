package Pieces;

import Game.Player;

public class Rook extends Piece
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
     * @param x the Rook's Horizontal location
     * @param y the Rook's Vertical location
     * @param player the Rook's assigned player
     */
    public Rook(int x, int y, Player player)
    {
        super(x, y, player);
        type = PieceType.Rook;
    }
}
