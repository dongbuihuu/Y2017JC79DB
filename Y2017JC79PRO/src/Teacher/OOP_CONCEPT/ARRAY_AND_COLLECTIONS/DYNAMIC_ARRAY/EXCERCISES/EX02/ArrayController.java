package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAY.EXCERCISES.EX02;

public class ArrayController {
	private ArrayModel mModel;
	public ArrayController() {
		mModel = new ArrayModel();
	}
	
	public double Sum(ArrayEntity objEntity){
		return mModel.SumElements(objEntity);
	}
}
