package Teacher.Y2017JC79.oops.generics.generic_class;

public class Student {
	private String sFullName;
	private double dMark;

	public Student() {

	}

	public Student(String sFullName, double dMark) {
		super();
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

	@Override
	public String toString() {

		return String.format("Full Name: %s - Mark: %s", this.getsFullName(), this.getdMark());
	}

}
