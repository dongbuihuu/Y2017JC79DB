package Teacher.Y2017JC79.arrays.static_array.single_array;

public class Demo {
	public static void main(String[] args) {

		// Giả sử có 1 mảng myArray
		Integer[] myArray = { 4, 6, 2, 7, 77, 43, 2, 4, 88, 98, 5 };
		// Copy to targetArray
		// Cách 1: dùng vòng for
		hienThi("NGUYEN VAN A");
		Integer[] targetArray = new Integer[myArray.length];
		// Integer[] targetArray;
		// targetArray = myArray;

		// for (int i = 0; i < myArray.length; i++) {
		// targetArray[i] = myArray[i];
		// }

		// printArray(myArray);

		// Cách 2: dùng lớp array
		// System.out.println();

		// System.arraycopy(myArray, 0, targetArray, 0, myArray.length);

		// printArray(targetArray);

	}

	public static void printArray(Object[] valuesArray) {
		if (valuesArray instanceof Integer[]) {
			for (int i = 0; i < valuesArray.length; i++) {
				System.out.print(valuesArray[i] + " ");
			}
		}

	}

	public static void hienThi(String... a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}
