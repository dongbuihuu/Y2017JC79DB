package JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.TRUONGTHANHDUC.Common;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.List;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class Common<T> {
	public DefaultTableModel getDataModels(ResultSet objRS) throws Exception {
		DefaultTableModel objDTM = new DefaultTableModel();
		try {
			int iCount = 0;
			// 1. Binding dữ liệu từ ResultSet vào đối tượng ResultSetMetaData
			ResultSetMetaData objRSData = objRS.getMetaData();
			int col = objRSData.getColumnCount();

			// 2. Khởi tạo đối tượng DefaultTableModel chứa thông tin Hàng và
			// Cột
			objDTM = new DefaultTableModel();
			Vector<String> col_name = new Vector<String>();
			Vector<String> row = new Vector<String>();

			// 3. Duyệt và khởi tạo thông tin column
			for (int i = 1; i <= col; i++) {
				col_name.addElement(objRSData.getColumnName(i));
			}
			objDTM.setColumnIdentifiers(col_name);

			// 4. Duyệt và khởi tạo thông tin Row
			while (objRS.next()) {
				row = new Vector<String>();
				for (int j = 1; j <= col; j++) {
					row.addElement(objRS.getString(j));
				}
				objDTM.addRow(row);
				iCount++;
			}
		} catch (Exception ex) {
			throw ex;
		}
		return objDTM;
	}

	public DefaultTableModel getDataModels(List<T> lisT) throws Exception {
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

		// Khởi tạo thông tin với Row
		for (int i = 0; i < lisT.size(); i++) {
			row = new Vector<String>();
			for (Field field : objF) {
				Field Ftemp = lisT.get(i).getClass().getDeclaredField(field.getName());
				Ftemp.setAccessible(true);
				row.add(Ftemp.get(lisT.get(i)) + "");
			}
			objDTM.addRow(row);
		}
		return objDTM;
	}
}
