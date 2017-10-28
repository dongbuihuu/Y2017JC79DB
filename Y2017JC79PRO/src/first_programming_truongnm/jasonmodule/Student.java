package first_programming_truongnm.jasonmodule;

public class Student {
	private int RollNo;
	private String Fullname;
	private double Mark;

	public Student(int rollNo, String fullname, double mark) {
		super();
		RollNo = rollNo;
		Fullname = fullname;
		Mark = mark;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getFullname() {
		return Fullname;
	}

	public void setFullname(String fullname) {
		Fullname = fullname;
	}

	public double getMark() {
		return Mark;
	}

	public void setMark(double mark) {
		Mark = mark;
	}

}
