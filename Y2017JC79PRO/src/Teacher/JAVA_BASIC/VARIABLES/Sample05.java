package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.VARIABLES;

import java.util.Scanner;

public class Sample05 {
	public static void main(String[] args) {
		//1. Khai báo biến
		int a, b;
		String sKQ;
		Scanner dt = new Scanner(System.in);
		
		//2. Yêu cầu người dùng nhập vào 02 số a và b
		System.out.println("- Mời nhập số a?");		
		a = dt.nextInt();
		
		System.out.println("- Mời nhập số b?");
		b = dt.nextInt();
		
		//3. Tính toán và hiển kết quả'
		System.out.println("- Tổng giá trị 02 số là: "+ (a + b));
		//sKQ = ""+(a+b);		
	}
}
