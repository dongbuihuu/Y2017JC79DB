package Teacher.Y2017JC79.arrays.dynamic_array.collectionframework.TheComparableAndIterableInterface.Comparable;

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

	@Override
	public String toString() {
		return String.format("FullName: %s - Mark: %s", this.sFullName, this.dMark);
	}

	@Override
	public int compareTo(Student o) {
		// So sánh về điểm của sinh viên
		if (this.getdMark() > o.getdMark()) {
			return 1;
		} else if (this.getdMark() == o.getdMark()) {
			return 0;
		} else
			return -1;

	}

}
