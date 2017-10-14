package TONMINHSON.Student;

public class StudentModel {
	// Find max value of mark of student
	public double findMinMark(ArrayObjectEntity objEntity) {
		StudentEntity[] obj = objEntity.getObjStudent();
		double dMin = obj[0].getdMark();
		for (int i = 0; i < obj.length; i++) {
			if (dMin > obj[i].getdMark()) {
				dMin = obj[i].getdMark();
			}
		}
		return dMin;
	}

	public double findMaxMark(ArrayObjectEntity objEntity) {
		StudentEntity[] obj = objEntity.getObjStudent();
		double dMax = obj[0].getdMark();
		for (int i = 0; i < obj.length; i++) {
			if (dMax < obj[i].getdMark()) {
				dMax = obj[i].getdMark();
			}
		}
		return dMax;
	}

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
		vIndex = new int[iCount];
		System.arraycopy(vIndexTemp, 0, vIndex, 0, iCount);
		return vIndex;
	}
}
