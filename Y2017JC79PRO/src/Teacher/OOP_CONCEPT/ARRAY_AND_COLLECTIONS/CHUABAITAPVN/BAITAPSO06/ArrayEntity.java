package Teacher.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.CHUABAITAPVN.BAITAPSO06;

public class ArrayEntity {
	private StudentEntity[] arrStudent;
	private double dValue;
	/***
	 * - bOption = 0: Min Index; bOption = 1: Max Index
	 */
	private byte bOption;

	public byte getbOption() {
		return bOption;
	}

	public void setbOption(byte bOption) {
		this.bOption = bOption;
	}

	public StudentEntity[] getArrStudent() {
		return arrStudent;
	}

	public void setArrStudent(StudentEntity[] arrStudent) {
		this.arrStudent = arrStudent;
	}

	public double getdValue() {
		return dValue;
	}

	public void setdValue(double dValue) {
		this.dValue = dValue;
	}

}
