package src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.TRUONGTHANHDUC.Model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.TRUONGTHANHDUC.Entity.StudentObject;

public class Model extends BaseModel<StudentObject> {
	private Connection m_objConnection;

	public Model(Connection objConnection) {
		m_objConnection = objConnection;
	}

	@Override
	public ResultSet getElement() throws Exception {
		// 1.Khai báo đối tượng ResultSet
		ResultSet objRs = null;
		CallableStatement objCmst = null;

		// 2.Khởi tạo CallableStatement
		String sql = "{call SP_SHOWALLSTUDENT(?)}";

		try {
			objCmst = m_objConnection.prepareCall(sql);
			objCmst.setInt("MALH", 1);
		} catch (Exception e) {
			throw e;
		}

		// Thực thi truy vấn
		objRs = objCmst.executeQuery();
		return objRs;
	}

	@Override
	public ResultSet addStudent(StudentObject objT) throws Exception {
		// 1.Khai báo đối tượng ResultSet
		ResultSet objRs = null;
		CallableStatement objCmst = null;

		// 2.Khởi tạo CallableStatement
		String sql = "{call SP_ADD_STUDENTS(?,?,?,?)}";

		try {
			objCmst = m_objConnection.prepareCall(sql);
		} catch (Exception e) {
			throw e;
		}

		// Thực thi truy vấn
		objRs = objCmst.executeQuery();
		return objRs;
	}

}
