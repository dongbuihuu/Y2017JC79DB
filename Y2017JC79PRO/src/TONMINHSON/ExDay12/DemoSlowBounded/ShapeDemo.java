package TONMINHSON.ExDay12.DemoSlowBounded;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle(12, 45);
		Shape circle = new Circle(29);

		System.out.println("Same area? " + equalsShape(rectangle, circle));

		// System.out.println("Same area?" + equalsShape(new Integer(12), new
		// Character('a'))); // Wrong because Integer
		// and Character are not instance of Shape
	}

	// Assume that we would like to compare Areas of instances of Shape

	public static <E extends Shape> boolean equalsShape(E o1, E o2) {
		boolean rec;
		rec = (o1.Area() == o2.Area()) ? true : false;
		return rec;
	}

}
