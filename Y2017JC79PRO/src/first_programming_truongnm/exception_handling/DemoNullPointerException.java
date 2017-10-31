package first_programming_truongnm.exception_handling;

public class DemoNullPointerException {

	public static void main(String[] args) {
		try {
			String strText2 = getString();
			int iLength = strText2.length();
			System.out.println("Length is: " + iLength);

		} catch (NullPointerException error) { // Có thể thay error bằng bất kỳ chữ khác
			System.out.println(error.getMessage());
			System.out.println(error.getClass());
		}

	}

	public static String getString() {
		return null;
	}
}
