package first_programming_truongnm.generics;

public class Student implements Comparable<Student> {

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
	public int compareTo(Student o) {
		if (this.getdMark() > o.getdMark())
			return 1;
		else if (this.getdMark() < o.getdMark())
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return String.format("Name: %s - Mark: %s", this.getsName(), this.getdMark());
	}

}
