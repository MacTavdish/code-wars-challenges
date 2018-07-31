package codewars;

public class Persistence {

	/*
	 * Write a function, persistence, that takes in a positive parameter num and
	 * returns its multiplicative persistence, which is the number of times you
	 * must multiply the digits in num until you reach a single digit.
	 */
	public static int persistence(int num) {
		return persistenceHelper(num, 0);
	}

	private static int persistenceHelper(int num, int count) {

		if (num < 10) {
			return count;
		} else {
			count++;
			int newNum = multiplyDigits(num);
			return persistenceHelper(newNum, count);
		}
	}

	private static int multiplyDigits(int num) {
		int multiply = 1;
		while (num != 0) {
			multiply *= num % 10;
			num /= 10;
		}
		return multiply;
	}
}
