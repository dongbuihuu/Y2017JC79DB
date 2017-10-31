package BUIHUUDONG.ExceptionHandling;

public class QuotientWithException {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			int result = quotient(a, b);
			System.out.println(a + "/" + b + "is: " + result);

		} catch (ArithmeticException ex) {
			System.out.println("Co loi chia cho 0");
		}
		System.out.println("Hoan thanh");

	}

	public static int quotient(int number1, int number2) {
		if (number2 == 0) {
			throw new ArithmeticException("Divisor cannot be zero");
		}
		return number1 / number2;
	}
}
