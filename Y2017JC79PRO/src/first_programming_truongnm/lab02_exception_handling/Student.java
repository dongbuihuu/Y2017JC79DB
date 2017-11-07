package first_programming_truongnm.lab02_exception_handling;

public class Student {
	private int maSV;
	private String hoTen;
	private double diem;
	private String xepLoai;

	public Student() {
		super();
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public String getXepLoai() {

		return xepLoai;
	}

	public void setXepLoai(String xepLoai) {
		this.xepLoai = xepLoai;
	}

	public void setXepLoai() {
		if (diem >= 8)
			xepLoai = "Gioi";
		if (diem < 8 && diem >= 6.5)
			xepLoai = "Kha";
		if (diem < 6.5 && diem >= 5)
			xepLoai = "TB";
		if (diem < 5)
			xepLoai = "Yeu Kem";
	}

	@Override
	public String toString() {

		return String.format("Ten: %s, MSSV: %s, Diem: %s, Xep Loai: %s", hoTen, maSV,
				diem, xepLoai);
	}

}
