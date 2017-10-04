package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON.EXAMPLE04;

import java.util.List;

public class Views {
	public static void main(String[] args) {
		// 1. Khai báo và khởi tạo chuỗi ApiService
		String ApiServ = "http://hoidapit.edu.vn/Service1.svc/API_GetAllLoaiKm";

		// 2. Khai báo và khởi tạo Controllers
		Controllers objController = new Controllers();

		// 3. Khởi tạo CarEntity
		try {
			ContentMetadata objResult = objController.GetDataOfJSon(ApiServ);			
			System.out.println("+ ErrorMessage: "+ objResult.getErrorMessage());
			System.out.println("+ ReturnCode: "+ objResult.getReturnCode());
			System.out.println("+ TotalRecord: "+ objResult.getTotalRecord());
			
			List<DisCountEntity> lisDiscount = objResult.getResults();
			for (DisCountEntity disCountEntity : lisDiscount) {
				System.out.println(disCountEntity);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
