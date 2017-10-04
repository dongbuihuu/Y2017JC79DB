package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.GENERICS.SAMPLE02.GENERICS_CLASS;

import java.util.LinkedList;

public class QueueInforOfGenerics<T> {
	private final LinkedList<T> items = new LinkedList<T>();

	public void AddQueue(T item) {
		items.addLast(item);
	}

	public T RemoveQueue() {
		return items.removeFirst();
	}

	public boolean isEmptyItem() {
		return (items.size() == 0) ? true : false;
	}

	/* Test */
	public static void main(String[] str) {
		// 1. Khai báo và khởi tạo đối tượng
		QueueInforOfGenerics<Students> objQueue = new QueueInforOfGenerics<Students>();

		// 2. Thêm dữ liệu vào Queue
		Students objSV01 = new Students(1, "Nguyễn Văn A", 200, 8.5);
		Students objSV02 = new Students(2, "Trần Thị B", 300, 9.5);
		Students objSV03 = new Students(3, "Hoàng Văn C", 100, 7.5);

		objQueue.AddQueue(objSV01);
		objQueue.AddQueue(objSV02);
		objQueue.AddQueue(objSV03);

		// 3. Xóa từng phần tử trong Queue --> Ko phải Inbox kiểu vì nó sẽ chính
		// là kiểu đó rồi
		Students getStudentOfRemove = objQueue.RemoveQueue();
		System.out.println("+ RollNo: " + getStudentOfRemove.getRollNo());
		System.out.println("+ FullName: " + getStudentOfRemove.getFullName());
		System.out.println("+ Age: " + getStudentOfRemove.getAge());
		System.out.println("+ Mark: " + getStudentOfRemove.getMark());
	}
}
