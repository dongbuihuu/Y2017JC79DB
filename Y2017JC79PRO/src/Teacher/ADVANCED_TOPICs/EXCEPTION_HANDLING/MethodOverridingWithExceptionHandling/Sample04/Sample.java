package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.EXCEPTION_HANDLING.MethodOverridingWithExceptionHandling.Sample04;

public class Sample {

	public static void main(String[] args) {
		try {
			Super s = new Sub();
			s.show();
		} catch (Exception e) { }
	}
}

class Super {
	void show() throws Exception {
		System.out.println("parent class");
	}
}

class Sub extends Super {
	void show() // Correct
	{
		System.out.println("child class");
	}
}
