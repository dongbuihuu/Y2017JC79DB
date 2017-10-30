package TONMINHSON.ExDay12.DemoSlowBounded;

public class Rectangle extends Shape {
	private double height;
	private double width;

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double Area() {
		return this.getHeight() * this.getWidth();
	}

	@Override
	public double Perimeter() {
		return (this.getHeight() + this.getWidth()) * 2;
	}

	public String toString() {
		return String.format("Height: %s, Width: %s", this.getHeight(), this.getWidth());
	}

}
