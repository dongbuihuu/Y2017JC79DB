package JAVACORE_TRAINING.OOPS_CONCEPTS.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

public class DEMO02_JSON_TO_OBJECT_DEMO {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // 1. Khai báo và khởi tạo đối tượng từ lớp ObjectMapper.
        ObjectMapper objMaper = new ObjectMapper();

        // 2. Lấy đường dẫn tương đối tới files Json đã tạo ra trước đó.
        // a. Lấy đường dẫn tương đối
        String Path = "C:\\JSONFiles\\Students.json";

        try {
            // b. Đọc dữ liệu và mapping sang objects Java
            Students objStudent = objMaper.readValue(new File(Path), Students.class);

            // c. Hiển thị dữ liệu trong đối tượng ra bên ngoài:
            System.out.println("RollNo: " + objStudent.getRollNo());
            System.out.println("FullName: " + objStudent.getFullName());
            System.out.println("Mark: " + objStudent.getMark());

        } catch (Exception e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
    }

}
