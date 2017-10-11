package JAVACORE_TRAINING.OOPS_CONCEPTS.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAYS.COLLECTIONFRAMEWORK.TreeSetExample.SortingOrderforPrimitives;

import java.util.Set;
import java.util.TreeSet;

public class JavaTreeSetExample {

	public static void main(String[] args) {
		Set integerSet = new TreeSet();
		integerSet.add(new Integer(17));
		integerSet.add(new Integer(1));
		integerSet.add(new Integer(4));
		integerSet.add(new Integer(9));
		System.out.println(integerSet.toString());
	}
}
