package first_programming_truongnm.genericjson;

import java.util.ArrayList;

import Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.common.EntityStudent;
import Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.librarygenericjson.GenericLibJson;

public class WriteObject {

	public static void main(String[] args) {

		ArrayList<EntityStudent> arrLst = new ArrayList<>();
		String strFile = null;
		
		EntityStudent sv1 = new EntityStudent(100, "Nguyen Van A", 10);
		EntityStudent sv2 = new EntityStudent(100, "Nguyen Van B", 8.5);
		EntityStudent sv3 = new EntityStudent(100, "Nguyen Van C", 7.5);
		EntityStudent sv4 = new EntityStudent(100, "Nguyen Van D", 6.0);
		arrLst.add(sv1);
		arrLst.add(sv2);
		arrLst.add(sv3);
		arrLst.add(sv4);
		
		File file = GenericJ
	}

}
