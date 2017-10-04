package JAVACORE_TRAINING.OOPS_CONCEPTS.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class DEMO05_JSON_TO_HASHMAP {

    /**
     * @param args
     * @throws Exception 
     */
    public static void main(String[] args) {
        // 1. Lấy đường dẫn tương đối đến Resources trong Solution đang phát
        // triển.
        String Path = "C:\\JSONFiles\\HashMapToJSONFiles.json";

        // 2. Khai báo và khởi tạo đối tượng ObjectMapper
        ObjectMapper objOMaper = new ObjectMapper();

        // 3. Đọc dữ liệu trong files JSon chuyển vào
        // HashMap<integer,List<Students>>
        try {
            HashMap<Integer, List<Students>> objHash = 
                        objOMaper.readValue(new File(Path), 
                       new TypeReference<HashMap<Integer, List<Students>>>() {
            });

            // 4. Hiển thị dữ liệu ra
            List<Students> lis = objHash.get(0);

            // 5. Duyệt danh sách để hiển thị dữ liệu
            for (int i = 0; i < lis.size(); i++) {
                System.out.println("RollNo: " + lis.get(i).getRollNo());
                System.out.println("FullName: " + lis.get(i).getFullName());
                System.out.println("Mark: " + lis.get(i).getMark());
            }

        } catch (Exception e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
    }
}
