package Teacher.Y2017JC79.oops.generics.generictypebounded.DemoSlowBounded;

public class Rectangle extends Shape {
	private double height; // Chieu cao
	private double width; // Chieu rong

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

		return 2 * (this.getHeight() + this.getWidth());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Height: %s - Width: %s", this.getHeight(), this.getWidth());

	}

}
