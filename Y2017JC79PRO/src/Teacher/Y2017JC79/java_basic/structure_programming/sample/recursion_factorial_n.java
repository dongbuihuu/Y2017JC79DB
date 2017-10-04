package Teacher.Y2017JC79.java_basic.structure_programming.sample;

import java.util.Scanner;

//Không code ở đây
public class recursion_factorial_n {

	public static void main(String[] args) {

		System.out.println("Nhap gia tri n:");
		int n = new Scanner(System.in).nextInt();
		System.err.println(n + "giai thua la: " + f(n));
	}

	public static long f(int n) {
		if (n == 0) // Dieu kien dung (base case)
			return 1;
		else
			return n * f(n - 1); // Lap - recursitive
	}

}

// Không code ở đây
