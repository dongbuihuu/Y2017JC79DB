package JAVACORE_TRAINING.OOP_CONCEPT.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.DYNAMIC_ARRAY.SAMPLES.BAITOANSO01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Sample01 {
	public static void main(String[] args) {
		//1. Khai báo và khởi tạo biến mảng động 1 chiều kiểu double
		List<Double> lisDouble = new ArrayList<Double>();
		List<Integer> lisInteger = new ArrayList<Integer>();
		List<Student> lisStudent = new ArrayList<Student>();
		
		//2. Đưa giá trị vào trong mảng động 1 chiều cơ sở & đối tượng
		lisDouble.add(8.5);
		lisDouble.add(9.5);
		lisDouble.add(6.5);
		lisDouble.add(7.5);
		
		lisStudent.add(new Student(100, "Nguyễn Văn A", 8.5));
		lisStudent.add(new Student(200, "Trần Thị B", 9.5));
		lisStudent.add(new Student(300, "Hoang Văn C", 7.5));
		
		//3. Hiển thị các phần tử trong mảng động 1 chiều
		Collections.sort(lisDouble);  //ASC
		for(int i = 0;i<lisDouble.size();i++){
			System.out.println("+ lisDouble = "+ lisDouble.get(i));
		}
		
		for (int i = 0; i < lisStudent.size(); i++) {
			Student objStudent = lisStudent.get(i);
			System.out.println("+ iRollNo: "+ objStudent.getiRollNo());
			System.out.println("+ sFullName: "+ objStudent.getsFullName());
			System.out.println("+ dMark: "+ objStudent.getdMark());
		}
		System.out.println("-----------Student----------");
		for (Student student : lisStudent) {
			System.out.println(student);
		}
		
		//4. Sắp xếp mảng đối tượng Sinh Viên
		Collections.sort(lisStudent, new Comparator<Student>() {
			@Override
			public int compare(Student objA, Student objB) {
				if(objA.getdMark() < objB.getdMark()){
					return -1;	
				}return 1;
			}					
		});
						
		System.out.println("-----------Sorted----------");
		for (Student student : lisStudent) {
			System.out.println(student);
		}
	}
}
