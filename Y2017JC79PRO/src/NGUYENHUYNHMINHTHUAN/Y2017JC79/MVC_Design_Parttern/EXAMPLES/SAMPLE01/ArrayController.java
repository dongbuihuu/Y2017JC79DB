package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.EXAMPLES.SAMPLE01;

public class ArrayController {
	private ArrayModel mModel = new ArrayModel();
	
	public double SumOf(ArrayEntity objArrEntity){
		return mModel.SumElements(objArrEntity);
	}
}
