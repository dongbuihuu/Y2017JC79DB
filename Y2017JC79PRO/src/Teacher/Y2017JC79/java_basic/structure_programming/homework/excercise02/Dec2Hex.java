package Teacher.Y2017JC79.java_basic.structure_programming.homework.excercise02;
/*
 * Desc: Convert from Dec to hexa
 * Hệ Hex dùng 16 digit from 0..9 và A...F
 * 
 */

import java.util.Scanner;

public class Dec2Hex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số hệ 10 cần chuyển: ");

		int decimal = sc.nextInt();

		String hex = "";

		while (decimal != 0) {
			int hexValue = decimal % 16;
			char hexDigit = (hexValue >= 0 && hexValue <= 9) ? (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');
			hex = hexDigit + hex;
			decimal /= 16;
		}

		System.out.println("Hexadecimal is: " + hex);

	}
}
