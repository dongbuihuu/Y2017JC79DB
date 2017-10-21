package Teacher.Y2017JC79.oops.generics.Excercise01.chuabaitapGeneric;

public class SortArrayClassGeneric<T extends Comparable<T>> {
	private T[] arrLst;

	public T[] getArrLst() {
		return arrLst;
	}

	public void setArrLst(T[] arrLst) {
		this.arrLst = arrLst;
	}

	public void SortArray(T[] lst) {
		T minValue; // Chua gia tri nho nhat
		int minIndexValue; // Chua chi so cua gia tri nho nhat minValue

		for (int i = 0; i < lst.length - 1; i++) {
			// Coi nhu vi tri theo i la min
			minValue = lst[i];
			minIndexValue = i;
			for (int j = i + 1; j < lst.length; j++) {
				if (minValue.compareTo(lst[j]) > 0) {
					minValue = lst[j];
					minIndexValue = j;
				}

			} // het lap j
			if (minIndexValue != i) { // Thuc hien hoan doi
				lst[minIndexValue] = lst[i];
				lst[i] = minValue;
			}

		}

	}

	public void printArray(T[] lst) {
		for (int i = 0; i < lst.length; i++) {
			System.out.print(lst[i] + " ");
		}
	}
}

/*
 * 
 * [11,97,5,1,6,23,61]
 * 
 * 
 * 
 */
