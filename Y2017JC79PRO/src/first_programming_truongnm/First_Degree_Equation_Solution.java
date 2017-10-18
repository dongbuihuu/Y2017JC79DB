package first_programming_truongnm;

import java.util.Scanner;

public class First_Degree_Equation_Solution {

	public static void main(String[] args) {
		Equation_Solution();

	}
	
	public static void Equation_Solution() {
		int a, b, x;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Kindly input a value: a = ");
		a = sc.nextInt();
		System.out.print("Kindly input b value: b = ");
		b = sc.nextInt();
		sc.close();
		if (a == 0) {
			System.out.println("The equation have no solution");
		}
		else if (a == 0 && b == 0) {
			System.out.println("Error");
		}
		else if (a != 0 && b ==0) {
			System.out.println("The result of equation is x = 0");
		}
		else {
			x = -b/a;
			System.out.println("The result of equation " + a + "x + " + b + " = 0 is: x = " + x );
		}
	}

}
