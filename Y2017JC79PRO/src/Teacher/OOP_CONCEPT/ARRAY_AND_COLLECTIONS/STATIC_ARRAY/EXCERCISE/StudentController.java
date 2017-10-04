package JAVACORE_TRAINING.OOP_CONCEPT.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.STATIC_ARRAY.EXCERCISE;

public class StudentController {
	private StudentModel mSModel;
	public StudentController() {
		mSModel = new StudentModel();
	}
	
	/***
	 * Nghiệp vụ sắp xếp thông tin
	 * @param arrStudent - Mảng đối tượng
	 * @param bOpt - 0: Buddy Sort; 
	 *                   bOpt - 1: Insertion Sort; 
	 *                   bOpt - 2: Selection Sort; 
	 */
	public void SortOf(cStudentEntity[] arrStudent, byte bOpt){
		switch (bOpt) {
			case 0: mSModel.BuddySort(arrStudent); break;
			case 1: mSModel.InsertionSort(arrStudent); break;
			case 2: mSModel.SelectionSort(arrStudent); break;
		}
	}
}
