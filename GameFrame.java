import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GameFrame extends JFrame implements ActionListener {

  private JButton diceButton;

  public GameFrame() {

    super("Mario Party");
    setSize(900, 800);

    diceButton = new JButton("Roll Dice");

    diceButton.addActionListener(this);

    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == diceButton) {
      public int dice (int diceRoll) {
          diceRoll = (int)(Math.random()*6 ) + 1;
          int move = diceRoll;
          return move;
      }
    }
  }

  public static void main(String[] args) {
    new GameFrame().setVisible(true);
  }

}
