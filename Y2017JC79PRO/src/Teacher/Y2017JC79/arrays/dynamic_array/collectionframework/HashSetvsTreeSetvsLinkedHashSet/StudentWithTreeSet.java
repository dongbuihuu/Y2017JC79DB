package JAVACORE_TRAINING.OOPS_CONCEPTS.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAYS.COLLECTIONFRAMEWORK.HashSetvsTreeSetvsLinkedHashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class StudentWithTreeSet {
	/*
	 * Sample thử lưu trữ danh sách Sinh Viên vào TreeSet
	 * */
	public static void main(String[] args) {
		//1. Khai báo & khởi tạo TreeSet?
		TreeSet<Student> objTree = new TreeSet<Student>();
		
		//2. Khai báo và khởi tạo các đối tượng Student
		Student objS1 = new Student();
		objS1.setRollNo(1);
		objS1.setFullName("Nguyễn Văn A");
		objS1.setMark(7.5);
		
		Student objS2 = new Student();
		objS2.setRollNo(2);
		objS2.setFullName("Trần Thị B");
		objS2.setMark(9.5);
		
		Student objS3 = new Student();
		objS3.setRollNo(3);
		objS3.setFullName("Phạm Thị C");
		objS3.setMark(8.5);
		
		//3. Đưa các đối tượng vào TreeSet?
		objTree.add(objS1);
		objTree.add(objS2);
		objTree.add(objS3);
		
		//4. Nhận về danh sách sinh viên từ TreeSet?
		Iterator<Student> objIt = objTree.iterator();
		while(objIt.hasNext()){
			System.out.println(objIt.next() + " ");
		}
	}
	
	/*------------------------------------------------------------------------------------
	 * Compile ok, but run-time error occurs:
	 * Student cannot be cast to java.lang.Comparable
	 * Solution:
	 * 		--> public class Student implements Comparable<Student>{....}
	 * 		@Override
			public int compareTo(Student obj) {
				if(Mark == obj.getMark())
					return 0;		
				else if(Mark < obj.getMark())
					return -1; //Desc
				else	
					return 1;  //Asc 
			}
	 * ------------------------------------------------------------------------------------*/
}
