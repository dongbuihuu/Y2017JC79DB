package HomeWork.InTamGiacHinhSao;

import java.util.Scanner;

/*
 * Desc: In tam giác nhìn sao như dưới 
 *       *
        * *
       * * *
      * * * *
     * * * * *
    * * * * * *
   * * * * * * *
  * * * * * * * *
 * * * * * * * * *
 * Author: Bùi Hữu Đông
 * Company: CBBank
 * Date: 10/Oct/2017 
 */

public class PrintStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chiều cao của tam giác hình sao cần in:");
		int height = sc.nextInt();

		printStar(height);
		sc.close();
	}

	public static void printStar(int numOfRow) {
		int countPrint = 1; // Giả sử in được 1 dòng
		// Check
		if (numOfRow < 0)
			return;
		for (int i = numOfRow; i > 0; i--) {
			// 1. In ra i khoảng trắng
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			// 2. In ra countPrint
			for (int k = 1; k <= countPrint; k++) {
				System.out.print("* ");
			}
			System.out.println(); // xuống dòng
			++countPrint;
		}
	}

}
