package NGUYENHUYNHMINHTHUAN.Y2017JC79.Json_module.Excercise_Json.BaiLam;

public class EntityStudent {
	private int MSSV;
	private String sFullName;
	private String sEmail;
	private String sPhoneNumber;
	private double dMark;

	public EntityStudent() {
	}

	public EntityStudent(int mSSV, String sFullName, String sEmail, String sPhoneNumber, double dMark) {
		super();
		MSSV = mSSV;
		this.sFullName = sFullName;
		this.sEmail = sEmail;
		this.sPhoneNumber = sPhoneNumber;
		this.dMark = dMark;
	}

	public int getMSSV() {
		return MSSV;
	}

	public void setMSSV(int mSSV) {
		MSSV = mSSV;
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

	public String getsPhoneNumber() {
		return sPhoneNumber;
	}

	public void setsPhoneNumber(String sPhoneNumber) {
		this.sPhoneNumber = sPhoneNumber;
	}

	public double getdMark() {
		return dMark;
	}

	public void setdMark(double dMark) {
		this.dMark = dMark;
	}

}
