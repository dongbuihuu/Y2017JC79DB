package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.EXCERCISES;

import java.util.Scanner;

public class EXCERCISE02 {

	public static void main(String[] args) {
		String sExit = "";
		Scanner dt = new Scanner(System.in);
		do{
			// 1. Mời nhập vào số a
			// a. Nhập dữ liệu vào Temp
			String sTemp = "";
			dt = new Scanner(System.in);
			do {
				System.out.println("Mời nhập vào số a? ");
				sTemp = dt.nextLine();
			} while (sTemp.isEmpty());	
			
			// b. Chuyển đổi giá trị từ chuỗi --> số
			double dNumA = Double.parseDouble(sTemp);

			// 3. Mời nhập vào số b
			// a. Nhập dữ liệu vào Temp
			do {
				System.out.println("Mời nhập vào số b? ");
				sTemp = dt.nextLine();
			} while (sTemp.isEmpty());

			// b. Chuyển đổi giá trị từ chuỗi --> số
			double dNumB = Double.parseDouble(sTemp);

			// 4. Mời chọn phép tính toán: 0 - Cộng; 1 - Trừ; 2 - Nhân; 3 - Chia?
			do {
				System.out.println("Mời chọn: 0 - Cộng; 1 - Trừ; 2 - Nhân; 3 - Chia?");
				sTemp = dt.nextLine();
			} while (sTemp.isEmpty() 
							|| Integer.parseInt(sTemp) < 0 
							|| Integer.parseInt(sTemp) > 3);
			
			byte bOpt =Byte.parseByte(sTemp);

			// 5. Kiểm tra & tính toán theo sự lựa chọn của người dùng
			switch (bOpt) {
					case 0: System.out.println("a + b = " + (dNumA + dNumB)); break;
					case 1: System.out.println("a - b = " + (dNumA - dNumB)); break;
					case 2: System.out.println("a * b = " + (dNumA * dNumB)); break;
					case 3: {
						if (dNumB == 0)
							   System.out.println("Phép tính ko thực hiện được");
					    else
						       System.out.println("a / b = " + (dNumA / dNumB));						
					}break;					
			}		
			
			System.out.println("Bạn đã tính toán chán chưa? Y/N");
			sExit = dt.nextLine();						
		}while(!sExit.toUpperCase().equals("Y"));
		System.out.println("Cảm ơn bạn đã sử dụng phần mềm của chúng tôi :D");
	}
}
