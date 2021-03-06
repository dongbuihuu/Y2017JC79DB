package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.EXAMPLES.SAMPLE02;

public class ArrayModel {
	/***
	 * Nghiệp vụ tính tổng các phần tử trong mảng
	 * 
	 * @param objArr
	 * @return
	 */
	public double SumElements(ArrayEntity objArr) {
		double dTotal = 0;
		for (double dValue : objArr.getdArr()) {
			dTotal += dValue;
		}
		return dTotal;
	}

	public double FindMaxElement(ArrayEntity objArr) {
		double dMax = objArr.getdArr()[0];
		for (int i = 1; i < objArr.getdArr().length; i++) {
			if (dMax < objArr.getdArr()[i]) {
				dMax = objArr.getdArr()[i];
			}
		}
		return dMax;
	}

	public double FindMinElement(ArrayEntity objArr) {
		double dMin = objArr.getdArr()[0];
		for (int i = 1; i < objArr.getdArr().length; i++) {
			if (dMin > objArr.getdArr()[i]) {
				dMin = objArr.getdArr()[i];
			}
		}
		return dMin;
	}

	public void BuddySortElement(ArrayEntity objArr) {
		for (int i = 0; i < objArr.getdArr().length - 1; i++) {
			for (int j = i + 1; j <= objArr.getdArr().length - 1; j++) {
				if (objArr.getdArr()[i] > objArr.getdArr()[j]) {
					double dTemp = objArr.getdArr()[i];
					objArr.getdArr()[i] = objArr.getdArr()[j];
					objArr.getdArr()[j] = dTemp;
				}
			}
		}
	}

	public void InsertionSortElement(ArrayEntity objArr) {
		for (int i = 1; i < objArr.getdArr().length; i++) {
			double currentElement = objArr.getdArr()[i];
			int k;
			for (k = i - 1; k >= 0 && objArr.getdArr()[k] > currentElement; k--) {
				objArr.getdArr()[k + 1] = objArr.getdArr()[k];
			}
			objArr.getdArr()[k + 1] = currentElement;
		}
	}
	
	public void SelectionSortElement(ArrayEntity objArr){
		 for (int i = objArr.getdArr().length - 1; i >= 1; i--){
	         double currentMax = objArr.getdArr()[0];
	         int currentMaxIndex = 0;
	         {for (int j = 1; j <= i; j++) {
	          if (currentMax < objArr.getdArr()[j]) {
	             currentMax = objArr.getdArr()[j];
	            currentMaxIndex = j;
	           }
	         } 
	         if (currentMaxIndex != i) {
	        	 objArr.getdArr()[currentMaxIndex] = objArr.getdArr()[i];
	           objArr.getdArr()[i] = currentMax;
	         }
	       }
	    }
	}
}
