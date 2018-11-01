package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Draws out the entire Chess Game
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
                Color newBlue = new Color (179, 204, 255);
                Color newGrey = new Color(102, 102, 102);
                if((row + col )% 2 == 0)
                {button.setBackground(newBlue);}
                else
                {button.setBackground(newGrey);}

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
}
