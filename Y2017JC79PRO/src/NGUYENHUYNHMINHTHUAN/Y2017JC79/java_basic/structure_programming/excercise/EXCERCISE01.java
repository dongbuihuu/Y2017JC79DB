package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.EXCERCISES;

import java.util.List;
import java.util.Scanner;

public class EXCERCISE01 {

	public static void main(String[] args) {	
		//1. Yêu cầu người dùng nhập vào 02 thông tin là UserName & PassWord?
		System.out.println("Mời nhập vào UserName?");
		Scanner objScanner = new Scanner(System.in);
		String sUserName = objScanner.nextLine();
		
		//2. Kiểm tra lại xem để chắc chắn người dùng đã nhập vào cho chúng ta?
		if(sUserName.isEmpty()){
			System.out.println("Yêu cầu bạn phải nhập vào tên truy cập!");
		}
		else{
			System.out.println("Mời nhập vào PassWord?");			
			String sPassWord = objScanner.nextLine();
			
			if(sPassWord.isEmpty()){
				System.out.println("Yêu cầu bạn phải nhập vào mật khẩu!");
			}
			else{
				//3. Kiểm tra xác thực tài khoản --> có tồn tại --> Chúc mừng?
				if(sUserName.equals("abc") && sPassWord.equals("nothing")){
					System.out.println(":D");
				}
				else{
					System.out.println(":(");
				}
			}
		}
		
	}
}
