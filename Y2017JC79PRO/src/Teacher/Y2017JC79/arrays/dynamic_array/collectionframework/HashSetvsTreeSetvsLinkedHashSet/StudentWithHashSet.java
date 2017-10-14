package Teacher.Y2017JC79.arrays.dynamic_array.collectionframework.HashSetvsTreeSetvsLinkedHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class StudentWithHashSet {
	public static void main(String[] args) {
		// 1. Khai báo & khởi tạo HashSet?
		HashSet<Student> objHSet = new HashSet<Student>();

		// 2. Khai báo và khởi tạo các đối tượng Student
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

		Student objS4 = new Student();
		objS4.setRollNo(4);
		objS4.setFullName("Hoàng Văn D");
		objS4.setMark(10.0);

		Student objS5 = new Student();
		objS5.setRollNo(5);
		objS5.setFullName("Phan Thị E");
		objS5.setMark(6.5);

		// 3. Đưa các đối tượng vào HashSet?
		objHSet.add(objS2);
		objHSet.add(objS1);
		objHSet.add(objS3);
		objHSet.add(objS5);
		objHSet.add(objS4);

		// 4. Nhận về danh sách sinh viên từ HashSet?
		Iterator<Student> objIt = objHSet.iterator();
		while (objIt.hasNext()) {
			System.out.println(objIt.next() + " ");
		}

		/* Note the order is not certain. */
	}
}
