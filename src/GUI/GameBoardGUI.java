package GUI;

import Game.Game;
import Game.Player;
import Pieces.Piece;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameBoardGUI
{
    Game game;
    boolean endOfTurn = false;


    public static void main(String[] args) throws InterruptedException
    {
        ChessGame CG = new ChessGame();
        CG.game();
    }

    public synchronized void waitForInput()
    {
        while(!endOfTurn)
        {
            try{
                wait();
            } catch (InterruptedException e){ e.printStackTrace();}
        }
    }

    /**
     * Initializes the GUI.
     */
    public GameBoardGUI() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Chess");
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                ChessGUI window = new ChessGUI();
                frame.add(window);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e){
        JButton button = (JButton) e.getSource();
    }
}
