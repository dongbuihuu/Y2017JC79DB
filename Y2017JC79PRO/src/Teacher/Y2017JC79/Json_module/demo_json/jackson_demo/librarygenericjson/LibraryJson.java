package Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.librarygenericjson;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class LibraryJson<E> {

	// 1. Write from objects to json file
	public boolean writeJsonFile(File file, E objValue) throws Exception {

		boolean result = true;
		ObjectMapper objMapper = new ObjectMapper();

		try {
			objMapper.writeValue(file, objValue);

		} catch (Exception e) {
			result = false;
		}
		return result;

	}

	// 2. Read data from file *.json

	public E readJsonFile(File file, E objData, byte option) throws Exception {
		ObjectMapper objMapper = new ObjectMapper();
		E result = null;
		List<E> lstData = null;

		try {
			if (option == 0) {
				lstData = new ArrayList<E>();
				lstData.add(objData);
				result = (E) objMapper.readValue(file, lstData.get(0).getClass());
			} else {
				result = objMapper.readValue(file, new TypeReference<E>() {
				});

			}

		} catch (Exception e) {
			throw e;
		}

		return result;

	}

}
