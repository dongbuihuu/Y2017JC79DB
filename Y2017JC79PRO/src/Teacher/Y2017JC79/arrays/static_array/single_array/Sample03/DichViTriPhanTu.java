package Teacher.Y2017JC79.arrays.static_array.single_array.Sample03;

public class DichViTriPhanTu {
	// ban đầu: { 1, 2, 3, 4, 5, 6, 7, 8, 9 } sau là { 2, 3, 4, 5, 6, 7, 8, 9, 1 }

	public static void main(String[] args) {
		// 1. Khai báo và gán phần tử mảng
		int[] myArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// 2. xử lý mảng
		int temp = myArray[0];

		for (int i = 1; i < myArray.length; i++) {
			myArray[i - 1] = myArray[i];
		}
		myArray[myArray.length - 1] = temp;

		// 3. In ra phần tử mảng sau khi hoán đổi
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(String.format("%d" + " ", myArray[i]));
		}
		System.out.println();

		for (int e : myArray)
			System.out.print(String.format("%d" + " ", e));
	}

}
