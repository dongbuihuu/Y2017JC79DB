package JAVACORE_TRAINING.OOP_CONCEPT.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.DYNAMIC_ARRAY.COLLECTIONFRAMEWORK.TheCollectionInterfaces;

import java.util.Collection;
import java.util.LinkedList;

public class cArrayList<E> 
						extends cAbstractList<E> implements IList<E> {
	private LinkedList<E> lisLink = new LinkedList<E>();	
	
	public boolean IsActive(){
		return true;
	}

	@Override
	public E get(int index) {
		return lisLink.get(index);
	}

	@Override
	public void set(int index, E obj) {
		
	}

	@Override
	public int indexOf(E obj) {
		return 0;
	}

	@Override
	public int lastIndexOf(E obj) {
		return 0;
	}

	@Override
	public Collection<E> subList(int start, int end) {
		return null;
	}

	@Override
	public boolean add(E obj) {
		try{
			lisLink.add(obj);
		}catch(Exception e){
			throw e;
		}
		return true;
	}

	@Override
	public boolean addAll(Collection<?> C) {
		return false;
	}

	@Override
	public E remove(E obj) {
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> C) {
		return false;
	}

	@Override
	public boolean contains(E obj) {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public int size() {
		return lisLink.size();
	}	
}
