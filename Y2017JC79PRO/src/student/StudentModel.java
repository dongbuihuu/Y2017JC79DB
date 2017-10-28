package student;

public class StudentModel {
	
	//1. Find Min values of Student's Mark
	
	public double FindMinMark(ArrayObjectEntity objEntity) {     
		StudentEntity[] obj = objEntity.getObjStudent();
		double dMin = obj[0].getdMark();
		
		
		for (int i = 1; i < objEntity.getObjStudent().length; i++) {
			
			if (obj[i].getdMark() < dMin) {
				
				dMin = obj[i].getdMark();
				
			}
		}
		return dMin;
	}
	for (int i = 1; i < objEntity.getObjStudent().length; i++) {
		
		if (obj[i].getdMark() < dMin) {
			
			dMin = obj[i].getdMark();
			
		}
	}
	return dMin;
}
	
}
