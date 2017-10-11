package Teacher.Y2017JC79.MVC_Design_Parttern.Sample02;

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

	public void ABCD() {

	}
}
