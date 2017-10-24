package Teacher.Y2017JC79.oops.generics.generic_class.sample02;

public class MyArray<T> {
	private T[] array;
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public MyArray() {

	}

	public MyArray(T[] array, int size) {
		this.array = array;
		this.size = size;
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
		this.size = array.length;
	}

	// Return phan tu tai vi tri i cua mang
	public T getElement(int index) {
		return array[index];
	}

}
