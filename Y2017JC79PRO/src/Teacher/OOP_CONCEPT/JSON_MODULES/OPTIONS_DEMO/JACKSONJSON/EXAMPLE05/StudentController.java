package Teacher.OOP_CONCEPT.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON.EXAMPLE05;

public class StudentController {
	private StudentModel mModel;

	public StudentController() {
		mModel = new StudentModel();
	}

	/***
	 * Nghiệp vụ đọc dữ liệu từ API Service
	 * 
	 * @param ApiServ
	 * @param bOpt
	 *            = 0: Lấy danh sách SV; bOpt = 1: ...
	 * @return
	 */
	public StudentMetaData getDataAPIOf(String ApiServ, byte bOpt) {
		StudentMetaData objResult = null;
		try {
			switch (bOpt) {
			case 0:
				objResult = mModel.GetElements(ApiServ);
				break;
			}
		} catch (Exception ex) {
		}
		return objResult;
	}
}
