package Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.librarygenericjson;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class GenericLibJson<E> {

	public boolean writeFileJson(File file, E objE) throws Exception {
		boolean result = false;

		ObjectMapper objMapper = new ObjectMapper();
		try {
			objMapper.writeValue(file, objE);
			result = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return result;
	}

	// 2. Read data from the json file.

	@SuppressWarnings("unchecked")
	public E readFileJson(File file, E objE, byte bOpt) throws Exception {
		ObjectMapper objMapper = new ObjectMapper();
		E result = null;
		List<E> lstData = null; // Trong truong hop doc mot object
		try {
			// Quy dinh doc mot object
			if (bOpt == 0) {
				lstData = new ArrayList<E>();
				lstData.add(objE);
				result = (E) objMapper.readValue(file, lstData.get(0).getClass());
			} else {
				result = objMapper.readValue(file, new TypeReference<E>() {
				});

			}

		} catch (Exception e) {

		}

		return result;

	}

}
