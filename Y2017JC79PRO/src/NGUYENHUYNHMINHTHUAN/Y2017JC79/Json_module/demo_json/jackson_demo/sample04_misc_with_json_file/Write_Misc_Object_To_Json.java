package Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.sample04_misc_with_json_file;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.common.EntityStudent;
import Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.common.FilePath;
import Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.common.StudentMetaData;

public class Write_Misc_Object_To_Json {

	public static void main(String[] args) {
		// 1. Tạo ra 1 list các Student
		List<EntityStudent> lisStudent = new ArrayList<>();

		StudentMetaData lstMeta = new StudentMetaData();

		String strFile = null;
		String sExit = "";
		Scanner sc = new Scanner(System.in);

		// 2. Khai báo & khởi tạo các đối tượng Sinh viên
		do {
			EntityStudent sv = new EntityStudent();

			System.out.print("ID:");
			sv.setiID(sc.nextInt());
			sc.nextLine();

			System.out.print("FullName:");
			sv.setsFullName(sc.nextLine());

			System.out.print("Mark:");
			sv.setdMark(sc.nextDouble());
			sc.nextLine();

			lisStudent.add(sv);

			sc = new Scanner(System.in);
			System.out.println("Bạn có muốn nhập tiếp không (Y/N) ?");
			sExit = sc.nextLine();

		} while (sExit.toUpperCase().equals("Y"));

		// EntityStudent sv01 = new EntityStudent();
		// EntityStudent sv02 = new EntityStudent();
		// EntityStudent sv03 = new EntityStudent();
		// EntityStudent sv04 = new EntityStudent();
		//
		// // 3. Thiết lập đầy đủ thông tin cho 03 đối tượng SV
		// sv01.setiID(1);
		// sv01.setsFullName("Nguyễn Văn A");
		// sv01.setdMark(9.5);
		//
		// sv02.setiID(2);
		// sv02.setsFullName("Trần Thị B");
		// sv02.setdMark(3.5);
		//
		// sv03.setiID(3);
		// sv03.setsFullName("Ma Văn C");
		// sv03.setdMark(8);
		//
		// sv04.setiID(4);
		// sv04.setsFullName("Ma Văn Mèo");
		// sv04.setdMark(5.5);
		//
		// // 4. Đưa các sinh viên vào trong danh sách sinh viên
		// lisStudent.add(sv01);
		// lisStudent.add(sv02);
		// lisStudent.add(sv03);
		// lisStudent.add(sv04);

		// 5. Đưa vào metadata
		lstMeta.setiReturnCode(0);
		lstMeta.setsMessageText("");
		lstMeta.setiTotalRecord(lisStudent.size());
		lstMeta.setLisStudent(lisStudent);
		// 6. write to file

		File file = FilePath.SaveFile();

		if (file != null) {
			strFile = file.getAbsolutePath();

			ObjectMapper objMapper = new ObjectMapper();
			try {
				objMapper.writeValue(new File(strFile), lstMeta);
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
