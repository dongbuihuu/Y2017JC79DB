package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.EXAMPLES.SAMPLE02;

public class ArrayEntity {
	private double[] dArr;
	/***
	 * + bOption = 0: Find Max, Find Index Max
	 * + bOption = 1: Find Min, Find Index Min
	 */
	private byte bOption;
	/***
	 * + bSortType = 0: buddy sort
	 * + bSortType = 1: insertion sort
	 * + bSortType = 2: selection sort
	 */
	private byte bSortType;
	/***
	 * + bOrder = 0: Asc
	 * + bOrder = 1: Desc
	 */
	private byte bOrder;

	public double[] getdArr() {
		return dArr;
	}

	public void setdArr(double[] dArr) {
		this.dArr = dArr;
	}

	public byte getbOption() {
		return bOption;
	}

	public void setbOption(byte bOption) {
		this.bOption = bOption;
	}

	public byte getbSortType() {
		return bSortType;
	}

	public void setbSortType(byte bSortType) {
		this.bSortType = bSortType;
	}
	
}
