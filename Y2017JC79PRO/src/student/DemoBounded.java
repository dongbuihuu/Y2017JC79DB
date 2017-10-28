package student;

public class DemoBounded {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle (22, 4555);
		
		Shape circle = new Circle(12);

		System.out.println("Same area? " + equalsShape(rectangle, circle));

	}
	
	public static <E extends Shape> boolean equalsShape (E o1, E o2){
		boolean rec;
		rec = (o1.Area() == o2.Area());
		return rec;
		
	}

}
