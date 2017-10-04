package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.EXCEPTION_HANDLING.MethodOverridingWithExceptionHandling.Sample05;

import javax.swing.text.html.FormSubmitEvent.MethodType;
import javax.tools.Diagnostic.Kind;

public class Sample {
	public static void main(String[] args) { }
}

class Super {
	void show() throws ArithmeticException {
		System.out.println("parent class");		
	}
}

class Sub extends Super {
	void show() throws Exception // Compile time Error
	{
		System.out.println("child class");
	}
}
