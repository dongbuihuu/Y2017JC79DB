package Teacher.Y2017JC79.arrays.dynamic_array.collectionframework.TheComparableAndIterable.AfterCompare;

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
		super();
		this.sName = sName;
		this.dMark = dMark;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Ho ten: %s - Diem: %s", this.getsName(), this.getdMark());
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
