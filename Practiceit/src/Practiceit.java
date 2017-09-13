
public class Practiceit {
	public static int gcd(int a, int b) {
		a = (a>0)? a:-a;
		b = (b>0)? b:-b;
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

	public static void main(String[] args) {
		System.out.println(gcd(-512, -12));
	}
}

/*
 * for (int i = 1; i <= a && i <= b; i++) { if (a % i == 0 && b % i == 0) { out
 * = i; } } return out;
 */