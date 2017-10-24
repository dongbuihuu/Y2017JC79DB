package Teacher.Y2017JC79.oops.generics.generic_method.sample01;

public class GenericDemoMethod {

	public static void main(String[] args) {
		Integer[] lisInt = { 4, 5, 6, 8, 2, 5, 11, 99 };
		Character[] lisChar = { 'a', 'b', 'c', 'd' };

		printArray(lisInt);

	}

	public static <E> void printArray(E[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}

}
