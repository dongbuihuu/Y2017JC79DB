package Teacher.Y2017JC79.java_basic.structure_programming.homework.TowerOfHaNoi;

import java.util.Scanner;

public class TheTowerOfHN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of disks: ");
		int n = input.nextInt();
		System.out.println("The moves are:");
		diChuyen(n, 'A', 'B', 'C');

	}

	public static void diChuyen(int n, char fromTower, char toTower, char auxTower) {
		if (n == 1) // nếu một đĩa thì chuyển luôn (base condition)
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
		else {
			diChuyen(n - 1, fromTower, auxTower, toTower);
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
			diChuyen(n - 1, auxTower, toTower, fromTower);
		}
	}
}
