package Teacher.Y2017JC79.oops.abstractions.abstract_class_demo01;

public class Circle extends Geometric {
	private double radius;

	public Circle() {

	}

	public Circle(double radius) {
		setRadius(radius);
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		setColor(color);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {

		return radius * radius * Math.PI;
	}

	@Override
	public double getPerimeter() {

		return 2 * radius * Math.PI;
	}

	// Hàm riêng (không trừu tượng) của lớp Circle
	public void printCircle() {
		System.out.println("Hình tròn được tạo tại ngày " + getDateCreated() + " và có bán kính là " + radius);
	}

}
