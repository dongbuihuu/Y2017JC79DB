package PHAMTHANHDAT.demo;

public class SinhVien {
	private String sName;
	private double dMark;

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public double getdMark() {
		return dMark;
	}

	public void setdMark(double dMark) {
		this.dMark = dMark;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format(sName + "/t" + dMark);
	}
}
