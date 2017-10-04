package JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.DEMO28042017.MOD05;

public class Student {
	private int RollNo;
	private String FullName;
	private double Mark;
	
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public double getMark() {
		return Mark;
	}
	public void setMark(double mark) {
		Mark = mark;
	}
	@Override
	public String toString() {
		return RollNo +" - "+ FullName;
	}
}
