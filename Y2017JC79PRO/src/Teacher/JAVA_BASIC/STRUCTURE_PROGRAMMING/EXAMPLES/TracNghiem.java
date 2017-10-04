package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.EXAMPLES;

import java.util.Scanner;

public class TracNghiem {
	public static void main(String[] args) {
		//1. Định nghĩa câu hỏi?
		System.out.println("Hãy cho biết kết quả của phép tính sau: 1 + 1 = ?");
		
		//2. Mời nhập kết quả
		Scanner sc = new Scanner(System.in);
		
		//3. Khai báo biến nhận kq
		int kQ = sc.nextInt();
		
		//4. Kiểm tra & đưa ra kq
		if(kQ == 2)
			System.out.println("Chúc mừng... :D");					
		
		else
			System.out.println("sai rồi :((");
	}
}
