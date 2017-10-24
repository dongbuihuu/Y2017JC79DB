package Teacher.Y2017JC79.java_basic.structure_programming.sample;

public class for_demo_2_nested {

	public static void main(String[] args) {

		// 1. In tiêu đề của bảng cửu chương
		System.out.println("             Bảng Cửu Chương");
		System.out.print("    ");
		for (int j = 1; j <= 9; j++) {
			System.out.print("   " + j);
		}
		System.out.println("\n----------------------------------------");
		// 2. Hiển thị thân của loop

		for (int i = 1; i <= 9; i++) {
			System.out.print(i + " | ");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%4d", i * j);
			}
			System.out.println();
		}

	}

}
