package JAVACORE_TRAINING.OOPS_CONCEPTS.JSON_MODULES.JSONEXCERCISE.CMSAPI;

import com.google.gson.Gson;

public class Controllers {	
	
	public CarEntity GetDataOfJSon(String ApiServ) throws Exception{
		//1. Khai báo và khởi tạo Model để thực thi nghiệp vụ
		String sData = new Models().readUrl(ApiServ);
		
		//2. Khai báo và khởi tạo Gson
		Gson objGson = new Gson();
		
		//3. Bindding toàn bộ dữ liệu từ JSon --> Object Java
		CarEntity objCar = objGson.fromJson(sData, CarEntity.class);
		
		//4. Trả đối tượng về cho Apps
		return objCar;
	}
}
