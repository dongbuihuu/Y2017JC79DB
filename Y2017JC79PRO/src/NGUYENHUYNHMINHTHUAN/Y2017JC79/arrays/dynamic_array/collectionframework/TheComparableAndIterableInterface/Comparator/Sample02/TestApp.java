package Teacher.Y2017JC79.arrays.dynamic_array.collectionframework.TheComparableAndIterableInterface.Comparator.Sample02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestApp {

	public static void main(String[] args) {
		List<Student> arrStudent = new ArrayList<Student>();
		arrStudent.add(new Student("Bui Huu Dong", 8.5));
		arrStudent.add(new Student("Tran Thi B", 9.5));
		arrStudent.add(new Student("Nguyen Van C", 4.5));
		arrStudent.add(new Student("Nguyen Van D", 2.5));
		arrStudent.add(new Student("Nguyen Van F", 6.5));
		// Trước khi sắp xếp
		for (Student student : arrStudent) {
			System.out.println(student);
		}
		// Sắp xếp
		Collections.sort(arrStudent, new StudentComparator());

		System.out.println("=========================");
		// Sau khi sắp xếp
		for (Student student : arrStudent) {
			System.out.println(student);
		}
	}

}
