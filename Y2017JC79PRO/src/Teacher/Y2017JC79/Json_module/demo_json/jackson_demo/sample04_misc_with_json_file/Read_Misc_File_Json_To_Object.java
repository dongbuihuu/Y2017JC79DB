package Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.sample04_misc_with_json_file;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.common.EntityStudent;
import Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.common.FilePath;
import Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.common.StudentMetaData;

public class Read_Misc_File_Json_To_Object {

	public static void main(String[] args) {
		String strFile = null;
		File file = FilePath.openFile();

		if (file != null) {
			strFile = file.getAbsolutePath();

			ObjectMapper objMapper = new ObjectMapper();
			try {

				StudentMetaData lstMetaData = objMapper.readValue(new File(strFile), StudentMetaData.class);
				System.out.println("iReturnCode " + lstMetaData.getiReturnCode());
				System.out.println("sMessageText " + lstMetaData.getsMessageText());
				System.out.println("iTotalRecord " + lstMetaData.getiTotalRecord());

				List<EntityStudent> lstStudent = lstMetaData.getLisStudent();
				for (EntityStudent entityStudent : lstStudent) {
					System.out.println(entityStudent);
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
