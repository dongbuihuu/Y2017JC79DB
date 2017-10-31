package Teacher.Y2017JC79.enumerations.WithConstructorInstanceVariableAndMethod;

public class EnumDemo02 {
	public static void main(String args[]) {

		// Display price of Winsap.
		System.out.println(Apple.A.getPrice());

		// Display all apples and prices.
		System.out.println("All apple prices:");
		for (Apple a : Apple.values())
			System.out.println(a + " costs " + a.getPrice() + " cents.");
	}
}
