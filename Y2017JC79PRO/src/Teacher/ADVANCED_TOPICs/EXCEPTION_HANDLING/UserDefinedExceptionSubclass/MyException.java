package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.EXCEPTION_HANDLING.UserDefinedExceptionSubclass;

public class MyException extends Exception {
	private int ex;

	MyException(int a) {
		ex = a;
	}

	public String toString() {
		return "CHUC MUNG CHUYEN GIA :D";
	}	
}
