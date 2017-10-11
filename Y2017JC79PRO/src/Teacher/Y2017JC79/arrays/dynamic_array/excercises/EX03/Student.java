package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAY.EXCERCISES.EX03;

public class Student {
	private int iRollNo;
	private String sFullName;
	private double dMark;
	
	public Student(int iRollNo, String sFullName, double dMark) {		
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
		return iRollNo +"-"+sFullName +"-"+ dMark;
	}
}
