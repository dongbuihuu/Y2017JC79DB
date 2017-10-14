package Teacher.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.CHUABAITAPVN.BAITAPSO06;

public class ArrayModel {
	/***
	 * Nghiệp vụ tìm điểm số lớn nhất
	 * 
	 * @param objEntity
	 * @return
	 */
	public double MaxElement(ArrayEntity objEntity) {
		// 1. Lấy ra điểm số ở đối tượng đầu tiên
		double dMax = objEntity.getArrStudent()[0].getdMark();
		// 2. Duyệt danh sách SV để tìm ra điểm số lớn nhất
		for (StudentEntity obj : objEntity.getArrStudent()) {
			if (dMax < obj.getdMark()) {
				dMax = obj.getdMark();
			}
		}
		// 3. Trả kq
		return dMax;
	}

	public double MinElement(ArrayEntity objEntity) {
		// 1. Lấy ra điểm số ở đối tượng đầu tiên
		double dMin = objEntity.getArrStudent()[0].getdMark();
		// 2. Duyệt danh sách SV để tìm ra điểm số lớn nhất
		for (StudentEntity obj : objEntity.getArrStudent()) {
			if (dMin > obj.getdMark()) {
				dMin = obj.getdMark();
			}
		}
		// 3. Trả kq
		return dMin;
	}

	public int[] GetIndexElement(ArrayEntity objEntity) {
		int[] arrIndex = null;
		int[] arrIndexTemp = new int[objEntity.getArrStudent().length];
		int iCounter = 0;
		for (int i = 0; i < objEntity.getArrStudent().length; i++) {
			if (objEntity.getArrStudent()[i].getdMark() == objEntity.getdValue()) {
				arrIndexTemp[iCounter] = i;
				iCounter++;
			}
		}
		arrIndex = new int[iCounter];
		System.arraycopy(arrIndexTemp, 0, arrIndex, 0, iCounter);
		return arrIndex;
	}
}
