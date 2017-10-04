package JAVACORE_TRAINING.BASIC_JAVA.MY_FIRST_JAVA_PROGRAM;

import java.util.Scanner;

public class Example06 {
	public static void main(String[] args) {
		//1. Khai báo và khởi tạo Scanner
		Scanner doituong = new Scanner(System.in);
		
		//2. Yêu cầu người dùng nhập và Họ và Tên?
		System.out.println("Mời nhập vào Họ và Tên của bạn?");
		
		//3. Khai báo biến nhận giá trị khi người dùng nhập vào từ bp
		String HovaTen = doituong.nextLine();
		
		//4. Hiển thị thông tin ra ngoài màn hình
		System.out.println("- Họ và tên: "+ HovaTen);
		System.out.println(String.format("- Họ và tên: %s", HovaTen));		
	}
}
