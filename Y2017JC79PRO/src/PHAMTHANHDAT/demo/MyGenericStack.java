package PHAMTHANHDAT.demo;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Yêu cầu lập trình một lớp mô phỏng stack :Last In First Out
 * +Đưa phần tử (Object.double,interger..)vào stack
 * +Lấy ra phần tử 
 * +Kiểm tra stack còn hay không
 */
public class MyGenericStack<T> {
	private ArrayList<T> arrStack = new ArrayList<T>();

	// Xây dựng bộ lặp cho Stack
	public Iterator<T> iteratorStack() {
		return arrStack.iterator();
	}

	// 1.Hàm trả ra size của stack
	public int getSize() {
		return arrStack.size();
	}

	// 2.Push(Thêm) 1 phần tử vào stack
	public void pushStack(T o) {
		arrStack.add(o);
	}

	// 3.Lấy ra phần tử cuối của stack [1,4,5,3,6]==>Lấy số 6
	public T peekStack() {
		return arrStack.get(this.getSize() - 1);
	}

	// 4.Lấy phần tử ra rồi xóa luôn phần tử đó
	public T pop() {
		T o = arrStack.get(this.getSize() - 1);
		arrStack.remove(this.getSize() - 1);
		return o;
	}

	// 5.Kiểm tra stack còn phần tử nào hay không
	public boolean isEmty() {
		return arrStack.isEmpty();
	}
	//
}
