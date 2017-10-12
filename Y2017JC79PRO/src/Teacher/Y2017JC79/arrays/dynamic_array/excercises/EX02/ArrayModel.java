package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAY.EXCERCISES.EX02;

public class ArrayModel {
	/***
	 * nghiệp vụ tính tổng điểm của Sinh Viên
	 * @param objEntity
	 * @return
	 */
	public double SumElements(ArrayEntity objEntity){
		double dTotal = 0;
		for(int i = 0; i<objEntity.getLiLisStudent().size();i++)
			for(int j = 0;j<objEntity.getLiLisStudent().get(i).size();j++){
				dTotal += objEntity.getLiLisStudent().get(i).get(j).getdMark();
			}
		return dTotal;
	}
}
