package JAVACORE_TRAINING.BASIC_JAVA.MY_FIRST_JAVA_PROGRAM;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		//1. Khai báo và khởi tạo Scanner?
		Scanner sc = new Scanner(System.in);
		
		//2. Đưa ra yêu cầu người dùng cần cung cấp các thông tin?
		System.out.println("- Mời nhập RollNo?");
		int iRollNo = sc.nextInt();		
		
		System.out.println("- Mời nhập FullName?");
		sc = new Scanner(System.in);
		String sFullName = sc.nextLine();
		
		System.out.println("- Mời nhập Mark?");
		double dMark = sc.nextDouble();		
				
		//3. Hiển thị toàn bộ thông tin ra ngoài màn hình?
		System.out.println("+ iRollNo: "+ iRollNo);
		System.out.println("+ sFullName: "+ sFullName);
		System.out.println("+ dMark: "+ dMark);		
	}
}
