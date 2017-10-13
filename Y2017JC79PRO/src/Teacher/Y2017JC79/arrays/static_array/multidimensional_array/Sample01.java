package Teacher.Y2017JC79.arrays.static_array.multidimensional_array;

public class Sample01 {

	public static void main(String[] args) {
		// 1. Khai báo
		int[][] matrix = new int[10][5];

		// 2. Fill giá trị vào mảng 2 chiều
		for (int row = 0; row < matrix.length; ++row) {

			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 1000);

			}

		}
		// 3. In ra ngoài
		for (int row = 0; row < matrix.length; row++) {

			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}

		System.out.println();
	}

}
