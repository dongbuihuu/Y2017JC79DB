package JAVACORE_TRAINING.BASIC_JAVA.MY_FIRST_JAVA_PROGRAM;

import java.util.Scanner;

public class Example05 {

	/**
	 * Student: ------------- 1> Inputs: + iRollNo:int + sFullName:String +
	 * iAge:int + sEmail:String + fMark:float
	 * 
	 * 2> Output: --> RollNo: ... --> FullName: ... --> Age: ... --> Email: ...
	 * --> Mark: ...
	 */
	public static void main(String[] args) {
		// 1. Khai báo các biến cần cho xử lý
		int iRollNo;
		String sFullName;
		int iAge;
		String sEmail;
		float fMark;

		// 2. Khai báo và khởi tạo đối tượng Scanner
		// ctrl + shift + f: Căn chỉnh lại mã lệnh
		Scanner objScanner = new Scanner(System.in);

		// 3. Nhận các giá trị người dùng nhập vào từ bàn phím
		System.out.println("- Mời nhập RollNo?");
		iRollNo = objScanner.nextInt();
		// objScanner.nextLine();

		objScanner = new Scanner(System.in);
		System.out.println("- Mời nhập FullName?");
		sFullName = objScanner.nextLine();

		System.out.println("- Mời nhập Age?");
		iAge = objScanner.nextInt();

		objScanner = new Scanner(System.in);
		System.out.println("- Mời nhập Email?");
		sEmail = objScanner.nextLine();

		System.out.println("- Mời nhập Mark?");
		fMark = objScanner.nextFloat();

		// 4. Hiển thị các thông tin
		System.out.println("- RollNo: " + iRollNo);
		System.out.println("- FullName: " + sFullName);
		System.out.println("- Age: " + iAge);
		System.out.println("- Email: " + sEmail);
		System.out.println("- Mark: " + fMark);
		objScanner.close();
	}
}
