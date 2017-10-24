package Teacher.Y2017JC79.oops.generics.nogeneric_demo;

import java.util.ArrayList;

public class TestApp {

	public static void main(String[] args) {
		MyList<String> mylist = new MyList<>();

		ArrayList<String> st;

		mylist.add("A");
		mylist.add("B");
		mylist.add("C");

		// Lấy thông tin
		for (int i = 0; i < mylist.getSize(); ++i) {
			String str = (String) mylist.get(i);
			System.out.print(str + " ");
		}
		// Đưa thêm vào
		// mylist.add(new Integer(123456));

		for (int i = 0; i < mylist.getSize(); ++i) {
			String str = (String) mylist.get(i);
			System.out.print(str + " ");
		}

	}

}
