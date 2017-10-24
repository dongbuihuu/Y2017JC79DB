package Teacher.Y2017JC79.java_basic.structure_programming.sample;

import java.util.Scanner;

public class while_demo_2 {

	/*
	 * Desc: tính tổng từ 1 cho đến n. input: n - interger input from your keyboard.
	 * ouput: total from 1 to n
	 */

	public static void main(String[] args) {

		// 1. Nhập từ bàn phím giá trị n
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n:");
		int n = sc.nextInt();
		// 2. tính tổng từ 1 cho đến n
		int sum = 0, i = 1;
		while (i <= n) {
			sum = sum + i;
			i++;
		}
		// 3. return sum
		System.out.println("Tổng từ 1 tới " + n + " là: " + sum);
		// System.out.println(String.format("Tổng từ 1 đến %d là %d", n, sum));
	}

}
