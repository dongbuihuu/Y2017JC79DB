package first_programming_truongnm.java_practices;

import java.util.Scanner;

public class Check_Positive_Or_Negative_Numbers {

	public static void main(String[] args) {
		Positive_or_Negaive();
	}

	public static void Positive_or_Negaive() {
		int x;

		Scanner sc = new Scanner(System.in);
		System.out.print("Kindly input x number: x = ");
		x = sc.nextInt();
		sc.close();

		if (x > 0)
			System.out.println("x = " + x + " is positive number");
		else if (x == 0)
			System.out.println("x = " + x + " is neither positive nor negative number");
		else
			System.out.println("x = " + x + " is negative number");
	}
}
