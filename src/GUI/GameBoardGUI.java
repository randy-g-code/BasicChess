package GUI;

import Game.Game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameBoardGUI
{
    Game game;
    boolean endOfTurn = false;

    public static void main(String[] args)
    {
        ChessGame CG = new ChessGame();
        CG.game();
    }

    /**
     * Instantiates the GUI.
     */
    public GameBoardGUI() {
        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("Basic Chess - Randy Gopaul");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());
            ChessGUI window = new ChessGUI();
            frame.setJMenuBar(window.createMenuBar(frame));
            frame.add(window);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
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

    public synchronized  void notifyInput()
    {
        endOfTurn = true;
        notifyAll();
    }
}

/**
 * Action Listener that Listens to What Square is Clicked On the Board
 */
class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e){
        JButton button = (JButton) e.getSource();
    }
}
