package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ABSTRACTIONS.ABS_CLASS_METHOD;

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
