package Assignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
	int x = 0, i = 0, j = 2, max = 0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Kindly input max value");
	
	max = sc.nextInt();
	sc.close();
	
	for (i = 2; i <= max; i++) {
		
		x = max%i;
	
		if (x != 0) {
			System.out.print(i);
		}
	}
	
}
}


