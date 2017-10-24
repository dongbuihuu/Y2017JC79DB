package Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.sample02_listobject_with_json;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.common.EntityStudent;
import Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.common.FilePath;

public class Read_FileJson_To_ListObject {

	public static void main(String[] args) {
		String strFile = null;
		File file = FilePath.openFile();

		if (file != null) {
			strFile = file.getAbsolutePath();

			ObjectMapper objMapper = new ObjectMapper();

			try {

				List<EntityStudent> lisStudent = objMapper.readValue(new File(strFile),
						new TypeReference<List<EntityStudent>>() {
						});

				for (EntityStudent entityStudent : lisStudent) {
					System.out.println(entityStudent);
				}
				//
				// for (EntityStudent objS : lisStudent) {
				// System.out.println("+ RollNo: " + objS.getiID());
				// System.out.println("+ FullName: " + objS.getsFullName());
				// System.out.println("+ Mark: " + objS.getdMark());
				// }

			} catch (JsonGenerationException e) {

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
