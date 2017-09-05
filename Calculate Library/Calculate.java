/*
 * @author derfelTerciano
 * @version 0.1
 * 
 * does math and operations
 * does not actually print anything.
 */
public class Calculate {
	public static int square(int x) {
		return x*x;
		
	}
	public static int cube(int num) {
		return num*num*num;
	}
	public static double average(double num1 , double num2 ) {
		return (num1+num2)/2;
	}
	public static double average(double num1,double num2,double num3) {
		return (num1+num2+num3)/3;
	}
	public static double toDegrees(double rad) {
		return (180*rad)/3.14159;
	}
	public static double toRadians(double degrees) {
		return (degrees*3.14159)/180;
	}
	public static double discrminant(double a, double b, double c) {
		return (b*b)-(4*a*c);
	}

}
