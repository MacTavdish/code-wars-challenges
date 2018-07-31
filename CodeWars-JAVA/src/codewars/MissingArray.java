package codewars;

/*
 * You get an array of arrays.
 * If you sort the arrays by their length, you will see, that their length-values are consecutive.
 * But one array is missing!
 * You have to write a method, that return the length of the missing array.
 * Example:
 * [[1, 2], [4, 5, 1, 1], [1], [5, 6, 7, 8, 9]] --> 3
 * If the array of arrays is null/nil or empty, the method should return 0.
 */
public class MissingArray {
	public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
		/// find length of max array
		/// initialize new array size of length of max array
		/// iterate over the array and return one that is false
		if (arrayOfArrays == null || arrayOfArrays.length == 0) {
			return 0;
		}

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;

		for (Object[] arr : arrayOfArrays) {
			try {
				if (min > arr.length) {
					min = arr.length;
				}
				if (max < arr.length) {
					max = arr.length;
				}
				sum += arr.length;
			} catch (NullPointerException ex) {
				return 0;
			}
		}
		if (min == 0) {
			return 0;
		}

		int actualSum = (max * (max + 1)) / 2;
		int nonExistentSum = ((min - 1) * min) / 2;
		int properSum = actualSum - nonExistentSum;

		return properSum - sum;
	}

	public static void main(String[] args) {
		Object[][] arr = new Object[][] { new Object[] {}, new Object[] { 4, 5, 1, 1 }, new Object[] { 1, 2, 3 },
				new Object[] { 5 } };
		System.out.println(getLengthOfMissingArray(arr));
	}
}
