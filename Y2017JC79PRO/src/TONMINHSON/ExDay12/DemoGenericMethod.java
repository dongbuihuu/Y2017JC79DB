package TONMINHSON.ExDay12;

public class DemoGenericMethod {

	public static void main(String[] args) {
		Integer[] list = { 1, 30, 50, 100, 200 };
		Character[] character = { 'a', 'b', 'c', 'd', 'e' };
		printList(list);
		printList(character);
	}

	public static <E> void printList(E[] e) {
		for (E a : e) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

}
