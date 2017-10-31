package Teacher.ADVANCED_TOPICs.EXCEPTION_HANDLING;

public class NestedTryStatement {

	public static void main(String[] args) {
		try {
			int arr[] = { 5, 0, 1, 2 };
			try {
				int x = arr[3] / arr[1];
			} catch (ArithmeticException ae) {
				System.out.println("divide by zero");
			}
			arr[4] = 3;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bound exception");
		}
		System.out.println("Ko có lỗi gì hết :D");
	}
}
