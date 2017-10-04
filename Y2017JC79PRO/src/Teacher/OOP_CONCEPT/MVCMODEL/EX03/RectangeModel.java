package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.MVCMODEL.EX03;

public class RectangeModel extends Shape {

	@Override
	public double Area(Object obj) {
		RectangeEntity objEntity = (RectangeEntity) obj;
		return objEntity.getdWidth()*objEntity.getdHeight();
	}

	@Override
	public double Perrimetter(Object obj) {
		RectangeEntity objEntity = (RectangeEntity) obj;
		return 2*(objEntity.getdHeight() + objEntity.getdWidth());
	}
	
}
