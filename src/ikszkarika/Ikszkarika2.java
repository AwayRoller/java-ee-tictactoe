package ikszkarika;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Ikszkarika2 {
	
	//Array to hold the X or O in each space (Default value: '_')
	public static char[] place = { '_', '_', '_', '_', '_', '_', '_', '_', '_' };
	
	//Variable to hold X or O for user
	public static char team = '_';
	
	//Variable to hold X or O for opponent team
	public static char opp = '_';
	
	//User String a scannerhez
	public static String usrStr;
	
	/**
	 * Udvozles es setup method futtatasa
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("WELCOME TO IKSZKARIKA2!");
		
		//setup elotti tesztelesre csak a kirajzolas
		//drawBoard();
		
		choice();
	}
	
	//prints the board out
	public static void drawBoard() {
		
		System.out.println("\n\t     A   B   C");
		
		//heading row
		System.out.println("\t   .-----------.");
		//1st game row
		System.out.println("\t 1 |_"+Ikszkarika2.place[0]+"_|_"+Ikszkarika2.place[1]+"_|_"+Ikszkarika2.place[2]+"_|");
		//2nd game row
		System.out.println("\t 2 |_"+Ikszkarika2.place[3]+"_|_"+Ikszkarika2.place[4]+"_|_"+Ikszkarika2.place[5]+"_|");
		//3rd game row
		System.out.println("\t 3 |_"+Ikszkarika2.place[6]+"_|_"+Ikszkarika2.place[7]+"_|_"+Ikszkarika2.place[8]+"_|");
		
		System.out.println("\t   '-----------'");
		
	}
	
	
	public static void choice() {
		//user vs comp or user choice
		System.out.println("\n\n Select mode: ");
		System.out.println("1) vs. CPU");
		System.out.println("2) vs. Player2");
				
		System.out.print("Enter your selection: ");
		Scanner input = new Scanner(System.in);
		String a = input.next();
				
		switch (a) {
			case "1" : setup();; break;
			case "2" : setupVs(); break;
		}		
		
		
	}
	
	/**
	 * reset the game
	 */
	public static void setup() {
		
		//loop that resets the char array to default
		for (int i = 0 ; i < 9 ; i++ ) {
			Ikszkarika2.place[i] = '_';
		}
		
		//Print the clean board to the console 
		drawBoard();
		
		//user X or O choice
		while( (Ikszkarika2.team != 'X') && (Ikszkarika2.team != 'O') ) {
			
			System.out.println("\n\n Select your team! Enter 'X' or 'O' below...");
			
			System.out.print("Enter your selection: ");
			Scanner input = new Scanner(System.in);
			Ikszkarika2.usrStr = input.next();
			
			if (Ikszkarika2.usrStr.toUpperCase().equals("X")) {
				
				Ikszkarika2.team = 'X';
				Ikszkarika2.opp = 'O';
				
			} else if (Ikszkarika2.usrStr.toUpperCase().equals("O")) {
				
				Ikszkarika2.team = 'O';
				Ikszkarika2.opp = 'X';
				
			} else {
				
				System.out.println("You entered: " + usrStr);
				System.out.println("This is not a valid option!");
				System.out.println("Please enter either an X or an O to continue");
				
			}
			
		}
		
		System.out.println("\n You are team " + Ikszkarika2.team + "!");
		
		//Run the game method
		game();
		
	}
	
	public static void setupVs() {
		
		//loop that resets the char array to default
		for (int i = 0 ; i < 9 ; i++ ) {
			Ikszkarika2.place[i] = '_';
		}
		
		//Print the clean board to the console 
		drawBoard();
		
		//user X or O choice
		while( (Ikszkarika2.team != 'X') && (Ikszkarika2.team != 'O') ) {
			
			System.out.println("\n\n Select your team! Enter 'X' or 'O' below...");
			
			System.out.print("Enter your selection: ");
			Scanner input = new Scanner(System.in);
			Ikszkarika2.usrStr = input.next();
			
			if (Ikszkarika2.usrStr.toUpperCase().equals("X")) {
				
				Ikszkarika2.team = 'X';
				Ikszkarika2.opp = 'O';
				
			} else if (Ikszkarika2.usrStr.toUpperCase().equals("O")) {
				
				Ikszkarika2.team = 'O';
				Ikszkarika2.opp = 'X';
				
			} else {
				
				System.out.println("You entered: " + usrStr);
				System.out.println("This is not a valid option!");
				System.out.println("Please enter either an X or an O to continue");
				
			}
			
		}
		
		System.out.println("\n You are team " + Ikszkarika2.team + "!");
		
		//Run the game method
		player1();
		
	}
	
	public static void game() {
		
		
		// Local variable to run loop
		boolean loop = true;
		
		System.out.println("IT'S YOUR TURN");
		
		drawBoard();
		
		do {
			
			System.out.println("\n\nChoose a column and row to place an " + Ikszkarika2.team + 
					". (EXAMPLE: A1)\n");
			
			System.out.print("Enter your selection: ");
			Scanner input = new Scanner(System.in);
			Ikszkarika2.usrStr = input.next().toUpperCase();
			
			switch (Ikszkarika2.usrStr)
			{
				case "A1" : if (Ikszkarika2.place[0] == '_') {
				
					Ikszkarika2.place[0] = Ikszkarika2.team;
					System.out.println("\nYou placed an " + Ikszkarika2.team + " in A1");
					oppMove();
					loop = false;
				
				} else if (Ikszkarika2.place[0] == Ikszkarika2.team) {
					
					System.out.println("\nThere is an " + Ikszkarika2.team + " there already!");
					
				} else if (Ikszkarika2.place[0] == Ikszkarika2.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "B1" : if (Ikszkarika2.place[1] == '_') {
					
					Ikszkarika2.place[1] = Ikszkarika2.team;
					System.out.println("\nYou placed an " + Ikszkarika2.team + " in B1");
					oppMove();
					loop = false;
				
				} else if (Ikszkarika2.place[1] == Ikszkarika2.team) {
					
					System.out.println("\nThere is an " + Ikszkarika2.team + " there already!");
					
				} else if (Ikszkarika2.place[1] == Ikszkarika2.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "C1" : if (Ikszkarika2.place[2] == '_') {
					
					Ikszkarika2.place[2] = Ikszkarika2.team;
					System.out.println("\nYou placed an " + Ikszkarika2.team + " in C1");
					oppMove();
					loop = false;
				
				} else if (Ikszkarika2.place[2] == Ikszkarika2.team) {
					
					System.out.println("\nThere is an " + Ikszkarika2.team + " there already!");
					
				} else if (Ikszkarika2.place[2] == Ikszkarika2.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "A2" : if (Ikszkarika2.place[3] == '_') {
					
					Ikszkarika2.place[3] = Ikszkarika2.team;
					System.out.println("\nYou placed an " + Ikszkarika2.team + " in A2");
					oppMove();
					loop = false;
				
				} else if (Ikszkarika2.place[3] == Ikszkarika2.team) {
					
					System.out.println("\nThere is an " + Ikszkarika2.team + " there already!");
					
				} else if (Ikszkarika2.place[3] == Ikszkarika2.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "B2" : if (Ikszkarika2.place[4] == '_') {
					
					Ikszkarika2.place[4] = Ikszkarika2.team;
					System.out.println("\nYou placed an " + Ikszkarika2.team + " in B2");
					oppMove();
					loop = false;
				
				} else if (Ikszkarika2.place[4] == Ikszkarika2.team) {
					
					System.out.println("\nThere is an " + Ikszkarika2.team + " there already!");
					
				} else if (Ikszkarika2.place[4] == Ikszkarika2.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "C2" : if (Ikszkarika2.place[5] == '_') {
					
					Ikszkarika2.place[5] = Ikszkarika2.team;
					System.out.println("\nYou placed an " + Ikszkarika2.team + " in C2");
					oppMove();
					loop = false;
				
				} else if (Ikszkarika2.place[5] == Ikszkarika2.team) {
					
					System.out.println("\nThere is an " + Ikszkarika2.team + " there already!");
					
				} else if (Ikszkarika2.place[5] == Ikszkarika2.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "A3" : if (Ikszkarika2.place[6] == '_') {
					
					Ikszkarika2.place[6] = Ikszkarika2.team;
					System.out.println("\nYou placed an " + Ikszkarika2.team + " in A3");
					oppMove();
					loop = false;
				
				} else if (Ikszkarika2.place[6] == Ikszkarika2.team) {
					
					System.out.println("\nThere is an " + Ikszkarika2.team + " there already!");
					
				} else if (Ikszkarika2.place[6] == Ikszkarika2.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "B3" : if (Ikszkarika2.place[7] == '_') {
					
					Ikszkarika2.place[7] = Ikszkarika2.team;
					System.out.println("\nYou placed an " + Ikszkarika2.team + " in B3");
					oppMove();
					loop = false;
				
				} else if (Ikszkarika2.place[7] == Ikszkarika2.team) {
					
					System.out.println("\nThere is an " + Ikszkarika2.team + " there already!");
					
				} else if (Ikszkarika2.place[7] == Ikszkarika2.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "C3" : if (Ikszkarika2.place[8] == '_') {
					
					Ikszkarika2.place[8] = Ikszkarika2.team;
					System.out.println("\nYou placed an " + Ikszkarika2.team + " in C3");
					oppMove();
					loop = false;
				
				} else if (Ikszkarika2.place[8] == Ikszkarika2.team) {
					
					System.out.println("\nThere is an " + Ikszkarika2.team + " there already!");
					
				} else if (Ikszkarika2.place[8] == Ikszkarika2.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				
			}
			
		} while (loop);
		
		checkWin();
		
	}

	public static void player1() {
		
		// Local variable to run loop
		boolean loop = true;
		
		System.out.println("IT'S PLAYER 1 TURN");
		
		drawBoard();
		
		do {
			
			System.out.println("\n\nChoose a column and row to place an " + Ikszkarika2.team + 
					". (EXAMPLE: A1)\n");
			
			System.out.print("Enter your selection: ");
			Scanner input = new Scanner(System.in);
			Ikszkarika2.usrStr = input.next().toUpperCase();
			
			switch (Ikszkarika2.usrStr)
			{
				case "A1" : if (Ikszkarika2.place[0] == '_') {
				
					Ikszkarika2.place[0] = Ikszkarika2.team;
					System.out.println("\nYou placed an " + Ikszkarika2.team + " in A1");
					//player2();
					loop = false;
				
				} else if (Ikszkarika2.place[0] == Ikszkarika2.team) {
					
					System.out.println("\nThere is an " + Ikszkarika2.team + " there already!");
					
				} else if (Ikszkarika2.place[0] == Ikszkarika2.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "B1" : if (Ikszkarika2.place[1] == '_') {
					
					Ikszkarika2.place[1] = Ikszkarika2.team;
					System.out.println("\nYou placed an " + Ikszkarika2.team + " in B1");
					//player2();
					loop = false;
				
				} else if (Ikszkarika2.place[1] == Ikszkarika2.team) {
					
					System.out.println("\nThere is an " + Ikszkarika2.team + " there already!");
					
				} else if (Ikszkarika2.place[1] == Ikszkarika2.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "C1" : if (Ikszkarika2.place[2] == '_') {
					
					Ikszkarika2.place[2] = Ikszkarika2.team;
					System.out.println("\nYou placed an " + Ikszkarika2.team + " in C1");
					//player2();
					loop = false;
				
				} else if (Ikszkarika2.place[2] == Ikszkarika2.team) {
					
					System.out.println("\nThere is an " + Ikszkarika2.team + " there already!");
					
				} else if (Ikszkarika2.place[2] == Ikszkarika2.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "A2" : if (Ikszkarika2.place[3] == '_') {
					
					Ikszkarika2.place[3] = Ikszkarika2.team;
					System.out.println("\nYou placed an " + Ikszkarika2.team + " in A2");
					//player2();
					loop = false;
				
				} else if (Ikszkarika2.place[3] == Ikszkarika2.team) {
					
					System.out.println("\nThere is an " + Ikszkarika2.team + " there already!");
					
				} else if (Ikszkarika2.place[3] == Ikszkarika2.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "B2" : if (Ikszkarika2.place[4] == '_') {
					
					Ikszkarika2.place[4] = Ikszkarika2.team;
					System.out.println("\nYou placed an " + Ikszkarika2.team + " in B2");
					//player2();
					loop = false;
				
				} else if (Ikszkarika2.place[4] == Ikszkarika2.team) {
					
					System.out.println("\nThere is an " + Ikszkarika2.team + " there already!");
					
				} else if (Ikszkarika2.place[4] == Ikszkarika2.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "C2" : if (Ikszkarika2.place[5] == '_') {
					
					Ikszkarika2.place[5] = Ikszkarika2.team;
					System.out.println("\nYou placed an " + Ikszkarika2.team + " in C2");
					//player2();
					loop = false;
				
				} else if (Ikszkarika2.place[5] == Ikszkarika2.team) {
					
					System.out.println("\nThere is an " + Ikszkarika2.team + " there already!");
					
				} else if (Ikszkarika2.place[5] == Ikszkarika2.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "A3" : if (Ikszkarika2.place[6] == '_') {
					
					Ikszkarika2.place[6] = Ikszkarika2.team;
					System.out.println("\nYou placed an " + Ikszkarika2.team + " in A3");
					//player2();
					loop = false;
				
				} else if (Ikszkarika2.place[6] == Ikszkarika2.team) {
					
					System.out.println("\nThere is an " + Ikszkarika2.team + " there already!");
					
				} else if (Ikszkarika2.place[6] == Ikszkarika2.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "B3" : if (Ikszkarika2.place[7] == '_') {
					
					Ikszkarika2.place[7] = Ikszkarika2.team;
					System.out.println("\nYou placed an " + Ikszkarika2.team + " in B3");
					//player2();
					loop = false;
				
				} else if (Ikszkarika2.place[7] == Ikszkarika2.team) {
					
					System.out.println("\nThere is an " + Ikszkarika2.team + " there already!");
					
				} else if (Ikszkarika2.place[7] == Ikszkarika2.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "C3" : if (Ikszkarika2.place[8] == '_') {
					
					Ikszkarika2.place[8] = Ikszkarika2.team;
					System.out.println("\nYou placed an " + Ikszkarika2.team + " in C3");
					//player2();
					loop = false;
				
				} else if (Ikszkarika2.place[8] == Ikszkarika2.team) {
					
					System.out.println("\nThere is an " + Ikszkarika2.team + " there already!");
					
				} else if (Ikszkarika2.place[8] == Ikszkarika2.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				
			}
			
		} while (loop);
		
		checkWinVs2();
		
	}
	
	public static void player2() {
		
		// Local variable to run loop
		boolean loop = true;
		
		System.out.println("IT'S PLAYER 2 TURN");
		
		drawBoard();
		
		do {
			
			System.out.println("\n\nChoose a column and row to place an " + Ikszkarika2.opp + 
					". (EXAMPLE: A1)\n");
			
			System.out.print("Enter your selection: ");
			Scanner input = new Scanner(System.in);
			Ikszkarika2.usrStr = input.next().toUpperCase();
			
			switch (Ikszkarika2.usrStr)
			{
				case "A1" : if (Ikszkarika2.place[0] == '_') {
				
					Ikszkarika2.place[0] = Ikszkarika2.opp;
					System.out.println("\nYou placed an " + Ikszkarika2.opp + " in A1");
					//player1();
					loop = false;
				
				} else if (Ikszkarika2.place[0] == Ikszkarika2.opp) {
					
					System.out.println("\nThere is an " + Ikszkarika2.opp + " there already!");
					
				} else if (Ikszkarika2.place[0] == Ikszkarika2.team) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "B1" : if (Ikszkarika2.place[1] == '_') {
					
					Ikszkarika2.place[1] = Ikszkarika2.opp;
					System.out.println("\nYou placed an " + Ikszkarika2.opp + " in B1");
					//player1();
					loop = false;
				
				} else if (Ikszkarika2.place[1] == Ikszkarika2.opp) {
					
					System.out.println("\nThere is an " + Ikszkarika2.opp + " there already!");
					
				} else if (Ikszkarika2.place[1] == Ikszkarika2.team) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "C1" : if (Ikszkarika2.place[2] == '_') {
					
					Ikszkarika2.place[2] = Ikszkarika2.opp;
					System.out.println("\nYou placed an " + Ikszkarika2.opp + " in C1");
					//player1();
					loop = false;
				
				} else if (Ikszkarika2.place[2] == Ikszkarika2.opp) {
					
					System.out.println("\nThere is an " + Ikszkarika2.opp + " there already!");
					
				} else if (Ikszkarika2.place[2] == Ikszkarika2.team) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "A2" : if (Ikszkarika2.place[3] == '_') {
					
					Ikszkarika2.place[3] = Ikszkarika2.opp;
					System.out.println("\nYou placed an " + Ikszkarika2.opp + " in A2");
					//player1();
					loop = false;
				
				} else if (Ikszkarika2.place[3] == Ikszkarika2.opp) {
					
					System.out.println("\nThere is an " + Ikszkarika2.opp + " there already!");
					
				} else if (Ikszkarika2.place[3] == Ikszkarika2.team) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "B2" : if (Ikszkarika2.place[4] == '_') {
					
					Ikszkarika2.place[4] = Ikszkarika2.opp;
					System.out.println("\nYou placed an " + Ikszkarika2.opp + " in B2");
					//player1();
					loop = false;
				
				} else if (Ikszkarika2.place[4] == Ikszkarika2.opp) {
					
					System.out.println("\nThere is an " + Ikszkarika2.opp + " there already!");
					
				} else if (Ikszkarika2.place[4] == Ikszkarika2.team) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "C2" : if (Ikszkarika2.place[5] == '_') {
					
					Ikszkarika2.place[5] = Ikszkarika2.opp;
					System.out.println("\nYou placed an " + Ikszkarika2.opp + " in C2");
					//player1();
					loop = false;
				
				} else if (Ikszkarika2.place[5] == Ikszkarika2.opp) {
					
					System.out.println("\nThere is an " + Ikszkarika2.opp + " there already!");
					
				} else if (Ikszkarika2.place[5] == Ikszkarika2.team) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "A3" : if (Ikszkarika2.place[6] == '_') {
					
					Ikszkarika2.place[6] = Ikszkarika2.opp;
					System.out.println("\nYou placed an " + Ikszkarika2.opp + " in A3");
					//player1();
					loop = false;
				
				} else if (Ikszkarika2.place[6] == Ikszkarika2.opp) {
					
					System.out.println("\nThere is an " + Ikszkarika2.opp + " there already!");
					
				} else if (Ikszkarika2.place[6] == Ikszkarika2.team) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "B3" : if (Ikszkarika2.place[7] == '_') {
					
					Ikszkarika2.place[7] = Ikszkarika2.opp;
					System.out.println("\nYou placed an " + Ikszkarika2.opp + " in B3");
					//player1();
					loop = false;
				
				} else if (Ikszkarika2.place[7] == Ikszkarika2.opp) {
					
					System.out.println("\nThere is an " + Ikszkarika2.opp + " there already!");
					
				} else if (Ikszkarika2.place[7] == Ikszkarika2.team) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "C3" : if (Ikszkarika2.place[8] == '_') {
					
					Ikszkarika2.place[8] = Ikszkarika2.opp;
					System.out.println("\nYou placed an " + Ikszkarika2.opp + " in C3");
					//player1();
					loop = false;
				
				} else if (Ikszkarika2.place[8] == Ikszkarika2.opp) {
					
					System.out.println("\nThere is an " + Ikszkarika2.opp + " there already!");
					
				} else if (Ikszkarika2.place[8] == Ikszkarika2.team) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				
			}
			
		} while (loop);
		
		checkWinVs();
		
	}
	
	public static void oppMove() {
		
		while (true) {
			
			if ( (Ikszkarika2.place[0] == '_') || (Ikszkarika2.place[1] == '_') || (Ikszkarika2.place[2] == '_')
					|| (Ikszkarika2.place[3] == '_') || (Ikszkarika2.place[4] == '_') || (Ikszkarika2.place[5] == '_') 
					|| (Ikszkarika2.place[6] == '_') || (Ikszkarika2.place[7] == '_') || (Ikszkarika2.place[8] == '_') 
				) {
				
				float rn = (float) Math.random();
				float m = rn * 8;
				int x = Math.round(m);
						
				if (Ikszkarika2.place[x] == '_') {
					
					Ikszkarika2.place[x] = Ikszkarika2.opp;
					break;
				} else { checkWin(); break; }
				
				}
			
		}
		
	}
	
	public static void checkWin() {
		
		//See of X has won the game
		if ( (Ikszkarika2.place[0] == 'X') && (Ikszkarika2.place[1] == 'X') && (Ikszkarika2.place[2] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[3] == 'X') && (Ikszkarika2.place[4] == 'X') && (Ikszkarika2.place[5] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika2.place[6] == 'X') && (Ikszkarika2.place[7] == 'X') && (Ikszkarika2.place[8] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika2.place[0] == 'X') && (Ikszkarika2.place[3] == 'X') && (Ikszkarika2.place[6] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika2.place[1] == 'X') && (Ikszkarika2.place[4] == 'X') && (Ikszkarika2.place[7] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[2] == 'X') && (Ikszkarika2.place[5] == 'X') && (Ikszkarika2.place[8] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[0] == 'X') && (Ikszkarika2.place[4] == 'X') && (Ikszkarika2.place[8] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[2] == 'X') && (Ikszkarika2.place[4] == 'X') && (Ikszkarika2.place[6] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
		}
			
		//Now see if O has won
		if ( (Ikszkarika2.place[0] == 'O') && (Ikszkarika2.place[1] == 'O') && (Ikszkarika2.place[2] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[3] == 'O') && (Ikszkarika2.place[4] == 'O') && (Ikszkarika2.place[5] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika2.place[6] == 'O') && (Ikszkarika2.place[7] == 'O') && (Ikszkarika2.place[8] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika2.place[0] == 'O') && (Ikszkarika2.place[3] == 'O') && (Ikszkarika2.place[6] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika2.place[1] == 'O') && (Ikszkarika2.place[4] == 'O') && (Ikszkarika2.place[7] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[2] == 'O') && (Ikszkarika2.place[5] == 'O') && (Ikszkarika2.place[8] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[0] == 'O') && (Ikszkarika2.place[4] == 'O') && (Ikszkarika2.place[8] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[2] == 'O') && (Ikszkarika2.place[4] == 'O') && (Ikszkarika2.place[6] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
				
		// Check for a tie!
		} else if ( (Ikszkarika2.place[0] != '_') && (Ikszkarika2.place[1] != '_') && (Ikszkarika2.place[2] != '_') &&
					(Ikszkarika2.place[3] != '_') && (Ikszkarika2.place[4] != '_') && (Ikszkarika2.place[5] != '_') &&
					(Ikszkarika2.place[6] != '_') && (Ikszkarika2.place[7] != '_') && (Ikszkarika2.place[8] != '_')
					) {
			System.out.println("\n\n\n\tTIE GAME!");
			drawBoard();
			playAgain();
			System.out.println("\n\n");
			
		//if no one has won and no tie, keep playing
		} else { game(); }
	}
	
	public static void checkWinVs() {
		
		//See of X has won the game
		if ( (Ikszkarika2.place[0] == 'X') && (Ikszkarika2.place[1] == 'X') && (Ikszkarika2.place[2] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[3] == 'X') && (Ikszkarika2.place[4] == 'X') && (Ikszkarika2.place[5] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika2.place[6] == 'X') && (Ikszkarika2.place[7] == 'X') && (Ikszkarika2.place[8] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika2.place[0] == 'X') && (Ikszkarika2.place[3] == 'X') && (Ikszkarika2.place[6] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika2.place[1] == 'X') && (Ikszkarika2.place[4] == 'X') && (Ikszkarika2.place[7] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[2] == 'X') && (Ikszkarika2.place[5] == 'X') && (Ikszkarika2.place[8] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[0] == 'X') && (Ikszkarika2.place[4] == 'X') && (Ikszkarika2.place[8] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[2] == 'X') && (Ikszkarika2.place[4] == 'X') && (Ikszkarika2.place[6] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
		}
			
		//Now see if O has won
		if ( (Ikszkarika2.place[0] == 'O') && (Ikszkarika2.place[1] == 'O') && (Ikszkarika2.place[2] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[3] == 'O') && (Ikszkarika2.place[4] == 'O') && (Ikszkarika2.place[5] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika2.place[6] == 'O') && (Ikszkarika2.place[7] == 'O') && (Ikszkarika2.place[8] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika2.place[0] == 'O') && (Ikszkarika2.place[3] == 'O') && (Ikszkarika2.place[6] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika2.place[1] == 'O') && (Ikszkarika2.place[4] == 'O') && (Ikszkarika2.place[7] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[2] == 'O') && (Ikszkarika2.place[5] == 'O') && (Ikszkarika2.place[8] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[0] == 'O') && (Ikszkarika2.place[4] == 'O') && (Ikszkarika2.place[8] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[2] == 'O') && (Ikszkarika2.place[4] == 'O') && (Ikszkarika2.place[6] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
				
		// Check for a tie!
		} else if ( (Ikszkarika2.place[0] != '_') && (Ikszkarika2.place[1] != '_') && (Ikszkarika2.place[2] != '_') &&
					(Ikszkarika2.place[3] != '_') && (Ikszkarika2.place[4] != '_') && (Ikszkarika2.place[5] != '_') &&
					(Ikszkarika2.place[6] != '_') && (Ikszkarika2.place[7] != '_') && (Ikszkarika2.place[8] != '_')
					) {
			System.out.println("\n\n\n\tTIE GAME!");
			drawBoard();
			playAgainVs();
			System.out.println("\n\n");
			
		//if no one has won and no tie, keep playing
		} else { player1(); }
	}
	
	public static void checkWinVs2() {
		
		//See of X has won the game
		if ( (Ikszkarika2.place[0] == 'X') && (Ikszkarika2.place[1] == 'X') && (Ikszkarika2.place[2] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[3] == 'X') && (Ikszkarika2.place[4] == 'X') && (Ikszkarika2.place[5] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika2.place[6] == 'X') && (Ikszkarika2.place[7] == 'X') && (Ikszkarika2.place[8] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika2.place[0] == 'X') && (Ikszkarika2.place[3] == 'X') && (Ikszkarika2.place[6] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika2.place[1] == 'X') && (Ikszkarika2.place[4] == 'X') && (Ikszkarika2.place[7] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[2] == 'X') && (Ikszkarika2.place[5] == 'X') && (Ikszkarika2.place[8] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[0] == 'X') && (Ikszkarika2.place[4] == 'X') && (Ikszkarika2.place[8] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[2] == 'X') && (Ikszkarika2.place[4] == 'X') && (Ikszkarika2.place[6] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
		}
			
		//Now see if O has won
		if ( (Ikszkarika2.place[0] == 'O') && (Ikszkarika2.place[1] == 'O') && (Ikszkarika2.place[2] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[3] == 'O') && (Ikszkarika2.place[4] == 'O') && (Ikszkarika2.place[5] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika2.place[6] == 'O') && (Ikszkarika2.place[7] == 'O') && (Ikszkarika2.place[8] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika2.place[0] == 'O') && (Ikszkarika2.place[3] == 'O') && (Ikszkarika2.place[6] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika2.place[1] == 'O') && (Ikszkarika2.place[4] == 'O') && (Ikszkarika2.place[7] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[2] == 'O') && (Ikszkarika2.place[5] == 'O') && (Ikszkarika2.place[8] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[0] == 'O') && (Ikszkarika2.place[4] == 'O') && (Ikszkarika2.place[8] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika2.place[2] == 'O') && (Ikszkarika2.place[4] == 'O') && (Ikszkarika2.place[6] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgainVs();
			System.out.println("\n\n\n\n");
				
		// Check for a tie!
		} else if ( (Ikszkarika2.place[0] != '_') && (Ikszkarika2.place[1] != '_') && (Ikszkarika2.place[2] != '_') &&
					(Ikszkarika2.place[3] != '_') && (Ikszkarika2.place[4] != '_') && (Ikszkarika2.place[5] != '_') &&
					(Ikszkarika2.place[6] != '_') && (Ikszkarika2.place[7] != '_') && (Ikszkarika2.place[8] != '_')
					) {
			System.out.println("\n\n\n\tTIE GAME!");
			drawBoard();
			playAgainVs();
			System.out.println("\n\n");
			
		//if no one has won and no tie, keep playing
		} else { player2(); }
	}

	
	public static void playAgain() {
		
		System.out.println("\n\nPlay again? [y/n]: ");
		
		
		Scanner input = new Scanner(System.in);
		Ikszkarika2.usrStr = input.next().toLowerCase();
		
		if (usrStr.equals("y")) {
			
			Ikszkarika2.team = '_';
			Ikszkarika2.opp = '_';
			setup();
			
		} else {
			System.exit(0);
		}
		
	}

	public static void playAgainVs() {
		
		System.out.println("\n\nPlay again? [y/n]: ");
		
		
		Scanner input = new Scanner(System.in);
		Ikszkarika2.usrStr = input.next().toLowerCase();
		
		if (usrStr.equals("y")) {
			
			Ikszkarika2.team = '_';
			Ikszkarika2.opp = '_';
			setupVs();
			
		} else {
			System.exit(0);
		}
		
	}

	
}

