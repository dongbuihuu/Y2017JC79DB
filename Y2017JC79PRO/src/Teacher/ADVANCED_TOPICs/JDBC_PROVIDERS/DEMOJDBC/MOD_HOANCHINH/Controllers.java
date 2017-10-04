package JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.DEMOJDBC.MOD_HOANCHINH;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;
public class Controllers 
			extends BaseController<EventObject> {
	private Connection m_objConnection;
	private Models m_objModel;
	
	public Controllers(Connection objConnection) {
			m_objConnection = objConnection;
			m_objModel = new Models(objConnection);
	}	
	
	@Override
	protected DefaultTableModel BindingOf() throws Exception {
		//1. Ủy quyền thực thi để nhận về 1 Resultset từ models
		ResultSet objRs = m_objModel.getElement();
		
		//2. Khai báo & khởi tạo đối tượng Commons để chuyển đổi dữ liệu
		  //ResultSet --> DefaultTableModel		
		return new Commons().getDataModels(objRs);
	}
}
