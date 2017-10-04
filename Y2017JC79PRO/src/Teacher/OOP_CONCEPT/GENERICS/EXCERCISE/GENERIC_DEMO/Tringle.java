package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.GENERICS.EXCERCISE.GENERIC_DEMO;

class Tringle extends Shape<Tringle> {
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
	public double Area(Tringle objT) {		
		Tringle objTringle = objT;
		return objTringle.dA + objTringle.dB + objTringle.dC;
	}

	@Override
	public double Perrimetter(Tringle objT) {
		return 0;
	}
	

}
