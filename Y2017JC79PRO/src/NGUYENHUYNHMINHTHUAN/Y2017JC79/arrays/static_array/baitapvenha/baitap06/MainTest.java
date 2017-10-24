package Teacher.Y2017JC79.arrays.static_array.baitapvenha.baitap06;

public class MainTest {

	public static void main(String[] args) {
		Student sv1 = new Student("Nguyễn Đình Tèo", 9.5);
		Student sv2 = new Student("Nguyễn Văn A", 5.5);
		Student sv3 = new Student("Trần Thị B", 8.0);

		Student[] arrSv = new Student[3];
		arrSv[0] = sv1;
		arrSv[1] = sv2;
		arrSv[2] = sv3;
		printArray(arrSv);
		SortArray(arrSv);
		System.out.println("==================================");
		printArray(arrSv);

	}

	public static void SortArray(Student[] vArr) {
		for (int i = 0; i < vArr.length - 1; i++) {
			for (int j = i + 1; j < vArr.length; j++) {
				if (vArr[i].getdMarks() > vArr[j].getdMarks()) {
					Student temp = vArr[i];
					vArr[i] = vArr[j];
					vArr[j] = temp;
				}
			}
		}
	}

	public static void printArray(Student[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
