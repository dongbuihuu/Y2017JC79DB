package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.MVCMODEL.EX03;

public abstract class Shape {
	private boolean isValue;
	public Shape(){
		isValue = true;
	}
	public Shape(boolean isValue){
		this.isValue = isValue;
	}	
	abstract public double Area(Object obj);
	public abstract double Perrimetter(Object obj);	
	public void PrintInfo(){}
}
