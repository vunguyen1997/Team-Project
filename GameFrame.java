import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GameFrame extends JFrame implements ActionListener {

  private JLabel diceLabel, boardLabel, turnLabel, dicePLabel, playerLabel;
  private JButton diceButton;
  private int move = 0, turn = 0;

  public GameFrame() {
    super("Mario Party");
    setSize(1000, 800);

    diceLabel = new JLabel("Dice Roll:  ");
    diceLabel.setFont(new Font("Serif", Font.BOLD, 18));
    dicePLabel = new JLabel();
    dicePLabel.setIcon(new ImageIcon(getClass().getResource("dice0.png")));
    dicePLabel.setSize(1, 1);
    turnLabel = new JLabel("Turn:  ");
    turnLabel.setFont(new Font("Serif", Font.BOLD, 18));
    boardLabel = new JLabel();
    boardLabel.setIcon(new ImageIcon(getClass().getResource("board.png")));
    diceButton = new JButton("Roll Dice");
    playerLabel = new HumanPlayer();

    diceButton.addActionListener(this);

    JPanel topPanel = new JPanel();
    topPanel.add(diceLabel);
    topPanel.add(turnLabel);

    JPanel westPanel = new JPanel();
    westPanel.add(playerLabel);

    JPanel centerPanel = new JPanel();
    centerPanel.add(boardLabel);

    JPanel eastPanel = new JPanel();
    eastPanel.add(dicePLabel);

    JPanel bottomPanel = new JPanel();
		bottomPanel.add(diceButton);

    Container contentPane = getContentPane();
		contentPane.add(topPanel, BorderLayout.NORTH);
    contentPane.add(westPanel, BorderLayout.WEST);
		contentPane.add(centerPanel, BorderLayout.CENTER);
    contentPane.add(eastPanel, BorderLayout.EAST);
		contentPane.add(bottomPanel, BorderLayout.SOUTH);

    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == diceButton && turn < 20) {
      move = (int)(Math.random()*6 ) + 1;
      diceLabel.setText("Dice Roll: " + move);
      turn++;
      turnLabel.setText("Turn: " + turn);
      dicePLabel.setIcon(new ImageIcon(getClass().getResource("dice" + move + ".png")));

      if(turn == 4 || turn == 8 || turn == 12 || turn == 16 || turn == 20) {
        boardLabel.setIcon(new ImageIcon(getClass().getResource("minigame1.png")));
      }
      else boardLabel.setIcon(new ImageIcon(getClass().getResource("board.png")));
    }
    else if(turn == 20) {
      boardLabel.setIcon(new ImageIcon(getClass().getResource("end.png")));
    }
  }

  public static void main(String[] args) {
    new GameFrame().setVisible(true);
  }

}
