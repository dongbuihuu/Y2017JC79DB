package JAVACORE_TRAINING.ADVANCED_TOPICS.JSON_MODULES.JSONEXCERCISE.WITH_JSON_SAMPLE;

import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JSONSampleAppParser {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String urlString = "http://hoidapit.com.vn/Service1.svc/getAppById/1d0fe8fa-aea3-4c6a-a07e-664d3dbda0de";
        try {
            // 1. Lấy dữ liệu về từ API Services
            String JsonString = IOUtils.toString(new URL(urlString));
            JSONObject objJSON = (JSONObject) JSONValue.parseWithException(JsonString);

            // 2. Lấy dữ liệu kiểu List Data
            JSONArray objJSONArr = (JSONArray) objJSON.get("lisDescription");

            // 3. Hiển thị 01 note trong JSon
            System.out.println("+ AverageRating: " + objJSON.get("AverageRating"));

            // 3. Duyệt và mapping dữ liệu vào Objects
            JSONObject objJ = null;
            for (int i = 0; i < objJSONArr.size(); i++) {
                objJ = (JSONObject) objJSONArr.get(i);
                System.out.println("--> No: " + (i + 1));
                System.out.println("--> AppId: " + objJ.get("AppId"));
                System.out.println("--> Des Images Id: " + objJ.get("Des_Images_Id"));
                System.out.println("--> Height: " + objJ.get("Height"));
                System.out.println("--> Width: " + objJ.get("Width"));
                System.out.println("--> Images URL: " + objJ.get("Images_URL"));
                System.out.println("--> Links: " + objJ.get("Links"));
                System.out.println("--> Status: " + objJ.get("Status"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
