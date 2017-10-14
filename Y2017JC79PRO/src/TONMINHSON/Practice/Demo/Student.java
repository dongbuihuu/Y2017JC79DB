package TONMINHSON.Practice.Demo;

public class Student extends Persons {
	private double dMark;
	private double dHocBong;

	public double getdMark() {
		return dMark;
	}

	public void setdMark(double dMark) {
		this.dMark = dMark;
	}

	@Override
	public String toString() {

		return "Full name: " + this.getsFullName() + ", ID: " + this.getsID() + ", Age: " + this.getbAge() + ", Mark: "
				+ this.getdMark() + ", Department: " + this.getsDepartment();
	}

	public double getdHocBong() {
		return dHocBong;
	}

	public void setdHocBong(double dHocBong) {
		this.dHocBong = dHocBong;
	}
}
