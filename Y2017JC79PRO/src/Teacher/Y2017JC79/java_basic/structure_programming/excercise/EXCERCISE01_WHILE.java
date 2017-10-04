package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.EXCERCISES;

import java.util.Scanner;

public class EXCERCISE01_WHILE {

	public static void main(String[] args) {
		String sExit;
		Scanner objSc = new Scanner(System.in);
		do {
			// 1. Kiểm tra trạng thái các điều khiển trên giao diện.
			// a. Mời nhập UserName?
			String sUserName = "";
			String sPassWord = "";
			Scanner sc = new Scanner(System.in);
			while (sUserName.isEmpty()) {
				System.out.println("Mời nhập UserName?");
				// b. Khai báo biến nhận giá trị nhập vào
				sUserName = sc.nextLine();
			}

			while (sPassWord.isEmpty()) {
				System.out.println("Mời nhập PassWord?");
				// c. Khai báo biến nhận giá trị nhập vào
				sPassWord = sc.nextLine();
			}

			// 2. Kiểm tra xác thực thông tin và đưa ra điều hướng tương ứng.
			if (sUserName.equals("doannv") && sPassWord.equals("nothing"))
				System.out.println("Chúc mừng bạn đã đăng nhập thành công!!!");
			else
				System.out.println("Rất tiếc, tài khoản của bạn ko tồn tại :<");
			
			System.out.println("Bạn đã nhập chán chưa? Y/N");
			sExit = objSc.nextLine();// ghi 
			
		} while (sExit.toUpperCase().equals("N"));
		System.out.println("Cảm ơn bạn đã sử dụng phần mềm của chúng tôi :D");
	}
}