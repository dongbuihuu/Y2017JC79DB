package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON.EXAMPLE04;

import java.util.List;
import com.google.gson.Gson;

public class Controllers {
	
	public ContentMetadata GetDataOfJSon(String ApiServ) throws Exception{
		//1. Khai báo và khởi tạo Model để thực thi nghiệp vụ
		String sData = new Models().readUrl(ApiServ);
		
		//2. Khai báo và khởi tạo Gson
		Gson objGson = new Gson();
		
		//3. Bindding toàn bộ dữ liệu từ JSon --> Object Java
		ContentMetadata objResult = objGson.fromJson(sData, ContentMetadata.class);
		
		//4. Trả đối tượng về cho Apps
		return objResult;
	}
}
