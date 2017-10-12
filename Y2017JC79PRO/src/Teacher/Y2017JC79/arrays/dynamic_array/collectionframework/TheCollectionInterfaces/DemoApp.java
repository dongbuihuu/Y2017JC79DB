package JAVACORE_TRAINING.OOP_CONCEPT.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.DYNAMIC_ARRAY.COLLECTIONFRAMEWORK.TheCollectionInterfaces;

import java.util.ArrayList;
import java.util.List;

public class DemoApp {
	public static void main(String[] args) {
		//1. Khai báo & khởi tạo mảng động 1 chiều với List
		List<Double> lisDouble = new ArrayList<Double>();
		
		//2. Đưa giá trị vào mảng động
		lisDouble.add(6.5);
		lisDouble.add(7.5);
		lisDouble.add(8.5);
		lisDouble.add(9.5);
		
		//3. Duyệt và hiển thị các giá trị trong mảng động 1 chiều
		for(int i = 0;i<lisDouble.size();i++){
		    	System.out.println(String.format("dValue = %s", 
		    			      lisDouble.get(i)));		    	
		} 			
		for(double dValue : lisDouble){
			System.out.println(String.format("dValue = %s", dValue));
		}		
	}
}
