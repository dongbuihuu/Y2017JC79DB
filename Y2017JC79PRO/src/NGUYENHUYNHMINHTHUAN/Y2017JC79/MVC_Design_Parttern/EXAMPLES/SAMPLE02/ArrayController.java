package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.EXAMPLES.SAMPLE02;

public class ArrayController {
	private ArrayModel mModel = new ArrayModel();
	
	public double SumOf(ArrayEntity objArrEntity){
		return mModel.SumElements(objArrEntity);
	}	
	
	public double FindMaxMin(ArrayEntity objArrEntity){
		double dValue = 0;
		switch(objArrEntity.getbOption()){
			case 0: dValue = mModel.FindMaxElement(objArrEntity); break;
			case 1: dValue = mModel.FindMinElement(objArrEntity); break;
		}
		return dValue;
	}
	
	public void SortArray(ArrayEntity objArrEntity){
		switch (objArrEntity.getbSortType()) {
				case 0: mModel.BuddySortElement(objArrEntity); break;
				case 1: mModel.InsertionSortElement(objArrEntity); break;
				case 2: mModel.SelectionSortElement(objArrEntity); break;
		}
	}
}
