package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.GENERICS.SAMPLE02.GENERICS_CLASS;

import java.util.LinkedList;

public class QueueInfor {
    private final LinkedList<Object> items = new LinkedList<Object>();

    public void AddQueue(Object item) {
        items.addLast(item);
    }

    public Object RemoveQueue() {
        return items.removeFirst();
    }

    public boolean isEmptyItem() {
        return (items.size() == 0) ? true : false;
    }

    /* Test */
    public static void main(String[] str) {
        // 1. Khai báo và khởi tạo đối tượng
        QueueInfor objQueue = new QueueInfor();

        // 2. Thêm dữ liệu vào Queue
        Students objSV01 = new Students(1, "Nguyễn Văn A", 200, 8.5);
        Students objSV02 = new Students(2, "Trần Thị B", 300, 9.5);
        Students objSV03 = new Students(3, "Hoàng Văn C", 100, 7.5);

        objQueue.AddQueue(objSV01);
        objQueue.AddQueue(objSV02);
        objQueue.AddQueue(objSV03);

        // 3. Xóa từng phần tử trong Queue
        Students getStudentOfRemove = (Students) objQueue.RemoveQueue();
        // getStudentOfRemove : nhận kết quả trả về từ objQueue.RemoveQueue();
        System.out.println("+ RollNo: " + getStudentOfRemove.getRollNo());
        System.out.println("+ FullName: " + getStudentOfRemove.getFullName());
        System.out.println("+ Age: " + getStudentOfRemove.getAge());
        System.out.println("+ Mark: " + getStudentOfRemove.getMark());
    }
}
