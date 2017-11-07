package first_programming_truongnm.lab02_exception_handling;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		int Array[] = new int[5];
		int sumArray = 0;
		try {
			for (int i = 0; i < Array.length + 1; i++) {
				System.out.print("Kindly input array's value at " + i + " position: ");
				Scanner sc = new Scanner(System.in);
				Array[i] = sc.nextInt();
				sumArray += Array[i];
			}
		} catch (Exception e) {
			throw new ArrayIndexOutOfBoundsException();
		} finally {
			System.out.println("Sum of array is " + sumArray);
		}
	}

}
