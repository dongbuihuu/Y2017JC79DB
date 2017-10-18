package first_programming_truongnm;

import java.util.Scanner;

public class Swap_two_integers_without_third_variable {

	public static void main(String[] args) {
	Swap();

	}
	
	public static void Swap() {
		int a, b, sum;
		Scanner sc = new Scanner (System.in);
		System.out.print("Kindly input a value: a = ");
		a = sc.nextInt();
		System.out.print("Kindly input b value: b = ");
		b = sc.nextInt();
		sc.close();
		
		sum = a + b;
		
		System.out.println("Bum!!! a and b values is exchanged");
		
		a = sum - a;
		System.out.println("Value of a is: a = " + a);
		b = sum - b;
		System.out.println("Value of b is: b = " + b);
		
	}

}
