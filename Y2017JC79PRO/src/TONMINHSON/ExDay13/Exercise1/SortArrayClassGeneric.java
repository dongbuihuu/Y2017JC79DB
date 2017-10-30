package TONMINHSON.ExDay13.Exercise1;

public class SortArrayClassGeneric<T extends Comparable<T>> {
	private T[] arrList;

	public T[] getArrList() {
		return arrList;
	}

	public void setArrList(T[] arrList) {
		this.arrList = arrList;
	}

	public void sortArray(T[] list) {
		T minValue; // store min value
		int minIndexValue; // store index of min value
		for (int i = 0; i < list.length - 1; i++) {
			minValue = list[i];
			minIndexValue = i;
			for (int j = i + 1; j < list.length; j++) {
				if (minValue.compareTo(list[j]) > 0) {
					minValue = list[j];
					minIndexValue = j;
				}
			}
			if (minIndexValue != i) {
				list[minIndexValue] = list[i];
				list[i] = minValue;
			}
		}
	}

	public void printArray(T[] list) {
		for (T lst : list)
			System.out.print(lst + " ");
	};
}
