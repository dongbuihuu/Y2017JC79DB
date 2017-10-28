package first_programming_truongnm.java_practices;

import java.util.ArrayList;
import java.util.Collections;

public class DemoListBeforeCompare {

	public static void main(String[] args) {
		ArrayList<String> lst = new ArrayList<>();

		lst.add("A");
		lst.add("B");
		lst.add("C");
		lst.add("D");
		lst.add("E");
		lst.add("F");
		lst.add("G");
		lst.add("H");

		Collections.sort(lst);

		for (String string : lst) {
			System.out.println(string);
		}
	}

}
