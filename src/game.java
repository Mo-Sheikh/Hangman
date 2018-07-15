import java.util.Scanner;

public class game {
	static String chosenWord;
	static String firstGo;
	static String secondGo;
	static String blank = "-";
	static String blanks = "";
	static int NoOfGuesses;
	static String guess;
	static int scoreCounter;
	static char[] reveal;
	static char[] chosenWordx;
	static int score;
	static int correct;
	static boolean win;
	static int wrong = 0;
	static int x = 0;
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
		
		 if(firstGo.equalsIgnoreCase(playerOne.playerOneName)) {
			 firstGo = playerOne.playerOneName;
			 secondGo = playerTwo.playerTwoName;
		 System.out.print(firstGo);
		 }else if(!firstGo.equalsIgnoreCase(playerOne.playerOneName)) {
			 firstGo = playerTwo.playerTwoName;
			 secondGo = playerOne.playerOneName;
		 System.out.print(firstGo);
		 }

		System.out.println(" Please choose word");
		chosenWord = y.nextLine();
		chosenWordx = chosenWord.toCharArray();
		System.out.print("\033[H\033[2J");
		

	}

	public static void word() {

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
			System.out.println("what is your guess");
			guess = y.nextLine();
			
			if(guess.length() > 1) {
				System.out.println("ERROR - please choose a single letter");
			}
			}while(guess.length() > 1);
			

	
			for( int i = 0; i < chosenWord.length(); i++) {

				if (guess.charAt(0) == chosenWordx[i]) {
					correct = 1;
					bob = 1;
					score++;
					System.out.println("Correct Guess!");

					reveal[i] = guess.charAt(0);
					reveal.toString();	
					break;
				} 
				if(guess.charAt(0) == reveal[i]) {
					System.out.println("You have already chosen this letter");
				}

			}	
				
			if(correct != 1) {
					
					switch(condition) {
					
					case 0:
						System.out.println(drawing);
						NoOfGuesses --;
						System.out.println("you have " + NoOfGuesses + " remaining");
						condition ++;
						System.out.println(condition);
					break;
					
					case 1:
						System.out.println(drawing);
						System.out.println(drawing1);
						NoOfGuesses --;
						System.out.println("you have " + NoOfGuesses + " remaining");
						condition ++;
						break;
					case 2:
						System.out.println(drawing);
						System.out.println(drawing1);
						System.out.println(drawing2);
						NoOfGuesses --;
						System.out.println("you have " + NoOfGuesses + " remaining");
						condition ++;
						break;
					case 3:
						System.out.println(drawing);
						System.out.println(drawing1);
						System.out.println(drawing2);
						System.out.println(drawing3);
						NoOfGuesses --;
						System.out.println("you have " + NoOfGuesses + " remaining");
						condition ++;
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
						
						NoOfGuesses --;
						System.out.println("Game over " + secondGo + " You lose");
						condition ++;
						break;
					}

				
			
			}
		
			if(correct == 1)
			System.out.println(reveal);
			
			if(score == chosenWord.length()) {
				win = true;
				System.out.println("well done " + firstGo + " you win");
				break;
			}
		
			
			
			
			}while(NoOfGuesses >= 0 || win == true);
			
			
}
}




	

	
