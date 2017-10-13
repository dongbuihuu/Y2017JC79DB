package Teacher.Y2017JC79.MVC_ARRAYS.baitap01;

public class StudentEntity {
	private String sFullName;
	private double dMark;

	public StudentEntity() {

	}

	public StudentEntity(String sFullName, double dMark) {
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

}
