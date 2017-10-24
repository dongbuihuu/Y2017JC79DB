package Teacher.Y2017JC79.oops.abstractions.abs_class_method;

public class RectangeModel extends Shape {

	@Override
	public double Area(Object obj) {
		RectangeEntity objEntity = (RectangeEntity) obj;
		return objEntity.getdHeight()*objEntity.getdWidth();
	}

	@Override
	public double Perrimetter(Object obj) {
		RectangeEntity objEntity = (RectangeEntity) obj;
		return (objEntity.getdHeight()+objEntity.getdWidth())*2;
	}

}
