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

  private JLabel diceLabel, boardLabel, turnLabel;
  private JButton diceButton, humanButton;
  private int move = 0, turn = 0;

  public GameFrame() {
    super("Mario Party");
    setSize(800, 700);

    diceLabel = new JLabel("Dice Roll:  ");
    diceLabel.setFont(new Font("Serif", Font.BOLD, 18));
    turnLabel = new JLabel("Turn:  ");
    turnLabel.setFont(new Font("Serif", Font.BOLD, 18));
    diceButton = new JButton("Roll Dice");
    humanButton = new HumanPlayer();
    humanButton.setLocation(400, 400);

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

    centerPanel.add(humanButton);

    JPanel bottomPanel = new JPanel();
		bottomPanel.add(diceButton);

    Container contentPane = getContentPane();
		contentPane.add(topPanel, BorderLayout.NORTH);
		contentPane.add(centerPanel, BorderLayout.CENTER);
		contentPane.add(bottomPanel, BorderLayout.SOUTH);

    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == diceButton) {
      move = (int)(Math.random()*6 ) + 1;
      diceLabel.setText("Dice Roll: " + move);
      turn++;
      turnLabel.setText("Turn: " + turn);
    }
  }

  public static void main(String[] args) {
    new GameFrame().setVisible(true);
  }

}
