package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAY.EXCERCISES.EX03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
	
	public ArrayEntity SortElements(ArrayEntity objEntity){
		ArrayEntity objArrEntity = new ArrayEntity();		
		List<Student> lisStudent = new 
							ArrayList<>(objEntity.getLisStudent());		
		
		Collections.sort(lisStudent, new Comparator<Student>() {
			@Override
			public int compare(Student objS01, Student objS02) {
				if(objS01.getdMark() < objS02.getdMark()){
					return 1;
				}else if(objS01.getdMark() > objS02.getdMark()){
					return -1;
				}else  return 0;
			}
		});
		objArrEntity.setLisStudent(lisStudent);
		return objArrEntity;
	}
}
