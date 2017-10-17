package Teacher.Y2017JC79.arrays.dynamic_array.collectionframework.TheComparableAndIterable.BeforeCompare;

import java.util.ArrayList;
import java.util.Collections;

public class DemoListBeforeCompare {
	public static void main(String[] args) {
		ArrayList<String> lst = new ArrayList<>();

		lst.add("A");
		lst.add("B");
		lst.add("F");
		lst.add("K");
		lst.add("D");
		lst.add("U");
		lst.add("G");
		lst.add("H");

		Collections.sort(lst);

		for (String string : lst) {
			System.out.println(string);
		}
	}
}
