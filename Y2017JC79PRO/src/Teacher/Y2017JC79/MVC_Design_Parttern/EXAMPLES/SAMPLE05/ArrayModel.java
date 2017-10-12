package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.EXAMPLES.SAMPLE05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.codehaus.jackson.map.util.Comparators;

public class ArrayModel {

	public double AvarageElements(ArrayEntity objEntity) {
		double dAverage = 0;
		for (Student objStudent : objEntity.lisStudent) {
			dAverage += objStudent.getdMark();
		}
		return dAverage / objEntity.lisStudent.size();
	}

	public List<Student> SortElements(ArrayEntity objEntity) {
		List<Student> lisStudent = new ArrayList<>(objEntity.lisStudent);
		Collections.sort(lisStudent, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getdMark() > o2.getdMark())
					return -1;
				else if (o1.getdMark() == o2.getdMark())
					return 0;
				else
					return 1;
			}
		});
		return lisStudent;
	}

	public List<Student> BuddySortElements(ArrayEntity objEntity) {
		List<Student> lisStudent = new ArrayList<>(objEntity.lisStudent);
		for (int i = 0; i < objEntity.lisStudent.size(); i++) {
			for (int j = i + 1; j <= objEntity.lisStudent.size(); j++) {
				if (lisStudent.get(i).getdMark() > 
										lisStudent.get(j).getdMark()) {
					Student objTemp = lisStudent.get(i);
					lisStudent.set(i, lisStudent.get(j));
					lisStudent.set(j, objTemp);
				}
			}
		}
		return lisStudent;
	}
	
	public int[] GetIndexElements(ArrayEntity objEntity){
		double dValue = 0;
		int[] iTemp = new int[objEntity.lisStudent.size()];
		
		switch(objEntity.bOpt){
			case 0 : dValue = MaxElements(objEntity); break;
			case 1 : dValue = MinElements(objEntity); break;
		}
		int iCounter = 0;
		for(int i = 0;i<objEntity.lisStudent.size();i++){
			if(objEntity.lisStudent.get(i).getdMark() == dValue){
				iTemp[iCounter] = i;
				iCounter++;
			}
		}
		int[] iIndex = new int[iCounter];
		System.arraycopy(iTemp, 0, iIndex, 0, iCounter);
		return iIndex;
	}
	
	double MaxElements(ArrayEntity objEntity){
		double dMax = objEntity.lisStudent.get(0).getdMark();
		for(Student objStudent : objEntity.lisStudent){
			if(dMax < objStudent.getdMark()){
				dMax = objStudent.getdMark();
			}
		}
		return dMax;
	}
	
	double MinElements(ArrayEntity objEntity){
		double dMin = objEntity.lisStudent.get(0).getdMark();
		for(Student objStudent : objEntity.lisStudent){
			if(dMin > objStudent.getdMark()){
				dMin = objStudent.getdMark();
			}
		}
		return dMin;
	}
}
