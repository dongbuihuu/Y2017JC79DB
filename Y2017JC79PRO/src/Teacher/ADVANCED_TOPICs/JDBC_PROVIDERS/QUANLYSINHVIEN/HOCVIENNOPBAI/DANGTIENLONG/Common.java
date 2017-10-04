package src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.DANGTIENLONG;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Field;

public class Common<T> {
	public DefaultTableModel getData(ResultSet objS) throws Exception{
		DefaultTableModel objTDM = new DefaultTableModel();
		
		try {
			int icount = 0;
			
			//Lay Data
			ResultSetMetaData objMeta = objS.getMetaData();
			
			//Dem so cot
			int col = objMeta.getColumnCount();
			
			objTDM = new DefaultTableModel();
			Vector<String> col_name = new Vector<String>();
			Vector<String> row_name = new Vector<String>();
			
			//Lay cac field cua cot
			for (int i = 1; i < col; i++){
				col_name.addElement(objMeta.getColumnName(i));
			}
			objTDM.setColumnIdentifiers(col_name);
			
			//Lay Data cua Hang
			while(objS.next()){
				 row_name = new Vector<String>();
				 for(int j = 1; j < col; j++){
					 row_name.addElement(objS.getString(j));
				 }
				 objTDM.addRow(row_name);
				 icount++;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}
		return objTDM;
		
	}
	public DefaultTableModel getData(List<T> lisT) throws Exception{
		DefaultTableModel objDTM = new DefaultTableModel();
		Vector<String> col_name = new Vector<String>();
		Vector<String> row = null;
		
		//Lay cac Field luu vao cot
		java.lang.reflect.Field[] objF = lisT.get(0).getClass().getDeclaredFields();
		
		for(int i = 0; i<objF.length; i++){
			col_name.addElement(objF[i].getName());
			
		}
		objDTM.setColumnIdentifiers(col_name);
		
		//Lay Data luu vao hang
		for(int j = 0; j < lisT.size(); j++){
			row = new Vector<String>();
			for (java.lang.reflect.Field field : objF) {
				java.lang.reflect.Field Ftemp = lisT.get(j).getClass()
						.getDeclaredField(field.getName());
				Ftemp.setAccessible(true);				
				row.add(Ftemp.get(lisT.get(j))+"");
			} 
			objDTM.addRow(row);
		}
		return objDTM;
	}
	
}
