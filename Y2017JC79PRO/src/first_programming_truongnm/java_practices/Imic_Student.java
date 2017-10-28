package first_programming_truongnm.java_practices;

import java.util.Comparator;

public class Imic_Student implements Comparator<Imic_Student> {

	private String sName;
	private double dMark;

	public Imic_Student(String sName, double dMark) {
		super();
		this.sName = sName;
		this.dMark = dMark;
	}

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
	public String toString() {
		return "Name: " + sName + " - Mark: " + dMark;
	}

	@Override
	public int compare(Imic_Student o1, Imic_Student o2) {
		if (o1.getdMark() > o2.getdMark())
			return 1;
		if (o1.getdMark() == o2.getdMark())
			return 0;
		if (o1.getdMark() < o2.getdMark())
			return -1;
		return 0;

	}

}
