package student;

public class StudentEntity {
	private String sFullname;
	private double dMark;
	
	public StudentEntity(){
		
	}
	public StudentEntity(String sFullname, double dMark) {
		super();
		this.sFullname = sFullname;
		this.dMark = dMark;
	}
	public String getsFullname() {
		return sFullname;
	}
	public void setsFullname(String sFullname) {
		this.sFullname = sFullname;
	}
	public double getdMark() {
		return dMark;
	}
	public void setdMark(double dMark) {
		this.dMark = dMark;
	}
	
	

}
