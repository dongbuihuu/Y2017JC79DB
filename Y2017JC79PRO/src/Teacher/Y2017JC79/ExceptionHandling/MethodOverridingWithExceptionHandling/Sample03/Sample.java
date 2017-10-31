package Teacher.Y2017JC79.ExceptionHandling.MethodOverridingWithExceptionHandling.Sample03;

public class Sample {
	public static void main(String[] args) {
		try {
			Super s = new Sub();
			s.show();
		} catch (Exception e) {
		}
	}
}

class Super {
	void show() throws Exception {
		System.out.println("parent class");
	}
}

class Sub extends Super {
	void show() throws Exception // Correct
	{
		System.out.println("child class");
	}
}
