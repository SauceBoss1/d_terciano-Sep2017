/*
 * @author derfelTerciano
 * @version 0.1
 * 
 * does calculations and operations
 * does not actually print anything.
 */
public class Calculate {
	public static int square(int x) {
		return x*x;	//This squares an input of 'x'
	}
	public static int cube(int num) {
		return num*num*num; //This cubes the input of 'num
	}
	public static double average(double num1 , double num2 ) {
		return (num1+num2)/2; //Average out two inputs
	}
	public static double average(double num1,double num2,double num3) {
		return (num1+num2+num3)/3;//Averages out 3 inputs
	}
	public static double toDegrees(double rad) {
		return (180*rad)/3.14159;//Converts input(which should be a double and a radian) to a degree of an angle 
	}
	public static double toRadians(double degrees) {
		return (degrees*3.14159)/180;//Does the samething as toDegrees but converts to Radian
	}
	public static double discriminant(double a, double b, double c) {
		return (b*b)-(4*a*c);//Returns the discrminant in a quadratic using the inputs of 'a','b','c'
	}
	public static String toImproperFrac(int x, int y, int z) {
		int numerator = (x*z)+y;
		String frac= numerator +"/"+ z;
		return frac; //Converts a Mixed Fraction into an Improper Fraction
	}
	public static String toMixedNum(int num, int den ) {
			int modOfFrac = num % den;
			int wholeNum = num/den;
			String mixedNum = wholeNum+" "+modOfFrac+"/"+den;
			return mixedNum;//Converts an Improper Fraction into a Mixed Fractions
	}
	public static String foil(int a, int b, int c, int d, String x) {
		int first = a*c;
		int outside= a*d;
		int inside= b*c;
		int last= b*d;
		int bx= outside+inside;
		String binom=first+x+"^2 "+"+ "+bx+x+" + "+last;
		String binom2=first+x+"^2 "+"+ "+bx+x+" - "+(last*-1);
		if (last>0) {
			return binom;
		} else {
			return binom2;//FOILs the inputs
		}
	}
	public static boolean isDivisibleBy(int a, int b) {
		if (a%b==0) {
			return true;
		} else {
			return false;//Checks if inputs are divisible to each other
		}
	}
	public static double absValue(double num) {
		if (num<0) {
			return num*-1;
		}else {
			return num;
		}
	}
	public static double max(double num1, double num2) {
		if (num1>num2) {
			return num1;
		} else {
			return num2;
		}
	}
	public static double max(double num1, double num2, double num3) {
		if (num1>num2 & num1>num3) {
			return num1;
		}else if (num2>num1 & num2>num3) {
			return num2;
		} else if (num3>num2 & num3>num1) {
			return num3;
		} else {
			return num1;//returns max of three doubles
		}
	}
	public static int min(int num1, int num2) {
		if (num2<num1) {
			return num2;
		} else {
			return num1;// returns the minimum of a number(integer)
		}
	}
	public static double round2(double num) {
		double convert2hun=num*=100;
		double convert2int= (int) num*100;
		double decimal = convert2hun-convert2int;
		if (decimal<0.5) {
			convert2int += 1;
			double convert2deci = (double) convert2int/100;
			return convert2deci;
		} else {
			double convert2deci = (double) convert2int/100;
			return convert2deci;
		}
		
		
	}
}
