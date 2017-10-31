package Teacher.ADVANCED_TOPICs.EXCEPTION_HANDLING;

public class ExampleForMultipleCatchBlocks {

	public static void main(String[] args) {
		try {
			int arr[] = { 1, 2 };
			arr[2] = 3 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			// e.printStackTrace();
			System.out.println("array index out of bound exception");
		} catch (ArithmeticException ae) {
			// ae.printStackTrace();
			System.out.println("divide by zero");
		}
	}
}
