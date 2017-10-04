package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.OOP_EXCERCISES.LEVEL01.EX01;

public class Models {
	
	public double Add(NumberEntity objCal){
		return objCal.getdNumA() + objCal.getdNumB();
	}
	
	public double Sub(NumberEntity objCal){
		return objCal.getdNumA() - objCal.getdNumB();
	}
	
	public double Mul(NumberEntity objCal){
		return objCal.getdNumA() * objCal.getdNumB();
	}
	
	public double Div(NumberEntity objCal){
		return objCal.getdNumA() / objCal.getdNumB();
	}
	
}
