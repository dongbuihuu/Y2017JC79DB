package Teacher.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAY.SAMPLES.BAITOANSO01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sample01 {

	public static void main(String[] args) {
		// int[] arrInt = new int[10];
		// arrInt[0] = 10;

		// 1. Khai báo và khởi tạo biến mảng động 1 chiều kiểu double

		ArrayList<Double> lisDouble = new ArrayList<Double>();
		ArrayList<Double> lisDouble1 = new ArrayList<Double>();
		/*
		 * lisDouble.isEmpty(); // Trả ra True nếu mảng listDouble là rỗng.
		 * lisDouble.clear(); // Xóa hết tất cả các object trong mảng listDouble
		 * lisDouble.remove(0);// Remove phần tử có index =0; lisDouble.get(0); // Lấy
		 * ra phần tử thứ k trong mảng ( với k = 0...lisDouble.size();)
		 * lisDouble.size(); // trả ra số lượng mà mảng lisDouble có (length)
		 * lisDouble.add(0, 1.0); // chèn một phần tử vào vị trí index
		 * lisDouble.addAll(c); // chèn một tập các đối tượng vào lisDouble
		 * lisDouble1.addAll(lisDouble); lisDouble.set(index, element); //Đưa phần tử
		 * elemnent vào vị trí index
		 */
		List<Integer> lisInteger = new ArrayList<Integer>();
		List<Student> lisStudent = new ArrayList<Student>();

		// 2. Đưa giá trị vào trong mảng động 1 chiều cơ sở & đối tượng
		lisDouble.add(8.5);
		lisDouble.add(9.5);
		lisDouble.add(6.5);
		lisDouble.add(7.5);

		lisStudent.add(new Student(100, "Nguyễn Văn A", 8.5));
		lisStudent.add(new Student(200, "Nguyễn Văn B", 9.5));
		lisStudent.add(new Student(300, "Hoang Văn C", 7.5));

		// 3. Hiển thị các phần tử trong mảng động 1 chiều
		Collections.sort(lisDouble); // Ngầm định java sắp theo chiều tăng dần

		for (int i = 0; i < lisDouble.size(); i++) {
			System.out.println("+ lisDouble = " + lisDouble.get(i));
		}

		for (int i = 0; i < lisStudent.size(); i++) {
			Student objStudent = lisStudent.get(i);
			System.out.println("+ iRollNo: " + objStudent.getiRollNo());
			System.out.println("+ sFullName: " + objStudent.getsFullName());
			System.out.println("+ dMark: " + objStudent.getdMark());
		}
		System.out.println("-----------Student----------");
		for (Student student : lisStudent) {
			System.out.println(student);
		}

		// 4. Sắp xếp mảng đối tượng Sinh Viên
		Collections.sort(lisStudent, new Comparator<Student>() {
			@Override
			public int compare(Student objA, Student objB) {
				if (objA.getdMark() < objB.getdMark()) {
					return -1;
				}
				return 1;
			}
		});

		System.out.println("-----------Sorted----------");
		for (Student student : lisStudent) {
			System.out.println(student);
		}
	}
}
