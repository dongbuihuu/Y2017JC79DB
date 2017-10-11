package JAVACORE_TRAINING.OOPS_CONCEPTS.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAYS.COLLECTIONFRAMEWORK.TreeSetExample.SortingOrderUsingComparator;

import java.util.Comparator;
import JAVACORE_TRAINING.OOPS_CONCEPTS.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAYS.COLLECTIONFRAMEWORK.TreeSetExample.NaturalOrderOfCustomClasses.*;

public class EmployeeSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary() >= o2.getSalary())
			return 1;	
		else
			return -1;		
	}	
}
