/*
 * Describes quadratic of 3 user defned inputs
 * 
 * version 1
 * 
 * created by Derfel Terciano
 */
import java.util.*;
public class QuadraticClient {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		//this part is not that important
		//this just creates a welcome message
		String intro_message= "Welcome to this fancy Quadratic describer!\nThis program helps describe what a quadratic would look like if you tell me 3 different coefficents";
		String intro_message2="All inputs will be formated to \"ax^2+bx+c\"";
		String author="Program created by Derfel Terciano.\n";
		System.out.println(intro_message);
		System.out.println(intro_message2);
		System.out.println("\n"+author+"\n");
		
		//main body of the code
		boolean stop = false;//primes the loop
		while (stop==false) {
			System.out.println("Please enter the following coefficents: \n");
			System.out.print("Enter value a:");
			double a = input.nextDouble();//value a of quadratic
			System.out.print("Enter value b:");
			double b = input.nextDouble();//value b of quadratic
			System.out.print("Enter value c:");
			double c = input.nextDouble();//value c of quadratic
			System.out.println("\n");
			Quadratic.quadrDescriber(a, b, c);
			System.out.println("\n\nDo you wish to continue??(y/n)");//asks if you want to tcontinue
			String decide = input.next();
			if ((decide.equals("n"))) {//checks if appropriate input is read
				System.out.println("\nThank you for using this program!");
				stop = true;//ends loop if true
			}
			
		}
	}
}