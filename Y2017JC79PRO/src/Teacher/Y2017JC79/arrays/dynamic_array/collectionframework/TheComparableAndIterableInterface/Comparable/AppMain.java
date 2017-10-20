package Teacher.Y2017JC79.arrays.dynamic_array.collectionframework.TheComparableAndIterableInterface.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class AppMain {

	public static void main(String[] args) {

		ArrayList<Student> arrStudent = new ArrayList<Student>();
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
		Collections.sort(arrStudent);
		System.out.println("=========================");
		// Sau khi sắp xếp
		for (Student student : arrStudent) {
			System.out.println(student);
		}
	}

}
