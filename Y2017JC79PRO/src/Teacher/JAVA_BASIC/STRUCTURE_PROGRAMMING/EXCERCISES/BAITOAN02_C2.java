package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.EXCERCISES;

import java.util.Scanner;

public class BAITOAN02_C2 {
	public static void main(String[] args) {
		// 1. Yêu cầu người dùng cung cấp đầy đủ thông tin?
		System.out.println("- Mời nhập số a?");
		Scanner sc = new Scanner(System.in);
		double dA = sc.nextDouble();

		System.out.println("- Mời nhập số b?");
		double dB = sc.nextDouble();

		System.out.println("- Mời chọn phép tính?");
		sc = new Scanner(System.in);
		String sOpt = sc.nextLine();

		// 3. Thực thi tính toán với phép toán người dùng lựa chọn?
		switch (sOpt) {
			case "+": System.out.println("a + b = " + (dA + dB)); break;
			case "-": System.out.println("a - b = " + (dA - dB)); break;
			case "*": System.out.println("a * b = " + (dA * dB)); break;
			case "/": System.out.println("a / b = " + (dA / dB)); break;
		}
	}
}
