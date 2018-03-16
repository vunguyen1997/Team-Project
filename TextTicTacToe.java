import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class TextTicTacToe {
	static Scanner in;
	static String[] board;
	static String turn;
	static Random rd;
	static String winner;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		rd = new Random();
		board = new String[9];
		turn = "X";
		String winner = null;
		populateEmptyBoard();

		System.out.println("Welcome to 2 Player Tic Tac Toe!");
		printBoard();

		System.out.println("Select mode: ");
		System.out.println("(1): Player vs Computer ");
		System.out.println("(2): Player vs Player   ");
		int input = in.nextInt();
		if (input == 1){
			p1_vs_ai();
		}else if (input == 2){
			p1_vs_p2();
		}else{
			System.out.println("Please choose 1 or 2!");

		}
	}

		static void p1_vs_ai(){
			printBoard();
			System.out.println("Enter the number to be replaced with X, O's are up next.");
			while (winner == null) {

				int numInput;
				int comInput;
				try {
					comInput = rd.nextInt(9)+1;
					numInput = in.nextInt();

					if (!(numInput > 0 && numInput <= 9)) {
						System.out.println("Invalid input; re-enter slot number:");
						continue;
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid input; re-enter slot number:");
					continue;
				}

				if (board[numInput-1].equals(String.valueOf(numInput))) {
					board[numInput-1] = turn;
					if (turn.equals("X")) {
						turn = "O";
					} else {
						turn = "X";
					}
					printBoard();
					winner = checkWinner();
				}else {
					System.out.println("Slot already taken; re-enter slot number:");
					continue;
				}
				while (!(board[comInput-1].equals(String.valueOf(comInput)))) {
				 comInput = rd.nextInt(9)+1;
			 }
				 board[comInput-1] = turn;
				 if (turn.equals("X")) {
					 turn = "O";
				 } else {
					 turn = "X";
					}
				 printBoard();
				 winner = checkWinner();


			}
			if (winner.equalsIgnoreCase("draw")) {
				System.out.println("It's a draw! Thanks for playing.");
			} else {
				System.out.println("Congratulations! " + winner + "'s have won!");
			}
		}

		static void p1_vs_p2(){
			printBoard();
			System.out.println("Enter the number to be replaced with X, O's are up next.");
			while (winner == null) {
				int numInput;
				try {
					numInput = in.nextInt();
					if (!(numInput > 0 && numInput <= 9)) {
						System.out.println("Invalid input; re-enter slot number:");
						continue;
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid input; re-enter slot number:");
					continue;
				}
				if (board[numInput-1].equals(String.valueOf(numInput))) {
					board[numInput-1] = turn;
					if (turn.equals("X")) {
						turn = "O";
					} else {
						turn = "X";
					}
					printBoard();
					winner = checkWinner();
				} else {
					System.out.println("Slot already taken; re-enter slot number:");
					continue;
				}
			}
			if (winner.equalsIgnoreCase("draw")) {
				System.out.println("It's a draw! Thanks for playing.");
			} else {
				System.out.println("Congratulations! " + winner + "'s have won!");
			}
		}



	static void populateEmptyBoard() {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a+1);
		}
	}

	static String checkWinner() {
		for (int a = 0; a < 8; a++) {
			String line = null;
			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("XXX")) {
				return "X";
			} else if (line.equals("OOO")) {
				return "O";
			}
		}

		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(String.valueOf(a+1))) {
				break;
			}
			else if (a == 8) return "draw";
		}

		System.out.println(turn + "'s turn; enter a number to place " + turn + " in:");
		return null;
	}

	static void printBoard() {
		System.out.println("This is the game board, entering your X or O replaces the number with the symbol.");
		System.out.println("/---|---|---\\");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("/---|---|---\\");
	}
}
