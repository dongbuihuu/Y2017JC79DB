package Teacher.Y2017JC79.MVC_ARRAYS.baitap01;

public class ArrayObjectEntity {

	private StudentEntity[] objStudent; // HAS-A. ADT- Kieu du lieu truu tuong
	private double dValueMinOrMax; // Chua gia tri Min hoac Max diem cua cac sinh vien
	private byte bOption; // 0: tim min, 1: tim Max

	public void setObjStudent(StudentEntity[] objStudent) {
		this.objStudent = objStudent;
	}

	public StudentEntity[] getObjStudent() {
		return objStudent;
	}

	public double getdValueMinOrMax() {
		return dValueMinOrMax;
	}

	public void setdValueMinOrMax(double dValueMinOrMax) {
		this.dValueMinOrMax = dValueMinOrMax;
	}

	public byte getbOption() {
		return bOption;
	}

	public void setbOption(byte bOption) {
		this.bOption = bOption;
	}

}
