package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.ENUMERATIONS.WithConstructorInstanceVariableAndMethod;

public class EnumDemo {

	public static void main(String[] args) {		
		Apple objApple = null;
		System.out.println("Price of : "+ Apple.A.getPrice());
		System.out.println("Price of : "+ Apple.B.getPrice());
		System.out.println("Price of : "+ Apple.C.getPrice());
		System.out.println("Price of : "+ Apple.D.getPrice());
		System.out.println("Price of : "+ Apple.E.getPrice());
		objApple.PrintInfo();
	}
}
