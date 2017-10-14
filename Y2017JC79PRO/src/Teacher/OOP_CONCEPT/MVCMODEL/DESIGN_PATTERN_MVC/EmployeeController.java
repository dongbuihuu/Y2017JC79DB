package Teacher.OOP_CONCEPT.MVCMODEL.DESIGN_PATTERN_MVC;

import java.util.List;

//Bước 3
public class EmployeeController {
	private EmployeeModel mEmpModel;

	public EmployeeController() {
		mEmpModel = new EmployeeModel();
	}

	public List<EmployeeEntity> getEmployeeAll() {
		return mEmpModel.GetElements();
	}

	public boolean insertEmployee(EmployeeEntity objEntity) {
		return mEmpModel.InsertElement(objEntity);
	}
}
