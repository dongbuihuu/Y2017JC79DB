package Teacher.ADVANCED_TOPICs.ENUMERATIONS;

import java.util.EnumSet;
import java.util.Iterator;

public class UseEnumSet {
	public static void main(String[] args) {
		EnumSet<Size> largeSize = EnumSet.of(Size.XL, Size.XXL, Size.XXXL);
		Iterator<Size> objIt = largeSize.iterator();
		while (objIt.hasNext()) {
			System.out.println(objIt.next() + " ");
		}
	}
}

enum Size {
	S, M, L, XL, XXL, XXXL;
}
