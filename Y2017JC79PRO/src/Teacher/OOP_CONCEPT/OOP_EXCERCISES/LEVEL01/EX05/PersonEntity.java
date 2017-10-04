package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.OOP_EXCERCISES.LEVEL01.EX05;

public class PersonEntity {
	private int iPersonId;
	private String sFullName;
	private short shMarriage;
	private short shSex;
	private int iAge;
	
	public int getiPersonId() {
		return iPersonId;
	}
	public void setiPersonId(int iPersonId) {
		this.iPersonId = iPersonId;
	}
	public String getsFullName() {
		return sFullName;
	}
	public void setsFullName(String sFullName) {
		this.sFullName = sFullName;
	}
	public short getShMarriage() {
		return shMarriage;
	}	
	public void setShMarriage(short shMarriage) {
		this.shMarriage = shMarriage;
	}
	public short getShSex() {
		return shSex;
	}
	public void setShSex(short shSex) {
		this.shSex = shSex;
	}
	public int getiAge() {
		return iAge;
	}
	public void setiAge(int iAge) {
		this.iAge = iAge;
	}
}
