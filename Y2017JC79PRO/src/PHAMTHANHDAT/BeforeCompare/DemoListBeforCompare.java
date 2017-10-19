package PHAMTHANHDAT.BeforeCompare;

import java.util.ArrayList;
import java.util.Collections;

public class DemoListBeforCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lst = new ArrayList<>();
		lst.add("A");
		lst.add("B");
		lst.add("C");
		lst.add("D");
		lst.add("E");
		lst.add("F");
		Collections.sort(lst);
		for (String string : lst) {
			System.out.println(string);
		}
	}

}
