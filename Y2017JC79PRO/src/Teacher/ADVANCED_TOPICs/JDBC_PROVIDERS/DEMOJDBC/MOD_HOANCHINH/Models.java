package JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.DEMOJDBC.MOD_HOANCHINH;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Models 
		extends BaseModel<EventObject> {
	private Connection m_objConnection;
	public Models(Connection objConnection) {
			m_objConnection = objConnection;
	}
	
	@Override
	protected ResultSet getElement() throws SQLException {		
		CallableStatement objCmst;			
		try {
			objCmst = m_objConnection.prepareCall("{call SP_EVENT_ALL()}");			
		} catch (SQLException e) {
			throw e;
		}		
		return objCmst.executeQuery();
	}
}
