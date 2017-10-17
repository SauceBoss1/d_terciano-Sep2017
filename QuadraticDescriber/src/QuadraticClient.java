
/*
 * Describes quadratic of 3 user defined inputs
 * 
 * version 1.0
 * 
 * created by Derfel Terciano
 */
import java.util.*;

public class QuadraticClient {
	// creates a new scanner object called input
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// this part is not that important
		// this just creates a welcome message
		String intro_message = "Welcome to this fancy Quadratic describer!\nThis program helps describe what a quadratic would look like if you tell me 3 different coefficents";
		String intro_message2 = "All inputs will be formated to \"ax^2+bx+c\"";
		String author = "Program created by Derfel Terciano.\n";
		System.out.println(intro_message);
		System.out.println(intro_message2);
		System.out.println("\n" + author + "\n");

		// main body of the code
		boolean stop = false;// primes the loop
		while (stop == false) {
			System.out.println("Please enter the following coefficents: \n");

			// Asks for coefficents
			System.out.print("Enter value a:");
			double a = input.nextDouble();// value a of quadratic
			System.out.print("Enter value b:");
			double b = input.nextDouble();// value b of quadratic
			System.out.print("Enter value c:");
			double c = input.nextDouble();// value c of quadratic
			System.out.println("\n");

			// describes the quadratic with the inputs
			System.out.println(Quadratic.quadrDescriber(a, b, c));

			// checks if we should continue program or stop it
			System.out.print("\n\nDo you wish to continue??(y/n): ");// asks if you want to continue
			String decide = input.next();
			if ((decide.equals("n"))) {// checks if appropriate input is read
				System.out.println("\nThank you for using this program!");
				stop = true;// ends loop if true
			}

		}
	}
}