package Teacher.Y2017JC79.MVC_ARRAYS.baitap01;

public class StudentController {
	private StudentModel mModel;

	public StudentController() {
		mModel = new StudentModel();
	}

	public int[] FindIndex(ArrayObjectEntity objEntity) {
		switch (objEntity.getbOption()) {
		case 0:
			objEntity.setdValueMinOrMax(mModel.findMinMark(objEntity));
			break;
		case 1:
			objEntity.setdValueMinOrMax(mModel.findMaxMark(objEntity));
			break;

		}

		return mModel.getIndexArray(objEntity);
	}

}
