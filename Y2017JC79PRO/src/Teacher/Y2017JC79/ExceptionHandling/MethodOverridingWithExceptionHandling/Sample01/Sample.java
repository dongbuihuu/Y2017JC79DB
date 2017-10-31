package Teacher.Y2017JC79.ExceptionHandling.MethodOverridingWithExceptionHandling.Sample01;

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
