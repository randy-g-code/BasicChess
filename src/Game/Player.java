package Game;

public class Player
{

    public PlayerColor playerC;
    public Game game;
    public boolean turnPlayer;

    /**
     * @param color assigned color for player
     * @param turnPlayer determines if it's the player's turn or not
     */
    public Player(PlayerColor color, boolean turnPlayer)
    {
        this.playerC = color;
        this.turnPlayer = turnPlayer;
    }

    public boolean isTurn()
    {
        return turnPlayer;
    }
}
