import java.lang.StringBuilder;

public class Practiceit {
	public static int gcd(int a, int b) {
		a = (a > 0) ? a : -a;
		b = (b > 0) ? b : -b;
		int out = 0;
		if (a != 0 && b != 0) {
			for (int i = 1; i <= a && i <= b; i++) {
				if (a % i == 0 && b % i == 0) {
					out = i;
				}
			}
			return out;

		} else if (a == 0) {
			return b;

		} else {
			return a;
		}
	}

	public static String repl(String a, int x) {
		if (x <= 0) {
			return "";
		}
		StringBuilder output = new StringBuilder();
		for (int i = 0; i <= x; i++) {
			output.append(a);
		}
		return output.toString();
	}

	public static String season(int month, int day) {
		if ((month > 3 && month < 6) || (month == 3 && day >= 16) || (month == 6 && day == 15)) {
			return "Spring";
		} else if ((month > 12 && month < 3) || (month == 12 && day == 16) || (month == 3 && day == 15)) {
			return "Winter";

		}else if ((6 < month && month < 9) || (month == 6 && day >= 16) || (month == 9 && day <= 15)) {
			return "Summer";
		} else {
			return "Fall";
		}
	}
	public static void sequence() {
		for (int i= 1; i <= 2; i++) {
			for (int j=1;j<=3;j++) {
				for (int k=1; k<=4; k++) {
					System.out.print("*");
				}
				System.out.print("!");
			}
			System.out.println();
		}
	}
	
	public static final int MAX=5;
	public static void unknown() {
		int number =0;
		for (int count = MAX; count >=1; count --) {
			number += (count*count);
		}
		System.out.println("The result is: "+ number);
	}
	public static String swapPairs(String str) {
	    char[] arr = str.toCharArray();
	    
	    for(int i = 0; i <= arr.length - 2; i += 2) {
	        char temp = arr[i];
	        arr[i] = arr[i+1];
	        arr[i+1] = temp;
	    }
	    
	    return new String(arr);
	}

	public static void main(String[] args) {
		swapPairs("hello there");
		
	}
}

/*
 * for (int i = 1; i <= a && i <= b; i++) { if (a % i == 0 && b % i == 0) { out
 * = i; } } return out;
 */