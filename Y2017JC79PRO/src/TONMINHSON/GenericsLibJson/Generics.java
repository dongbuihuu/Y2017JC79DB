package TONMINHSON.GenericsLibJson;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class Generics<E> {
	public boolean writeJson(File file, E objE) throws Exception {
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

	@SuppressWarnings("unchecked")
	public E readJson(File file, E objE, byte bOpt) throws Exception {
		ObjectMapper objMapper = new ObjectMapper();
		E result = null;
		List<E> dataList = null;
		try {
			if (bOpt == 0) {
				dataList = new ArrayList<>();
				dataList.add(objE);
				result = (E) objMapper.readValue(file, dataList.get(0).getClass());
			} else {
				result = objMapper.readValue(file, new TypeReference<E>() {
				});
			}
		} catch (Exception e) {

		}
		return result;
	}
}
