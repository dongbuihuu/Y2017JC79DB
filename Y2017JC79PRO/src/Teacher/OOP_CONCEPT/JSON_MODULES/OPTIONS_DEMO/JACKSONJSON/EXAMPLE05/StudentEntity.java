package JAVACORE_TRAINING.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON.EXAMPLE05;

public class StudentEntity {
	private int iRollNo;
	private String sFullName;
	private String sEmail;
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
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	public double getdMark() {
		return dMark;
	}
	public void setdMark(double dMark) {
		this.dMark = dMark;
	}
	
	@Override
	public String toString() {
		return iRollNo +" - "+ sFullName + " - "+ sEmail +" - "+ dMark;
	}
}
