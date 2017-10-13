package Teacher.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.CHUABAITAPVN;

import java.util.Scanner;

public class BAITAPSO09 {
	public static void main(String[] args) {
		int iValue = 0;
		String sExit = "";
		int[][] myArr = new int[8][7];
		System.out.println("Chương trình làm việc với Mảng!");
		Scanner sc = new Scanner(System.in);

		do {
			// Input
			for (int i = 0; i < myArr.length; i++)
				for (int j = 0; j < myArr[i].length; j++) {
					System.out.print(String.format("myArr[%s][%s] = ", i, j));
					myArr[i][j] = sc.nextInt();
				}
			// Output
			int iTotal;
			for (int i = 0; i < myArr.length; i++) {
				iTotal = 0;
				for (int j = 0; j < myArr[i].length; j++) {
					iTotal += myArr[i][j];
				}
				System.out.println(String.format("- Tổng số[%s] = %s", (i + 1), iTotal));
			}
			System.out.println("- Anh có muốn tiếp tục nữa ko? [Y/N]");
			// sc = new Scanner(System.in);
			sc.nextLine();
			sExit = sc.nextLine();
		} while (sExit.toUpperCase().equals("Y"));
		System.out.println("Cảm ơn bạn!!!");
	}
}
