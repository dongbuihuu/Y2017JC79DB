package TONMINHSON.Practice;

public class Lecturer {
	private String sFullName;
	private String sID;
	private String sRate;
	private byte bAge;
	private String sDepartment;

	public Lecturer() {

	}

	public Lecturer(String sFullName, String sID, String sRate, byte bAge, String sDepartment) {
		this.sFullName = sFullName;
		this.sID = sID;
		this.sRate = sRate;
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

	public String getsRate() {
		return sRate;
	}

	public void setsRate(String sRate) {
		this.sRate = sRate;
	}
}
