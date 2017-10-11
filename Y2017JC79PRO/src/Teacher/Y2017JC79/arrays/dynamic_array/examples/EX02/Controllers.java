package Teacher.Y2017JC79.arrays.dynamic_array.examples.EX02;

import java.util.List;

public class Controllers {
	private Models m_objModel;

	public Controllers() {
		m_objModel = new Models();
	}

	public double TotalDouble(List<List<Double>> lisDouble) {
		return m_objModel.TotalElements(lisDouble);
	}

	public double TotalProduct(List<List<Product>> lisProduct) {
		return m_objModel.TotalProductElements(lisProduct);
	}
}
