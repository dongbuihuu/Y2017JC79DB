package Teacher.Y2017JC79.oops.abstractions.abs_class_method;

public abstract  class Shape {
	
	private boolean isValue;

	public Shape() {
		isValue = true;
	}
   
	public Shape(TringleEntity obj) {
		
	}
	
	public Shape(boolean isValue) {
		this.isValue = isValue;
	}

	public abstract double Area(Object obj);

	public abstract double Perrimetter(Object obj);

	public void PrintInfo() {
	}
}
