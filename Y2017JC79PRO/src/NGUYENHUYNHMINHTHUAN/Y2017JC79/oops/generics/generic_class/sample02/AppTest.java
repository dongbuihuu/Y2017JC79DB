package Teacher.Y2017JC79.oops.generics.generic_class.sample02;

public class AppTest {

	public static void main(String[] args) {
		MyArray<String> arrString = new MyArray<String>();

		String[] listString = { "A", "B", "C", "D" };
		arrString.setArray(listString);
		printArray(arrString);

	}

	public static void printArray(MyArray<?> array) {
		for (int i = 0; i < array.getSize(); i++) {
			System.out.println(array.getArray()[i]);
		}
	}

}
