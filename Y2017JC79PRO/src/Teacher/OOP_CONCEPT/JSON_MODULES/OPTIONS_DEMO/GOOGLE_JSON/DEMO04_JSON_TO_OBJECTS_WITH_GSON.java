package IMIC.NGUYENVANDOAN.JSONDEMO.GOOGLE_JSON;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;

import com.google.gson.Gson;

public class DEMO04_JSON_TO_OBJECTS_WITH_GSON {

    public static void main(String[] args) {
        // 1. Khai báo và khởi tạo đối tượng của Gson
        Gson objGson = new Gson();

        // 2. Lấy đường dẫn tương đối đến Resources trong Solution đang phát
        // triển.
        ClassLoader objcls = (Thread.currentThread()).getContextClassLoader();
        URL url = objcls.getResource("NGUYENVANDOAN/JSONDEMO/GSON/");

        // 3. Đọc dữ liệu trong files JSon chuyển vào Object
        try {
            BufferedReader objBR = new BufferedReader(new FileReader(url.getPath() + "ObjectToJSONFilesWithGson.json"));

            Students objStudent = objGson.fromJson(objBR, Students.class);

            System.out.println("+ RollNo: " + objStudent.getRollNo());
            System.out.println("+ FullName: " + objStudent.getFullName());
            System.out.println("+ Age: " + objStudent.getMark());

        } catch (Exception e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
    }
}
