package first_programming_truongnm;

public class Array_Sum_And_Average {

	public static void main(String[] args) {
		int sum = 0;
		float average = 0;
		int myArray[] = {3, 5, 7, 30, 10, 5, 8, 23, 0, -5};
		for (int i = 0; i < myArray.length; i++) {
			
			sum = sum + myArray[i];
			
		}
		System.out.println("Sum of myArray is: Sum = "+ sum);
		average = (float)sum/myArray.length;
		
		System.out.println("Average of myArray is: Average = " + average);

	}

}
