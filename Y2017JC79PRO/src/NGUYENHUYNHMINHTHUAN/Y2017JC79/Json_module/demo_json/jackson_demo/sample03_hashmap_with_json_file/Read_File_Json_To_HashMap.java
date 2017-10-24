package Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.sample03_hashmap_with_json_file;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.common.EntityStudent;
import Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.common.FilePath;

public class Read_File_Json_To_HashMap {

	public static void main(String[] args) {
		String strFile = null;
		File file = FilePath.openFile();

		if (file != null) {
			strFile = file.getAbsolutePath();

			ObjectMapper objMapper = new ObjectMapper();
			try {

				HashMap<Integer, List<EntityStudent>> objHashStudent = objMapper.readValue(new File(strFile),
						new TypeReference<HashMap<Integer, List<EntityStudent>>>() {
						});

				for (int i = 0; i < objHashStudent.size(); i++) {
					List<EntityStudent> lst = objHashStudent.get(i);

					for (EntityStudent objS : lst) {
						System.out.println(objS);
					}
				}

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
