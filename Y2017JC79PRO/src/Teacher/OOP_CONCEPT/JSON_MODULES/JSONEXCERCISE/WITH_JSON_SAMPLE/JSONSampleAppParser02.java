package JAVACORE_TRAINING.ADVANCED_TOPICS.JSON_MODULES.JSONEXCERCISE.WITH_JSON_SAMPLE;

import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JSONSampleAppParser02 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String urlString = "http://hoidapit.com.vn/Service1.svc/getAppById/1d0fe8fa-aea3-4c6a-a07e-664d3dbda0de";
        try {
            CONTROLLERS objController = new CONTROLLERS();
            AppInfo objApps = objController.getObjectAppsInfo(urlString);
            System.out.println("Download Url: "+ objApps.getDownloadUrl());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
