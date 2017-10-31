package Teacher.Y2017JC79.ExceptionHandling.Sample01_DemoWithoutException;

public class MethodWithoutException {

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 0;
		int result = dividedTwoNumber(number1, number2);

		System.out.println(number1 + " / " + number2 + " is " + result);

	}

	public static int dividedTwoNumber(int a, int b) {
		if (b == 0) {
			System.out.println("Divisor cannot be zero");
			Runtime.getRuntime().exit(1); // Ket thuc chuong trinh
			System.exit(0);
		}
		return a / b;
	}

}
