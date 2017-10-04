package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.CHUABAITAPVN.BAITAPSO06;

public class ArrayController {
	private ArrayModel mModel;
	public ArrayController() {
		mModel = new ArrayModel();
	}
	
	public int[] FindIndex(ArrayEntity objEntity){		
		switch(objEntity.getbOption()){
			case 0: objEntity.setdValue(mModel.MinElement(objEntity)); break;
			case 1: objEntity.setdValue(mModel.MaxElement(objEntity)); break;
		}
		return mModel.GetIndexElement(objEntity);
	}	
}
