package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.EXAMPLES.SAMPLE01;

public class ArrayModel {
	/***
	 * Nghiệp vụ tính tổng các phần tử trong mảng
	 * @param objArr
	 * @return
	 */
	public double SumElements(ArrayEntity objArr){
		double dTotal = 0;
		for(double dValue : objArr.getdArr()){
			dTotal += dValue;
		}
		return dTotal;
	}
}
