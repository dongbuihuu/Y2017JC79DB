package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.EXCERCISES;

import java.util.Scanner;

public class EXCERCISE04 {

	public static void main(String[] args) {
		String sExit = "";
		Scanner objSc = new Scanner(System.in);
		do {
			// 1. Mời nhập vào tháng		
			String sTemp = "";
			// a. Tháng?
			do {
				System.out.println("Mời nhập vào Tháng? ");
				sTemp = objSc.nextLine();
			} while (sTemp.isEmpty() 
									|| Integer.parseInt(sTemp) < 1 
									|| Integer.parseInt(sTemp) > 12);
			byte bMonth = Byte.parseByte(sTemp);

			// b. Năm?
			do {
				System.out.println("Mời nhập vào Năm? ");
				sTemp = objSc.nextLine();
			} while (sTemp.isEmpty());
			int iYear = Integer.parseInt(sTemp);

			// 2. Xử lý số liệu và đưa ra kết quả số Ngày?
			switch (bMonth) {
				case 4: 
				case 6:
				case 9:
				case 11: System.out.println("Có 30 ngày"); break;
				case 2: {
					if (iYear % 400 == 0 || (iYear % 4 == 0 && iYear % 100 != 0))
						System.out.println("Có 29 ngày");
					else
						System.out.println("Có 28 ngày");
				} break;
				default: System.out.println("Có 31 ngày"); break;
			}
			System.out.println("Bạn muốn thoát chứ? Y/N");
			sExit = objSc.nextLine();
			
		} while (!sExit.toUpperCase().equals("Y"));
		System.out.println("Cảm ơn bạn đã sử dụng phần mềm của chúng tôi :D");
	}
}
