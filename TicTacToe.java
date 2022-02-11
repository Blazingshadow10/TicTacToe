import java.util.*;
import javax.swing.*;

public class TicTacToe{
	
	static String[] board;
	static String turn;
	
	/*CheckWinner method will
	decide the combination
	of three box given below.*/
	static String checkWinner()
	{
		for (int a = 0; a < 27; a++) {
			String line = null;

			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[0] + board[4] + board[8];
				break;
			case 2:
				line = board[0] + board[3] + board[6];
				break;
			case 3:
				line = board[1] + board[4] + board[7];
				break;
			case 4:
				line = board[2] + board[5] + board[8];
				break;
			case 5:
				line = board[2] + board[4] + board[6];
				break;
			case 6:
				line = board[3] + board[4] + board[5];
				break;
			case 7:
				line = board[6] + board[7] + board[8];
				break;
			case 8:
				line = board[9] + board[10] + board[11];
				break;
			case 9:
				line = board[9] + board[13] + board[17];
				break;
			case 10:
				line = board[9] + board[12] + board[15];
				break;
			case 11:
				line = board[10] + board[13] + board[16];
				break;
			case 12:
				line = board[11] + board[14] + board[17];
				break;
			case 13:
				line = board[11] + board[13] + board[15];
				break;
			case 14:
				line = board[12] + board[13] + board[14];
				break;
			case 15:
				line = board[15] + board[16] + board[17];
				break;
			case 16:
				line = board[18] + board[19] + board[20];
				break;
			case 17:
				line = board[18] + board[22] + board[26];
				break;
			case 18:
				line = board[18] + board[21] + board[24];
				break;
			case 19:
				line = board[19] + board[22] + board[25];
				break;
			case 20:
				line = board[20] + board[23] + board[26];
				break;
			case 21:
				line = board[20] + board[22] + board[24];
				break;
			case 22:
				line = board[21] + board[22] + board[23];
				break;
			case 23:
				line = board[24] + board[25] + board[26];
				break;
			case 24:
				line = board[0] + board[9] + board[18];
				break;
			case 25:
				line = board[0] + board[10] + board[20];
				break;
			case 26:
				line = board[0] + board[12] + board[15];
				break;
			case 27:
				line = board[0] + board[13] + board[26];
				break;
			case 28:
				line = board[1] + board[10] + board[19];
				break;
			case 29:
				line = board[1] + board[13] + board[25];
				break;
			case 30:
				line = board[2] + board[11] + board[20];
				break;
			case 31:
				line = board[2] + board[10] + board[18];
				break;
			case 32:
				line = board[2] + board[14] + board[26];
				break;
			case 33:
				line = board[2] + board[13] + board[24];
				break;
			case 34:
				line = board[3] + board[12] + board[21];
				break;
			case 35:
				line = board[3] + board[13] + board[23];
				break;
			case 36:
				line = board[4] + board[13] + board[22];
				break;
			case 37:
				line = board[5] + board[14] + board[23];
				break;
			case 38:
				line = board[6] + board[15] + board[24];
				break;
			case 39:
				line = board[6] + board[16] + board[26];
				break;
			case 40:
				line = board[6] + board[12] + board[18];
				break;
			case 41:
				line = board[6] + board[13] + board[20];
				break;
			case 42:
				line = board[7] + board[16] + board[25];
				break;
			case 43:
				line = board[8] + board[17] + board[26];
				break;
			case 44:
				line = board[8] + board[16] + board[24];
				break;
			case 45:
				line = board[8] + board[14] + board[20];
				break;
			case 46:
				line = board[8] + board[13] + board[18];
				break;
			}
			//For X winner
			if (line.equals("XXX")) {
				return "X";
			}
			
			// For O winner
			else if (line.equals("OOO")) {
				return "O";
			}
		}
		
		for (int a = 0; a < 27; a++) {
			if (Arrays.asList(board).contains(
					String.valueOf(a + 1))) {
				break;
			}
			else if (a == 26) {
				return "draw";
			}
		}

	// To enter the X Or O at the exact place on board.
		System.out.println(
			turn + "'s turn; enter a slot number to place "
			+ turn + " in:");
		return null;
	}
	
	// Prints 3 tic tac toe game boards
	static void printBoard()
	{
		System.out.println("|---|---|---|" + "	|----|----|----|" + "	|----|----|----|");
		System.out.println("| " + board[0] + " | "
						+ board[1] + " | " + board[2]
						+ " |"+"	| " + board[9] + " | "
						+ board[10] + " | " + board[11] 
						+ " | " + "	| " + board[18] + " | "
						+ board[19] + " | " + board[20]
						+ " |");
		System.out.println("|-----------|"+"	|--------------|" + "	|--------------|");
		System.out.println("| " + board[3] + " | "
						+ board[4] + " | " + board[5]
						+ " |"+"	| " + board[12] + " | "
						+ board[13] + " | " + board[14]
						+ " |"+"	| " + board[21] + " | "
						+ board[22] + " | " + board[23]
						+ " |");
		System.out.println("|-----------|" + "	|--------------|" + "	|--------------|");
		System.out.println("| " + board[6] + " | "
						+ board[7] + " | " + board[8]
						+ " |" + "	| " + board[15] + " | "
						+ board[16] + " | " + board[17]
						+ " |" + "	| " + board[24] + " | "
						+ board[25] + " | " + board[26 ]
						+ " |");
		System.out.println("|---|---|---|" + "	|----|----|----|" + "	|----|----|----|");
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		board = new String[27];
		turn = "X";
		String winner = null;

		for (int a = 0; a < 27; a++) {
			board[a] = String.valueOf(a + 1);
		}

		System.out.println("Welcome to 3x3x3 Tic Tac Toe.");
		printBoard();

		System.out.println(
			"X will play first. Enter a slot number to place X in:");

		while (winner == null) {
			int numInput;
			
		/* Exception handling.
		numInput will take input from user like from 1 to 9.
		If it is not in range from 1 to 9.
		then it will show you an error "Invalid input." */
			try {
				numInput = in.nextInt();
				if (!(numInput > 0 && numInput <= 27)) {
					System.out.println(
						"Invalid input; re-enter slot number:");
					continue;
				}
			}
			catch (InputMismatchException e) {
				System.out.println(
					"Invalid input; re-enter slot number:");
				continue;
			}
			
			// This game has two player x and O.
			// Here is the logic to decide the turn.
			if (board[numInput - 1].equals(
					String.valueOf(numInput))) {
				board[numInput - 1] = turn;

				if (turn.equals("X")) {
					turn = "O";
				}
				else {
					turn = "X";
				}

				printBoard();
				winner = checkWinner();
			}
			else {
				System.out.println(
					"Slot already taken; re-enter slot number:");
			}
		}
		
		// If it is a draw or a win
		if (winner.equalsIgnoreCase("draw")) {
			System.out.println(
				"It's a draw! Thanks for playing.");
		}
		else {
			System.out.println(
				"Congratulations! " + winner
				+ "'s have won! Thanks for playing.");
		}
	}
}