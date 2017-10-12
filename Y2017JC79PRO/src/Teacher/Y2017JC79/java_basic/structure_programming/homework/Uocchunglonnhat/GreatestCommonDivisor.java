package Teacher.Y2017JC79.java_basic.structure_programming.homework.Uocchunglonnhat;

import java.util.Scanner;

/* 
 * Desc: Tìm ước chung lớn nhất của 2 số nguyên
 * Author: Bùi Hữu Đông
 * Date: 09/Oct/2017
 * Company: IMIC edu.
 */
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nguyên thứ 1:");
		int x = sc.nextInt();

		System.out.println("Nhập số nguyên thứ 2:");
		int y = sc.nextInt();
		sc.close();
		System.out.println("Ước chung lớn nhất của " + x + " và " + +y + " là: " + gcd(x, y));
	}

	public static int gcd(int a, int b) {
		int gcd = 1; // Khởi gán gcd
		if (a == 0) {
			gcd = b;
		} else {
			gcd = a;
		}

		for (int k = 2; k <= a && k <= b; k++) {
			if ((a % k == 0) && (b % k == 0)) {
				gcd = k;
			}
		}
		return gcd;
	}

}
