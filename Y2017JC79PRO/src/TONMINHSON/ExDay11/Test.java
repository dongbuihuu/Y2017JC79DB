package TONMINHSON.ExDay11;

import java.util.ArrayList;
import java.util.Iterator;

public class Test<T> implements Iterable<T> {

	private ArrayList<T> arrStack = new ArrayList<T>();

	public Iterator<T> iterator() {
		return arrStack.iterator();
	}

	public int getSize() {
		return arrStack.size();
	}

	public void push(T o) {
		arrStack.add(o);
	}

	public T peek() {
		return arrStack.get(this.getSize() - 1);
	}

	public T pop() {
		T o = arrStack.get(this.getSize() - 1);
		arrStack.remove(this.getSize() - 1);
		return o;
	}

	public boolean isEmpty() {
		return arrStack.isEmpty();
	}

	public static void main(String[] args) {
		Test<String> test = new Test<String>();
		// Test<Student> student = new Test<Student>();
		test.push("Student A");
		test.push("Student B");
		test.push("Student C");
		test.push("Student D");
		test.push("Student E");
		Iterator<String> iter = test.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
