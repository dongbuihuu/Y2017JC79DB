package Teacher.Y2017JC79.oops.generics.Excercise01;

public class MainApp {

	public static void main(String[] args) {
		SortArrayClass<String> lst = new SortArrayClass<>();
		String[] arrLst = { "A", "D", "C", "K", "F", "D" };

		lst.setArrList(arrLst);

		lst.printArray(arrLst);

		lst.sortArray(arrLst);
		System.out.println();
		System.out.println("----------------------");
		lst.printArray(arrLst);

	}

}
