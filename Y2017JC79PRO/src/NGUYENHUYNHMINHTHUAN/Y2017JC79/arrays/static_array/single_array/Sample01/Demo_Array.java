package Teacher.Y2017JC79.arrays.static_array.single_array.Sample01;

public class Demo_Array {
	public static void main(String[] args) {
		// 1. Khai báo biến mảng
		double[] dArr;
		dArr = new double[10];

		double[] myArr = { 6.5, 7.5, 8.5, 9.5 }; // 4 phần tử

		double[] dArray = new double[] { 1.0, 2.5, 88.9, 8.3 }; // Vừa khai báo vừa khởi tạo

		// 2. Đưa giá trị vào biến mảng
		dArr[0] = 6.5;
		dArr[1] = 7.5;
		dArr[2] = 8.5;
		dArr[3] = 9.5;
		dArr[9] = 5.5;

		// System.out.println(dArr);

		// 3. Hiển thị các giá trị
		System.out.println("dArr[0] = " + dArr[0]);
		System.out.println("dArr[1] = " + dArr[1]);
		System.out.println("dArr[2] = " + dArr[2]);
		System.out.println("dArr[3] = " + dArr[3]);
		System.out.println("dArr[9] = " + dArr[9]);

		// 4. Sử dụng For
		for (int i = 0; i < dArr.length; i++) {
			System.out.println(String.format("dArr[%s] = %s", i, dArr[i]));
		}

		// 5. ForEach
		double dTotal = 0;
		for (double dValue : dArr) {
			dTotal += dValue;
			System.out.println("dValue = " + dValue);
		}
		System.out.println("dTotal = " + dTotal);
	}
}
