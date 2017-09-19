/*
 * @author derfelTerciano
 * @version 0.1
 * 
 * does calculations and operations
 * does not actually print anything.
 */
public class Calculate {
	public static int square(int x) {
		return x * x; // This squares an input of 'x'
	}

	public static int cube(int num) {
		return num * num * num; // This cubes the input of 'num
	}

	public static double average(double num1, double num2) {
		return (num1 + num2) / 2; // Average out two inputs
	}

	public static double average(double num1, double num2, double num3) {
		return (num1 + num2 + num3) / 3;// Averages out 3 inputs
	}

	public static double toDegrees(double rad) {
		return (180 * rad) / 3.14159;// Converts input(which should be a double and a radian) to a degree of an angle
	}

	public static double toRadians(double degrees) {
		return (degrees * 3.14159) / 180;// Does the samething as toDegrees but converts to Radian
	}

	public static double discriminant(double a, double b, double c) {
		return (b * b) - (4 * a * c);// Returns the discrminant in a quadratic using the inputs of 'a','b','c'
	}

	public static String toImproperFrac(int x, int y, int z) {
		int numerator = (x * z) + y;
		String frac = numerator + "/" + z;
		return frac; // Converts a Mixed Fraction into an Improper Fraction
	}

	public static String toMixedNum(int num, int den) {
		int modOfFrac = num % den;
		int wholeNum = num / den;
		String mixedNum = wholeNum + " " + modOfFrac + "/" + den;
		return mixedNum;// Converts an Improper Fraction into a Mixed Fractions
	}

	public static String foil(int a, int b, int c, int d, String x) {
		int first = a * c;
		int outside = a * d;
		int inside = b * c;
		int last = b * d;
		int bx = outside + inside;
		String binom = first + x + "^2 " + "+ " + bx + x + " + " + last;
		String binom2 = first + x + "^2 " + "+ " + bx + x + " - " + (last * -1);
		if (last > 0) {
			return binom;
		} else {
			return binom2;// FOILs the inputs
		}
	}

	public static boolean isDivisibleBy(int a, int b) {
		if (a % b == 0) {
			return true;
		} else {
			return false;// Checks if inputs are divisible to each other
		}
	}

	public static double absValue(double num) {
		if (num < 0) {
			return num * -1;
		} else {
			return num;
		}
	}

	public static double max(double num1, double num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static double max(double num1, double num2, double num3) {
		if (num1 > num2 & num1 > num3) {
			return num1;
		} else if (num2 > num1 & num2 > num3) {
			return num2;
		} else if (num3 > num2 & num3 > num1) {
			return num3;
		} else {
			return num1;// returns max of three doubles
		}
	}

	public static int min(int num1, int num2) {
		if (num2 < num1) {
			return num2;
		} else {
			return num1;// returns the minimum of a number(integer)
		}
	}

	public static double round2(double num) {
		double x = (num - num % 0.001) * 1000;
		if (x % 10 >= 5) {
			x += 10;
			return (x-x%10) / 1000;
		} else {
			return (x-x%10) / 1000;
		}

	}

	public static double exponent(double base, int power) {
		double ans = 1;
		for (int i = 0; i < power; i++) {
			ans *= base;
		}
		return ans;
	}

	public static int factorial(int num) {
		int numSub = num;
		int ans = 1;
		for (int i = 0; numSub > 0; i++) {
			ans *= numSub;
			numSub--;
		}
		return ans;
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (isDivisibleBy(num, i) == true) {
				return false;
			}
		}
		return true;

	}

	public static int gcf(int num1, int num2) {
		if (isPrime(num1) && isPrime(num2)) {
			return 1;
		}
		while (num1 != 0 && num2 != 0) {
			int num3 = num2;
			num2 = num1%num2;
			num1=num3;
		}
		return num1+num2;
	}
	
	public static double sqrt(double x) {
		double sqrRoot = 0;
		double temp =0;
		temp = x/2;
		while ( x > 0.0) {
			sqrRoot = temp - (temp*temp - x)/(2*temp);
			double value=0;
			value = ((temp - sqrRoot)<0) ? value:-value; 
			if (value < .0001) {
				x= sqrRoot;
			} else {
				temp =sqrRoot;
			}
		}
		return x;
	}
}//end of program
