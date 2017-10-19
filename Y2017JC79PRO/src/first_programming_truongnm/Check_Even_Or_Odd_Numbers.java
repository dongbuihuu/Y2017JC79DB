package first_programming_truongnm;

import java.util.Scanner;

public class Check_Even_Or_Odd_Numbers {

	public static void main(String[] args) {
		Even_Or_Odd();

	}
	public static void Even_Or_Odd() {
		int x, module;
		Scanner sc = new Scanner (System.in);
		System.out.print("Kindly input x number: x = ");
		x = sc.nextInt();
		sc.close();
		module = x%2;
		if (module == 0)
			System.out.println("x = " + x + " is a Even number");
		else 
			System.out.println("x = " + x + " is a Odd number");
	}
   
}
