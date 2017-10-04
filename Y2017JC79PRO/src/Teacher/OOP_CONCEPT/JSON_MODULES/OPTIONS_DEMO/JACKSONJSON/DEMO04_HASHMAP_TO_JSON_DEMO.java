package JAVACORE_TRAINING.OOPS_CONCEPTS.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

public class DEMO04_HASHMAP_TO_JSON_DEMO {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // 1. Khai báo đối tượng hashmap<Integer, List<Students>>
        HashMap<Integer, List<Students>> objHash = new HashMap<Integer, List<Students>>();

        // 2. Khai báo và khởi tạo List<Object>
        List<Students> lisStudent = new ArrayList<Students>();
        Students SV01 = new Students();
        SV01.setRollNo(1);
        SV01.setFullName("Nguyễn Văn A");

        Students SV02 = new Students();
        SV02.setRollNo(2);
        SV02.setFullName("Trần Hồng B");

        lisStudent.add(SV01);
        lisStudent.add(SV02);

        // 3. Put dữ liệu Objects vào trong HashMap
        objHash.put(0, lisStudent);

        // 4. Ghi dữ liệu xuống files JSON
        try {
            // a. Lấy đường dẫn tương đối
            String Path = "C:\\JSONFiles\\HashMapToJSONFiles.json";

            // b. Ghi dữ liệu xuống file JSon
            ObjectMapper objOMap = new ObjectMapper();
            objOMap.writeValue(new File(Path), objHash);
            System.out.println("Okie :))");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
