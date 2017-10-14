package Teacher.Y2017JC79.arrays.static_array.baitapvenha.baitap09;

import java.util.Scanner;

public class Excercise09 {

	public static void main(String[] args) {
		// 1. Khai báo 1 mảng 2 chiều dimensional
		int[][] arrEmp = new int[2][4];
		String sExit = "";
		Scanner sc = new Scanner(System.in);
		// 2. Input
		do {
			for (int row = 0; row < arrEmp.length; row++)
				for (int col = 0; col < arrEmp[row].length - 1; col++) {

					System.out.printf("arrEmp[%s][%s]= \n", row, col);
					arrEmp[row][col] = sc.nextInt();

				}
			// 3. Tinh tong
			int iSum;
			for (int row = 0; row < arrEmp.length; row++) {
				iSum = 0;
				for (int col = 0; col < arrEmp[row].length - 1; col++) {
					iSum += arrEmp[row][col];
				}
				arrEmp[row][arrEmp[row].length - 1] = iSum;
			}
			// 4 Hien thi
			prinInforArray(arrEmp);

			sc.nextLine();
			System.out.println("Are you continue [Y/N]?");
			sExit = sc.nextLine();

		} while (sExit.toUpperCase().equals("Y"));

	}

	// Ham in thong tin
	public static void prinInforArray(int[][] pArray) {
		for (int i = 0; i < pArray.length; i++) {
			for (int j = 0; j < pArray[i].length; j++) {
				System.out.print(String.format("%4d", pArray[i][j]));
			}
			System.out.println();
		}
	}

}
