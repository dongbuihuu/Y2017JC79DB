package src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.DANGTIENLONG;

import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;



public class JController implements BaseController<ClassInfo>{
	private Connection m_objConnection;
	private JModel m_objModel;
	public JController(Connection objConnection) {
		m_objConnection = objConnection;
		m_objModel = new JModel(objConnection);
}	

public DefaultTableModel BindingOf() throws Exception {
	//1. Ủy quyền thực thi để nhận về 1 Resultset từ models
	ResultSet objRs = m_objModel.getElement();
	
	//2. Khai báo & khởi tạo đối tượng Commons để chuyển đổi dữ liệu
	  //ResultSet --> DefaultTableModel		
	return new Common().getData(objRs);
	}

@Override
public boolean UpdateElement(ClassInfo objClass) throws Exception {
	if (m_objModel.WriteElement(objClass))
		return true;
	else return false;
}

}

