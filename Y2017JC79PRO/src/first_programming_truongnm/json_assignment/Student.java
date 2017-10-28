package first_programming_truongnm.json_assignment;

public class Student {
	private String sName;
	private int iID;
	private String sEmail;
	private int iPhoneNumber;
	private int iMark;

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getiID() {
		return iID;
	}

	public void setiID(int iID) {
		this.iID = iID;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public int getiPhoneNumber() {
		return iPhoneNumber;
	}

	public void setiPhoneNumber(int iPhoneNumber) {
		this.iPhoneNumber = iPhoneNumber;
	}

	public int getiMark() {
		return iMark;
	}

	public void setiMark(int iMark) {
		this.iMark = iMark;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format(
				"Name: %s, Student ID: %s, Student's Mark: %s, Student's Email: %s, Student's Phone.No: %s, ",
				getsName(), getiID(), getiMark(), getsEmail(), getiPhoneNumber());
	}
}
