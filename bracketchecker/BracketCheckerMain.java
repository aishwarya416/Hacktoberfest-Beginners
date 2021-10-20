package bracketchecker;

import java.util.Scanner;

public class BracketCheckerMain {

	public static void main(String[] args) {
	
		String input;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter teh STring containing Delimiters and empty value to break");
		System.out.flush();
		input = scan.nextLine();
		
		scan.close();
		
		BracketChecker theChecker = new BracketChecker(input);
		theChecker.check();

	}

}
