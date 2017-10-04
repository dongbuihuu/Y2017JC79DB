package IMIC.NGUYENVANDOAN.JSONDEMO.GOOGLE_JSON;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class DEMO02_JSON_TO_LIST_WITH_GSON {

    public static void main(String[] args) {
        // 1. Khai báo và khởi tạo đối tượng của Gson
        Gson objG = new Gson();

        // 2. Lấy đường dẫn tương đối đến Resources trong Solution đang phát
        // triển.
        ClassLoader objcls = (Thread.currentThread()).getContextClassLoader();
        URL url = objcls.getResource("NGUYENVANDOAN/JSONDEMO/GSON/");

        // 3. Đọc dữ liệu trong files JSon chuyển vào List<T>
        try {
            BufferedReader objBR = new BufferedReader(new FileReader(url.getPath() + "ListToJSONFilesWithGson.json"));

            // C1: Tường minh từng bước xử lý
            /*
             * Type listType = new TypeToken<List<Students>>() { }.getType();
             * List<Students> objList = objG.fromJson(objBR, listType);
             */

            // C2:
            List<Students> objList = objG.fromJson(objBR, new TypeToken<List<Students>>() {
            }.getType());

            // 4. Duyệt và hiển thị thông tin
            for (int i = 0; i < objList.size(); i++) {
                System.out.println("---------" + objList.get(i).getFullName() + "------------");
                System.out.println("+ RollNo: " + objList.get(i).getRollNo());
                System.out.println("+ FullName: " + objList.get(i).getFullName());
                System.out.println("+ Age: " + objList.get(i).getMark());
            }
        } catch (Exception e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
    }
}
