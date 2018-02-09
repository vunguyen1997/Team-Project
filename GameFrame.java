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

public class GameFrame extends JFrame implements ActionListener {

  private JLabel diceLabel, boardLabel, turnLabel, dicePLabel;
  private JButton diceButton, humanButton;
  private int move = 0, turn = 0;

  public GameFrame() {
    super("Mario Party");
    setSize(1000, 600);

    diceLabel = new JLabel("Dice Roll:  ");
    diceLabel.setFont(new Font("Serif", Font.BOLD, 18));
    dicePLabel = new JLabel();
    dicePLabel.setIcon(new ImageIcon(getClass().getResource("dice0.png")));
    dicePLabel.setSize(1, 1);
    turnLabel = new JLabel("Turn:  ");
    turnLabel.setFont(new Font("Serif", Font.BOLD, 18));
    diceButton = new JButton("Roll Dice");
    humanButton = new HumanPlayer();

    diceButton.addActionListener(this);

    JPanel topPanel = new JPanel();
    topPanel.add(diceLabel);
    topPanel.add(turnLabel);

    JPanel centerPanel = new JPanel();

    try {
      BufferedImage boardPicture = ImageIO.read(this.getClass().getResource("board.png"));
      boardLabel = new JLabel(new ImageIcon(boardPicture));
      centerPanel.add(boardLabel);
    }
    catch (IOException e) {
      e.printStackTrace();
    }

    JPanel eastPanel = new JPanel();
    eastPanel.add(dicePLabel);

    JPanel bottomPanel = new JPanel();
		bottomPanel.add(diceButton);

    Container contentPane = getContentPane();
		contentPane.add(topPanel, BorderLayout.NORTH);
		contentPane.add(centerPanel, BorderLayout.WEST);
    contentPane.add(eastPanel, BorderLayout.EAST);
		contentPane.add(bottomPanel, BorderLayout.SOUTH);

    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == diceButton) {
      move = (int)(Math.random()*6 ) + 1;
      diceLabel.setText("Dice Roll: " + move);
      turn++;
      turnLabel.setText("Turn: " + turn);
      dicePLabel.setIcon(new ImageIcon(getClass().getResource("dice" + move + ".png")));
    }
  }

// after every 4 turns, get a minigame prompt to show up

  public static void main(String[] args) {
    new GameFrame().setVisible(true);
  }

}
