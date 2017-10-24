package Teacher.Y2017JC79.oops.abstractions.abs_class_method;

public class TringleModel extends Shape {

	@Override
	public double Area(Object obj) {
		TringleEntity objEntity = (TringleEntity) obj;
		double halfOfPerimeter = this.Perrimetter(obj) / 2;
		return Math.sqrt(halfOfPerimeter * (halfOfPerimeter - objEntity.getdSide01())
				* (halfOfPerimeter - objEntity.getdSide02()) * (halfOfPerimeter - objEntity.getdSide03()));
	}

	@Override
	public double Perrimetter(Object obj) {
		TringleEntity objEntity = (TringleEntity) obj;
		return objEntity.getdSide01() + objEntity.getdSide02() + objEntity.getdSide03();
	}

}
