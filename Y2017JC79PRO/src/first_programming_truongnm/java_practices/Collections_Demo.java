package first_programming_truongnm.java_practices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections_Demo {

	public static void main(String[] args) {
		List<Object> a1 = new ArrayList<>();

		a1.add("Nguyen Van A");
		a1.add("Nguyen Van B");
		a1.add("Nguyen Van C");
		System.out.println("ArrayList");
		System.out.print("\t" + a1);

		List<Object> a2 = new LinkedList<>();
		a2.add("Hoang Khanh Hoa");
		a2.add("Hoang Van Thuc");
		a2.add("Nguyen Manh Truong");
		System.out.println("LinkedList");
		System.out.print("\t" + a2);

		Set<Object> a3 = new HashSet<>();
		a3.add("Nguyen Thi C");
		a3.add("Nguyen Thi D");
		a3.add("Nguyen Van F");
		System.out.println("HashSet");
		System.out.print("\t" + a3);

		Map<Object, Object> a4 = new HashMap<>();
		a4.put("Nguyen Manh Truong", "10");
		a4.put("Nguyen Van C", "5.5");
		a4.put("Nguyen Van F", "7.6");
		System.out.println("HashMap");
		System.out.print("\t" + a4);

	}

}
