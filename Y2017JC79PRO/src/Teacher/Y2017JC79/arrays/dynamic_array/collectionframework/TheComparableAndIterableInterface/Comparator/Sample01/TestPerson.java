package Teacher.Y2017JC79.arrays.dynamic_array.collectionframework.TheComparableAndIterable.Comparator.Sample01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestPerson {

	public static void main(String[] args) {

		Person person01 = new Person("A", (short) 90);
		Person person02 = new Person("B", (short) 60);
		ArrayList<Person> arrLst = new ArrayList<>();
		arrLst.add(person01);
		arrLst.add(person02);
		Collections.sort(arrLst, new CompartorPerson());

		for (Person person : arrLst) {
			System.out.println(person);
			System.out.println("=========");
		}
		// Person personMax = max(person01, person02, new CompartorPerson());

		// System.out.println(personMax);

	}

	// Tạo ra một phương thức so sánh xem ai có tuổi lớn nhất
	public static Person max(Person o1, Person o2, Comparator<Person> c) {
		if (c.compare(o1, o2) > 0)
			return o1;
		else
			return o2;
	}

}
