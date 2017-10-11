package JAVACORE_TRAINING.OOPS_CONCEPTS.ARRAY_AND_COLLECTION.DYNAMIC_ARRAYS.COLLECTIONFRAMEWORK.TheCollectionInterfaces;

import java.util.ArrayList;
import java.util.List;

public class ExampleList2D {
	public static void main(String[] args) {
		//1. Khai báo và khởi tạo mảng động 2 chiều List & ArrayList
		List<List<Double>> lisDouble = new ArrayList<List<Double>>();
		ArrayList<ArrayList<Double>> arrDouble = new ArrayList<ArrayList<Double>>();
		
		//2. Đưa giá trị vào mảng động 2 chiều
		//a. Khai báo mảng con 1 chiều
		List<Double> liDouble01 = new ArrayList<>();
		liDouble01.add(6.5);
		liDouble01.add(7.5);
		liDouble01.add(8.5);
		
		List<Double> liDouble02 = new ArrayList<>();
		liDouble02.add(6.5);
		liDouble02.add(7.5);
		liDouble02.add(8.5);
		
		//b. Đưa các mảng con 1 chiều vào mảng cha 2 chiều
		lisDouble.add(liDouble01);
		lisDouble.add(liDouble02);
		
		//3. Duyệt và hiển thị các giá trị trong mảng động 2 chiều
		for(int i = 0;i<lisDouble.size();i++)
			for(int j = 0;j<lisDouble.get(i).size();j++){
				System.out.println(String.format("lisDouble[%s][%s] = %s", i, j,
									lisDouble.get(i).get(j)));
			}		
	}
}
