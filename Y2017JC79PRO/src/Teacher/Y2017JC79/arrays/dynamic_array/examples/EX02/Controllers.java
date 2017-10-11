package OOPS_CONCEPTS.ARRAY_AND_COLLECTION.DYNAMIC_ARRAYS.EXAMPLES.EX02;

import java.util.List;

public class Controllers {
	private Models m_objModel;
	public Controllers() {
		m_objModel = new Models();
	}
	
	public double TotalDouble(List<List<Double>> lisDouble){
		return m_objModel.TotalElements(lisDouble);
	}
	
	public double TotalProduct(List<List<Product>> lisProduct){
		return m_objModel.TotalProductElements(lisProduct);
	}
}
