package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.SERIZABLES.EXCERCISES;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import com.google.gson.Gson;

public class MODELS<T> {

	public boolean WriteListObjectIntoFiles(
			List<T> lisValue, String fileName) throws Exception {
		try {
			File objFile = new File(fileName);
			FileOutputStream objOutFile = new FileOutputStream(objFile);
			ObjectOutputStream objOoS = new ObjectOutputStream(objOutFile);
			objOoS.writeObject(lisValue);
			objOoS.flush();
		} catch (Exception e) {
			throw e;
		} return true;
	}

	public List<T> ReadListObjectIntoFiles(
						String fileName) throws Exception {
		List<T> lisValue = null;
		try {
			File objFile = new File(fileName);
			ObjectInputStream objObjectIn = new ObjectInputStream(new FileInputStream(objFile));
			lisValue = (List<T>) objObjectIn.readObject();
		} catch (Exception e) {
			throw e;
		} return lisValue;
	}
	
	public DefaultTableModel getDataModels(
								List<T> lisT) throws Exception {
		// 1. Khởi tạo đối tượng DefaultTableModel chứa thông tin Hàng và Cột
		DefaultTableModel objDTM = new DefaultTableModel();
		Vector<String> col_name = new Vector<String>();
		Vector<String> row = null;

		// 2. Khởi tạo thông tin column			
		Field[] objF = lisT.get(0).getClass().getDeclaredFields();
		for (int i = 0; i < objF.length; i++) {
			col_name.addElement(objF[i].getName());
		}
		objDTM.setColumnIdentifiers(col_name);
		Gson gson = new Gson();
		
		// 3. Duyệt và khởi tạo thông tin Row
		Object[] objO = new Object[lisT.size()];
		
		for (int i = 0; i < lisT.size(); i++) {
			//objO[i] = lisT.get(i);
			String strTemp = gson.toJson(lisT.get(i));
			int iIndex = 0;
			row = new Vector<String>();
			for(int j=0;j<col_name.size();j++){
				iIndex = strTemp.indexOf(objF[j].getName());
	        	 if ('"' == strTemp.charAt(iIndex + objF[j].getName().length()+2))
	        	 {
	        		 if((objF.length - j) > 1)
	        			  row.add(strTemp.substring(iIndex + objF[j].getName().length()+3, strTemp.indexOf(objF[j+1].getName()) -3 ));
	        		 else row.add(strTemp.substring(iIndex + objF[j].getName().length()+3, strTemp.length() - 2));
	        	 }
	        	 else 
	        	 {
	        		 if((objF.length - j) > 1)
	        			  row.add(strTemp.substring(iIndex + objF[j].getName().length()+2, strTemp.indexOf(objF[j+1].getName()) -2 ));
	        		 else row.add(strTemp.substring(iIndex + objF[j].getName().length()+2, strTemp.length() - 1));
	        	 }
				//Dành cho các chuyên gia
				//String sValue = objO[i]
				//row.add(objO[i][j])
			}			
			objDTM.addRow(row);
		}return objDTM;
	}
}
