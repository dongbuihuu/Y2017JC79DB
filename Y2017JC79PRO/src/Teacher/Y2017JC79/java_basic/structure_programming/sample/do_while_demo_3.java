package Teacher.Y2017JC79.java_basic.structure_programming.sample;

import java.util.Scanner;

public class do_while_demo_3 {
	public static void main(String[] args) {
		int data;
		int sum = 0;
		// Create new scanner
		Scanner sc = new Scanner(System.in);
		// reading data until the input is 0
		do {
			System.out.print("Nhập số nguyên. Kết thúc khi nhập 0:");
			data = sc.nextInt();
			sum += data;
		} while (data != 0);

		System.out.println("Tổng là: " + sum);

	}

}
