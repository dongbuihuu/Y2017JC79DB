package Teacher.Y2017JC79.oops.generics.generictypebounded.DemoSlowBounded;

public class MainBoundedDemo {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle(12, 4555);
		Shape circle = new Circle(12);

		System.out.println("Same area?" + equalsShape(rectangle, circle));
		// System.out.println(equalsShape(new Integer(12), new Double(123.8)));

	}
	// Giả sử ta muốn so sánh 2 đối tượng shape (về Area) nhưng các đối tượng đó chỉ
	// là
	// lớp con của Shape thì viết hàm Generic thế nào?

	public static <E extends Shape> boolean equalsShape(E o1, E o2) {
		boolean rec = false;
		rec = (o1.Area() == o2.Area());
		return rec;
	}

}
