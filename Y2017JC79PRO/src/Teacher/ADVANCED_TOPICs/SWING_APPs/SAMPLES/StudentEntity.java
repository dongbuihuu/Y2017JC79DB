package JAVACORE_TRAINING.ADVANCED_TOPICs.SWING_APPs.SAMPLES;

public class StudentEntity {
	private int iRollNo;
	private String sFullName;
	private double dMark;
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
		return iRollNo +" - "+ sFullName;
	}
}
