package src.JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.QUANLYSINHVIEN.HOCVIENNOPBAI.DANGTIENLONG;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JModel implements BaseModel<ClassInfo>{

	private Connection m_objConnection;
	
    int rs;
	public JModel(Connection objConnection) {
			m_objConnection = objConnection;
	}
	@Override
	public ResultSet getElement() throws Exception {
		CallableStatement objCmst;
		try{
		objCmst = m_objConnection.prepareCall("{call SP_EVENT_ALL()}");
		
		}catch(Exception e){
			throw e;
		}
		
		return objCmst.executeQuery();
	}
	@Override
	public boolean WriteElement(ClassInfo objClass ) throws Exception {
		if(m_objConnection == null)
			return false;
		try {
			CallableStatement insertNewClass= m_objConnection.prepareCall("{call dbo.InsertDataToLopHoc(?, ?, ?, ?, ?) }");
			insertNewClass.setInt(1, objClass.getMaLop());
			insertNewClass.setString(2, objClass.getTenLop());
			insertNewClass.setInt(3, objClass.getSoSinhvien());
			
			
			insertNewClass.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	
	
}

