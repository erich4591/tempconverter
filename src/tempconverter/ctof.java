package tempconverter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ctof {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		String forc;

		int fdegree,cdegree,ftoccalculate,ctofcalculate;
		
		String continueRunning = "yes";
		
		System.out.print("Convert from Fahrenheit or Celcius: ");
		forc = scanner.next();

        while(continueRunning.startsWith("y") || continueRunning.startsWith("Y")) {
			if (forc.startsWith("f") || forc.startsWith("F")) {		
				System.out.print("What's the degrees in Fahrenheit: ");
				ftoccalculate = scanner.nextInt();
				fdegree = (int) ((ftoccalculate - 32) * .5556);
				System.out.println("The degrees in Celcius is: " + fdegree);
				System.out.println("Would you like to input another temperature? Yes or No?");
				continueRunning = scanner.next();
				if (!(continueRunning.startsWith("y") || continueRunning.startsWith("Y") ||
						continueRunning.startsWith("n") || continueRunning.startsWith("N"))) {
					System.out.println("Incorrect Input.");
				}
			} else if (forc.startsWith("c") || forc.startsWith("C")) {	
				System.out.print("What's the degrees in Celcius: ");
				ctofcalculate = scanner.nextInt();
				cdegree = (int) ((ctofcalculate * 1.8000) + 32);
				System.out.println("The degrees in Fahrenheit is: " + cdegree);
				System.out.println("Would you like to input another temperature? Yes or No?");
				continueRunning = scanner.next();
				if (!(continueRunning.startsWith("y") || continueRunning.startsWith("Y") ||
						continueRunning.startsWith("n") || continueRunning.startsWith("N"))) {
					System.out.println("Incorrect Input.");
				}			
			} else if (Character.isDigit(forc.charAt(0))) {
				System.out.println("That's a number. Try again");
				break;
			} else {
				System.out.println("Incorrect Input. Try again");
				break;
			}
			if (continueRunning.startsWith("n") 
					|| continueRunning.endsWith("N")) {
				System.out.println("Okay, Hava a nice day.");
			}
		}
	}
}