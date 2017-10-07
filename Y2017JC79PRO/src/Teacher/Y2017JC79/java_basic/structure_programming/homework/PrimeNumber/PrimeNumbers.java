package Teacher.Y2017JC79.java_basic.structure_programming.homework.PrimeNumber;

import java.util.Scanner;

/* 
 * Desc: Hiển thị n số nguyên tố trên k dòng
 * Author: Bùi Hữu Đông
 * Date: 09/Oct/2017
 * Company: IMIC edu.
 */
public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số lượng số nguyên tố muốn in: ");
		int numberOfPrime = sc.nextInt();

		System.out.print("Nhập số lượng số nguyên tố trên một dòng: ");
		int rowPrint = sc.nextInt();

		displayPrime(numberOfPrime, rowPrint);
		sc.close();

	}

	public static void displayPrime(int numberOfPrime, int rowPrint) {
		int count = 0; // dùng để đếm xem đã đủ số lượng số nguyên tố chưa?
		int numPrime = 2;
		while (count < numberOfPrime) {
			if (checkPrime(numPrime)) { // Nếu là số nguyên tố
				count++;
				if (count % rowPrint == 0) {
					System.out.println(numPrime);
				} else {
					System.out.print(numPrime + " ");
				}
			}
			numPrime++;
		}

	}

	public static boolean checkPrime(int number) {
		boolean isPrime = true;
		for (int i = 2; i <= Math.sqrt(number); i++) { // Đã tối ưu phép chia
			if (number % i == 0) {
				isPrime = false;
				return false; // void
			}
		}
		return isPrime;

	}

}
