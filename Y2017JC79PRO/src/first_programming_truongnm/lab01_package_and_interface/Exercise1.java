package first_programming_truongnm.lab01_package_and_interface;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Area();
	}

	public static double Area() {
		double radius = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly input radius = ");
		radius = sc.nextDouble();
		sc.close();
		System.out.println("Area of the circlce is: " + Math.PI * Math.pow(radius, 2));
		System.out.println("Perimeter of the circle is: " + 2 * Math.PI * radius);
		return 0;
	}
}
