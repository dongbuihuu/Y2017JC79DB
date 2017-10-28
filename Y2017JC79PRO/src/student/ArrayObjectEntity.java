package student;

public class ArrayObjectEntity {
	private StudentEntity[] objStudent; //HAS - A. Abstract data type: Kieu du lieu truu tuong
	private double dValueMinOrMax; //Chu gia tri Min or Max diem cua cac sinh vien
	private byte bOption;
	
	public StudentEntity[] getObjStudent() {
		return objStudent;
	}
	public void setObjStudent(StudentEntity[] objStudent) {
		this.objStudent = objStudent;
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
