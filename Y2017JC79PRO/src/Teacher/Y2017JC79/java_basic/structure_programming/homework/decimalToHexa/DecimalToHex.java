package Teacher.Y2017JC79.java_basic.structure_programming.homework.decimalToHexa;

import java.util.Scanner;

/* 
 * Desc: Chuyển đổi từ hệ 10 (Thập phân) sang hệ 16 (Thập lục phân)
 * Algorithm: Known
 * Author: Bùi Hữu Đông
 * Date: 09/Oct/2017
 * Company: IMIC edu.
 */
public class DecimalToHex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nguyên hệ 10: ");

		int decimalNumber = sc.nextInt();
		sc.close();
		System.out.println("Số hexadecimal tương ứng là: " + decToHex(decimalNumber));
	}

	public static String decToHex(int decimal) {
		String hexReturn = "";
		while (decimal != 0) {
			int hexValue = decimal % 16; // get remainder;
			char digitChar = (hexValue >= 0 && hexValue <= 9) ? (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');
			hexReturn = digitChar + hexReturn; // very Importance

			decimal /= 16; // phan thuong: decimal = decimal /16;
		}
		return hexReturn;
	}
}
