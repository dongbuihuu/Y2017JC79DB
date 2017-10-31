package BUIHUUDONG.ExceptionHandling.Demo2;

public class DemoMulti {

	public static void main(String[] args) {
		try {
			method1();
			System.out.println("Tiep phuong thuc main");
		} catch (Exception e) {
			System.out.println("Cuoi cung");
		}
	}

	// 1. Tao phuong thuc 3
	public static void method3(int a, int b) {

		int c = a / 0;

	}

	// 2. tao phuong thuc 2
	public static void method2() {
		try {
			method3(10, 0);
			System.out.println("Cau lenh tiep method2");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// 3. tao phuong thuc 1
	public static void method1() {
		try {
			method2();
			System.out.println("Cau lenh tiep method1");
		} catch (Exception e) {
			System.out.println("Xy ly o phuong 1");
		}
	}
}
