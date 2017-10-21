package Teacher.OOP_CONCEPT.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON.LIBRARY;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class Commons<T> {

	public boolean JSONWriteValue(File objFile, T objT) throws Exception {
		ObjectMapper objMap = new ObjectMapper();
		try {
			objMap.writeValue(objFile, objT);
		} catch (Exception e) {
			throw e;
		}
		return true;
	}

	/***
	 * + bOpt = 0: object; + bOpt = 1: List object;
	 * 
	 * @param objFile
	 * @param objT
	 * @param bOpt
	 * @return
	 * @throws Exception
	 */
	public T JSONReadValue(File objFile, T objT, byte bOpt) throws Exception {
		ObjectMapper objMap = new ObjectMapper();
		List<T> lisT = null;
		T objResult = null;
		try {
			if (bOpt == 0) {
				lisT = new ArrayList<T>();
				lisT.add(objT);
				objResult = (T) objMap.readValue(objFile, lisT.get(0).getClass());
			} else {
				objResult = objMap.readValue(objFile, new TypeReference<T>() {
				});
			}
		} catch (Exception e) {
			throw e;
		}
		return objResult;
	}
}
