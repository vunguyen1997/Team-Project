import java.io.*; //allows user input
import java.awt.*; //for the frame
import javax.swing.*; //for the frame

public class MarioParty { //main class

  public static void main (String[] args) throws IOException { //main method

    public class gameFrame implements Runnable { //class to create frame where game will eventually be displayed
        gameFrame Frame = new gameFrame();
        SwingUtilities.invokeLater(Frame);
    }

    public void run() {
        JFrame frame = new JFrame("GameFrame");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(900, 800));
        frame.pack();
        frame.setVisible(true);
    }

    public static int dice (int diceRoll) {
        diceRoll = (int)(Math.random()*6 )+1 ; //creates the dice
        int move = diceRoll; //adds the dice roll to get a move for a player
        return move; //this will send how far the player will move once the movement is implemented
    }

  }

  public class board {
    int [][] board = new int[4][]; //created the possble 4 lanes depending on players
    board[0] = new int[30];        //each lane is of length 30 and the players position will be set-
    board[1] = new int[30];        //to a point in the array corresponding to the movement dependant
    board[2] = new int[30];        //on what the player rolls on the dice
    board[3] = new int[30];        //certain points in the array will have special actions(mini games..)
    //the main game method will access the array if the point in the array is that of special action it will
    //initiate either the mini game or action
  }

}
