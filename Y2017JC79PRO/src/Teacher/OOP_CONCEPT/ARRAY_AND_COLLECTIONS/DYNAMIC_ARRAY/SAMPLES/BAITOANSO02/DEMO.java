package JAVACORE_TRAINING.OBJECT_AND_CLASSES.ARRAY_AND_COLLECTION.DYNAMIC_ARRAY.SAMPLES.BAITOANSO02;

import java.util.ArrayList;
import java.util.List;

public class DEMO {
	public static void main(String[] args) {
		//1. Khai báo mảng động 2 chiều kiểu ...
		List<List<Double>>  lisDouble = new 
														ArrayList<List<Double>>();
		ArrayList<ArrayList<Double>> arrDouble = new 
																ArrayList<ArrayList<Double>>();
		
		//2. Khai báo ra các mảng con 1 chiều
		List<Double> lisD01 = new ArrayList<>();
		List<Double> lisD02 = new ArrayList<>();
		List<Double> lisD03 = new ArrayList<>();
		
		//3.  Đưa dữ liệu vào mảng
		lisD01.add(6.5);
		lisD01.add(7.5);
		lisD01.add(8.5);
		
		lisD02.add(6.5);
		lisD02.add(7.5);
		lisD02.add(8.5);
		
		lisD03.add(6.5);
		lisD03.add(7.5);
		lisD03.add(8.5);
		
		//4. Đưa các mảng con vào mảng cha
		lisDouble.add(lisD01);
		lisDouble.add(lisD02);
		lisDouble.add(lisD03);		
		
		//5. Duyệt danh sách các đối tượng
		for(int i = 0;i<lisDouble.size();i++)
			for(int j=0;j<lisDouble.get(i).size();j++){
				System.out.println("Value = "+ 
								lisDouble.get(i).get(j));
			}
		
	}
}
