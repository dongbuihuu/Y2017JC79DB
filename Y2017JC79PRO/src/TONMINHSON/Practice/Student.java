package TONMINHSON.Practice;

public class Student {
	private String sFullName;
	private String sID;
	private double dMark;
	private byte bAge;
	private String sDepartment;

	public Student() {

	}

	public Student(String sFullName, String sID, double dMark, byte bAge, String sDepartment) {
		this.sFullName = sFullName;
		this.sID = sID;
		this.dMark = dMark;
		this.bAge = bAge;
		this.sDepartment = sDepartment;
	}

	public byte getbAge() {
		return bAge;
	}

	public void setbAge(byte bAge) {
		this.bAge = bAge;
	}

	public String getsDepartment() {
		return sDepartment;
	}

	public void setsDepartment(String sDepartment) {
		this.sDepartment = sDepartment;
	}

	public String getsFullName() {
		return sFullName;
	}

	public void setsFullName(String sFullName) {
		this.sFullName = sFullName;
	}

	public String getsID() {
		return sID;
	}

	public void setsID(String sID) {
		this.sID = sID;
	}

	public double getdMark() {
		return dMark;
	}

	public void setdMark(double dMark) {
		this.dMark = dMark;
	}
}
