package Teacher.Y2017JC79.oops.generics.generic_class.demo;

public class SinhVien {
	private String sName;
	private double dMark;

	public SinhVien(String sName, double dMark) {
		super();
		this.sName = sName;
		this.dMark = dMark;
	}

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
		return String.format("Ho Ten: %s - Diem: %s", this.getsName(), this.getdMark());
	}
}
