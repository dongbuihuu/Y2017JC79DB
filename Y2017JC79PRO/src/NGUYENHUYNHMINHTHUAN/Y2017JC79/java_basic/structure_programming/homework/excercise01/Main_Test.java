package Teacher.Y2017JC79.java_basic.structure_programming.homework.excercise01;

import java.util.Scanner;

public class Main_Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input number a:");
		int a = sc.nextInt();

		System.out.println("Input number b:");
		int b = sc.nextInt();

		System.out.println("GCD is: " + GreatestCommonDivisor.gcd(a, b));
	}

}
