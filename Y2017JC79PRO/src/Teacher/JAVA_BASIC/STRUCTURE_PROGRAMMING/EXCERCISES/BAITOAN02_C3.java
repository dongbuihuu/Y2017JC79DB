package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.EXCERCISES;

import java.util.Scanner;

public class BAITOAN02_C3 {
	public static void main(String[] args) {
		String sTemp = "";
		Scanner sc = null;
		do{
			//1. Bắt buộc phải nhập vào số a?
			String sA, sB = "";
			sc = new Scanner(System.in);
			do{
				System.out.println("- Mời nhập vào giá trị số a?");
				sA = sc.nextLine();			
			}while(sA.isEmpty());
			
			//2. Bắt buộc phải nhập vào số b?			
			do{
				System.out.println("- Mời nhập vào giá trị số b?");
				sB = sc.nextLine();			
			}while(sB.isEmpty());
		
			//3. Bắt buộc phải chon phép tính toán?		
			sc = new Scanner(System.in);
			String sOpt = "";
			do{
				System.out.println("- Mời chọn phép tính toán: +,-,*,/");
				sOpt = sc.nextLine();			
			}while(sOpt.isEmpty());
			
			//4. Thực thi tính toán
			double dA = Double.parseDouble(sA);
			double dB = Double.parseDouble(sB);
			switch (sOpt) {
				case "+": System.out.println("a + b = " + (dA + dB)); break;
				case "-": System.out.println("a - b = " + (dA - dB)); break;
				case "*": System.out.println("a * b = " + (dA * dB)); break;
				case "/": System.out.println("a / b = " + (dA / dB)); break;
			}
			System.out.println("- Bạn đã chán chưa? Y/N?");
			sTemp = sc.nextLine();
			if(sTemp.isEmpty())
				sTemp = "n";
		}while(sTemp.toUpperCase().equals("N"));		
		System.out.println("Cảm ơn bạn đã sử dụng phần mềm của chúng tôi!!!");
	}
}
