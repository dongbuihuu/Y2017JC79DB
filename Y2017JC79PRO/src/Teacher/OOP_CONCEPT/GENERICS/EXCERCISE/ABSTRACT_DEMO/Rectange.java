package JAVACORE_TRAINING.OBJECT_AND_CLASSES.GENERICS.EXCERCISE.ABSTRACT_DEMO;

public class Rectange extends Shape {
	private double dA;
	private double dB;

	
	public double getdA() {
		return dA;
	}

	public void setdA(double dA) {
		this.dA = dA;
	}

	public double getdB() {
		return dB;
	}

	public void setdB(double dB) {
		this.dB = dB;
	}

	@Override
	public double Area(Object obj) {
		Rectange objrec = (Rectange)obj;
		return objrec.dA + objrec.dB;
	}

	@Override
	public double Perrimetter(Object obj) {
		return 0;
	}
	
}
