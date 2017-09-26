import java.util.*;
public class QuadraticClient {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
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
				stop = true;
			}
			
		}
	}
}