package TONMINHSON.GenericsLibJson;

public class EntityStudent {
	private int iID;
	private String sFullName;
	private double dMark;

	public EntityStudent() {

	}

	public EntityStudent(int iID, String sFullName, double dMark) {
		super();
		this.iID = iID;
		this.sFullName = sFullName;
		this.dMark = dMark;
	}

	public int getiID() {
		return iID;
	}

	public void setiID(int iID) {
		this.iID = iID;
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

	public String toString() {
		return String.format("ID: %s. Full name: %s. Mark: %s", this.getiID(), this.getsFullName(), this.getdMark());
	}

}
