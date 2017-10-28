package first_programming_truongnm.java_practices;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.print("Kindly input a double number " + i + ": ");
			a.add(sc.nextDouble());
		}
		sc.close();
		double sum = 0;
		for (Double double1 : a) {
			sum = double1 + sum;
		}
		System.out.print("Sum of arraylist a is : ");
		System.out.println(sum);

	}

}
