package BUIHUUDONG.ExceptionHandling.Demo6;

public class ChainedExceptionDemo {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void method1() throws Exception {
		try {
			method2();
		} catch (Exception ex) {
			throw new Exception("Da bat", ex);
		}
	}

	public static void method2() throws Exception {
		throw new Exception("New info from method2");
	}

}
