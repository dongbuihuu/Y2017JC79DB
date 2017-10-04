package IMIC.NGUYENVANDOAN.JSONDEMO.GOOGLE_JSON;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import com.google.gson.Gson;

public class DEMO03_OBJECT_TO_JSON_WITH_GSON {

    public static void main(String[] args) {
        // 1. Khai báo và khởi tạo đối tượng
        Students objStudent = new Students();

        // 2. Khai báo và khởi tạo đối tượng của Gson
        Gson objGson = new Gson();

        // 3. Lấy đường dẫn tương đối đến Resources trong Solution đang phát
        // triển.
        ClassLoader objcls = (Thread.currentThread()).getContextClassLoader();
        URL url = objcls.getResource("NGUYENVANDOAN/JSONDEMO/GSON/");

        // 5. Chuyển dữ liệu trong Object --> thành format JSon
        String JSonString = objGson.toJson(objStudent); // {"RollNo":"100",...}

        // 6. Sử dụng đối tượng FileWriter
        FileWriter objFW;
        try {
            objFW = new FileWriter(new File(url.getPath().toString() + "ObjectToJSONFilesWithGson.json"));
            objFW.write(JSonString);
            objFW.close();
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
        System.out.println("Ghi files thành công!!!");
    }
}
