package JAVACORE_TRAINING.OOPS_CONCEPTS.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAYS.COLLECTIONFRAMEWORK.TreeSetExample.SortingOrderUsingComparator;

import java.util.Set;
import java.util.TreeSet;
import ADVANCED_TOPICS.COLLECTIONFRAMEWORK.TreeSetExample.NaturalOrderOfCustomClasses.Employee;

public class avaTreeSetExample {

	public static void main(String[] args) {
		// 1. Khai báo & khởi tạo đối tượng TreeSet
		Set<Employee> objSet = new TreeSet<Employee>(new EmployeeSalaryComparator());

		// 2. Thêm đối tượng vào TreeSet
		objSet.add(new Employee(1, "Nguyễn Văn A", 10.2));
		objSet.add(new Employee(2, "Trần Thị B", 30.5));
		objSet.add(new Employee(3, "Hoàng Văn C", 50.0));
		objSet.add(new Employee(4, "Phạm Thị D", 7.5));
		
		//3. Hiển thị danh sách
		System.out.println(objSet);
	}
}
