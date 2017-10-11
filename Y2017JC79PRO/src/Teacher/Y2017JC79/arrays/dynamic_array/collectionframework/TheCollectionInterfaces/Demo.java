package JAVACORE_TRAINING.OOP_CONCEPT.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.DYNAMIC_ARRAY.COLLECTIONFRAMEWORK.TheCollectionInterfaces;

import java.util.HashSet;

public class Demo {
	public static void main(String[] args) {
		// 1. Tạo ra đối tượng thông qua sự thể hiện của ArrayList
		// <Điều kiện bắt buộc lớp khởi tạo thông qua đó phải implement từ IList<E>
		IList<Integer> lisInteger = new cArrayList<Integer>();
		lisInteger.add(100);
		
		IList<Double> lisDouble = new cArrayList<Double>();		
		lisDouble.add(6.5);
		lisDouble.add(9.5);
		lisDouble.add(7.5);		

		System.out.println("lisDouble[0] = " + lisDouble.get(0));
		System.out.println("lisDouble[1] = " + lisDouble.get(1));
		System.out.println("lisDouble[2] = " + lisDouble.get(2));

		// 2. Thực thi nghiệp vụ được định nghĩa trong cArrayList (IsActive())
		//lisDouble.IsActive();
		/*
		 * Errors không thể thực thi IsActive() do khi khởi tạo thông qua thì
		 * chỉ những gì thể hiện trên giao diện gốc mới đc sử dụng
		 */
		
		// 3. Khai báo & khởi tạo với cArrayList
		cArrayList<Double> arrDouble = new cArrayList<Double>();
		arrDouble.IsActive();
		arrDouble.add(6.5);
	}
}
