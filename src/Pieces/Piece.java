package Pieces;

import Game.Player;

public abstract class Piece
{
    public abstract PieceType getPiece();

    public abstract void canCapture(int finalx, int finaly);

    public abstract boolean canMove(int finalx, int finaly);

    public int x, y;
    public Player player;

    /**
     * Super Constructor for a Piece.
     * @param x    the Vertical location of the Piece
     * @param y    the Horizontal location of the Piece
     * @param player    the Player object associated with the Piece
     */
    public Piece(int x, int y, Player player)
    {
        this.x = x;
        this.y = y;
        this.player = player;
        this.player.game.board.gameBoardArray[x][y] = this;
    }
}
