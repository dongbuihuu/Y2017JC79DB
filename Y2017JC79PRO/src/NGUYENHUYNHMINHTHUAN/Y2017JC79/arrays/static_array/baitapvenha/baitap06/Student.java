package Teacher.Y2017JC79.arrays.static_array.baitapvenha.baitap06;

public class Student {
	private String sFullName;
	private double dMarks;

	public Student() {

	}

	public Student(String sFullName, double dMarks) {
		this.sFullName = sFullName;
		this.dMarks = dMarks;
	}

	public double getdMarks() {
		return dMarks;
	}

	public void setdMarks(double dMarks) {
		this.dMarks = dMarks;
	}

	public String getsFullName() {
		return sFullName;
	}

	public void setsFullName(String sFullName) {
		this.sFullName = sFullName;
	}

	@Override
	public String toString() {
		return String.format("- FullName: %s \n- Mark: %s ", this.getsFullName(), this.getdMarks());
	}

}
