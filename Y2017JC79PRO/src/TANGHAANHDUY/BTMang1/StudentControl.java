package TANGHAANHDUY.BTMang1;

import Teacher.OOP_CONCEPT.MVCMODEL.EX01.Models;
import Teacher.OOP_CONCEPT.MVCMODEL.EX01.NumberEntity;

public class StudentControl {
	private StudentModel mModel;
	
	public StudentControl() {
		mModel = new StudentModel();
	}
	
	public int[] StudentName(ArrayObjectEntity objCal){
		//String name = "";
		
		switch (objCal.getBoption()) {
			case 0: objCal.setMinormax( mModel.FindMin(objCal));  break;
			case 1: objCal.setMinormax( mModel.FindMax(objCal));  break;
		} return mModel.getIndexArray(objCal);
	}
}
