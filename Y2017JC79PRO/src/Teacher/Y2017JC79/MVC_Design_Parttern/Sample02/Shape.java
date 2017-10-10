package Teacher.Y2017JC79.MVC_Design_Parttern.Sample02;

public abstract class Shape {
	private boolean isValue;

	public Shape() {
		isValue = true;
	}

	public Shape(boolean isValue) {
		this.isValue = isValue;
	}

	abstract public double Area(Object obj);

	public abstract double Perrimetter(Object obj);

	public void PrintInfo() {
	}
}
