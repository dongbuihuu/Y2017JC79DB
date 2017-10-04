package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.BAITOANBOXUNG.BAITOANSO11;

import java.util.Scanner;

public class MainApps {
	public static void main(String[] args) {
		//1. Khai báo biến và nhận giá trị
		double dCanh01;
		double dCanh02;
		double dCanh03;
		
		System.out.println("- Mời nhập cạnh 01?");
		Scanner dt = new Scanner(System.in);
		dCanh01 = dt.nextDouble();
		
		System.out.println("- Mời nhập cạnh 02?");		
		dCanh02 = dt.nextDouble();
		
		System.out.println("- Mời nhập cạnh 03?");		
		dCanh03 = dt.nextDouble();
		
		//2. Kiểm tra có phải tam giác
		if((dCanh01 + dCanh02) > dCanh03 &&
				  (dCanh02 + dCanh03) > dCanh01 &&
				         (dCanh03 + dCanh01) > dCanh02)
			System.out.println("- Đây là các cạnh của Tam giác :D");
		else
			System.out.println("- Đây ko phải là Tam giác :<");			
	}
}
