package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.AUTOBOXING_UNBOXING;

public class ExampleOfAutoboxingAndUnboxing {

	public static void main(String[] args) {
		Integer objI = 100;    // Autoboxing of int
		int i = objI; 			      // Auto-Unboxing of Integer
		System.out.println(i + " " + objI);

		Character objC = 'a'; 	// Autoboxing of char
		char ch = objC; 			// Auto-unboxing of Character
		System.out.println(objC + " " + ch);
	}
}
