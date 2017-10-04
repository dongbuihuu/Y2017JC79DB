package IMIC.NGUYENVANDOAN.JSONDEMO.GOOGLE_JSON;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class DEMO01_LIST_TO_JSON_WITH_GSON {

    public static void main(String[] args) {
        // 1. Khai báo và khởi tạo List<đối tượng>
        List<Students> lisStudent = new ArrayList<Students>();

        // 2. Khai báo và khởi tạo các đối tượng
        Students objA = new Students();
        Students objB = new Students();

        objA.setRollNo(100);
        objA.setFullName("Nguyễn Văn A");
        objA.setMark(8.5);

        objB.setRollNo(200);
        objB.setFullName("Hoàng Văn B");
        objB.setMark(9.5);

        lisStudent.add(objA);
        lisStudent.add(objB);

        // 3. Lấy đường dẫn tương đối đến Resources trong Solution đang phát
        // triển.
        ClassLoader objcls = (Thread.currentThread()).getContextClassLoader();
        URL url = objcls.getResource("NGUYENVANDOAN/JSONDEMO/GSON/");

        // 4. Khai báo và khởi tạo đối tượng của Gson
        Gson objG = new Gson();

        // 5. Chuyển dữ liệu trong List<T> --> thành format JSon
        String JSonString = objG.toJson(lisStudent); // {"RollNo":"100",...}

        // 6. Sử dụng đối tượng FileWriter
        FileWriter objFW;
        try {
            objFW = new FileWriter(new File(url.getPath().toString() + "ListToJSONFilesWithGson.json"));
            objFW.write(JSonString);
            objFW.close();
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
        System.out.println("Ghi files thành công!!!");
    }
}
