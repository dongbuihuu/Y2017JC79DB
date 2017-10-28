package first_programming_truongnm.java_practices;

import java.util.Scanner;

public class Swap_Two_Integers_Using_Third_Variable {

	public static void main(String[] args) {
		Swap();

	}

	public static void Swap() {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Kindly input a value: a = ");
		a = sc.nextInt();
		System.out.print("Kindly input b value: b = ");
		b = sc.nextInt();
		sc.close();

		c = a;
		a = b;
		b = c;

		System.out.println("Bum@@@, Now, a and b is exchanged");
		System.out.println("a value is a = " + a);
		System.out.println("b value is b = " + b);
	}

}
