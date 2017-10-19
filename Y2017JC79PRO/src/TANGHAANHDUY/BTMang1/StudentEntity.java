package TANGHAANHDUY.BTMang1;

public class StudentEntity {
	String fullname;
	double mark;
	public StudentEntity() {}
	public StudentEntity(String fullname, double mark) {
		super();
		this.fullname = fullname;
		this.mark = mark;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
}
