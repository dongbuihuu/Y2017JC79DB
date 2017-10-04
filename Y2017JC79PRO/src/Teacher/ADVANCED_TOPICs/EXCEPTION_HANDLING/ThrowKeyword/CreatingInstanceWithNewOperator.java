package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.EXCEPTION_HANDLING.ThrowKeyword;

public class CreatingInstanceWithNewOperator {
	public static void main(String[] args) {
		try {
			throw new ArithmeticException("demo");
		} catch (ArithmeticException e) {
			System.out.println("Exception caught");
		}
	}
}
