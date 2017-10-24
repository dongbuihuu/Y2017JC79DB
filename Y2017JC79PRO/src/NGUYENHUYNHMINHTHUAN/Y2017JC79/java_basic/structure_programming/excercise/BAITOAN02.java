package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.EXCERCISES;

import java.util.Scanner;

public class BAITOAN02 {
	public static void main(String[] args) {
		// 1. Yêu cầu người dùng cung cấp đầy đủ thông tin?
		System.out.println("- Mời nhập vào số a?");
		Scanner objSc = new Scanner(System.in);		
		String sTemp = objSc.nextLine();
		
		// 2. Kiểm tra để chắc chắn người dùng đã nhập vào giá trị?
		if(sTemp.isEmpty()){
			System.out.println("Yêu cầu bạn phải nhập vào số a!");
			return;
		}else{
			double dA = Double.parseDouble(sTemp);			
			System.out.println("- Mời nhập vào số b?");			
			sTemp = objSc.nextLine();
			
			if(sTemp.isEmpty()){
				System.out.println("Yêu cầu bạn phải nhập vào số b!");
				return;
			}else{
				double dB = Double.parseDouble(sTemp);
				System.out.println("- Mời chọn: +, -, *, /?");
				objSc = new Scanner(System.in);		
				sTemp = objSc.nextLine();
				
				// 3. Thực thi tính toán với phép toán người dùng lựa chọn?
				switch (sTemp) {
					case "+": System.out.println("a + b = "+ (dA + dB)); break;
					case "-": System.out.println("a - b = "+ (dA - dB)); break;
					case "*": System.out.println("a * b = "+ (dA * dB)); break;
					case "/": System.out.println("a / b = "+ (dA / dB)); break;
				}
			}
		}		
	}
}
