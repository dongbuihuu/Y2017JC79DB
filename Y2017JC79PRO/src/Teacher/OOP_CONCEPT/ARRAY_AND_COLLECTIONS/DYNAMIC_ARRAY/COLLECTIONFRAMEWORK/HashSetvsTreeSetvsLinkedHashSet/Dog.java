package JAVACORE_TRAINING.OOPS_CONCEPTS.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAYS.COLLECTIONFRAMEWORK.HashSetvsTreeSetvsLinkedHashSet;

public class Dog implements Comparable<Dog> {
	int size;
	 
	public Dog(int s) {
		size = s;
	}
 
	public String toString() {
		return size + "";
	}
	
	@Override
	public int compareTo(Dog o) {
		return size - o.size;
	}	
}
