package Teacher.Y2017JC79.java_basic.structure_programming.sample;

public class break_demo {

	public static void main(String[] args) {
		int sum = 0;
		int number = 1;

		while (number <= 100) {
			number++;
			sum += number;
			if (sum > 200) {
				break;
			}
		}
		System.out.println("The sum is: " + sum);
		System.out.println("The number is: " + number);

	}

}
