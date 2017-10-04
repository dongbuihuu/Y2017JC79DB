package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.CHUABAITAPVN.BAITAPSO07;

import java.util.Scanner;

public class DEMO {
	public static void main(String[] args) {
		int iValue = 0;
		String sExit = "";
		int[][] myArr = new int[2][2];		
		System.out.println("Chương trình làm việc với Mảng!");
		Scanner sc = new Scanner(System.in);
		
		do{			
			//Input
			for(int i = 0;i<myArr.length;i++)
				for(int j = 0;j<myArr[i].length;j++){
					System.out.println(String.format("myArr[%s][%s] = ", i, j));
					myArr[i][j] = sc.nextInt();
				}
			//Output
			for(int i = 0;i<myArr.length;i++)
				for(int j = 0;j<myArr[i].length;j++){
					System.out.println(String.format
							("myArr[%s][%s] = %s", i, j, myArr[i][j]));					
				}			
			System.out.println("- Anh có muốn tiếp tục nữa ko? [Y/N]");
			//sc = new Scanner(System.in);
			sc.nextLine();
			sExit = sc.nextLine();			
		}while(sExit.toUpperCase().equals("Y"));
		System.out.println("Cảm ơn bạn!!!");
	}
}
