package Teacher.Y2017JC79.oops.abstractions.abstract_class_demo01;

/*
 * Desc: Demo the abstract class
 * author: Bui Huu Dong
 * date: none
 * */

abstract class Geometric {
	private String color = "white";
	private java.util.Date dateCreated;

	protected Geometric() {
		dateCreated = new java.util.Date();
	}

	protected Geometric(String color) {
		dateCreated = new java.util.Date();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	// Định nghĩa phương thức trừu tượng
	public abstract double getArea(); // Tính diện tích

	// Định nghĩa phương thức trừu tượng => chu vi
	public abstract double getPerimeter();
}
