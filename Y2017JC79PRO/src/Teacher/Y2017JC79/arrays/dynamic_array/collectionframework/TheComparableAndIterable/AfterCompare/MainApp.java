package Teacher.Y2017JC79.arrays.dynamic_array.collectionframework.TheComparableAndIterable.AfterCompare;

import java.util.ArrayList;
import java.util.Collections;

public class MainApp {

	public static void main(String[] args) {
		ArrayList<Student> lst = new ArrayList<>();
		lst.add(new Student("A", 8.6));
		lst.add(new Student("B", 9));
		lst.add(new Student("C", 2));
		lst.add(new Student("D", 6));
		lst.add(new Student("E", 8));
		lst.add(new Student("F", 10));
		printArray(lst); // Truoc khi sap xep
		Collections.sort(lst);

		System.out.println("=========================");
		printArray(lst);// Sau khi sap xep

	}

	public static void printArray(ArrayList<Student> obj) {
		for (Student student : obj) {
			System.out.println(student);
		}
	}

}
