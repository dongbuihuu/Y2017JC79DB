package JAVACORE_TRAINING.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.DYNAMIC_ARRAY.COLLECTIONFRAMEWORK.TheCollectionInterfaces;

public class DemoApp02 {
	public static void main(String[] args) {
		// 1. Khai báo & khởi tạo mảng động 1 chiều với List
		IList<Double> lisDouble = new cArrayList<Double>();

		// 2. Đưa giá trị vào mảng động
		lisDouble.add(6.5);
		lisDouble.add(7.5);
		lisDouble.add(8.5);
		lisDouble.add(9.5);

		// 3. Duyệt và hiển thị các giá trị trong mảng động 1 chiều
		System.out.println("dValue = "+ lisDouble.get(0));
		for (int i = 0; i < lisDouble.size(); i++) {
			System.out.println(String.format("dValue = %s", lisDouble.get(i)));
		}		
	}
}
