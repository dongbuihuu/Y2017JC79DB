package BUIHUUDONG;

public class demo {

	public static void main(String[] args) {
		int[] myArray = { 5, 8, 2, 1, 3, 9, 6 };

		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray.length; j++) {
				if (myArray[i] > myArray[j]) {
					int temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;

				}
			}
		}
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}

	}

}
