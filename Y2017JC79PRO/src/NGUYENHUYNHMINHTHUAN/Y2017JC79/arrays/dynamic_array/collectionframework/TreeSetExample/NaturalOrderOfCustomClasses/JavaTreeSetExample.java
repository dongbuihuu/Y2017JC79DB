package JAVACORE_TRAINING.OOPS_CONCEPTS.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAYS.COLLECTIONFRAMEWORK.TreeSetExample.NaturalOrderOfCustomClasses;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class JavaTreeSetExample {

	public static void main(String[] args) {
		// 1. Khai báo & khởi tạo TreeSet
		Set<Employee> objSet = new TreeSet<Employee>();

		// 2. Thêm đối tượng vào TreeSet
		objSet.add(new Employee(1, "Nguyễn Văn A", 10.2));
		objSet.add(new Employee(2, "Trần Thị B", 30.5));
		objSet.add(new Employee(3, "Hoàng Văn C", 50.0));
		objSet.add(new Employee(4, "Phạm Thị D", 7.5));

		// 3. Duyệt & hiển thị danh sách
		System.out.println("** Iterating using for loop **");
		for (Employee objE : objSet) {
			System.out.println(objE);
		}

		System.out.println("** Iterating using Iterator **");
		Iterator iterator = objSet.iterator();		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
