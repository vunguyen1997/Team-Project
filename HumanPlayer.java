import java.awt.Graphics;
import java.awt.Container;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HumanPlayer extends JButton {

private BufferedImage playerPicture;

  public HumanPlayer() {
    ImageIcon player = new ImageIcon("player.png");
    super.setIcon(player);
    Image img = player.getImage();
    Image newimg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_DEFAULT);
    player = new ImageIcon(newimg);
  }

  public void paintComponents(Graphics g) {
    super.paintComponents(g);
    ImageIcon player = new ImageIcon("player.png");
    player.paintIcon(this, g, 300, 300);
  }

}

/**



try {
  playerPicture = ImageIO.read(this.getClass().getResource("player.png"));
}
catch (IOException e) {
  e.printStackTrace();
}

*/
