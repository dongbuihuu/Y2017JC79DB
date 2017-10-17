package Teacher.Y2017JC79.oops.generics.generic_class.demo;

import java.util.Iterator;

public class MainApp {

	public static void main(String[] args) {

		MyGenericStack<String> listString = new MyGenericStack<String>();
		// MyGenericStack<SinhVien> listStudent = new MyGenericStack<SinhVien>();

		listString.pushStack("Nguyen Van A");
		listString.pushStack("Tran Thi B");
		listString.pushStack("Tran Thi C");
		listString.pushStack("Tran Thi D");
		listString.pushStack("Tran Thi E");
		listString.pushStack("Tran Thi F");

		Integer iValue = 5; // int => Autoboxing
		int intValue = new Integer(123);/// Auto Unboxing

		Iterator<String> iter = listString.iteratorStack();
		while (iter.hasNext()) {
			System.out.println(iter.next());
			iter.remove();
		}

		for (int i = 0; i < listString.getSize(); i++) {
			System.out.println(listString.getStackIndex(i));
		}
		System.out.println(listString);
		/*
		 * System.out.println("==========================="); listStudent.pushStack(new
		 * SinhVien("A", 8.9)); listStudent.pushStack(new SinhVien("B", 4.9));
		 * listStudent.pushStack(new SinhVien("C", 5.9)); listStudent.pushStack(new
		 * SinhVien("D", 6.9));
		 * 
		 * Iterator<SinhVien> iterSV = listStudent.iteratorStack(); while
		 * (iterSV.hasNext()) { System.out.println(iterSV.next()); }
		 */
		// Output kieu 3
		// for (String string : listString) {
		// System.out.println(string);
		// }

	}
}
