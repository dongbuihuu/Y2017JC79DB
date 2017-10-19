package TANGHAANHDUY.GenericExample.Demo;

public class SinhVien {
private String sname;
private double dMark;

public String toString() {
	return String.format(getSname(), getdMark());
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public double getdMark() {
	return dMark;
}

public void setdMark(double dMark) {
	this.dMark = dMark;
}
}
