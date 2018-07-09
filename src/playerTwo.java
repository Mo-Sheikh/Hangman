import java.util.Scanner;
public class playerTwo {
	public static String playerTwoName;
	static Scanner x = new Scanner(System.in);
	
	public static void playerTwoDetails() {
		System.out.println("Player two - what is your name");
		String playerTwoName = x.next();
	}

}
