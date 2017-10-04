package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.VARIABLES;

import java.util.Scanner;

public class SAMPLE07 {
	public static void main(String[] args) {
		//1. Khai báo biến
		int CuocTaxi = 35000;
		
		//2. Yêu cầu người dùng nhập vào số km đã đi
		System.out.println("- Mời nhập vào số Km đã đi của bạn?");
		
		//3. Khai báo và khởi tạo ra 1 đối tượng của Scanner
		Scanner  dt = new Scanner(System.in);
		
		//4. Lấy giá trị người dùng nhập vào
		int KM = dt.nextInt();
		System.out.println("- Số tiền phải trả: "+ (KM * CuocTaxi));
		
		ChiTietNghiepVu();		
	}
	
	 static void ChiTietNghiepVu(){
		System.out.println("Xử lý chi tiết :D");
		System.out.println("Xử lý chi tiết :D");
		System.out.println("Xử lý chi tiết :D");
		System.out.println("Xử lý chi tiết :D");
		int c = 10/0;
		System.out.println("- KQ: "+ c);
		System.out.println("Xử lý chi tiết :D");
		
	}
}
