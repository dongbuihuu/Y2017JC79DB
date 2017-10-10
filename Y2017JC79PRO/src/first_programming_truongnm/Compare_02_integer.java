package first_programming_truongnm;

import java.util.Scanner;

public class Compare_02_integer {

	public static void main(String[] args) {
		compare();

	}
	
	public static void compare () {
		int a, b;
		Scanner sc = new Scanner (System.in);
		System.out.print("Kindly input a value from your keyboard: a = ");
		a = sc.nextInt();
		System.out.print("Kindly input b value from your keyboard: b = ");
		b = sc.nextInt();
		sc.close();
		if (a > b) {
			System.out.println("Number a = " + a +" greater than b = " + b);
		}
		else {
			System.out.println("Number b = " + b +" greater than a = " + a);
		}
		
	}

}
