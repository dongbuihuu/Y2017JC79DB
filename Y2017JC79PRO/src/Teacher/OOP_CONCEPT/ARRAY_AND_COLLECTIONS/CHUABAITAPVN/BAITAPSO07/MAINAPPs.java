package Teacher.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.CHUABAITAPVN.BAITAPSO07;

public class MAINAPPs {
	public static void main(String[] args) {
		// 1. Khai báo mảng
		int[][] myArr = { { 1, 2, 4, 5 }, { 6, 7, 8, 9 }, { 10, 11, 12, 13 }, { 14, 15, 16, 17 } };
		// 2. Duyệt danh sách các phần tử trong mảng
		for (int i = 0; i < myArr.length; i++)
			for (int j = 0; j < myArr[i].length; j++) {
				System.out.println(String.format("myArr[%s][%s] = %s", i, j, myArr[i][j]));
			}
	}
}
