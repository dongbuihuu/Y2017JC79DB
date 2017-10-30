package TONMINHSON.ExDay11;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("A", (double) 8.6));
		list.add(new Student("C", (double) 9.8));
		list.add(new Student("D", (double) 7.6));
		list.add(new Student("E", (double) 6.2));

		Collections.sort(list);
		for (Student student : list) {
			System.out.println(student.toString());
		}
		System.out.println("=====================");
		Collections.reverse(list);
		for (Student student : list) {
			System.out.println(student.toString());
		}
		System.out.println("=====================");
		System.out.println("Best student: " + list.get(list.size() - 1));
	}
}
