package Teacher.Y2017JC79.oops.object_and_class;

public class Demo_Static {

	// instance variable
	String sName;

	public String change() {
		return this.sName;
	}

	public int tinhTong(int a, int b) {
		int c = (a + b); // none - static
		return c;
	}

	public static void main(String[] args) {
		int x = 10, y = 11;
		Demo_Static obj = new Demo_Static();

		System.out.println("Tong la:" + obj.tinhTong(x, y));
	}

}
