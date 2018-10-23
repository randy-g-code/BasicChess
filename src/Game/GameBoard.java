package Game;

public class GameBoard
{
    public int height;
    public int width;
    public Game game;

    /**
     *
     * @param height height of gameboard
     * @param width width of gameboard
     * @param game game object
     */
    public GameBoard(int height, int width, Game game)
    {
        this.height = height;
        this.width = width;
        this.game = game;
    }
}
