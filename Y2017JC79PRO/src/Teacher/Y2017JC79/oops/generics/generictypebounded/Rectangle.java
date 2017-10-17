package Teacher.Y2017JC79.oops.generics.generictypebounded;

public class Rectangle extends Shape {
	private double height;
	private double width;

	public Rectangle(double height, double width) {
		super();
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
	public double Perimetter() {
		// TODO Auto-generated method stub
		return 2 * (this.getHeight() + this.getWidth());
	}

}
