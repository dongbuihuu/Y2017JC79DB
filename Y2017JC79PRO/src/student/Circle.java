package student;

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
		
		return Math.PI*radius*radius;
	}

	@Override
	public double Perimeter() {
		
		return 2*Math.PI*radius;
	}

	
}
