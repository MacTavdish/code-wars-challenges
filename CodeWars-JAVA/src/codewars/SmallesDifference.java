package codewars;

import java.util.Arrays;

public class SmallesDifference {
	public static void main(String[] args) {

	}

	/**
	 * Compute the value that is the minimal difference between 2 values in each
	 * of the given arrays
	 * 
	 * @param arr1
	 *            - first array
	 * @param arr2
	 *            - second array
	 * @return value that corresponds to the minimal difference between 2 values
	 *         in each of the arrays.
	 */
	public static int computeMinDifference(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int pointerA = 0;
		int pointerB = 0;
		int min = Integer.MAX_VALUE;
		while (pointerA < arr1.length && pointerB < arr2.length) {
			if (Math.abs(arr1[pointerA] - arr2[pointerB]) < min) {
				min = Math.abs(arr1[pointerA] - arr2[pointerB]);
			}
			if (arr1[pointerA] < arr2[pointerB]) {
				pointerA++;
			} else {
				pointerB++;
			}
		}
		return min;
	}
}
