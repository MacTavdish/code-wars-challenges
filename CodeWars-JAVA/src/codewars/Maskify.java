package codewars;
public class Maskify {
	/*
	 * Usually when you buy something, you're asked whether your credit card
	 * number, phone number or answer to your most secret question is still
	 * correct. However, since someone could look over your shoulder, you don't
	 * want that shown on your screen. Instead, we mask it. Your task is to
	 * write a function maskify, which changes all but the last four characters
	 * into '#'.
	 */
	public static String maskify(String str) {
		if (str.length() < 4) {
			return str;
		} else {
			// StringBuilder to build newly masked string
			StringBuilder newMaskedString = new StringBuilder();
			for (int i = 0; i < str.length(); i++) {
				if (str.length() - i > 4) {
					newMaskedString.append("#");
				} else {
					newMaskedString.append(str.charAt(i));
				}
			}
			return newMaskedString.toString();
		}
	}
}
