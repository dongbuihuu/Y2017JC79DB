package Teacher.Y2017JC79.oops.generics.wildcardgeneric.example01;

import java.util.Collection;
import java.util.LinkedList;

public class QueueInforOfGenerics<T> {
	private final LinkedList<T> items = new LinkedList<T>();

	public void AddQueue(T item) {
		items.addLast(item);
	}

	public T RemoveQueue() {
		return items.removeFirst();
	}

	public boolean isEmptyItem() {
		return (items.size() == 0) ? true : false;
	}

	// WildCards Types of Generics
	public void AddAll(Collection<? extends T> collection) {
		for (T item : collection)
			AddQueue(item);
	}

	public void addAllTo(Collection<? super T> collection) {
		// Xóa tất cả các phần tử có trong Queue và thêm mới vào collection
		while (!isEmptyItem()) {
			T item = RemoveQueue(); // Remove từng item trong queue
			collection.add(item); // Chèn vào collection.
		}
	}
}
