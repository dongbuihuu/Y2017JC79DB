package Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.sample03_hashmap_with_json_file;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.common.EntityStudent;
import Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.common.FilePath;

public class Write_Hashmap_To_Json_File {

	public static void main(String[] args) {
		// 1. Khai báo một hashmap chứa thông tin sinh viên
		HashMap<Integer, List<EntityStudent>> objHashStudent = new HashMap<Integer, List<EntityStudent>>();

		// 2. Khai báo & khởi tạo các đối tượng Sinh viên
		List<EntityStudent> lisStudent = new ArrayList<EntityStudent>();

		EntityStudent sv01 = new EntityStudent();
		EntityStudent sv02 = new EntityStudent();
		EntityStudent sv03 = new EntityStudent();

		// 3. Thiết lập đầy đủ thông tin cho 03 đối tượng SV
		sv01.setiID(1);
		sv01.setsFullName("Nguyễn Văn A");
		sv01.setdMark(9.5);

		sv02.setiID(2);
		sv02.setsFullName("Trần Thị B");
		sv02.setdMark(3.5);

		sv03.setiID(3);
		sv03.setsFullName("Ma Văn C");
		sv03.setdMark(8);

		// 4. Đưa các sinh viên vào trong danh sách sinh viên
		lisStudent.add(sv01);
		lisStudent.add(sv02);
		lisStudent.add(sv03);

		// 5. Đưa vào listSV
		objHashStudent.put(0, lisStudent);

		// 6. Gọi mở cửa sổ chọn file và thực hiện ghi xuống file
		String strFile = null;
		File file = FilePath.SaveFile();

		if (file != null) {
			strFile = file.getAbsolutePath();

			ObjectMapper objMapper = new ObjectMapper();
			try {
				objMapper.writeValue(new File(strFile), objHashStudent);
				JOptionPane.showMessageDialog(null, "Lưu file json thành công");

			} catch (JsonGenerationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
