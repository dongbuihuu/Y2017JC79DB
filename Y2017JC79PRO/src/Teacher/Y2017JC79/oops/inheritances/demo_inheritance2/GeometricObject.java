package Teacher.Y2017JC79.oops.inheritances.demo_inheritance2;

import java.util.Date;

public class GeometricObject {
	// 1. Định nghĩa data fields
	private String color = "black";
	private boolean filled;
	private Date dateCreated;

	// 2. Khai báo contructor để khởi tạo đối tượng
	public GeometricObject() {
		dateCreated = new Date();
	}

	public GeometricObject(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public GeometricObject(String color, boolean filled) {
		dateCreated = new Date();
		this.color = color;

	}

}
