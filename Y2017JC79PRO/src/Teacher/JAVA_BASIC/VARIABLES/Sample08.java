package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.VARIABLES;

import java.util.Scanner;

public class Sample08 {
	public static void main(String[] args) {
		//1. Mời nhập các thông tin
		System.out.println("- Mời nhập Mã SV?");
		Scanner dt = new Scanner(System.in);
		int MaSv = dt.nextInt();
		
		System.out.println("- Mời nhập Họ và Tên?");
		String HovaTen  = dt.nextLine();
		
		System.out.println("- Mời nhập Tuổi?");
		int Tuoi = dt.nextInt();
		
		System.out.println("- Mời nhập điểm?");
		double DiemSo = dt.nextDouble();
		
		//2. Hiển thị các thông tin ra ngoài màn hình
		System.out.println("- Mã Sinh Viên: "+ MaSv);
		System.out.println("- Họ và Tên: "+ HovaTen);
		System.out.println("- Tuổi: "+ Tuoi);
		System.out.println("- Điểm số: "+ DiemSo);		
	}
}
