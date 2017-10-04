package JAVACORE_TRAINING.OOPS_CONCEPTS.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAYS.COLLECTIONFRAMEWORK.HashSetvsTreeSetvsLinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class PerformanceTesting {

	public static void main(String[] args) {
		Random r = new Random();
		//1. Khai báo & khởi tạo các đối tượng
		HashSet<Dog> hashSet = new HashSet<Dog>();
		TreeSet<Dog> treeSet = new TreeSet<Dog>();
		LinkedHashSet<Dog> linkedSet = new LinkedHashSet<Dog>();
	 
		// start time
		long startTime = System.nanoTime();
	 
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			hashSet.add(new Dog(x));
		}
		// end time
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("HashSet: " + duration);
	 
		// start time
		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			treeSet.add(new Dog(x));
		}
		// end time
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("TreeSet: " + duration);
	 
		// start time
		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			linkedSet.add(new Dog(x));
		}
		// end time
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedHashSet: " + duration);		
	}
}
