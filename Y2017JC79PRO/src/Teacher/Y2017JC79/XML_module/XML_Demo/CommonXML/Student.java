package Teacher.Y2017JC79.XML_module.XML_Demo.CommonXML;

public class Student {
	private int ID;
	private String FullName;
	private double Mark;

	public Student() {
	}

	public Student(int ID, String FullName, double Mark) {

		this.ID = ID;
		this.FullName = FullName;
		this.Mark = Mark;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String FullName) {
		this.FullName = FullName;
	}

	public double getMark() {
		return Mark;
	}

	public void setMark(double Mark) {
		this.Mark = Mark;
	}

	@Override
	public String toString() {

		return String.format("ID: %s. FullName: %s. dMark: %s", this.getID(), this.getFullName(), this.getMark());
	}
}
