package Teacher.Y2017JC79.oops.generics.generic_method.sample01;

public class DemoGenericMethod {
	public static void main(String[] args) {
		Integer[] lstInt = { 1, 66, 5, 8, 9, 2, 12, 25, 522, 550 };
		Character[] lstChar = { 'a', 'b', 'e', 't', 'k', 'c' };

		printList(lstInt);
		System.out.println("==================");
		printList(lstChar);

	}

	// Đây là phương thức Generic
	public static <E> void printList(E[] e) {
		for (int i = 0; i < e.length; i++) {
			System.out.print(e[i] + " ");
		}
		System.out.println();
	}
}
