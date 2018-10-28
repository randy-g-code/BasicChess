package Game;

import Pieces.*;

import java.util.Vector;

public class GameBoard
{
    public int height;
    public int width;
    public Game game;
    public Piece[][] gameBoardArray;
    public Vector<Piece> white = new Vector<>(16);
    public Vector<Piece> black = new Vector<>(16);

    /**
     * @param height height of gameboard
     * @param width width of gameboard
     * @param game game object
     */
    public GameBoard(int height, int width, Game game)
    {
        this.height = height;
        this.width = width;
        this.game = game;
        gameBoardArray = new Piece[height][width];
        setupPieces();
    }

    /**
     * Setup all Pieces for the Game
     */
    public void setupPieces()
    {
        setP1Pieces();
        setP2Pieces();
        setPieceVectors();
    }

    /**
     * Preset Pieces for Player 1
     */
    public void setP1Pieces()
    {
        //Create a copy of gameboard
        Piece[][] board = this.gameBoardArray;

        //Fill board with pieces
        for(int i = 0; i < board.length; i++)
        {
            Piece pawn = new Pawn(i, 6, this.game.p1);
            board[i][6] = pawn;
        }

        //Assign Pieces to correct rows and columns of the board
        Piece rook = new Rook(0, 7, this.game.p1);
        Piece rook2 = new Rook(7, 7, this.game.p1);

        Piece knight = new Knight(1, 7, this.game.p1);
        Piece knight2 = new Knight(6,7, this.game.p1);

        Piece bishop = new Bishop(2, 7, this.game.p1);
        Piece bishop2 = new Bishop(5, 7, this.game.p1);

        Piece queen = new Queen(3, 7, this.game.p1);
        King king = new King(4, 7, this.game.p1);
    }

    /**
     * Preset Pieces for Player 2
     */
    public void setP2Pieces()
    {
        //Create a copy of gameboard
        Piece[][] board = this.gameBoardArray;

        //Fill board with pieces
        for(int i = 0; i < 8; i++)
        {
            Piece pawn = new Pawn(i, 1, this.game.p2);
        }

        //Assign Pieces to correct rows and columns of the board
        Piece topRook = new Rook(0, 0, this.game.p2);
        Piece bottomRook = new Rook(7, 0, this.game.p2);

        Piece topKnight = new Knight(1, 0, this.game.p2);
        Piece bottomKnight = new Knight(6, 0, this.game.p2);

        Piece topBishop = new Bishop(2, 0, this.game.p2);
        Piece bottomBishop = new Bishop(5, 0, this.game.p2);

        Piece queen = new Queen(3, 0, this.game.p2);
        King king = new King(4, 0, this.game.p2);
    }

    //Set Vector Positions for Pieces Based on Color
    public void setPieceVectors()
    {
        for(int i = 0; i < 8; i++)
        {
            white.add(this.gameBoardArray[i][6]);
            white.add(this.gameBoardArray[i][7]);
            black.add(this.gameBoardArray[i][0]);
            black.add(this.gameBoardArray[i][1]);
        }
    }
}
