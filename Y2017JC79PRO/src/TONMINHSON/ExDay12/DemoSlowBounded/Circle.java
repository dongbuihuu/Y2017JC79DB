package TONMINHSON.ExDay12.DemoSlowBounded;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double Area() {
		return Math.PI * Math.pow(this.getRadius(), 2);
	}

	@Override
	public double Perimeter() {
		return 2 * Math.PI * this.getRadius();
	}

}
