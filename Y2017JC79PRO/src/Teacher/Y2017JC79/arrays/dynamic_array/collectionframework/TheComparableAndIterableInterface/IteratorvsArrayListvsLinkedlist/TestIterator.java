package Teacher.Y2017JC79.arrays.dynamic_array.collectionframework.TheComparableAndIterable.IteratorvsArrayListvsLinkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestIterator {

	public static void main(String[] args) {

		List<String> collections = new ArrayList<String>();
		collections.add("A");
		collections.add("B");
		collections.add("C");
		collections.add("D");
		collections.add("E");

		// Gọi bộ lặp một chiều
		Iterator<String> iterator = collections.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// Khai báo một linkedlist
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.addAll(collections);

		// Duyệt theo chiều thuận
		ListIterator<String> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
		System.out.println();

		// Duyệt theo chiều nghịch
		listIterator = linkedList.listIterator(linkedList.size());
		while (listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
	}

}
