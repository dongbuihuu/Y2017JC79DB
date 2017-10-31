package Teacher.ADVANCED_TOPICs.EXCEPTION_HANDLING;

public class UncheckedException {

	public static void main(String[] args) {

		int a = 0;
		try {
			int b = 7 / a; // Divide by zero, will lead to exception

		} catch (ArithmeticException ex) {
			// ex.printStackTrace();
			System.out.println("CHÚC MỪNG CHUYÊN GIA");
		}
		/*
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
		 * ADVANCED_TOPICS.EXCEPTION_HANDLING.UncheckedException.main(UncheckedException
		 * .java:7)
		 * -----------------------------------------------------------------------------
		 * ------------------------------- + ArithmeticException: Tên lớp đảm nhiệm vai
		 * trò xử lý lỗi này. + UncheckedException.main: Hàm main xảy ra lỗi ở trong lớp
		 * UncheckedException. + 7 : line số 7 phát sinh ra lỗi
		 * -----------------------------------------------------------------------------
		 * -------------------------------
		 */
	}
}
