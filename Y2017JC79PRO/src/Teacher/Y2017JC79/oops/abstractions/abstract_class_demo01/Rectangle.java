package Teacher.Y2017JC79.oops.abstractions.abstract_class_demo01;

public class Rectangle extends Geometric {
	private double width; // chiều rộng

	private double height; // chiều dài

	public Rectangle() {

	}

	public Rectangle(double width, double height, String color) {
		this.width = width;
		this.height = height;
		setColor(color);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {

		return width * height;
	}

	@Override
	public double getPerimeter() {

		return 2 * (width + height);
	}
}
