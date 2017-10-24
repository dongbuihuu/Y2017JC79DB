package Teacher.Y2017JC79.oops.abstractions.abstract_class_demo01;

import java.util.Date;

/*
 * Desc: Demo the abstract class
 * author: Bui Huu Dong
 * date: none
 * */

abstract class Geometric {
	private String color;
	private Date dateCreated;

	protected Geometric() {
		dateCreated = new Date();
		this.color = "white";
	}

	protected Geometric(String color) {
		dateCreated = new Date();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	// Định nghĩa phương thức trừu tượng
	public abstract double getArea(); // Tính diện tích

	// Định nghĩa phương thức trừu tượng => chu vi
	public abstract double getPerimeter();
}
