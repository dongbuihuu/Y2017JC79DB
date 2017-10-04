package JAVACORE_TRAINING.OBJECT_AND_CLASSES.GENERICS.EXCERCISE.ABSTRACT_DEMO;

public class Tringle extends Shape {
	private double dA;
	private double dB;
	private double dC;	
	
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

	public double getdC() {
		return dC;
	}

	public void setdC(double dC) {
		this.dC = dC;
	}

	@Override
	public double Area(Object obj) {		
		Tringle objTringle = (Tringle)obj;
		return objTringle.dA + objTringle.dB + objTringle.dC;
	}

	@Override
	public double Perrimetter(Object obj) {
		return 0;
	}

}
