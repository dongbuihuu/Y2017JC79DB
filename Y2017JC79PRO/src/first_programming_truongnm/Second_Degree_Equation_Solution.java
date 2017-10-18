package first_programming_truongnm;

import java.util.Scanner;

public class Second_Degree_Equation_Solution {

	public static void main(String[] args) {
		Equation_Solution();

	}
	public static void Equation_Solution() {
		
		int a, b, c;
		double delta, x1, x2;
		Scanner sc = new Scanner (System.in);		
		System.out.print("Kindly input a value: a = ");
		a = sc.nextInt();
		System.out.print("Kindly input b value: b = ");
		b = sc.nextInt();
		System.out.print("Kindly input c value: c = ");
		c = sc.nextInt();
		sc.close();
		
		if (a ==0 && b != 0 && c != 0)
			System.out.println("Secon degree becomes first degree equation: x1 = x2 = " + -c/b);
		else if (a ==0 && b == 0 && c != 0)
			System.out.println("No solutions");
		else if (a ==0 && b == 0 && c == 0) {
			System.out.println("This equation has countless solutions");
		}
		else {
			delta = Math.pow(b, 2) - 4*a*c;
			if (delta < 0){
				System.out.println("No solution");
			}
			else if (delta ==0) {
				System.out.println("The result of equation is: x1 = x2 = " + -b/(2*a));
			}
			else {
				
				x1 = (-b + Math.sqrt(delta))/(2*a);
				x2 = (-b - Math.sqrt(delta))/(2*a);
				
				System.out.println("The result of equation is: x1 = " + x1 + "; x2 = " + x2);
			}
		}
	}
}
