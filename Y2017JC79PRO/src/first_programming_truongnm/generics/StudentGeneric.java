package first_programming_truongnm.generics;

public class StudentGeneric<T extends Comparable<T>> {

	private T[] arrLst;

	public T[] getArrLst() {
		return arrLst;
	}

	public void setArrLst(T[] arrLst) {
		this.arrLst = arrLst;
	}

	public void SortArr(T[] lst) {

		for (int i = 0; i < lst.length - 1; i++) {
			for (int j = i; j < lst.length; j++) {
				if (lst[i] > lst[j]) {
					int temp;
					temp = lst[i];
					lst[j] = temp;

				}
			}
		}

	}

}
