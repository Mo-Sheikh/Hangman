import java.util.Scanner;

public class game {
	static String chosenWord;
	static String firstGo;
	static String blank = "-";
	static String blanks = "";
	static int NoOfGuesses;
	static String guess;
	static int scoreCounter;
	static char[] reveal;
	static char[] chosenWordx;
	static int score;
	static int correct;
	static Scanner y = new Scanner(System.in);

	public static void goesFirst() {

		// System.out.println("Who wants to go first");
		// firstGo = y.nextLine();
		//
		// if(firstGo.equalsIgnoreCase(playerOne.playerOneName)) {
		// System.out.println(playerOne.playerOneName);
		// }else if(firstGo.equalsIgnoreCase(playerTwo.playerTwoName)) {
		// System.out.print(playerTwo.playerTwoName);
		// }

		System.out.println(" Please choose word");
		chosenWord = y.nextLine();
		chosenWordx = chosenWord.toCharArray();

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
			System.out.println("what is your guess");
			guess = y.nextLine();
			

	
			for( int i = 0; i < chosenWord.length(); i++) {

				if (guess.charAt(0) == chosenWordx[i]) {
					correct = 1;
					System.out.println("Correct Guess!");

					reveal[i] = guess.charAt(0);
					reveal.toString();	
					break;
				} 
				
				
				
				
			
//				if(correct == 2) {
//					NoOfGuesses --;
//					System.out.println("wrong!");
//					System.out.println("you have " +  NoOfGuesses + " remaining");
//					
//				}
				
			
		
			
				
			}	
			if(correct != 1){
		

				System.out.print("wrong!");
				NoOfGuesses --;
			}
			System.out.println(reveal);
			}while(NoOfGuesses > 0);
		System.out.println("you lose");
	

}
}



//			if (con != 1) {
//				for (int j = wordCount; j > -1; j--) {
//					if (guess.charAt(0) == chosenWord.charAt(j)) {
//						System.out.println("correct guess!");
//
//						con = 1;
//						break;
//
//					}
//
//				}
//			}
			

//			if(con == 0) {
//				System.out.println("wrong");
//				System.out.println(blanks);
//				NoOfGuesses--;
//				System.out.println("you have" + NoOfGuesses + " remaining");
//			}
//			}while(NoOfGuesses > 0);
//


	

	
