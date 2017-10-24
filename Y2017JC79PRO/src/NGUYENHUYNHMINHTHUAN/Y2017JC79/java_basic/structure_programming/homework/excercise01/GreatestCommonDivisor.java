package Teacher.Y2017JC79.java_basic.structure_programming.homework.excercise01;

/*
 * Desc: Finding the Greatest Common Divisor
 * Author: Dongbh
 * Date: 03/10/2017
 */
public class GreatestCommonDivisor {
	public static int gcd(int a, int b) {
		int gcd = 1;
		int k = 2;
		while (k <= a && k <= b) {
			if (a % k == 0 && b % k == 0)
				gcd = k;
			k++;
		}
		return gcd;
	}
}
