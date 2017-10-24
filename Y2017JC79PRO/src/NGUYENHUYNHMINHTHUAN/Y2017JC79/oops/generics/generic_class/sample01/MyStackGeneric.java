package Teacher.Y2017JC79.oops.generics.generic_class.sample01;

import java.util.ArrayList;
import java.util.Iterator;

public class MyStackGeneric<E> {
	ArrayList<E> myList = new ArrayList<E>();

	public Iterator<E> iterator() {
		return myList.iterator();
	}

	public int getSize() {
		return myList.size();
	}

	public E get(int index) {
		return myList.get(index);
	}

	public E peek() {
		return myList.get(myList.size() - 1);
	}

	public E pop() {
		E o = myList.get(myList.size() - 1);
		myList.remove(getSize() - 1);
		return o;
	}

	public void push(E o) {
		myList.add(o);
	}

	public boolean isEmpty() {
		return myList.isEmpty();
	}

}
