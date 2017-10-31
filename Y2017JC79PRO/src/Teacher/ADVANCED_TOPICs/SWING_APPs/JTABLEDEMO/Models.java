package Teacher.ADVANCED_TOPICs.SWING_APPs.JTABLEDEMO;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class Models<T> {

	public DefaultTableModel ConvertListTtoDTM(List<T> lisT) throws Exception {
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
