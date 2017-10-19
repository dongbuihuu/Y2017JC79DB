package TANGHAANHDUY.GenericExample.Demo;

import java.util.ArrayList;
import java.util.Iterator;

public class MyGenericStack <T> implements Iterable<T>{
private ArrayList<T> arrStack = new ArrayList<T>();
//.0 xay dung bo lap cho stack

Iterator<T> iteratorStack(){
	return arrStack.iterator();
};
//.1Ham tra size cua stack

public int getSize() {
	return arrStack.size();
}

//2.Push 1 phan tu vao stack
public void pushStack(T o) {
	arrStack.add(o);
}

//3.Lay ra phan tu cuoi cua stack
public T peekStack() {
	return arrStack.get(arrStack.size()-1);
}

//4.Lay 1 phan tu ra roi xoa luon phan tu do
public T popStack() {
	T o = arrStack.get(arrStack.size()-1);
	arrStack.remove(this.getSize()-1);
	return o;
}

//5.Kiem tra xem stack con phan tu nao khong

public boolean isEmpty() {
	return arrStack.isEmpty();
}

//6.Lay ra theo index

public T getStackIndex(int index) {
	return arrStack.get(index);
}
@Override
public Iterator<T> iterator() {
	// TODO Auto-generated method stub
	return null;
}
}
