package Teacher.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAY.SAMPLES.BAITOANSO01;

public class Student {
	private int iRollNo;
	private String sFullName;
	private double dMark;

	public Student(int iRollNo, String sFullName, double dMark) {
		super();
		this.iRollNo = iRollNo;
		this.sFullName = sFullName;
		this.dMark = dMark;
	}

	public int getiRollNo() {
		return iRollNo;
	}

	public void setiRollNo(int iRollNo) {
		this.iRollNo = iRollNo;
	}

	public String getsFullName() {
		return sFullName;
	}

	public void setsFullName(String sFullName) {
		this.sFullName = sFullName;
	}

	public double getdMark() {
		return dMark;
	}

	public void setdMark(double dMark) {
		this.dMark = dMark;
	}

	@Override
	public String toString() {
		return getiRollNo() + " - " + getsFullName() + " - " + getdMark();
	}
}
