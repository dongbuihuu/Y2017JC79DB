package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.EXCEPTION_HANDLING.UserDefinedExceptionSubclass;

public class Test {

	public static void main(String[] args) {
		try {
			sum(-10, 10);
		} catch (MyException me) {
			System.out.println(me);
		}
	}

	static void sum(int a, int b) throws MyException {
		if (a < 0) {			
			throw new MyException(a);
		} else {
			System.out.println(a + b);
		}
	}
}
