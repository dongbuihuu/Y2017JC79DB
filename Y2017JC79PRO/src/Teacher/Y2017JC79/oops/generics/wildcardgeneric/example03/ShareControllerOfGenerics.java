package Teacher.Y2017JC79.oops.generics.wildcardgeneric.example03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class CircleShape extends Shape {
}

class OctagonShape extends Shape {
}

class ChildOctagon extends OctagonShape {
}

class Shape extends BaseShape {
}

class BaseShape {
}

public class ShareControllerOfGenerics {
	/*
	 * <? extend T>: T & con của T <? super T> : T & cha, ông,...
	 */
	// Nghiệp vụ vẽ đường tròn
	static void drawCircle(List<? extends CircleShape> objEx, List<? super CircleShape> objSu) {

	}

	static void drawOctagon(List<? extends OctagonShape> objEx, List<? super OctagonShape> objSu) {

	}

	static <T> List<T> MakeList(T obj) {
		List<T> lis = new LinkedList<T>();
		lis.add(obj);
		return lis;
	}

	public static void main(String[] str) {
		// 1. Khởi tạo các List<T>
		List<CircleShape> objCi = MakeList(new CircleShape());
		List<OctagonShape> objOc = MakeList(new OctagonShape());
		List<ChildOctagon> objChildOc = MakeList(new ChildOctagon());

		// 2. Khởi tạo các List<T>
		List<Shape> lisShape = new ArrayList<Shape>();
		List<BaseShape> lisBaseShape = new ArrayList<BaseShape>();
		List<CircleShape> lisCi = new ArrayList<CircleShape>();
		List<OctagonShape> lisOc = new ArrayList<OctagonShape>();

		// 3. Thực thi nghiệp vụ drawCircle(? extend T, ? super T);
		// a. Okie
		drawCircle(objCi, lisShape); // Okie
		drawCircle(objCi, objCi); // Okie
		drawCircle(objCi, lisBaseShape); // Okie

		drawOctagon(objOc, lisShape); // Okie
		drawOctagon(objChildOc, lisShape); // Okie
		drawOctagon(objChildOc, lisBaseShape); // Okie

		// b. Not Okie
		// drawCircle(lisShape, lisShape); // Errors lisShap ko phai Circle hay kế thừa
		// từ Cirle
		// drawOctagon(lisShape, lisShape); // Errors tuong tu
		// drawOctagon(objChildOc, objChildOc); // Errors chilOc ko phải là cha của
		// OctagonEntity

		/*
		 * Tổng kết: + ? extends T : Đối tượng ? phải kế thừa từ T hoặc là chính T. + ?
		 * super T: Đối tượng ? phải là đối tượng cha của T hoặc là chínhT (ko nhận các
		 * đối tượng con của T).
		 */
	}
}
