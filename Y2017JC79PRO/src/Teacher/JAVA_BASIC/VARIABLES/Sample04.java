package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.VARIABLES;

import java.util.Scanner;

public class Sample04 {
	public static void main(String[] args) {
		//1. Khai báo biến
		int iRollNo;
		//double dMark;
		
		//2. Yêu cầu người dùng nhập vào cho chúng ta mã Sinh Viên
		System.out.println("- Mời Anh/Chị nhập vào Mã Sinh Viên?");
		
		//3. Sử dụng biến để nhận giá trị
		//+ System.in: Lắng nghe & nhận các giá trị nhập vào từ bàn phím
		//+ nextInt: Có nghĩa là nhận giá trị và chuyển đổi nó sang kiểu Int
		Scanner sc = new Scanner(System.in);
		iRollNo = sc.nextInt();  
		 //--> Comment: ctrl + shift + / 
		//--> UnComment: ctrl + shift + \
		//Muốn xóa ngay 1 dòng lệnh nào đó : ctrl + d
		
		//dMark = new Scanner(System.in).nextDouble();
		
		//4. Hiển thị thông tin
		System.out.println("- Mã Sinh Viên là: "+ iRollNo);
	}
}
