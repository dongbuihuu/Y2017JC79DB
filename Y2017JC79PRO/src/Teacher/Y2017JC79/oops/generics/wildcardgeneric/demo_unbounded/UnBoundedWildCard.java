package Teacher.Y2017JC79.oops.generics.wildcardgeneric.demo_unbounded;

import Teacher.Y2017JC79.oops.generics.generic_class.sample01.MyStackGeneric;

public class UnBoundedWildCard {
	public static void main(String[] args) {
		MyStackGeneric<String> lis = new MyStackGeneric<>();
		MyStackGeneric<Integer> lisIt = new MyStackGeneric<>();
		lisIt.push(1);
		lisIt.push(2);
		lisIt.push(144);
		lisIt.push(14);

		lis.push("A");
		lis.push("B");
		lis.push("C");
		lis.push("D");
		print(lis);
		print(lisIt);

	}

	public static void print(MyStackGeneric<?> lis) {
		for (int i = 1; i < lis.getSize(); i++) {
			System.out.println(lis.get(i));
		}

	}

}
