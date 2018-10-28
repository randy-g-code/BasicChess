package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Draws out the entire Chess Board Using Grid Layout and Buttons
 */
public class ChessGUI extends JPanel {

    public ChessGUI()
    {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        for (int row = 0; row < 8; row++)
        {
            for (int col = 0; col < 8; col++)
            {
                gbc.gridx = col;
                gbc.gridy = row;
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(100, 100));

                //Set Proper Colors for Chess Board
                if((row + col )% 2 == 0)
                {button.setBackground(java.awt.Color.white);}
                else
                {button.setBackground(Color.lightGray);}

                MyActionListener Listener = new MyActionListener();
                button.addActionListener(Listener);
                add(button, gbc);
            }
        }
    }
}
