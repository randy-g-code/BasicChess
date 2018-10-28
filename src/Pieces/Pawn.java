package Pieces;

import Game.Player;

public class Pawn extends Piece {
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
     * @param x the Pawn's X location
     * @param y the Pawn's Y location
     * @param player the Pawn's assigned player
     */
    public Pawn(int x, int y, Player player)
    {
        super(x, y, player);
        type = PieceType.Pawn;
    }
}
