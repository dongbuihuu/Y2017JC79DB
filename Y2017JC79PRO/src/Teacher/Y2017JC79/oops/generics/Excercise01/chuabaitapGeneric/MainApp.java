package Teacher.Y2017JC79.oops.generics.Excercise01.chuabaitapGeneric;

public class MainApp {
	public static void main(String[] args) {
		// String[] lst = { "A", "D", "C", "E", "M", "N" };

		// Integer[] lst = { 3, 4, 777, 8, 8, 0, 2, 4, 56, 77, 52 };
		Student[] lst = { new Student("A", 8.7), new Student("B", 3), new Student("C", 9.5) };

		SortArrayClassGeneric<Student> arrLst = new SortArrayClassGeneric<>();
		arrLst.setArrLst(lst);

		arrLst.printArray(lst); // Truoc khi sap xep
		System.out.println();

		System.out.println("============================");
		arrLst.SortArray(lst);
		arrLst.printArray(lst); // Sau khi sap xep

	}
}
