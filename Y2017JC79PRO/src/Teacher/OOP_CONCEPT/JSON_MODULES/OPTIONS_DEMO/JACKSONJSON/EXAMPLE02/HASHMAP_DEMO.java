package JAVACORE_TRAINING.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON.EXAMPLE02;

import java.util.HashMap;

public class HASHMAP_DEMO {
	
	public static void main(String[] args) {
		// 1. Khai báo sử dụng HashMap
        // Hashmap<key, value>;
		// HashMap<Integer, Double>;       
        // HashMap<Integer, Student>;
        // HashMap<Integer,List<Students>>;
        HashMap<Integer, String> objHash = 
        						new HashMap<Integer, String>();
        objHash.put(100, "Nguyễn Văn A");
        objHash.put(1, "Hoàng Văn B");
        objHash.put(2, "Trần Thị C");

        // 2. Kiểm tra Key
        if (objHash.containsKey(100)) {
            System.out.println("Có tồn tại Key này!");
        }

        // 3. Hiển thị giá trị theo Key
        System.out.println("Key(0): " + objHash.get(100));
        System.out.println("Key(1): " + objHash.get(1));
        System.out.println("Key(2): " + objHash.get(2)); //Trần Thị C

        // 4. Xóa từng phần tử trong HashMap
        objHash.remove(100);

        // 5. Kiểm tra lại
        if (!objHash.containsKey(100)) {
            System.out.println("Không còn tồn tại Key này!");
        }

        // 6. Xem kích thước Hash
        System.out.println("Size: " + objHash.size());  //2 phần tử
	}
}
