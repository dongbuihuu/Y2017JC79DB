package JAVACORE_TRAINING.BASIC_JAVA.MY_FIRST_JAVA_PROGRAM;

import java.util.Scanner;

public class Sample03 {
	public static void main(String[] args) {
		//1. Yêu cầu người dùng nhập vào 1 giá trị nào?
		System.out.println("Mời nhập vào số Kilogram?");
		Scanner sc = new Scanner(System.in);
		
		//2. Nhận giá trị rồi chuyển đổi giá trị đó --> Pound?
		double dKilogram = sc.nextDouble();
		
		//3. Hiển thị giá trị ra ngoài màn hình?
		//Comment: Ctrl + shift + /
		//UnComment: Ctrl + Shift + \
		//double dPound = 2.2 * dKilogram;
		//System.out.println(String.format("Số Pound = %s", dPound));
		System.out.println(String.format("Số Pound = %s", 
								(2.2 * dKilogram)));
	}
}
