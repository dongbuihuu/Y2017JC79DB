package Teacher.Y2017JC79.oops.generics.generic_class.demo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Yeu cau: Lap trinh mot lop mo phong Stack: Last In First Out + Dua phan tu
 * (Object, Double, Integer...) vao Stack + Lay ra 1 phan tu + Kiem tra stack
 * con hay khong?
 * 
 * @author Administrator
 *
 */

public class MyGenericStack<T> {
	private ArrayList<T> arrStack = new ArrayList<T>();

	// 0. Xay dung bo lap cho Stack

	public Iterator<T> iteratorStack() {
		return arrStack.iterator();
	}

	// 1. Ham tra ra size cua stack
	public int getSize() {
		return arrStack.size();
	}

	// 2. Push 1 phan tu vao stack
	public void pushStack(T o) {
		arrStack.add(o);
	}

	// 3. Lay ra phan tu tren cung (Vao sau cung) cua stack
	public T peekStack() {
		return arrStack.get(this.getSize() - 1);
	}

	// 4. Lay 1 phan tu ra roi xoa luon phan tu do
	public T popStack() {
		T o = arrStack.get(this.getSize() - 1);
		arrStack.remove(this.getSize() - 1);
		return o;
	}

	// 5. Kiem tra xem stack con phan tu nao khong?
	public boolean isEmpty() {
		return arrStack.isEmpty();
	}

	// 6. lay ra phan theo index
	public T getStackIndex(int index) {
		return arrStack.get(index);
	}

	// 7. remove
	public T removeStack(int index) {
		T o = arrStack.get(index);
		arrStack.remove(index);
		return o;

	}

}

// [1,6,9,5,6]