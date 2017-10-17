package Teacher.Y2017JC79.oops.generics.nogeneric_demo;

public class MyList<T> {
	private int size;
	private Object[] arrObj;

	public MyList() {
		this.size = 0;
		arrObj = new Object[100];
	}

	public void add(T o) {

		arrObj[size] = o;
		size++;
	}

	public T get(int index) {
		return (T) arrObj[index];
	}

	public int getSize() {
		return size;
	}

}
