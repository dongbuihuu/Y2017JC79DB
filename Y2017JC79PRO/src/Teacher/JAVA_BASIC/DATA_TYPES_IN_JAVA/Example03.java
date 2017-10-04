package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.DATA_TYPES_IN_JAVA;

public class Example03 {
	public static void main(String[] args) {
		// 1. Khai báo ra 03 biến kiểu nguyên thủy với double
		// double a; //struct - Kiểu dữ liệu nguyên thủy
		// Double b; //Object - Kiểu dữ liệu tham chiếu
		double dA = 6.5;
		double dB = 7.5;
		double dC;
		String sValue;

		// 2. Thực hiện tính toán c = a + b;

		dC = dA + dB;
		System.out.println("--> Kết quả: a (" + dA + ") + b(" + dB + ") = " + dC);
		System.out.println(String.format("--> Kết quả: a(%s) + b(%s) = %s", dA, dB, dC));
	}
}
