package TONMINHSON.Practice.Demo;

public class Persons {
	private String sFullName;
	private String sID;
	private byte bAge;
	private String sDepartment;

	public Persons() {

	}

	public Persons(String sFullName, String sID, byte bAge, String sDepartment) {
		this.sFullName = sFullName;
		this.sID = sID;
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

}
