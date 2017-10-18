package PHAMTHANHDAT.AfterCompare;

import java.util.Comparator;

public class Student implements Comparator<Student> {
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

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String sName, double dMark) {
		super();
		this.sName = sName;
		this.dMark = dMark;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%10s%10.2f", sName, dMark);
	}

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getdMark() == o2.getdMark())
			return 0;
		else if (o1.getdMark() > o2.getdMark())
			return 1;
		else
			return -1;
	}
}
