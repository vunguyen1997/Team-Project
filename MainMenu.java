import java.util.Scanner;
import java.util.InputMismatchException;

public class MainMenu {
	
	private static int Players =0;
	private static int HumanPlayers =0;
	private static int AIplayers = 0;
	
	public static void main(String[] args) {
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
				enter = input.nextInt()
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

	public  void setNumberofPlayers(int numPlayers) {
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






























}