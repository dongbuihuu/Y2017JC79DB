package JAVACORE_TRAINING.OBJECT_AND_CLASSES.GENERICS.EXCERCISE.GENERIC_DEMO;

class Rectange extends Shape<Rectange> {
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
	public double Area(Rectange objT) {
		return objT.dA + objT.dB;
	}

	@Override
	public double Perrimetter(Rectange objT) {
		return 0;
	}
	
	
}
