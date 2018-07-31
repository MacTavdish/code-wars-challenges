package codewars;
import java.util.HashMap;
import java.util.Map;

/*
 * An isogram is a word that has no repeating letters, consecutive or non-consecutive.
 * Implement a function that determines whether a string that contains only letters is an isogram.
 * Assume the empty string is an isogram. Ignore letter case.
 */

public class Isogram {

	public static boolean isIsogram(String str) {
		str = str.toLowerCase();
		int[] arr = new int[26];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 97]++;
			if (arr[str.charAt(i) - 97] > 1) {
				return false;
			}
		}
		return true;
	}

	public static boolean isIsogram2(String str) {
		return str.length() == str.toLowerCase().chars().distinct().count();
	}

	public static void main(String[] args) {
		System.out.println(isIsogram("isogram"));
		System.out.println(isIsogram("isIsogram"));
		System.out.println(isIsogram("aba"));
		System.out.println(isIsogram("moOse"));
		System.out.println(isIsogram("thumbscrewjapingly"));
	}
}
