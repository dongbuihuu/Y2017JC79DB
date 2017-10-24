package Teacher.OOP_CONCEPT.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON.EXAMPLE05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import com.google.gson.Gson;

public class StudentModel {
	/***
	 * Nghiệp vụ đọc dữ liệu JSON từ API Services
	 * 
	 * @param urlString
	 * @return
	 * @throws Exception
	 */
	private String readUrl(String urlString) throws Exception {
		BufferedReader reader = null;
		try {
			URL url = new URL(urlString);
			reader = new BufferedReader(new InputStreamReader(url.openStream()));
			StringBuffer buffer = new StringBuffer();
			int read;
			char[] chars = new char[1024];
			while ((read = reader.read(chars)) != -1)
				buffer.append(chars, 0, read);

			return buffer.toString();
		} finally {
			if (reader != null)
				reader.close();
		}
	}

	public StudentMetaData GetElements(String ApiServ) throws Exception {
		// 1. Thực thi nghiệp vụ và nhận về chuỗi giá trị
		String sData = readUrl(ApiServ);

		// 2. Khai báo và khởi tạo Gson
		Gson objGson = new Gson();

		// 3. Bindding toàn bộ dữ liệu từ JSon --> Object Java
		StudentMetaData objResult = objGson.fromJson(sData, StudentMetaData.class);

		// 4. Trả đối tượng về cho Apps
		return objResult;
	}
}
