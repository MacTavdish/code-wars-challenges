package codewars;

public class CakculateRotation {
	/**
	 * Write a function that receives two strings and returns n, where n is
	 * equal to the number of characters we should shift the first string
	 * forward to match the second.
	 * 
	 * For instance, take the strings "fatigue" and "tiguefa". In this case, the
	 * first string has been rotated 5 characters forward to produce the second
	 * string, so 5 would be returned.
	 * 
	 * If the second string isn't a valid rotation of the first string, the
	 * method returns -1.
	 */
	public static void main(String[] args) {
		System.out.println(generateRotatedStr("coffee", 2));
		System.out.println(shiftedDiff("coffee", "eecoff"));
	}

	public static int shiftedDiff(String first, String second) {
		if (first.length() != second.length()) {
			return -1;
		}
		//first = first.toLowerCase();
		//second = second.toLowerCase();
		String temp;
		if (first.equals(second)) {
			return 0;
		}
		for (int i = 1; i < first.length(); i++) {
			temp = generateRotatedStr(first, i);
			if (temp.equals(second)) {
				return i;
			}
			temp = null;
		}
		return -1;
	}

	private static String generateRotatedStr(String first, int i) {
		char[] temp = new char[first.length()];
		for (int j = 0; j < first.length(); j++) {
			temp[j] = first.charAt((first.length() - i + j) % first.length()); 
		}
		return String.valueOf(temp);
	}

}
