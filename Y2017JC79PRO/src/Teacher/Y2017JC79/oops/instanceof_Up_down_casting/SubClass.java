package Teacher.Y2017JC79.oops.instanceof_Up_down_casting;

public class SubClass extends SupperClass {

	public void display() {
		System.out.println("Casting sucessfuly");
	}

	public static void show(SupperClass p) {
		if (p instanceof SubClass) {
			SubClass b1 = (SubClass) p;
			b1.display();
		} else {
			System.out.println("Not instanceof");
		}
	}

	public static void main(String[] args) {
		// SupperClass p = new SubClass(); // da hinh up-casting
		SupperClass p = new SupperClass();
		SubClass.show(p);
	}

}
