package first_programming_truongnm.jdbc_stepbystep;

import java.sql.Connection;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class JDBCConnectionChecking {
	public Connection ConnectionChecking(String databaseName, String serverName, String userName, String password,
			int portNumber) {
		Connection objConnection = null;
		SQLServerDataSource objData = new SQLServerDataSource();
		objData.setDatabaseName(databaseName);
		objData.setServerName(serverName);
		objData.setUser(userName);
		objData.setPassword(password);
		objData.setPortNumber(portNumber);
		try {
			objConnection = objData.getConnection();
		} catch (SQLServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objConnection;
	}

}
