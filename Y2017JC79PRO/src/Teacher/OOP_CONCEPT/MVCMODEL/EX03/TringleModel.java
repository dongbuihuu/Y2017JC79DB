package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.MVCMODEL.EX03;

public class TringleModel extends Shape {
	
	@Override
	public double Area(Object obj) {
		TringleEntity objEntity = (TringleEntity) obj;
		return objEntity.getdSide03();
	}

	@Override
	public double Perrimetter(Object obj) {
		TringleEntity objEntity = (TringleEntity) obj;
		return objEntity.getdSide01();
	}
	
	public void ABCD(){
		
	}
}
