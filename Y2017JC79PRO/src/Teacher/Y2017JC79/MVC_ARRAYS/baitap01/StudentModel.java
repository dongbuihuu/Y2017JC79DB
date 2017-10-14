package Teacher.Y2017JC79.MVC_ARRAYS.baitap01;

public class StudentModel {

	// 1. Find Min value of the Mark of student
	public double findMinMark(ArrayObjectEntity objEntity) {
		StudentEntity[] obj = objEntity.getObjStudent();

		double dMin = obj[0].getdMark();

		for (int i = 1; i < obj.length; i++) {
			if (obj[i].getdMark() < dMin) {
				dMin = obj[i].getdMark();
			}
		}

		return dMin;

	}

	// 2. Find Max value of the Mark of student
	public double findMaxMark(ArrayObjectEntity objEntity) {
		StudentEntity[] obj = objEntity.getObjStudent();

		double dMax = obj[0].getdMark();

		for (int i = 1; i < obj.length; i++) {
			if (obj[i].getdMark() > dMax) {
				dMax = obj[i].getdMark();
			}
		}

		return dMax;

	}

	// 3. Get mang danh sach cac index ma la max hoac min
	public int[] getIndexArray(ArrayObjectEntity objEntity) {
		StudentEntity[] obj = objEntity.getObjStudent();

		int[] vIndex = null;
		int iCount = 0;

		int[] vIndexTemp = new int[obj.length];
		for (int i = 0; i < obj.length; i++) {
			if (obj[i].getdMark() == objEntity.getdValueMinOrMax()) {
				vIndexTemp[iCount] = i;
				iCount++;
			}
		}
		// Mang vIndexTemp chua cac index la min/max
		vIndex = new int[iCount];
		// Copy mang vIndexTemp sang VIndex
		System.arraycopy(vIndexTemp, 0, vIndex, 0, iCount);
		// return
		return vIndex;
	}

}
