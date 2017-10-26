package Teacher.Y2017JC79.XML_module.XML_Demo.Demo_XML_NoLib.Demo_CreateXMLFile_NoLib;

public class Student {
	private int Id;
	private String RollNo;
	private String FullName;
	private double Mark;

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

	@Override
	public String toString() {
		return String.format("- Id: %s; RollNo: %s; FullName: %s; Mark: %s", Id, RollNo, FullName, Mark);
	}
}
