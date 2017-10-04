package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.GENERICS.SAMPLE01;

public class GEOController {
	private GEOModel mModel;

	public GEOController() {
		mModel = new GEOModel();
	}

	/***
	 * Nghiệp vụ tính diện tích hoặc chu vi
	 * 
	 * @param obj
	 * @param bTyper = 0: Tam giác; bTyper = 1: Bát giác;
	 * @param bOpt
	 *            = 0: Tính diện tích & bOpt = 1: Tính chu vi
	 * @return
	 */
	public double ExecuteOf(Object obj, byte bTyper, byte bOpt) {
		double dResult = 0;
		switch (bOpt) {
				case 0: dResult = mModel.Area(obj, bOpt); break;
				case 1:  dResult = mModel.Perrimeter(obj, bOpt); break;
		}
		return dResult;
	}

}
