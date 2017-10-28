package first_programming_truongnm.java_practices;

/*
 * Yeu cau: Lap trinh mot lop mo phong Stack: Last in First Out
 * + Dua phan tu (Object, Double, Integer...) vao Stack
 * + Lay ra 1 phan tu 
 * + Kiem tra Stack con phan tu hay khong?
*/
import java.util.ArrayList;
import java.util.Iterator;

public class MyStackGeneric<T> {

	private ArrayList<T> arrStack = new ArrayList<T>();

	// 0. Xay dung bo lap cho Stack
	Iterator<T> iteratorStack() {
		return arrStack.iterator();
	}

	// 1. Ham tra ra do lon cua Stack
	public int getSize() {
		return arrStack.size();
	}

	// 2. Push 1 phan tu vao Stack
	public void pushStack(T o) {
		arrStack.add(o);
	}

	// 3. Lay ra 1 phan tu cuoi cua Stack
	public T peekStack() {
		return arrStack.get(this.getSize() - 1);
	}

	// 4. Lay 1 phan tu ra roi xoa luon phan tu do
	public T popStack() {
		T o = arrStack.get(this.getSize() - 1);
		arrStack.remove(arrStack.get(this.getSize() - 1));
		return o;
	}

	// 5. Kiem tra xem Stack con phan tu nao khong?
	public boolean isEmpty() {
		return arrStack.isEmpty();
	}

}
