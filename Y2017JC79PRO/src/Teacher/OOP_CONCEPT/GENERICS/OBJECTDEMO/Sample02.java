package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.GENERICS.OBJECTDEMO;

public class Sample02 {
	public static void main(String[] args) {
		//1. Khai báo và khởi tạo đối tượng
		StudentObject objS = new StudentObject();
		objS.setRollNo(100);
		objS.setFullName("Nguyễn Văn A");
		
		TeacherObject objT = new TeacherObject();
		objT.setTeachID(200);
		objT.setFullName("Trần Thị B");
		
		//2. Thưc thi nghiệp vụ
		InsertElement(objS, (short)0);
		InsertElement(objT, (short)1);
	}	
	
	/***
	 * Thêm đối tượng
	 * @param obj
	 * @param shOpt = 0: Thêm Sinh viên;
	 * @param shOpt = 1: Thêm Giang viên;
	 */
	static void InsertElement(Object obj, short shOpt){
		switch (shOpt) {
			case 0:{
				StudentObject objStudent = (StudentObject) obj;
				System.out.println("+ RollNo: "+ objStudent.getRollNo());
				System.out.println("+ FullName: "+ objStudent.getFullName());
			}break;
			case 1:{
				TeacherObject objTeacher = (TeacherObject) obj;
				System.out.println("+ RollNo: "+ objTeacher.getTeachID());
				System.out.println("+ FullName: "+ objTeacher.getFullName());
			}break;	
		}
	}
}
