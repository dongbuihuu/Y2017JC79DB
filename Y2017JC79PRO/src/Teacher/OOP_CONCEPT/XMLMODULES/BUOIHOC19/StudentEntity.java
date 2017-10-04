package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.XMLMODULES.BUOIHOC19;

public class StudentEntity {
	private int Id;
	private String RollNo;
	private String FullName;
	private double Mark;
	private Classes objClasses;	
	
	public Classes getObjClasses() {
		return objClasses;
	}
	public void setObjClasses(Classes objClasses) {
		this.objClasses = objClasses;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getRollNo() {
		return RollNo;
	}
	public void setRollNo(String rollNo) {
		RollNo = rollNo;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public double getMark() {
		return Mark;
	}
	public void setMark(double mark) {
		Mark = mark;
	}
}
