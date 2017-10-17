package Teacher.Y2017JC79.oops.generics.generictypebounded;

public class Triangle extends Shape {
	private double radius;

	public Triangle(double radius) {
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
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	public double Perimetter() {

		return 2 * Math.PI * radius;
	}

}
