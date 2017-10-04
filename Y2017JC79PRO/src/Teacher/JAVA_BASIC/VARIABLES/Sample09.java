package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.VARIABLES;

import java.util.Scanner;

public class Sample09 {
	public static void main(String[] args) {
		System.out.println("- Nhập Tên?");
		Scanner dt  =new Scanner(System.in);
		String sTen = dt.nextLine();
		
		System.out.println("- Nhập Tuoi");
		int Tuoi = dt.nextInt();
		dt.nextLine();
		
		System.out.println("- Nhập và Email: ");
		String sEmail = dt.nextLine();
		
		System.out.println("- Nhập vào Mobile?");
		String sMobile = dt.nextLine();
		
		System.out.println("- Tên: "+ sTen);
		System.out.println("- Tuoi: "+ Tuoi);
		System.out.println("- Email: "+ sEmail);
		System.out.println("- Mobile: "+ sMobile);
	}
}
