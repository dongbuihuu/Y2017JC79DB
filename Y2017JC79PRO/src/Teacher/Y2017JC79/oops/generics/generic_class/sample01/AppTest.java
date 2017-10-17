package Teacher.Y2017JC79.oops.generics.generic_class;

import java.util.Iterator;

public class AppTest {
	public static void main(String[] args) {
		MyStackGeneric<Student> list = new MyStackGeneric<Student>();

		list.push(new Student("A", 5.6));

		list.push(new Student("B", 8.6));
		list.push(new Student("C", 6.6));
		list.push(new Student("D", 7.6));

		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
