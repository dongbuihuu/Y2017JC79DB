package JAVACORE_TRAINING.OOPS_CONCEPTS.JSON_MODULES.JSONEXCERCISE;

import com.google.gson.Gson;

public class JSONAppParser {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String urlString = "http://hoidapit.com.vn/Service1.svc/getAppById/1d0fe8fa-aea3-4c6a-a07e-664d3dbda0de";
        try {
            //1. Đọc dữ liệu từ JSON API nhận về kiểu chuỗi
            String getData = Commons.readUrl(urlString);
            Gson objGson = new Gson();
            
            //2. Mapping dữ liệu từ JSONString --> Object Entity
            AppInfo objApp = objGson.fromJson(getData, AppInfo.class);           
            
            //3. Duyệt thông tin và hiển thị
            System.out.println("+ AverageRating: "+ objApp.getAverageRating());
            System.out.println("+ SizeApps: "+ objApp.getSizeApps());
            System.out.println("+ AppId: "+ objApp.getAppid());
            System.out.println("+ Catagory Name: "+ objApp.getCatagoryName());
            System.out.println("+ Catagory Id: "+ objApp.getCatagoryid());
            System.out.println("+ Description: "+ objApp.getDescription());
            System.out.println("+ Download Count: "+ objApp.getDownloadCount());
            System.out.println("+ Download Url: "+ objApp.getDownloadUrl());
            System.out.println("+ ErrorMessage: "+ objApp.getErrormessage());
            System.out.println("+ Icon: "+ objApp.getIcon());
            System.out.println("+ Image Code: "+ objApp.getImageCode());
            System.out.println("+ Name: "+ objApp.getName());
            System.out.println("+ Price: "+ objApp.getPrice());
            System.out.println("+ Provider Name: "+ objApp.getProviderName());
            System.out.println("+ Provider Id: "+ objApp.getProviderid());
            System.out.println("+ Return Code: "+ objApp.getReturnCode());
            System.out.println("+ Screen Height: "+ objApp.getScreen_height());
            System.out.println("+ Screen Width: "+ objApp.getScreen_width());
            System.out.println("+ Total Record: "+ objApp.getTotalrecord());
            System.out.println("+ Url Share: "+ objApp.getUrl_share());
            System.out.println("+ Vertions: "+ objApp.getVertions());
            System.out.println("+ View Count: "+ objApp.getView_count());
            int iCount = 0;
            for(ImageDescription obj : objApp.getLisDescription()){
                System.out.println("--> No: "+ (iCount + 1));
                System.out.println("--> AppId: "+ obj.getAppId());
                System.out.println("--> Des Images Id: "+ obj.getDes_Images_Id());
                System.out.println("--> Height: "+ obj.getHeight());
                System.out.println("--> Width: "+ obj.getWidth());
                System.out.println("--> Images URL: "+ obj.getImages_URL());
                System.out.println("--> Links: "+ obj.getLinks());
                System.out.println("--> Status: "+ obj.getStatus());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
