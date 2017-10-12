package JAVACORE_TRAINING.OOPS_CONCEPTS.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAYS.COLLECTIONFRAMEWORK.HashSetvsTreeSetvsLinkedHashSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	/*
	 * The following is a very simple TreeSet example. From this simple example, you will see:
			+ TreeSet is sorted.
			+ How to iterate a TreeSet.
			+ How to check empty.
			+ How to retrieve first/last element.
			+ How to remove an element.
	 * */
	public static void main(String[] args) {
		//1. Khai báo & khởi tạo TreeSet?
		TreeSet<Double> objTree = new TreeSet<Double>();
		
		//2. Đưa các phần tử vào TreeSet?
		objTree.add(9.5);
		objTree.add(5.5);
		objTree.add(8.5);
		objTree.add(7.5);
		objTree.add(10.0);
		
		//3. Nhận về danh sách các phần tử 
		Iterator<Double> objIt = objTree.iterator();
		System.out.print("- Tree set data: ");
		while(objIt.hasNext()){
			System.out.print(objIt.next() + " ");
		}
		System.out.println();
		
		//4. Kiểm tra trạng thái rỗng <Empty>
		if(objTree.isEmpty()){
			System.out.print("--> Tree Set is empty.");
		}
		else{
			System.out.println("--> Tree Set size: " + objTree.size());
		}
		
		//5. Nhận về phần tử đầu tiên trong set
		System.out.println("- First data: " + objTree.first());
		
		//6. Nhận về phần tử cuối cùng trong set
		System.out.println("- Last data: " + objTree.last());
		
		//7. Loại bỏ 1 phần tử khỏi Set
		if(objTree.remove(7.5)){
			System.out.println("--> Data is removed from tree set");	
		}
		else{
			System.out.println("--> Data doesn't exist!");
		}
		
		//8. Nhận lại danh sách các phần tử trong TreeSet hiện thời?
		objIt = objTree.iterator();
		System.out.print("- Now the tree set data: ");
		while(objIt.hasNext()){
			System.out.print(objIt.next() + " ");
		}
		System.out.println();
		System.out.println("--> Now the size of tree set: " + objTree.size());
		
		//9. Xóa tất cả các phần tử trong TreeSet?
		objTree.clear();
		if(objTree.isEmpty()){
			System.out.print("--> Tree Set is empty.");
		} else {
			System.out.println("--> Tree Set size: " + objTree.size());
		}		
	}
}
