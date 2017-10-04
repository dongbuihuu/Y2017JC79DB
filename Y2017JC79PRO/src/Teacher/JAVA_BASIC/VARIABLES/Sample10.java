package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.VARIABLES;

import java.util.Scanner;

public class Sample10 {
	public static void main(String[] args) {
		// 1. Khai báo biến
		double DTB;

		// 2. Mời nhập đtb của bạn
		System.out.println("- Mời nhập giá trị ĐTB của bạn?");
		Scanner dt = new Scanner(System.in);
		DTB = dt.nextDouble();

		// 3. Xét các điều kiện để biết được học lực là ntn
		if (DTB < 0 || DTB > 10.0) {
			System.out.println("Nhập sai rồi e ơi :D");
		} else {
			if (DTB < 5.0)
				System.out.println("- Yếu rồi em ơi :D");					
			else if (DTB >= 5.0 && DTB < 6.5)
				System.out.println("- TB rồi em ơi :D");
			else if (DTB >= 6.5 && DTB < 7.5)
				System.out.println("- TB Khá rồi e ơi");
			else if (DTB >= 7.5 && DTB < 8.5)
				System.out.println("- Khá rồi e ơi");
			else if (DTB >= 8.5 && DTB < 9.5)
				System.out.println("- Giỏi rồi e ơi");
			else if (DTB >= 9.5)
				System.out.println("- Chuyên gia hàng đầu Châu Á rồi e ơi");
		}
	}
}
