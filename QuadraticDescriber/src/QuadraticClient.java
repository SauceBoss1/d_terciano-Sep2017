import java.util.*;
public class QuadraticClient {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String intro_message= "Welcome to this fancy Quadratic describer!\nThis program helps describe what a quadratic would look like if you tell me 3 different coefficents";
		String intro_message2="All inputs will be formated to \"ax^2+bx+c\"";
		String author="Program created by Derfel Terciano.";
		System.out.println(intro_message);
		System.out.println(intro_message2);
		System.out.println("\n"+author+"\n");
		boolean stop = false;
		while (stop==false) {
			System.out.print("Enter value a:");
			double a = input.nextDouble();
			System.out.print("Enter value b:");
			double b = input.nextDouble();
			System.out.print("Enter value c:");
			double c = input.nextDouble();
			System.out.println("\n");
			Quadratic.quadrDescriber(a, b, c);
			System.out.println("\n\nDo you wish to continue??(y/n)");
			String decide = input.next();
			if ((decide.equals("n"))) {
				System.out.println("\nThank you for using this program!");
				stop = true;
			}
			
		}
	}
}