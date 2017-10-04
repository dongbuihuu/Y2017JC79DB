package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.EXCEPTION_HANDLING.ThrowsKeyword;

public class ExampleDemonstratingThrowsKeyword {

	public static void main(String[] args) {
		Controllers objController = new Controllers();
		try {
			boolean bResult = objController.Calculator();
		} catch (ArithmeticException ex) {
			System.out.println("Lỗi chia cho số 0");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Lỗi vượt quá chỉ số mảng");
		}
	}
}
