package GUI;

import Game.Game;

public class ChessGame
{
    public void game()
    {
        GameBoardGUI GUI = new GameBoardGUI();
        GUI.game = new Game();
        GUI.waitForInput();
    }


}
