import java.awt.image.BufferedImage;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HumanPlayer extends JLabel {

private BufferedImage playerPicture;

  public HumanPlayer() {
    ImageIcon player = new ImageIcon("player.png");
    super.setIcon(player);
  }

}

/**
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Color;

public void paintComponents(Graphics g) {
  super.paintComponents(g);
  ImageIcon player = new ImageIcon("player.png");
  player.paintIcon(this, g, 300, 300);
}

*/
