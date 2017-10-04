package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.BAITOANBOXUNG.BAITOANSO08;

import java.util.Scanner;

public class MainApps02 {
	public static void main(String[] args) {
		//1. Khai báo biến và nhận giá trị người dùng gõ vào từ bp
		int iNumA, iNumB;
		long lTotal;
		System.out.println("- Mời nhập số thứ nhất?");
		Scanner dt = new Scanner(System.in);
		iNumA = dt.nextInt();
		
		System.out.println("- Mời nhập số thứ hai?");
		iNumB = dt.nextInt();
		
		//2. Tính toán
		lTotal = TongBinhPhuong(iNumA, iNumB);
		System.out.println("- Tổng bình phương: "+ lTotal);
	}
	
	private static long TongBinhPhuong(int iNumA, int iNumB){
		return (iNumA * iNumA + iNumB * iNumB);
	}
}
