package JAVACORE_TRAINING.OOP_CONCEPT.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.STATIC_ARRAY.SAMPLES.BAITOAN01;

public class ArrayControllers {
	private ArrayModels mModel;
	public ArrayControllers() {
		mModel = new ArrayModels();
	}
	
	public double SumOf(ArrayEntity objEntity){
		return mModel.SumElements(objEntity);				
	}
}
