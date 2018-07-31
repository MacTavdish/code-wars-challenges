package codewars;

public class Operations {
	public static void main(String[] args) {
		System.out.println(sub(-11, -11));
		System.out.println(mult(2, 1));
		System.out.println(div(4, 5));
	}

	//////////////////// ALLOWED ONLY THE "ADD" & "BITWISE" OPERATORS////////////////
	public static int sub(int a, int b) {
		return a + (~b + 1);
	}

	public static int mult(int a, int b) {
		int sum = 0;
		if (b > 0) {
			for (int i = 0; i < b; i++) {
				sum += a;
			}
		} else if (a < 0) {
			for (int i = 0; i < (~b + 1); i++) {
				sum += (~a + 1);
			}
		} else {
			for (int i = 0; i < (~b + 1); i++) {
				sum -= (~a + 1);
			}
		}
		return sum;
	}

	public static int div(int a, int b) {
		boolean neg = false;

		if (a < 0 && b < 0) {
			a = ~a + 1;
			b = ~b + 1;
		} else if (a < 0 && b > 0) {
			a = ~a + 1;
			neg = true;
		} else if (b < 0 && a > 0) {
			b = ~b + 1;
			neg = true;
		} else if (b > a) {
			return 0;
		}

		int temp = 1;
		int sum = b;
		while (a > sum) {
			temp++;
			sum += b;
		}
		if (neg) {
			return ~temp + 1;
		}
		return temp;

	}
}
