package Pieces;

import Game.Player;

public class Knight extends Piece
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
     * @param x the Knight's Horizonal location
     * @param y the Knight's Vertical location
     * @param player the Knight's assigned player
     */
    public Knight(int x, int y, Player player)
    {
        super(x, y, player);
        type = PieceType.Knight;
    }
}
