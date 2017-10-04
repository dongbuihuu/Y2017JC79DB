package src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.TRUONGTHANHDUC.Controller;

import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;

import src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.TRUONGTHANHDUC.Common.Common;
import src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.TRUONGTHANHDUC.Entity.StudentObject;
import src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.TRUONGTHANHDUC.Model.Model;


public class Controller extends BaseController<StudentObject>{
	private Connection m_objConnection;
	private Model m_objModel;
	
	public Controller(Connection objConnection){
		m_objConnection = objConnection;
	}
	
	@Override
	public DefaultTableModel BinddingOf() throws Exception {
		//1.Ủy quyền thực thi và nhận về 1 ResultSet
		ResultSet objRs = m_objModel.getElement();
		
		//2.Khởi tạo đối tượng Common để chuyển đổi dữ liệu
		//ResultSet --> DefaultTableModel
		return new Common().getDataModels(objRs);
	}

	@Override
	public DefaultTableModel BinddingOfStudent(StudentObject objT) throws Exception {
		//1.Ủy quyền thực thi và nhận về 1 ResultSet
		ResultSet objRs = m_objModel.addStudent(objT);
		
		//2.Khởi tạo đối tượng Common để chuyển đổi dữ liệu
				//ResultSet --> DefaultTableModel
		return new Common().getDataModels(objRs);
	}

}
