package Teacher.Y2017JC79.arrays.dynamic_array.examples.EX02;

import java.util.ArrayList;
import java.util.List;

public class Views {
	public static void main(String[] args) {
		// 1. Khai báo mảng động kiểu cơ sở
		List<List<Double>> lisDouble = new ArrayList<List<Double>>();
		List<List<Product>> lisProduct = new ArrayList<List<Product>>();

		// 2. Đưa giá trị vào mảng động kiểu cơ sở
		// a. Khai báo các mảng con 1 chiều kiểu cơ sở
		List<Double> lisD01 = new ArrayList<>();
		lisD01.add(6.5);
		lisD01.add(7.5);

		List<Double> lisD02 = new ArrayList<>();
		lisD02.add(6.5);
		lisD02.add(7.5);

		// b. Đưa 02 mảng con 1 chiều kiểu cơ sở --> mảng cha 2 chiều kiểu cơ sở
		lisDouble.add(lisD01);
		lisDouble.add(lisD02);

		// 3. Đưa giá trị vào mảng động kiểu đối tượng
		// a. Khai báo các mảng con 1 chiều kiểu đối tượng
		List<Product> lisPro01 = new ArrayList<>();
		Product objP01 = new Product();
		objP01.setiProductId(100);
		objP01.setiQuantity(60);

		Product objP02 = new Product();
		objP02.setiProductId(100);
		objP02.setiQuantity(60);

		lisPro01.add(objP01);
		lisPro01.add(objP02);

		List<Product> lisPro02 = new ArrayList<>();
		Product objP03 = new Product();
		objP03.setiProductId(100);
		objP03.setiQuantity(60);

		Product objP04 = new Product();
		objP04.setiProductId(100);
		objP04.setiQuantity(60);

		lisPro02.add(objP03);
		lisPro02.add(objP04);

		// b. Đưa 02 mảng con 1 chiều kiểu đối tượng --> mảng cha 2 chiều kiểu cơ sở
		lisProduct.add(lisPro01);
		lisProduct.add(lisPro02);
	}
}
