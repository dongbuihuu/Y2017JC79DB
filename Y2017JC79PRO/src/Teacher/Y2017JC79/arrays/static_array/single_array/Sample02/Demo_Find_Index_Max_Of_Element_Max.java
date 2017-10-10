package Teacher.Y2017JC79.arrays.static_array.Sample02;

public class Demo_Find_Index_Max_Of_Element_Max {

	/*
	 * Desc: Tìm chỉ số thấp nhất của phần tử lớn nhất. Ví dụ: myArray =
	 * {1,3,8,9,55,88,9,88,79,88,77,26} => index find = 5
	 */

	public static void main(String[] args) {
		// 1. Ta khởi tạo mảng (có thể default hoặc nhập từ bàn phím)
		int[] myArray = new int[] { 1, 3, 8, 9, 55, 88, 9, 88, 79, 88, 77, 26 };
		// 2. gán phần tử đầu tiên coi như là max
		int max = myArray[0];
		int indexOfMax = 0;
		// 3. Xử lý tìm max
		for (int i = 1; i <= myArray.length - 1; i++) {
			if (myArray[i] > max) {
				max = myArray[i];
				indexOfMax = i;
			}
		}
		// 4. Return result
		System.out.println("Chỉ số lớn nhất của phần tử lớn nhất là: " + indexOfMax);

	}

}
