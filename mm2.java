import java.util.Scanner;
import java.util.InputMismatchException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class mm2  {
 	private static int Players =0;
	private static int HumanPlayers =0;
	private static int AIplayers = 0;
 
  mm2() {
    
    JFrame f = new JFrame("Main Menu - Game Setup");
    f.setSize(800, 800);

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JMenuBar jmb = new JMenuBar();

    JMenu jmSNOP = new JMenu("Set Number Of  Human Players"); //set the number of Human players
    JMenuItem jmiP1 = new JMenuItem("One");                 //will be asked if remaining spots to be filled with AI
    JMenuItem jmiP2 = new JMenuItem("Two");
    JMenuItem jmiP3 = new JMenuItem("Three");
    JMenuItem jmiP4 = new JMenuItem("Four");
    jmSNOP.add(jmiP1);
    jmSNOP.add(jmiP2);
    jmSNOP.add(jmiP3);
    jmSNOP.add(jmiP4);
    jmb.add(jmSNOP);

    JMenu jmSM = new JMenu("Set Minigames"); //set wether the player wants all the games or just one that they like
    JMenu CG = new JMenu("choose games");
    JMenuItem CG1 = new JMenuItem("game one");
    JMenuItem CG2 = new JMenuItem("game two");
    JMenuItem CG3 = new JMenuItem("game three");
    CG.add(CG1);
    CG.add(CG2);
    CG.add(CG3);
    jmSM.add(CG);

    jmb.add(jmSM);

    JMenu jmSPI = new JMenu("Set Player Icons"); //set the player icon
    JMenu I = new JMenu("choose human player Icon");
    JMenuItem I1 = new JMenuItem("icon one");
    JMenuItem I2 = new JMenuItem("icon two");
    JMenuItem I3 = new JMenuItem("icon three");
    JMenuItem I4 = new JMenuItem("icon four");
    I.add(I1);
    I.add(I2);
    I.add(I3);
    I.add(I4);
    jmSPI.add(I);

    jmb.add(jmSPI);



    f.setJMenuBar(jmb);
    f.setVisible(true);
  }

  public static void main(String args[]) {
    new mm2();
    int numPlayers = 0;
		int numHumanPlayers = 0;
		int numAIplayers = 0;
		int enter =0;
		boolean menuSet = false;
		do {
			try {
				Scanner input = new Scanner(System.in);
				System.out.println("How many Players?");					
				enter = input.nextInt();
				if (enter <=1 || enter >4){
					System.out.println("Please enter a number between 2 and 4");
					enter = input.nextInt();
				}
				else{
					numPlayers = enter;	
				}
								
				System.out.println("How many Human Players?");
				enter = input.nextInt();
				if (enter <=1 || enter >4){
					System.out.println("Please enter a number between 2 and 4");
					enter = input.nextInt();
				}
				else{
					numHumanPlayers = enter;	
					numAIplayers = numPlayers - numHumanPlayers;
					menuSet = true;
				}
				}
			catch(InputMismatchException exception){
				System.out.println("Please enter a valid number");
			}
			
			} while (menuSet = false);
  }
}

/*	public  void setNumberofPlayers(int numPlayers) {
			this.Players = numPlayers;
		}
		
	public int getNumberofPlayers(){
		return Players;
	}
	
	public  void setNumberofHumanplayers(int numHumanPlayers){
		this.HumanPlayers = numHumanPlayers;
	}
	
	public int getNumberofHumanplayers(){
		return HumanPlayers;
	}
	public  void setNumberofAIplayers(int numAIplayers){
		this.AIplayers = numAIplayers;
		
	}
	
	public int getNumberofAIplayers(){
		return AIplayers;
	
	
	}




} */


























