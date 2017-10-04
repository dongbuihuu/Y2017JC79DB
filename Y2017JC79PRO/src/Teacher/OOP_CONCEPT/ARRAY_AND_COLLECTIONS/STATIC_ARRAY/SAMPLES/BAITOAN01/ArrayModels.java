package JAVACORE_TRAINING.OOP_CONCEPT.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.STATIC_ARRAY.SAMPLES.BAITOAN01;

public class ArrayModels {
	/***
	 * Nghiệp vụ tính tổng các phần tử trong mảng
	 * @param objEntity: Đối tượng chứa thuộc tính là 1 biến mảng kiểu double
	 * @return 
	 */
	public double SumElements(ArrayEntity objEntity){
		double dTotal = 0;
		for(double dValue : objEntity.dArr){
			dTotal += dValue;
		}
		return dTotal;
	}
}
