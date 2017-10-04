package JAVACORE_TRAINING.OOP_CONCEPT.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.STATIC_ARRAY.EXCERCISE;

public class StudentModel {
	
	public void BuddySort(cStudentEntity[] arrStudent) {
		for (int i = 0; i < arrStudent.length; i++) {
			for (int j = i + 1; j <= arrStudent.length - 1; j++) {
				if (arrStudent[i].getdMark() > arrStudent[j].getdMark()) {
					cStudentEntity objTemp = arrStudent[i];
					arrStudent[i] = arrStudent[j];
					arrStudent[j] = objTemp;
				}
			}
		}
	}
	
	public void InsertionSort(cStudentEntity[] arrStudent){
		for (int i = 1; i < arrStudent.length; i++) {	       
	        cStudentEntity objCurrent = arrStudent[i];
	        int k;
	        for (k = i - 1; k >= 0 && 
	        				arrStudent[k].getdMark() > objCurrent.getdMark(); k--) {
	        	arrStudent[k + 1] = arrStudent[k];
	       }
	       // Insert the current element into list[k+1]
	        arrStudent[k + 1] = objCurrent;
	     }
	}
	
	public void SelectionSort(cStudentEntity[] arrStudent){
		for (int i = arrStudent.length - 1; i >= 1; i--){
	         // Find the maximum in the list[0..i]
	         cStudentEntity objCurrentMax = arrStudent[0];
	         int currentMaxIndex = 0;
	         {for (int j = 1; j <= i; j++) {
	          if (objCurrentMax.getdMark() < arrStudent[j].getdMark()) {
	        	  objCurrentMax = arrStudent[j];
	            currentMaxIndex = j;
	           }
	         } 
	         // Swap list[i] with list[currentMaxIndex] if necessary;
	         if (currentMaxIndex != i) {
	        	 arrStudent[currentMaxIndex] = arrStudent[i];
	        	 arrStudent[i] = objCurrentMax;
	         }
	       }
	    }
	}
}
