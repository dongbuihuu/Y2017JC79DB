package Teacher.Y2017JC79.oops.generics.Excercise01.chuabaitapGeneric;

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

	public Student(String sName, double dMark) {

		this.sName = sName;
		this.dMark = dMark;
	}

	@Override
	public int compareTo(Student o) {
		if (this.getdMark() > o.getdMark())
			return 1;
		else if (this.getdMark() == o.getdMark())
			return 0;
		else
			return -1;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Name: %s - Diem: %s", this.getsName(), this.getdMark());
	}

}
