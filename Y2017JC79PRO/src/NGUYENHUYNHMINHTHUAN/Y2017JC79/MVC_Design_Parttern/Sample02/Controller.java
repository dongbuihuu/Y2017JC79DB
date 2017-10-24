package Teacher.Y2017JC79.MVC_Design_Parttern.Sample02;

public class Controller {
	private Shape mShape; // HAS-A (IS-A)

	/***
	 * bObjectType = 0: Tam giác; bObjectType = 1: Hình chữ nhật
	 * 
	 * @param bObjectType
	 */
	public Controller(byte bObjectType) {
		switch (bObjectType) {
		case 0:
			mShape = new TringleModel();
			break;
		case 1:
			mShape = new RectangeModel();
			break;
		}
	}

	public double ExecOf(Object obj, byte bOpt) {
		return (bOpt == 0) ? mShape.Area(obj) : mShape.Perrimetter(obj);
	}
}
