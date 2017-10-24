package Teacher.Y2017JC79.arrays.dynamic_array.excercises.EX02;

import java.util.ArrayList;
import java.util.List;

public class ArrayView {
	private static ArrayEntity mArrEntity;
	private static List<List<Student>> liLisStudent;

	public static void main(String[] args) {
		// 1. Nghiệp vụ 01: Thêm mới các đối tượng vào Mảng động
		Add();

		// 2. Nghiệp vụ 02: Hiển thị danh sách Sinh Viên
		PrintInfo();

		// 3. Tính tổng các điểm số
		ArrayController objController = new ArrayController();
		double dTotal = objController.Sum(mArrEntity);

		// 4. Hiển thị
		System.out.println("- Total: " + dTotal);
	}

	static void Add() {
		mArrEntity = new ArrayEntity();
		// 1. Khai báo mảng động 2 chiều kiểu đối tượng Student
		liLisStudent = new ArrayList<List<Student>>();

		// 2. Khai báo ra các mảng con 1 chiều
		List<Student> lisS01 = new ArrayList<>();
		List<Student> lisS02 = new ArrayList<>();

		// 3. Khai báo và khởi tạo ra các đối tượng SV
		Student objS01 = new Student(100, "Mr A", 8.5);
		Student objS02 = new Student(200, "Mr B", 9.5);
		Student objS03 = new Student(300, "Mr C", 7.5);

		// 4. Đưa đt SV vào mảng
		lisS01.add(objS01);
		lisS01.add(objS02);
		lisS01.add(objS03);

		lisS02.add(objS01);
		lisS02.add(objS02);
		lisS02.add(objS03);

		// 5. Đưa các mảng con vào mảng cha 2 chiều
		liLisStudent.add(lisS01);
		liLisStudent.add(lisS02);

		mArrEntity.setLiLisStudent(liLisStudent);
	}

	static void PrintInfo() {
		for (int i = 0; i < liLisStudent.size(); i++)
			for (int j = 0; j < liLisStudent.get(i).size(); j++) {
				System.out.println(String.format("- RollNo: %s", liLisStudent.get(i).get(j).getiRollNo()));
				System.out.println(String.format("- FullName: %s", liLisStudent.get(i).get(j).getsFullName()));
				System.out.println(String.format("- Mark: %s", liLisStudent.get(i).get(j).getdMark()));
			}
	}
}
