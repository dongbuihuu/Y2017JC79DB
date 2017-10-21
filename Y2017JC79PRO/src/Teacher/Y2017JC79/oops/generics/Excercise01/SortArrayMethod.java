package Teacher.Y2017JC79.oops.generics.Excercise01;

public class SortArrayMethod {
	public static void main(String[] args) {

		String[] lst = { "A", "D", "C", "K", "F", "D" };
		printArray(lst);
		sortArray(lst);
		System.out.println("==========================");
		printArray(lst);

	}

	public static <E extends Comparable<E>> void sortArray(E[] lst) {
		E minObject;
		int minObjectIndex;
		for (int i = 0; i < lst.length - 1; i++) {
			// Coi nhu vi tri dau tien theo i la min
			minObject = lst[i];
			minObjectIndex = i;
			// Thuc hien tim tu i+1 den length
			for (int j = i + 1; j < lst.length; j++) {
				if (minObject.compareTo(lst[j]) > 0) {
					minObject = lst[j];
					minObjectIndex = j;
				}
			}
			// Het vong for ta duoc min
			if (minObjectIndex != i) {
				lst[minObjectIndex] = lst[i];
				lst[i] = minObject;

			}

		}
	}

	public static <E> void printArray(E[] lst) {
		for (int i = 0; i < lst.length; i++) {
			System.out.print(lst[i] + " ");
		}
	}
}
