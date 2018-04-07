package ikszkarika;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Ikszkarika {
	
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
		
		System.out.println("WELCOME TO IKSZKARIKA!");
		
		//setup elotti tesztelesre csak a kirajzolas
		//drawBoard();
		
		setup();
	}
	
	//prints the board out
	public static void drawBoard() {
		
		System.out.println("\n\t     A   B   C");
		
		//heading row
		System.out.println("\t   .-----------.");
		//1st game row
		System.out.println("\t 1 |_"+Ikszkarika.place[0]+"_|_"+Ikszkarika.place[1]+"_|_"+Ikszkarika.place[2]+"_|");
		//2nd game row
		System.out.println("\t 2 |_"+Ikszkarika.place[3]+"_|_"+Ikszkarika.place[4]+"_|_"+Ikszkarika.place[5]+"_|");
		//3rd game row
		System.out.println("\t 3 |_"+Ikszkarika.place[6]+"_|_"+Ikszkarika.place[7]+"_|_"+Ikszkarika.place[8]+"_|");
		
		System.out.println("\t   '-----------'");
		
	}
	
	/**
	 * reset the game
	 */
	public static void setup() {
		
		//loop that resets the char array to default
		for (int i = 0 ; i < 9 ; i++ ) {
			Ikszkarika.place[i] = '_';
		}
		
		//Print the clean board to the console 
		drawBoard();
		
		//user X or O choice
		while( (Ikszkarika.team != 'X') && (Ikszkarika.team != 'O') ) {
			
			System.out.println("\n\n Select your team! Enter 'X' or 'O' below...");
			
			System.out.print("Enter your selection: ");
			Scanner input = new Scanner(System.in);
			Ikszkarika.usrStr = input.next();
			
			if (Ikszkarika.usrStr.toUpperCase().equals("X")) {
				
				Ikszkarika.team = 'X';
				Ikszkarika.opp = 'O';
				
			} else if (Ikszkarika.usrStr.toUpperCase().equals("O")) {
				
				Ikszkarika.team = 'O';
				Ikszkarika.opp = 'X';
				
			} else {
				
				System.out.println("You entered: " + usrStr);
				System.out.println("This is not a valid option!");
				System.out.println("Please enter either an X or an O to continue");
				
			}
			
		}
		
		System.out.println("\n You are team " + Ikszkarika.team + "!");
		
		//Run the game method
		game();
		
	}
	
	public static void game() {
		
		// Local variable to run loop
		boolean loop = true;
		
		System.out.println("IT'S YOUR TURN");
		
		drawBoard();
		
		do {
			
			System.out.println("\n\nChoose a column and row to place an " + Ikszkarika.team + 
					". (EXAMPLE: A1)\n");
			
			System.out.print("Enter your selection: ");
			Scanner input = new Scanner(System.in);
			Ikszkarika.usrStr = input.next().toUpperCase();
			
			switch (Ikszkarika.usrStr)
			{
				case "A1" : if (Ikszkarika.place[0] == '_') {
				
					Ikszkarika.place[0] = Ikszkarika.team;
					System.out.println("\nYou placed an " + Ikszkarika.team + " in A1");
					oppMove();
					loop = false;
				
				} else if (Ikszkarika.place[0] == Ikszkarika.team) {
					
					System.out.println("\nThere is an " + Ikszkarika.team + " there already!");
					
				} else if (Ikszkarika.place[0] == Ikszkarika.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "B1" : if (Ikszkarika.place[1] == '_') {
					
					Ikszkarika.place[1] = Ikszkarika.team;
					System.out.println("\nYou placed an " + Ikszkarika.team + " in B1");
					oppMove();
					loop = false;
				
				} else if (Ikszkarika.place[1] == Ikszkarika.team) {
					
					System.out.println("\nThere is an " + Ikszkarika.team + " there already!");
					
				} else if (Ikszkarika.place[1] == Ikszkarika.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "C1" : if (Ikszkarika.place[2] == '_') {
					
					Ikszkarika.place[2] = Ikszkarika.team;
					System.out.println("\nYou placed an " + Ikszkarika.team + " in C1");
					oppMove();
					loop = false;
				
				} else if (Ikszkarika.place[2] == Ikszkarika.team) {
					
					System.out.println("\nThere is an " + Ikszkarika.team + " there already!");
					
				} else if (Ikszkarika.place[2] == Ikszkarika.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "A2" : if (Ikszkarika.place[3] == '_') {
					
					Ikszkarika.place[3] = Ikszkarika.team;
					System.out.println("\nYou placed an " + Ikszkarika.team + " in A2");
					oppMove();
					loop = false;
				
				} else if (Ikszkarika.place[3] == Ikszkarika.team) {
					
					System.out.println("\nThere is an " + Ikszkarika.team + " there already!");
					
				} else if (Ikszkarika.place[3] == Ikszkarika.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "B2" : if (Ikszkarika.place[4] == '_') {
					
					Ikszkarika.place[4] = Ikszkarika.team;
					System.out.println("\nYou placed an " + Ikszkarika.team + " in B2");
					oppMove();
					loop = false;
				
				} else if (Ikszkarika.place[4] == Ikszkarika.team) {
					
					System.out.println("\nThere is an " + Ikszkarika.team + " there already!");
					
				} else if (Ikszkarika.place[4] == Ikszkarika.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "C2" : if (Ikszkarika.place[5] == '_') {
					
					Ikszkarika.place[5] = Ikszkarika.team;
					System.out.println("\nYou placed an " + Ikszkarika.team + " in C2");
					oppMove();
					loop = false;
				
				} else if (Ikszkarika.place[5] == Ikszkarika.team) {
					
					System.out.println("\nThere is an " + Ikszkarika.team + " there already!");
					
				} else if (Ikszkarika.place[5] == Ikszkarika.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "A3" : if (Ikszkarika.place[6] == '_') {
					
					Ikszkarika.place[6] = Ikszkarika.team;
					System.out.println("\nYou placed an " + Ikszkarika.team + " in A3");
					oppMove();
					loop = false;
				
				} else if (Ikszkarika.place[6] == Ikszkarika.team) {
					
					System.out.println("\nThere is an " + Ikszkarika.team + " there already!");
					
				} else if (Ikszkarika.place[6] == Ikszkarika.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "B3" : if (Ikszkarika.place[7] == '_') {
					
					Ikszkarika.place[7] = Ikszkarika.team;
					System.out.println("\nYou placed an " + Ikszkarika.team + " in B3");
					oppMove();
					loop = false;
				
				} else if (Ikszkarika.place[7] == Ikszkarika.team) {
					
					System.out.println("\nThere is an " + Ikszkarika.team + " there already!");
					
				} else if (Ikszkarika.place[7] == Ikszkarika.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				case "C3" : if (Ikszkarika.place[8] == '_') {
					
					Ikszkarika.place[8] = Ikszkarika.team;
					System.out.println("\nYou placed an " + Ikszkarika.team + " in C3");
					oppMove();
					loop = false;
				
				} else if (Ikszkarika.place[8] == Ikszkarika.team) {
					
					System.out.println("\nThere is an " + Ikszkarika.team + " there already!");
					
				} else if (Ikszkarika.place[8] == Ikszkarika.opp) {
					System.out.println("\nThis place is already taken!");
					
				}; break;
				
				
			}
			
		} while (loop);
		
		checkWin();
		
	}
	
	public static void oppMove() {
		
		while (true) {
			
			if ( (Ikszkarika.place[0] == '_') || (Ikszkarika.place[1] == '_') || (Ikszkarika.place[2] == '_')
					|| (Ikszkarika.place[3] == '_') || (Ikszkarika.place[4] == '_') || (Ikszkarika.place[5] == '_') 
					|| (Ikszkarika.place[6] == '_') || (Ikszkarika.place[7] == '_') || (Ikszkarika.place[8] == '_') 
				) {
				
				float rn = (float) Math.random();
				float m = rn * 8;
				int x = Math.round(m);
						
				if (Ikszkarika.place[x] == '_') {
					
					Ikszkarika.place[x] = Ikszkarika.opp;
					break;
				} else { checkWin(); break; }
				
				}
			
		}
		
	}
	
	public static void checkWin() {
		
		//See of X has won the game
		if ( (Ikszkarika.place[0] == 'X') && (Ikszkarika.place[1] == 'X') && (Ikszkarika.place[2] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika.place[3] == 'X') && (Ikszkarika.place[4] == 'X') && (Ikszkarika.place[5] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika.place[6] == 'X') && (Ikszkarika.place[7] == 'X') && (Ikszkarika.place[8] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika.place[0] == 'X') && (Ikszkarika.place[3] == 'X') && (Ikszkarika.place[6] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika.place[1] == 'X') && (Ikszkarika.place[4] == 'X') && (Ikszkarika.place[7] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika.place[2] == 'X') && (Ikszkarika.place[5] == 'X') && (Ikszkarika.place[8] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika.place[0] == 'X') && (Ikszkarika.place[4] == 'X') && (Ikszkarika.place[8] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika.place[2] == 'X') && (Ikszkarika.place[4] == 'X') && (Ikszkarika.place[6] == 'X') ) {
			
			System.out.println("\n\n\n\tX WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
		}
			
		//Now see if O has won
		if ( (Ikszkarika.place[0] == 'O') && (Ikszkarika.place[1] == 'O') && (Ikszkarika.place[2] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika.place[3] == 'O') && (Ikszkarika.place[4] == 'O') && (Ikszkarika.place[5] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika.place[6] == 'O') && (Ikszkarika.place[7] == 'O') && (Ikszkarika.place[8] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika.place[0] == 'O') && (Ikszkarika.place[3] == 'O') && (Ikszkarika.place[6] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
					
		} else if ( (Ikszkarika.place[1] == 'O') && (Ikszkarika.place[4] == 'O') && (Ikszkarika.place[7] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika.place[2] == 'O') && (Ikszkarika.place[5] == 'O') && (Ikszkarika.place[8] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika.place[0] == 'O') && (Ikszkarika.place[4] == 'O') && (Ikszkarika.place[8] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
			
		} else if ( (Ikszkarika.place[2] == 'O') && (Ikszkarika.place[4] == 'O') && (Ikszkarika.place[6] == 'O') ) {
			
			System.out.println("\n\n\n\tO WINS!!!"); 
			drawBoard();
			playAgain();
			System.out.println("\n\n\n\n");
				
		// Check for a tie!
		} else if ( (Ikszkarika.place[0] != '_') && (Ikszkarika.place[1] != '_') && (Ikszkarika.place[2] != '_') &&
					(Ikszkarika.place[3] != '_') && (Ikszkarika.place[4] != '_') && (Ikszkarika.place[5] != '_') &&
					(Ikszkarika.place[6] != '_') && (Ikszkarika.place[7] != '_') && (Ikszkarika.place[8] != '_')
					) {
			System.out.println("\n\n\n\tTIE GAME!");
			drawBoard();
			playAgain();
			System.out.println("\n\n");
			
		//if no one has won and no tie, keep playing
		} else { game(); }
	}
	
	public static void playAgain() {
		
		System.out.println("\n\nPlay again? [y/n]: ");
		
		
		Scanner input = new Scanner(System.in);
		Ikszkarika.usrStr = input.next().toLowerCase();
		
		if (usrStr.equals("y")) {
			
			Ikszkarika.team = '_';
			Ikszkarika.opp = '_';
			setup();
			
		} else {
			System.exit(0);
		}
		
	}

}
 