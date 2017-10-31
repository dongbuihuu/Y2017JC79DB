package Teacher.ADVANCED_TOPICs.EXCEPTION_HANDLING.MethodOverridingWithExceptionHandling.Sample01;

import java.io.IOException;

public class Sample {

}

class Super {
	void show() {
		System.out.println("parent class");
	}
}

class Sub extends Super {
	void show() throws IOException // Compile time error
	{
		System.out.println("parent class");
	}
}
