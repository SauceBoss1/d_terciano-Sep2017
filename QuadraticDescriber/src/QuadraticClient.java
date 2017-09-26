import java.util.*;
public class QuadraticClient {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter value a:");
		double a = input.nextDouble();
		System.out.print("Enter value b:");
		double b = input.nextDouble();
		System.out.print("Enter value c:");
		double c = input.nextDouble();
		Quadratic.quadrDescriber(a, b, c);
		
	}
}