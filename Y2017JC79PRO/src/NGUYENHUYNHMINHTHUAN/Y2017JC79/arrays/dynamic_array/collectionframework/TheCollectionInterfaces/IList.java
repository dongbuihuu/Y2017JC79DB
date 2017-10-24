package JAVACORE_TRAINING.OOP_CONCEPT.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.DYNAMIC_ARRAY.COLLECTIONFRAMEWORK.TheCollectionInterfaces;

import java.util.Collection;

public interface IList<E> extends ICollection<E> {
	E get(int index );
	void set(int index, E obj);
	int indexOf(E obj);
	int lastIndexOf(E obj);
	Collection<E> subList(int start, int end);
}
