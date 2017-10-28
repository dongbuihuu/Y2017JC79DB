package Assignment;

public class RepareGenerics < T extends Comparable <T>> {
	private T[] arrlst;

	public T[] getArrlst() {
		return arrlst;
	}

	public void setArrlst(T[] arrlst) {
		this.arrlst = arrlst;
	}
	
	public void sortArray (T[] lst) {
		T minValue; //Chua gia tri nho nhat
		int minIndexValue; //Chua chi so cua gia tri nho nhat
		for (int i = 0; i < lst.length - 1; i++) {
			//Coi vi tri theo i la min
			minValue = lst[i];
			minIndexValue = i;
			for (int j = i + 1; j < lst.length; j ++) {
				if (minValue.compareTo(lst[j]) > 0) {
					minValue = lst[j];
					minIndexValue = j;
				}
			}
			if (minIndexValue != i) {
				//Thuc hien hoan doi
				lst[minIndexValue] = lst[i];
				lst[i] = minValue;
			}
		}
	}
	
	
	public void printArray( T[] lst) {
		for (int i = 0; i < lst.length; i++ ) {
			System.out.print(lst[i] + " ");
	}
	


	}
}
