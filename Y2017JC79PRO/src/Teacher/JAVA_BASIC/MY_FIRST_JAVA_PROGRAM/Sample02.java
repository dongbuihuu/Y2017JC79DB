package JAVACORE_TRAINING.BASIC_JAVA.MY_FIRST_JAVA_PROGRAM;
import java.util.Scanner;

public class Sample02 {

	public static void main(String[] args) {
		//1. Khai báo các biến và khởi tạo giá trị cố định
		double dA = 0;
		double dB = 0;
		
		//2. Sử dụng Scanner để yêu cầu người dùng nhập vào giá trị?
		Scanner sc = new Scanner(System.in);
		
		//3. Lấy ra giá trị người dùng nhập vào  --> gán cho biến c
		System.out.println("Mời nhập giá trị số a?");
		dA = sc.nextDouble();
		
		System.out.println("Mời nhập giá trị số b?");
		dB = sc.nextDouble();
		//1 Kilogram = 2.2 pound;
		//4. Tính toán Cộng 02 số --> Hiển thị kết quả
		double dC = dA + dB;
		System.out.println("Kết quả = "+ dC);
		System.out.println(String.format("Kết quả = %s", dC));
	}
}
