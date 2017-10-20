package Teacher.Y2017JC79.oops.generics.generictypebounded.DemoSlowBounded;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		super();
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

		return Math.PI * radius * radius;
	}

	@Override
	public double Perimetter() {

		return 2 * Math.PI * radius;
	}
}
