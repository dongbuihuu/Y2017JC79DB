package JAVACORE_TRAINING.OOP_CONCEPT.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.DYNAMIC_ARRAY.COLLECTIONFRAMEWORK.TheCollectionInterfaces;

import java.util.Collection;

public interface ICollection<E> {
	boolean add(E obj);
	boolean addAll(Collection<?> C);
	E remove(E obj);
	boolean removeAll(Collection<?> C);
	boolean contains(E obj);
	boolean isEmpty();
	int size();
}
