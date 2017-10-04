package JAVACORE_TRAINING.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON.EXAMPLE05;
import java.util.List;

public class MAINAPPs {
	public static void main(String[] args) {
		// 1. Khai báo và khởi tạo chuỗi ApiService
		String ApiServ = "http://hoidapit.edu.vn/Service1.svc/api_getStudentInfo";

		// 2. Khai báo và khởi tạo Controllers
		StudentController objController = new StudentController();

		// 3. Khởi tạo CarEntity
		try {
			StudentMetaData objResult = objController.getDataAPIOf(ApiServ, (byte)0);
			System.out.println("+ ErrorMessage: " + objResult.getsMessageText());
			System.out.println("+ ReturnCode: " + objResult.getiReturnCode());
			System.out.println("+ TotalRecord: " + objResult.getiTotalRecord());

			List<StudentEntity> lisStudent = objResult.getLisStudent();
			for (StudentEntity obj : lisStudent) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
