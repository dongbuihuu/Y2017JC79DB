package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAY.EXCERCISES.EX03;

import java.util.ArrayList;
import java.util.List;

public class ArrayView {
	private static ArrayEntity mArrEntity;
	private static List<List<Student>> liLisStudent;
	
	public static void main(String[] args) {
		//1. Nghiệp vụ 01: Thêm mới các đối tượng vào Mảng động
		Add();
		
		//2. Tính tổng các điểm số
		ArrayController objController = new ArrayController();
		ArrayEntity objEntity = objController.Sort(mArrEntity);
		
		//4. Hiển thị
		PrintInfo(objEntity);
	}

	static void Add() {
		mArrEntity = new ArrayEntity();
		// 1. Khai báo mảng động 1 chiều kiểu đối tượng Student		
		List<Student> lisStudent = new ArrayList<>();	

		// 3. Khai báo và khởi tạo ra các đối tượng SV
		Student objS01 = new Student(100,"Mr A", 8.5);
		Student objS02 = new Student(200,"Mr B", 9.5);
		Student objS03 = new Student(300,"Mr C", 7.5);

		//4. Đưa các mảng con vào mảng cha 2 chiều
		lisStudent.add(objS01);
		lisStudent.add(objS02);
		lisStudent.add(objS03);
		
		mArrEntity.setLisStudent(lisStudent);
	}
	
	static void PrintInfo(ArrayEntity objEntity){
		for(int i = 0;i<objEntity.getLisStudent().size();i++){
			System.out.println(objEntity.getLisStudent().get(i));
		}
	}
}
