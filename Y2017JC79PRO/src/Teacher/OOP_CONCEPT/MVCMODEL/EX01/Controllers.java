package Teacher.OOP_CONCEPT.MVCMODEL.EX01;

public class Controllers {
	private Models mModel;

	public Controllers() {
		mModel = new Models();
	}

	/**
	 * Nghiệp vụ abc - bOpt = 0: Tính tổng - bOpt = 1: Tính Hiệu - bOpt = 2:
	 * Tính Tichs - bOpt = 3: Tính Thuwong
	 * 
	 * @param objCal
	 * 
	 * @return
	 */
	public double Calculators(NumberEntity objCal) {
		double dResult = 0;
		switch (objCal.getbOpt()) {
		case 0:
			dResult = mModel.Add(objCal);
			break;
		case 1:
			dResult = mModel.Sub(objCal);
			break;
		case 2:
			dResult = mModel.Mul(objCal);
			break;
		case 3:
			dResult = mModel.Div(objCal);
			break;
		}
		return dResult;
	}
}
