
public class Quadratic {
	public static double discriminant(double a, double b, double c) {
		return (b * b) - (4 * a * c);// Returns the discriminant in a quadratic using the inputs of 'a','b','c'
	}
	public static double round2(double num) {
		double x = (num - num % 0.001) * 1000;
		if (x % 10 >= 5) {
			x += 10;
			return (x - x % 10) / 1000;
		} else {
			return (x - x % 10) / 1000;
		}//rounds an input
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
		return round2(t);//sqrts the input accurately
	}
	public static String quadForm(int a, int b, int c) {
		if(a==0) {
			throw new IllegalArgumentException("Variable \"a\" must be greater than zero.");
		}
		if (discriminant(a,b,c)<0) {
			return "no real roots";
		}
		double plus = round2((-b +sqrt(discriminant(a,b,c)))/(2*a));
		double minus = round2((-b -sqrt(discriminant(a,b,c)))/(2*a));
		if (discriminant(a,b,c)==0) {
			String ans1= plus+"";
			return ans1;
		} else {
			String ans2=plus +" and "+ minus;
			return ans2;
		}//returns the quadratic formula for 3 inputs
		
	}
	public static void quadrDescriber (double a, double b, double c) {
		
	}


}
