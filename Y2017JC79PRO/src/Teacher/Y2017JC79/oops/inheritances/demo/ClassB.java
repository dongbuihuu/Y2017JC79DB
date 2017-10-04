package Teacher.Y2017JC79.oops.inheritances.demo;

public class ClassB extends ClassA {
	String sDiaChi;

	public void hienThi() {
		System.out.println("Đây là lớp B");
	}

	public void Display() {
		System.out.println("Day là display");
	}

	public static void main(String[] args) {
		ClassB b = new ClassB();
		b.hienThi();

	}

}
