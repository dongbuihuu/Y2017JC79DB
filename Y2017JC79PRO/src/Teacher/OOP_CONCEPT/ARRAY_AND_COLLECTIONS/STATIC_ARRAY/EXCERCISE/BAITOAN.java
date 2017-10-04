package JAVACORE_TRAINING.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.STATIC_ARRAY.EXCERCISE;

public class BAITOAN {
	public static void main(String[] args) {
		// 1. Khai báo mảng đối tượng Sinh Viên
		cStudentEntity[] arrStudent;

		// 2. Khởi tạo mảng đối tượng
		arrStudent = new cStudentEntity[3];

		// 3. Tạo ra các đối tượng Sinh Viên
		cStudentEntity objS01 = new cStudentEntity();
		cStudentEntity objS02 = new cStudentEntity();
		cStudentEntity objS03 = new cStudentEntity();

		// 4. Thiết lập các thông tin đầy đủ cho 03 đối tượng SV nói trên
		objS01.setiRollNo(100);
		objS01.setsFullName("Nguyễn Văn A");
		objS01.setdMark(9.5);

		objS02.setiRollNo(200);
		objS02.setsFullName("Trần Thị B");
		objS02.setdMark(7.5);

		objS03.setiRollNo(300);
		objS03.setsFullName("Hoàng Văn C");
		objS03.setdMark(8.5);

		// 5. Đưa 03 đối tượng Sinh viên vào trong mảng đối tượng SV
		arrStudent[0] = objS01;
		arrStudent[1] = objS02;
		arrStudent[2] = objS03;

		// 6. Sử dụng các thuật toán để sắp xếp thông tin SV theo Điểm
		//new BAITOAN().BuddySort(arrStudent);
		//new BAITOAN().InsertionSort(arrStudent);
		new BAITOAN().SelectionSort(arrStudent);
		
		//7. Hiển thị toàn bộ thông tin của Sinh Viên
		for(cStudentEntity objStudent : arrStudent){
			System.out.println(objStudent);
		}
	}

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
