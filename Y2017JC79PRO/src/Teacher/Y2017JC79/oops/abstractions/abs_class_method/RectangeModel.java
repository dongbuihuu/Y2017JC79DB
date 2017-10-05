package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ABSTRACTIONS.ABS_CLASS_METHOD;

public class RectangeModel extends Shape {

	@Override
	public double Area(Object obj) {
		RectangeEntity objEntity = (RectangeEntity) obj;
		return objEntity.getdWidth();
	}

	@Override
	public double Perrimetter(Object obj) {
		RectangeEntity objEntity = (RectangeEntity) obj;
		return objEntity.getdHeight()*objEntity.getdWidth();
	}

}
