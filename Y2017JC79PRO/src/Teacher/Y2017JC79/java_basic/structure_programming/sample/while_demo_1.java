package Teacher.Y2017JC79.java_basic.structure_programming.sample;

public class while_demo_1 {

	public static void main(String[] args) {

		// 1. Khai báo một biến đếm
		int iCount = 0;
		// 2. Dùng vòng lặp
		while (iCount < 10) {
			System.out.println("Giá trị của iCount = " + iCount);
			/* Thay đổi biến iCount */
			// iCount++;
			// ++iCount;
			// iCount++;
			iCount = ++iCount; // control điều kiện lặp

		}

	}

}
