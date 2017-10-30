package TONMINHSON.ExDay13.Exercise1;

public class Test {

	public static void main(String[] args) {
		String[] list = { "C", "A", "D", "M", "N", "K" };
		SortArrayClassGeneric<String> arrList = new SortArrayClassGeneric<String>();
		arrList.setArrList(list);
		arrList.printArray(list);
		System.out.println();
		System.out.println("=====================");

		arrList.sortArray(list);
		arrList.printArray(list);
	}

}
