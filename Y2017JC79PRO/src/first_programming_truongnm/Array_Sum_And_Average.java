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
		
		//Output position which is the values less than or equal to zero
		
		for ( int i = 0; i < myArray.length; i++) {
			if (myArray[i] <= 0) {
				System.out.println("Index of values that less than or equal to 0 is: " + i);
			}
		}	
		
		// When myArray pass through below code section, myArray will be arranged follow ascending
		for (int i = 0; i < myArray.length; i++) {
			for (int j = i + 1; j < myArray.length; j++) {
				if (myArray[i] > myArray[j]) {
					
					int temp;
					temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		
		//Output myArray
		for (int i = 0; i < myArray.length; i++)
			System.out.print(myArray[i] + " ");
	
	}

}
