package JAVACORE_TRAINING.ADVANCED_TOPICS.JSON_MODULES.JSONEXCERCISE.WITH_JSON_SAMPLE;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class CONTROLLERS {

    /***
     * Nghiệp vụ lấy dữ liệu từ API Services --> Mapping vào Object Entity
     * @param Url
     * @return
     * @throws Exception
     */
    public AppInfo getObjectAppsInfo(String Url) throws Exception {
        // 1. Lấy dữ liệu về từ API Services
        String JsonString = IOUtils.toString(new URL(Url));
        JSONObject objJSON = (JSONObject) JSONValue.parseWithException(JsonString);

        // 2. Khai báo và khởi tạo đối tượng
        AppInfo objApps = new AppInfo();
        List<ImageDescription> lisImage = new ArrayList<ImageDescription>();

        objApps.setAverageRating("" + objJSON.get("AverageRating"));
        objApps.setSizeApps("" + objJSON.get("SizeApps"));
        objApps.setAppid("" + objJSON.get("appid"));
        objApps.setCatagoryName("" + objJSON.get("catagoryName"));
        objApps.setCatagoryid("" + objJSON.get("catagoryid"));
        objApps.setDescription("" + objJSON.get("description"));
        objApps.setDownloadCount(Integer.parseInt("" + objJSON.get("downloadCount")));
        objApps.setDownloadUrl("" + objJSON.get("downloadUrl"));
        objApps.setErrormessage("" + objJSON.get("errormessage"));
        objApps.setIcon("" + objJSON.get("icon"));
        objApps.setImageCode("" + objJSON.get("imageCode"));
        objApps.setName("" + objJSON.get("name"));
        objApps.setPrice("" + objJSON.get("price"));
        objApps.setProviderName("" + objJSON.get("providerName"));
        objApps.setProviderid("" + objJSON.get("providerid"));
        objApps.setReturnCode("" + objJSON.get("returnCode"));
        objApps.setScreen_width(Integer.parseInt("" + objJSON.get("screen_width")));
        objApps.setScreen_height(Integer.parseInt("" + objJSON.get("screen_height")));
        objApps.setTotalrecord("" + objJSON.get("totalrecord"));
        objApps.setUrl_share("" + objJSON.get("url_share"));
        objApps.setVertions("" + objJSON.get("vertions"));
        objApps.setView_count("" + objJSON.get("view_count"));

        // 3. Lấy dữ liệu kiểu List Data
        JSONArray objJSONArr = (JSONArray) objJSON.get("lisDescription");

        // 4. Duyệt và mapping dữ liệu vào Objects
        JSONObject objJ = null;
        ImageDescription objImages = null;
        for (int i = 0; i < objJSONArr.size(); i++) {
            objJ = (JSONObject) objJSONArr.get(i);
            objImages = new ImageDescription();
            objImages.setAppId("" + objJ.get("AppId"));
            objImages.setDes_Images_Id("" + objJ.get("Des_Images_Id"));
            objImages.setHeight(Integer.parseInt("" + objJ.get("Height")));
            objImages.setWidth(Integer.parseInt("" + objJ.get("Width")));
            objImages.setImages_URL("" + objJ.get("Images_URL"));
            objImages.setLinks("" + objJ.get("Links"));
            objImages.setStatus("" + objJ.get("Status"));

            lisImage.add(objImages);
        }

        // 5. Gắn thông tin List Images vào đối tượng
        objApps.setLisDescription(lisImage);

        // 6. Trả đối tượng về cho Apps
        return objApps;
    }
}
