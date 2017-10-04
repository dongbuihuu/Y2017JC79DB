package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.EXCERCISES;

import java.util.Scanner;

public class EXCERCISE05 {

	public static void main(String[] args) {
		String sExit = "";
		Scanner objSc = new Scanner(System.in);
		do {
			// 1. Mời nhập vào Họ và Tên?		
			String sTemp = "";
			do {
				System.out.println("Mời nhập vào Họ và Tên? ");
				sTemp = objSc.nextLine();
			} while (sTemp.isEmpty());
			//Nhận thông tin Họ và Tên.
			String sFullName = sTemp;
			
			// 2. Mời nhập vào Tuổi?	
			do {
				System.out.println("Mời nhập vào Tuổi? ");
				sTemp = objSc.nextLine();
			} while (sTemp.isEmpty()
								|| Integer.parseInt(sTemp) <= 0 
								|| Integer.parseInt(sTemp) > 50);			
			//Nhận thông tin Tuổi
			byte bAge = Byte.parseByte(sTemp);
			
			// 3. Mời chọn tình trạng ?	
			do {
				System.out.println("Mời chọn tính trạng Hôn Nhân: "
							+ "(0)-Ly hôn;(1) - Chưa kết hôn; (2) - Đã kết hôn; ?");
				sTemp = objSc.nextLine();
			} while (sTemp.isEmpty()
								|| Integer.parseInt(sTemp) < 0 
								|| Integer.parseInt(sTemp) > 2);
			//Nhận vào tình trạng hôn nhân
			byte bMarriage = Byte.parseByte(sTemp);
			
			// 4. Mời chọn Giới tính?	
			do {
				System.out.println("Chọn giới tính: (0) - Nữ; (1) - Nam;?");							
				sTemp = objSc.nextLine();
			} while (sTemp.isEmpty()
								|| Integer.parseInt(sTemp) < 0 
								|| Integer.parseInt(sTemp) > 1);
			//Nhận vào giới tính
			byte bSex = Byte.parseByte(sTemp);
			
			//5. Xử lý nghiệp vụ đăng ký tham gia kết bạn
			if (bAge < 19 || bMarriage == 2 || 
										(bAge < 22 && bSex == 1)) {
				System.out.println("Bạn KHÔNG ĐƯỢC PHÉP tham gia kết bạn!");
			} else {
				System.out.println("Bạn ĐƯỢC PHÉP tham gia kết bạn!");
			}			
			System.out.println("Bạn đã chán chưa? Y/N");
			sExit = objSc.nextLine();
			
		} while (!sExit.toUpperCase().equals("Y"));
		System.out.println("Cảm ơn bạn đã sử dụng phần mềm của chúng tôi :D");		
	}
}
