package Assignment;

import java.util.Scanner;

public class Triangle_Builder {

	public static void main(String[] args) {
		
		int i = 0, j = 0, max = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly input height max: ");
		 max = sc.nextInt();
		 sc.close();
		 
		 System.out.println("Congrtulation! This is your triangle with height = " + max);
		 
		for (i = 0; i < max; i++ ) {
			for (j = 0; j < max-i; j++) {
								
				System.out.printf(" ");
			}
			for (j = 0; j < 2*i - 1; j++) {
				System.out.printf("*");
			}
				System.out.printf("\n\n");
		}

	}

}
