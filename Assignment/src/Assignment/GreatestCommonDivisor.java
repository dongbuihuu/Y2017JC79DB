package Assignment;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		
		System.out.println("Your Greatest Common Divisor is " + GCD());

	}
	public static int GCD() {
		int a, b;
		System.out.println("Kindly input two integer numbers: ");
		Scanner sc = new Scanner (System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		sc.close();
	
		if (a ==0 && b !=0) {
			return b;
		}
		if (a!=0 && b ==0) {
			return a;
		}
		while (a != b) {
			if (a > b) {
				a = a - b;
			}
			else {
				b = b - a;
			}
		}
		return a;
		
	}
	
}
