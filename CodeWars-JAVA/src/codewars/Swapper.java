package codewars;

public class Swapper {
	public static void main(String[] args) {
		swap(-2, 9);
	}

	public static void swap(int a, int b) {
		System.out.println("a was :" + a);
		System.out.println("b was :" + b);
		a = a - b;
		b = b + a;
		a = b - a;
		System.out.println("a is :" + a);
		System.out.println("b is :" + b);
	}
}
