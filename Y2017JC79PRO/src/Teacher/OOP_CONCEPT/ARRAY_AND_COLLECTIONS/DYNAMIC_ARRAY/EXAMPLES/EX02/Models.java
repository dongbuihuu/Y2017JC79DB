package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAY.EXAMPLES.EX02;

import java.util.List;

public class Models {
	/***
	 * Nghiệp vụ tính tổng giá trị trong mảng động 2 chiều kiểu cơ sở
	 * @param lisDouble
	 * @return
	 */
	public double TotalElements(List<List<Double>> lisDouble){
		double dResult = 0;
		for (int i = 0; i < lisDouble.size(); i++) {
			 for (int j = 0; j < lisDouble.get(i).size(); j++) {
				   dResult += lisDouble.get(i).get(j);
			}
		}
		return dResult;
	}
	
	/***
	 * Nghiệp vụ tính tổng giá trị trong mảng động 2 chiều kiểu đối tượng
	 * @param lisDouble
	 * @return
	 */
	public double TotalProductElements(List<List<Product>> lisProduct){
		double dResult = 0;
		for (int i = 0; i < lisProduct.size(); i++) {
			 for (int j = 0; j < lisProduct.get(i).size(); j++) {
				 dResult += lisProduct.get(i).get(j).getiQuantity();
			}
		}
		return dResult;
	}
}
