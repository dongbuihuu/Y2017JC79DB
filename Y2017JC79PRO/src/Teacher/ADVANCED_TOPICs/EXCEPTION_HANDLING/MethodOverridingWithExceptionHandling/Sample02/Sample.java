package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.EXCEPTION_HANDLING.MethodOverridingWithExceptionHandling.Sample02;

public class Sample {
	public static void main(String[] args) {

	}
}

class Super {
	void show() {
		System.out.println("parent class");
	}
}

class Sub extends Super {
	void show() throws ArrayIndexOutOfBoundsException
	// Correct because ArrayIndexOutOfBoundsException 
	//is unchecked exceptions
	{
		System.out.println("child class");
	}
}
