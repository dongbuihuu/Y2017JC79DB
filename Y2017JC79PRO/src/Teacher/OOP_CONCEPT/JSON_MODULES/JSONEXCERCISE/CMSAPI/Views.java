package JAVACORE_TRAINING.OOPS_CONCEPTS.JSON_MODULES.JSONEXCERCISE.CMSAPI;

public class Views {

	public static void main(String[] args) {
		//1. Khai báo và khởi tạo chuỗi ApiService
		String ApiServ = "http://hoidapit.edu.vn/Service1.svc/API_GetSalonAll";
		
		//2. Khai báo và khởi tạo Controllers
		Controllers objController = new Controllers();
		
		//3. Khởi tạo CarEntity
		try {
			CarEntity objCar = objController.GetDataOfJSon(ApiServ);
			System.out.println("+ Total Record: "+ objCar.getTotalRecord());
			System.out.println("+ Return Code: "+ objCar.getReturnCode());			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
