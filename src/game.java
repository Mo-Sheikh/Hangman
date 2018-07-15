import java.util.Scanner;

public class game {
	static String chosenWord;
	static String firstGo;
	static String secondGo;
	static String blank = "-";
	static String blanks = "";
	static int NoOfGuesses;
	static String guess;
	static char[] reveal;
	static char[] chosenWordx;
	static int score;
	static int correct;
	static boolean win;
	static int wrong = 0;
	static int x = 0;
	static int j;
	static int condition;
	static int bob;
	static String drawing = "   |   |\n";
	static String drawing1 = "  O   |\n";
	static String drawing2 = " /|\\ |\n";
	static String drawing3 = " / \\ |\n";
	static String drawing4 = " _|_\n";
	static String drawing5 = "|   |______|\n";
	static String drawing6 = "|   RIP!   |\n";
	static String drawing7 = "| You Lost |\n";
	static String drawing8 = "|__________|\n";

	static Scanner y = new Scanner(System.in);

	public static void goesFirst() {

		System.out.println("Who wants to go first");
		firstGo = y.nextLine();

		if (firstGo.equalsIgnoreCase(playerOne.playerOneName)) {
			firstGo = playerOne.playerOneName;
			secondGo = playerTwo.playerTwoName;
			System.out.print(firstGo);
		} else if (!firstGo.equalsIgnoreCase(playerOne.playerOneName)) {
			firstGo = playerTwo.playerTwoName;
			secondGo = playerOne.playerOneName;
			System.out.print(firstGo);
		}

		System.out.println(" Please choose word");
		chosenWord = y.nextLine();
		
		//clears console/terminal after player add word
		chosenWordx = chosenWord.toCharArray();
		System.out.print("\033[H\033[2J");

	}

	public static void word() {
		
		// adds the hashes for word
		for (int i = 0; i < chosenWord.length(); i++) {
			blanks += blank;
			reveal = blanks.toCharArray();

		}

		System.out.println(blanks);

	}

	public static void solve(int NoOfGuesses) {
		do {
			correct = 0;
			bob = 0;
			do {
			do {
				// player inputs the word they want to use.
				System.out.println("what is your guess");
				guess = y.nextLine();
				// checks to see if more than one letter has been entered
				if (guess.length() > 1) {
					System.out.println("ERROR - please choose a single letter");
				}
			} while (guess.length() > 1);
			
			/*Checks to see if the user has already chosen the letter they input, if so,
			they are prompted to enter another letter*/
			for (int j = 0; j < reveal.length; j++) {
				if(reveal[j] == guess.charAt(0)) {
					System.out.println("You have already chosen this letter");
					System.out.println("Please choose another letter!");
				}
			}
			}while(guess.charAt(0) == reveal[j]);
			
			/* checks to see if the users guess matches any letters chosen*/
			for (int i = 0; i < chosenWord.length(); i++) {

				if (guess.charAt(0) == chosenWordx[i]) {
					correct = 1;
					bob = 1;
					score++;
					System.out.println("Correct Guess!");

					reveal[i] = guess.charAt(0);
					reveal.toString();
					break;
				}	

			}

				/* if its wrong, the user loses a life and a drawing is printed to the screen,
				 * the more wrong answers, the higher the case number and the lives lost*/
				 
			
			if (correct != 1) {

				switch (condition) {

				case 0:
					System.out.println(drawing);
					NoOfGuesses--;
					System.out.println("you have " + NoOfGuesses + " remaining");
					condition++;
					System.out.println(condition);
					break;

				case 1:
					System.out.println(drawing);
					System.out.println(drawing1);
					NoOfGuesses--;
					System.out.println("you have " + NoOfGuesses + " remaining");
					condition++;
					break;
				case 2:
					System.out.println(drawing);
					System.out.println(drawing1);
					System.out.println(drawing2);
					NoOfGuesses--;
					System.out.println("you have " + NoOfGuesses + " remaining");
					condition++;
					break;
				case 3:
					System.out.println(drawing);
					System.out.println(drawing1);
					System.out.println(drawing2);
					System.out.println(drawing3);
					NoOfGuesses--;
					System.out.println("you have " + NoOfGuesses + " remaining");
					condition++;
					break;
				case 4:
					System.out.println(drawing);
					System.out.println(drawing1);
					System.out.println(drawing2);
					System.out.println(drawing3);
					System.out.println(drawing4);
					System.out.println(drawing5);
					System.out.println(drawing6);
					System.out.println(drawing7);
					System.out.println(drawing8);

					NoOfGuesses--;
					System.out.println("Game over " + secondGo + " You lose");
					condition++;
					break;
				}

			}
			/* if the users guess is correct, the word, or the partial word is printed
			o the screen.*/
			if (correct == 1)
				System.out.println(reveal);
			/* if the score, which is incremented is equal to the length of the word
			chosen by the player, then we have a winner*/
			if (score == chosenWord.length()) {
				win = true;
				System.out.println("well done " + firstGo + " you win");
				break;
			}

		} while (NoOfGuesses >= 0 || win == true);

	}
}
