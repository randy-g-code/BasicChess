package Game;

public class Game
{
    public GameBoard board;
    public Player p1;
    public Player p2;
    public int turn;
    public boolean validMove = false;
    public boolean canCapture = false;

    /**
     * Default Constructor to Create a Standard Game of Chess
     */
    public Game()
    {
        board = new GameBoard(8,8, this);
        turn = 1;
        p1 = new Player(PlayerColor.WHITE, true);
        p2 = new Player(PlayerColor.BLACK, false);
        p1.game = this;
        p2.game = this;
    }

}
