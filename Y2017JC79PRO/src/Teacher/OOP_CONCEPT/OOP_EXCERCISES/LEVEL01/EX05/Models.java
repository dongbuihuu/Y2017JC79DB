package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.OOP_EXCERCISES.LEVEL01.EX05;

public class Models {
	/***
	 * Nghiệp vụ kiểm tra tính hợp lệ của hồ sơ
	 * @param objParams
	 * @return
	 */
	public boolean CheckElement(Params objParams){				
		return (objParams.getObjPerson().getiAge() < 
								objParams.getTuoiNu() || 
								objParams.getObjPerson().getShMarriage() 
										== objParams.TTHonNhan 
				               || (objParams.getObjPerson().getiAge() < 
				            		   		objParams.getTuoiNam()  
				            		      && objParams.getObjPerson().getShSex() 
				            		      			== objParams.GTGioiHan)) ? false : true;
	}
}
