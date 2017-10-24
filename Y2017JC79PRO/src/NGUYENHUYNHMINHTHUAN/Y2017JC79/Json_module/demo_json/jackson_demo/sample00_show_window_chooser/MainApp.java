package Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.sample00_show_window_chooser;

import java.io.File;

import Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.common.EntityStudent;
import Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.common.FilePath;
import Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.librarygenericjson.GenericLibJson;

public class MainApp {
	public static void main(String[] args) {
		EntityStudent objStudent = new EntityStudent();
		objStudent.setiID(100);
		objStudent.setsFullName("Nguyễn văn A");
		objStudent.setdMark(8.5);

		File file = FilePath.SaveFile();

		if (file != null) {
			String strFile = file.getAbsolutePath();
			GenericLibJson<EntityStudent> json = new GenericLibJson<>();
			try {
				boolean kq = json.writeFileJson(new File(strFile), objStudent);
				if (kq) {
					System.out.println("Thanh cong");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
