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
                button.setBorderPainted(true);
                button.setPreferredSize(new Dimension(100, 100));
                button.setBackground(java.awt.Color.white);
                MyActionListener mal = new MyActionListener();
                button.addActionListener(mal);
                add(button, gbc);

            }
        }
    }
}
