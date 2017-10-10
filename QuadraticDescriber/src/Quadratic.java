/*
* Functions for the QuadracClient
* version 1.00
* 
* created by Derfel Terciano
*/
public class Quadratic {
	public static double absValue(double num) {
		if (num < 0) {
			return num * -1;
		} else {
			return num;
		}
	}
	public static double discriminant(double a, double b, double c) {
		return (b * b) - (4 * a * c);// Returns the discriminant in a quadratic using the inputs of 'a','b','c'
	}

	public static double round2(double num) {
		double x = (num - num % 0.001) * 1000;
		if (absValue(x % 10) >= 5) {
			if (num>=0) {
				x += 10;
			} else {
				x -= 10;
			}
			return (x - x % 10) / 1000;
		} else {
			return (x - x % 10) / 1000;
		} // rounds an input
	}

	public static double sqrt(double x) {
		if (x < 0) {
			throw new IllegalArgumentException("You can't sqrt a negative number. Use only positive numbers.");
		}
		double c = x;
		double t = c;
		double errorTolerance = 1e-15;
		while ((t - c / t) > errorTolerance * t) {
			t = (c / t + t) / 2.0;
		}
		return round2(t);// sqrts the input accurately
	}

	public static String quadForm(double a, double b, double c) {
		if (a == 0) {
			throw new IllegalArgumentException("Variable \"a\" must be greater than zero.");
		}
		if (discriminant(a, b, c) < 0) {
			return "no real roots";
		}
		double plus = round2((-b + sqrt(discriminant(a, b, c))) / (2 * a));
		double minus = round2((-b - sqrt(discriminant(a, b, c))) / (2 * a));
		if (discriminant(a, b, c) == 0) {
			String ans1 = plus + "";
			return ans1;
		} else {
			String ans2 = plus + " and " + minus;
			return ans2;
		} // returns the quadratic formula for 3 inputs

	}

	public static double xVertex(double a, double b) {
		return -b / (2 * a);
	}

	public static double yVertex(double a, double b, double c, double xVert) {
		double compute = (a * (xVert * xVert)) + (b * xVert) + c;
		return compute;
	}

	public static void quadrDescriber(double a, double b, double c) {
		// description
		String description = a + "x^2 + " + b + "x + " + c;
		System.out.println("Description of the graph:");
		System.out.println(description + "\n");

		// determines if graph is open up or down
		System.out.print("Opens: ");
		if (a > 0) {
			System.out.println("Up");
		} else {
			System.out.println("Down");
		}

		// determines axis of symmetry
		String sym = "Axis of Symmetry: " + round2(xVertex(a, b));
		System.out.println(sym);

		// determines vertex
		String vertex = "(" + round2(xVertex(a, b)) + "," + round2(yVertex(a, b, c, xVertex(a, b))) + ")";
		String vertex2 = "Vertex: " + vertex;
		System.out.println(vertex2);

		// determines x-int
		String xint = "x-intercept: " + (quadForm(a, b, c));
		System.out.println(xint);

		// determines y-int
		System.out.print("y-intecept: " + c);

	}

}
