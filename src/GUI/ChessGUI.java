package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Draws out the entire Chess Game
 */
public class ChessGUI extends JPanel
{
    public ChessGUI()
    {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        //Generate Buttons in an 8x8 Grid
        for (int row = 0; row < 8; row++)
        {
            for (int col = 0; col < 8; col++)
            {
                gbc.gridx = col;
                gbc.gridy = row;
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(50, 50));

                //Set Proper Colors for Chess Board
                Color newBlue = new Color (179, 204, 255);
                Color newGrey = new Color(102, 102, 102);
                if((row + col )% 2 == 0)
                {button.setBackground(newBlue);}
                else
                {button.setBackground(newGrey);}

                /* Set Chess Piece Image Based on Board Position */
                setImage(row, col, button);

                MyActionListener Listener = new MyActionListener();
                button.addActionListener(Listener);
                add(button, gbc);
            }
        }
    }

    //Create and Edit Menu Bar and Options
    public JMenuBar createMenuBar(JFrame frame)
    {
        final JMenuBar gameMenuBar = new JMenuBar();
        gameMenuBar.add(createFileMenu(frame));
        return gameMenuBar;
    }

    private JMenu createFileMenu(JFrame frame)
    {
        final JMenu fileMenu = new JMenu("File");

        final JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitMenuItem);

        final JMenuItem saveScreenShot = new JMenuItem("Screen Shot");
        saveScreenShot.addActionListener(e ->
        {
            Container c = frame.getContentPane();
            BufferedImage bufImage = new BufferedImage(c.getWidth(), c.getHeight(),BufferedImage.TYPE_INT_RGB);

            c.print(bufImage.getGraphics());
            String path = System.getProperty("user.dir");
            File imageFile = new File(path, "ChessScreenShot.png");
            try
            {
                imageFile.createNewFile();
                ImageIO.write(bufImage, "png", imageFile);
            }
            catch(Exception ex){}
        });
        fileMenu.add(saveScreenShot);

        return fileMenu;
    }

    //Looks at the row and column sent and returns the appropriate chess piece image
    private void setImage(int row, int col, JButton B)
    {
        //Set Pawns
        if (row == 1) //Black
        {
            try
            {
                Image BP = ImageIO.read(getClass().getResource("../Assets/BPawn.png"));
                B.setIcon(new ImageIcon(BP));
            }
            catch (IOException e) { }
        }
        if (row == 6) //White
        {
            try
            {
                Image WP = ImageIO.read(getClass().getResource("../Assets/WPawn.png"));
                B.setIcon(new ImageIcon(WP));
            }
            catch (IOException e) { }
        }


        //Set Rooks
        if (row == 0 && (col == 0 || col == 7))
        {
            try
            {
                Image BR = ImageIO.read(getClass().getResource("../Assets/BRook.png"));
                B.setIcon(new ImageIcon(BR));
            }
            catch (IOException e) { }
        }
        if (row == 7 && (col == 0 || col == 7))
        {
            try
            {
                Image WR = ImageIO.read(getClass().getResource("../Assets/WRook.png"));
                B.setIcon(new ImageIcon(WR));
            }
            catch (IOException e) { }
        }


        //Set Knights
        if (row == 0 && (col == 1 || col == 6))
        {
            try
            {
                Image BK = ImageIO.read(getClass().getResource("../Assets/BKnight.png"));
                B.setIcon(new ImageIcon(BK));
            }
            catch (IOException e) { }
        }
        if (row == 7 && (col == 1 || col == 6))
        {
            try
            {
                Image WK = ImageIO.read(getClass().getResource("../Assets/WKnight.png"));
                B.setIcon(new ImageIcon(WK));
            }
            catch (IOException e) { }
        }

        //Set Bishops
        if (row == 0 && (col == 2 || col == 5))
        {
            try
            {
                Image BB = ImageIO.read(getClass().getResource("../Assets/BBishop.png"));
                B.setIcon(new ImageIcon(BB));
            }
            catch (IOException e) { }
        }
        if (row == 7 && (col == 2 || col == 5))
        {
            try
            {
                Image WB = ImageIO.read(getClass().getResource("../Assets/WBishop.png"));
                B.setIcon(new ImageIcon(WB));
            }
            catch (IOException e) { }
        }

        //Set Kings
        if (row == 0 && col == 4)
        {
            try
            {
                Image BKing = ImageIO.read(getClass().getResource("../Assets/BKing.png"));
                B.setIcon(new ImageIcon(BKing));
            }
            catch (IOException e) { }
        }
        if (row == 7 && col == 4)
        {
            try
            {
                Image WKing = ImageIO.read(getClass().getResource("../Assets/WKing.png"));
                B.setIcon(new ImageIcon(WKing));
            }
            catch (IOException e) { }
        }

        //Set Queens
        if (row == 0 && col == 3)
        {
            try
            {
                Image BQ = ImageIO.read(getClass().getResource("../Assets/BQueen.png"));
                B.setIcon(new ImageIcon(BQ));
            }
            catch (IOException e) { }
        }
        if (row == 7 && col == 3)
        {
            try
            {
                Image WQ = ImageIO.read(getClass().getResource("../Assets/WQueen.png"));
                B.setIcon(new ImageIcon(WQ));
            }
            catch (IOException e) { }
        }

    }
}
