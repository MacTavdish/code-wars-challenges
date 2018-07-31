package codewars;

public class MaxOfTwo {
	public static void main(String[] args){
		System.out.print(findMax(11, -12));
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @return the maximum of two numbers without control statements
	 */
	public static int findMax(int a, int b) {
		// use bitwise ops:
		// if a - b is positive then a is bigger. otherwise b is bigger.
		int c = a - b;
		// get the 32 bit of c
		int signBit = (c >> 31) & 0x1;
		/// now if sign bit it 0 then we return a 
		/// if sign bit is 1, we return b
		return b * signBit + a * (signBit^1);
	}
}
