package TONMINHSON.ExDay11;

public class Student implements Comparable<Student> {

	private String sFullName;
	private double dMark;

	public Student() {

	}

	public Student(String sFullName, double dMark) {
		this.sFullName = sFullName;
		this.dMark = dMark;
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
		return String.format("Name: %s - Mark: %s", this.getsFullName(), this.getdMark());
	}

	@Override
	public int compareTo(Student other) {
		if (this.getdMark() == other.getdMark())
			return 0;
		else if (this.getdMark() > other.getdMark())
			return 1;
		else
			return -1;
	}

}
