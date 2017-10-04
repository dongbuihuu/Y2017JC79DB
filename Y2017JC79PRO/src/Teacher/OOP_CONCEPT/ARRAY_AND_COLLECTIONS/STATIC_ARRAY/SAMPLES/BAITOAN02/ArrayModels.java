package JAVACORE_TRAINING.OOP_CONCEPT.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.STATIC_ARRAY.SAMPLES.BAITOAN02;

public class ArrayModels {
	/***
	 * Nghiệp vụ tính tổng các phần tử trong mảng
	 * @param objEntity: Đối tượng chứa thuộc tính là 1 biến mảng kiểu double
	 * @return 
	 */
	public double SumElements(ArrayEntity objEntity){
		double dTotal = 0;
		for(double dValue : objEntity.getdArr()){
			dTotal += dValue;
		}
		return dTotal;
	}
		
	public double MaxElement(ArrayEntity objEntity){
		double dMax = objEntity.getdArr()[0];
		for(int i = 1;i<objEntity.getdArr().length;i++){			
			if(dMax < objEntity.getdArr()[i]){
				dMax = objEntity.getdArr()[i];
			}
		}
		return dMax;
	}
	
	public double MinElement(ArrayEntity objEntity){
		double dMin = objEntity.getdArr()[0];
		for(int i = 1;i<objEntity.getdArr().length;i++){			
			if(dMin > objEntity.getdArr()[i]){
				dMin = objEntity.getdArr()[i];
			}
		}
		return dMin;
	}
}
