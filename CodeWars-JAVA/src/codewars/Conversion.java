package codewars;

public class Conversion {

	public static String solution(int n) {
		StringBuilder solution = new StringBuilder();
		return solutionHelper(n, solution);
	}

	public static String solutionHelper(int n, StringBuilder solution) {
		if (n == 0) {
			return solution.toString();
		} else {
			if (n >= 1000) {
				solution.append(converter((n / 1000) * 1000));
				solutionHelper(n % 1000, solution);
			} else if (n >= 500) {
				solution.append(converter((n / 100) * 100));
				solutionHelper(n % 100, solution);
			} else if (n >= 100) {
				solution.append(converter((n / 100) * 100));
				solutionHelper(n % 100, solution);
			} else if (n >= 50) {
				solution.append(converter((n / 10) * 10));
				solutionHelper(n % 10, solution);
			} else if (n >= 10) {
				solution.append(converter((n / 10) * 10));
				solutionHelper(n % 10, solution);
			} else if (n >= 5) {
				solution.append(converter(n));
				solutionHelper(n / 10, solution);
			} else if (n >= 1) {
				solution.append(converter(n));
				solutionHelper(n / 10, solution);
			}
		}
		return solution.toString();
	}

	private static String converter(int n) {
		StringBuilder str = new StringBuilder();
		if (n >= 1000) {
			for (int i = 0; i < n / 1000; i++) {
				str.append("M");
			}
		} else if (n >= 500) {
			if (n < 900) {
				str.append("D");
				for (int i = 0; i < (n - 500) / 100; i++) {
					str.append("C");
				}
			} else {
				// n is 900
				str.append("CM");
			}
		} else if (n >= 100) {
			if (n < 400) {
				for (int i = 0; i < n / 100; i++) {
					str.append("C");
				}
			} else {
				// n is 400
				str.append("CD");
			}
		} else if (n >= 50) {
			if (n < 90) {
				str.append("L");
				for (int i = 0; i < (n - 50) / 10; i++) {
					str.append("X");
				}
			} else {
				// n is 90
				str.append("XC");
			}
		} else if (n >= 10) {
			if (n < 40) {
				for (int i = 0; i < n / 10; i++) {
					str.append("X");
				}
			} else {
				// n is 40
				str.append("XL");
			}
		} else if (n >= 5) {
			if (n < 9) {
				str.append("V");
				for (int i = 0; i < n - 5; i++) {
					str.append("I");
				}
			} else {
				str.append("IX");
			}
		} else if (n >= 1) {
			if (n < 4) {
				for (int i = 0; i < n; i++) {
					str.append("I");
				}
			} else {
				str.append("IV");
			}
		}
		return str.toString();
	}

	public static void main(String[] args) {
		System.out.println(solution(1666));
	}
}
