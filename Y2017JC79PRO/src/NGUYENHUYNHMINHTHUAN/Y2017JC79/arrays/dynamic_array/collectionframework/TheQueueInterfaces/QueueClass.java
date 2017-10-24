package JAVACORE_TRAINING.OOPS_CONCEPTS.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAYS.COLLECTIONFRAMEWORK.TheQueueInterfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueClass {
	public static void main(String[] args) {
		//1. Khai báo & khởi tạo hàng đợi
		Queue<String> objQueue = new LinkedList<String>();
		
		//2. Thêm phần tử vào Queue sử dụng offer() --> return true/false
		objQueue.offer("Monday");
		objQueue.offer("Thusday");
		boolean flag = objQueue.offer("Wednesday");
		System.out.println("+ Lấy phần tử Wednesday từ hàng đợi? " + flag);

		//3. Thêm phần tử vào Queue sử dụng add() --> throws IllegalStateException
		try{
			objQueue.add("Thursday");
			objQueue.add("Friday");
			objQueue.add("Weekend");
		}catch(IllegalStateException e){
			e.printStackTrace();
		}
		List<E>
		//4. Lấy ra phần tử đầu tiên của Queue
		System.out.println("peek = "+ objQueue.peek());
		
		//5. Xóa phần tử sử dụng remove()
		String head = null;
		try {
			head = objQueue.remove();
			System.out.println("+ Phần tử đầu bị xóa là: "+ head);
			System.out.println("+ Phần tử đầu tiếp theo là: "+ objQueue.element());			
		}catch(NoSuchElementException  e){
			e.printStackTrace();
		}
		
		//6. Xóa phần tử sử dụng poll()
		head = objQueue.poll();
		System.out.println("+ Phần tử đầu bị xóa là: "+ head);
		System.out.println("+ Phần tử đầu tiếp theo là: "+ objQueue.peek());
		
		//7. Tìm trong hàng đợi có chứa đối tượng không?
		System.out.println("+ Hàng đợi có chứa Weekend?"+ objQueue.contains("Weekend"));
		System.out.println("+ Hàng đợi có chứa Monday?"+ objQueue.contains("Monday"));
		
		//8. Duyệt và hiển thị các giá trị trong hàng đợi?
		Iterator objItr = objQueue.iterator();
		while(objItr.hasNext()){
			System.out.println("+ Queue Next Value: "+objItr.next());
		}
		System.out.println("Size: "+ objQueue.size());
	}
}
