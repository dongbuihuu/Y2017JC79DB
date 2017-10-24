package JAVACORE_TRAINING.OOPS_CONCEPTS.ARRAY_AND_COLLECTION.DYNAMIC_ARRAYS.COLLECTIONFRAMEWORK.TheCollectionInterfaces;

import java.util.ArrayList;
import java.util.List;

public class ExampleListObject {
	public static void main(String[] args) {
		//1. Khai báo mảng động 1 chiều kiểu đối tượng Sinh viên
		List<StudentEntity> lisStudent = new ArrayList<StudentEntity>();
		
		//2. Đưa các đối tượng Sinh Viên vào mảng đối tượng Sinh Viên
		//a. Khai báo ra các đối tượng SV
		StudentEntity objS01 = new StudentEntity();
		objS01.setiRollNo(100);
		objS01.setsFullName("Mr A");
		objS01.setdMark(6.5);
		
		StudentEntity objS02 = new StudentEntity();
		objS02.setiRollNo(200);
		objS02.setsFullName("Mr B");
		objS02.setdMark(7.5);
		
		StudentEntity objS03 = new StudentEntity();
		objS03.setiRollNo(300);
		objS03.setsFullName("Mr C");
		objS03.setdMark(8.5);
		
		//b. Đưa vào danh sách đối tượng
		lisStudent.add(objS01);
		lisStudent.add(objS02);
		lisStudent.add(objS03);
		
		//3. Duyệt và hiển thị các đối tượng trong danh sách
		for(int i = 0;i<lisStudent.size();i++){
			StudentEntity objStudent = lisStudent.get(i);
			System.out.println(objStudent);
		}
		
	}
}
