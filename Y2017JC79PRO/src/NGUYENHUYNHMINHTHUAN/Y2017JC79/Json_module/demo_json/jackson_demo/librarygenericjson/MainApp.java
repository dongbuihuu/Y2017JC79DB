package NGUYENHUYNHMINHTHUAN.Y2017JC79.Json_module.demo_json.jackson_demo.librarygenericjson;

import java.io.File;
import java.util.ArrayList;

import NGUYENHUYNHMINHTHUAN.Y2017JC79.Json_module.demo_json.jackson_demo.common.EntityStudent;
import NGUYENHUYNHMINHTHUAN.Y2017JC79.Json_module.demo_json.jackson_demo.common.FilePath;

public class MainApp {

	public static void main(String[] args) {
		ArrayList<EntityStudent> listStudent = new ArrayList<EntityStudent>();
		String strFile = "";
		EntityStudent sv1 = new EntityStudent();
		sv1.setiID(1);
		sv1.setsFullName("Minh Thuan");
		sv1.setdMark(8);
		listStudent.add(sv1);

		File file = FilePath.SaveFile();
		strFile = file.getAbsolutePath();

		GenericLibJson<EntityStudent> objData = new GenericLibJson<EntityStudent>();

		boolean kq = objData.writeFileJson(new File(strFile), listStudent);

	}

}
