package TONMINHSON.Student;

public class ArrayObjectEntity {
	private StudentEntity[] objStudent;
	private double dValueMinOrMax; // store min or max value
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
