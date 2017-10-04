package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.STRUCTURE_PROGRAMMING.BAITOANBOXUNG.BAITOANSO12;

import java.util.Scanner;

public class MainApps02 {
	public static void main(String[] args) {
		//1. Khai báo biến và nhận giá trị		
		System.out.println("- Mời nhập số a?");
		Scanner dt = new Scanner(System.in);
		int iNumA = dt.nextInt();
		
		System.out.println("- Mời nhập số b?");
		int iNumB = dt.nextInt();
		
		//2. Thực thi xử lý
		float fResult = GiaiPTBacNhat(iNumA, iNumB);
		 if(fResult == -1)
			 System.out.println("- Phương trình bậc nhất vô nghiệm!");          
         else
        	 System.out.println(String.format
        			 				("- Nghiệm của PT Bậc Nhất là: x = %s", fResult)); 
	}
	
	private static float GiaiPTBacNhat(int iNumA, int iNumB){
		if(iNumA == 0)
			 return -1;             
        return Float.parseFloat((""+ ((-iNumB)/iNumA))); 
	}
}
