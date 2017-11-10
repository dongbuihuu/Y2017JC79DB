package first_programming_truongnm.jdbc;

import java.sql.Connection;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class JDBC_Check_Connection_Argument {

	public Connection SQLServerCheckConnection(String serverName, String userName, String password, String databaseName,
			int portNumber) {
		Connection objConnection = null;
		SQLServerDataSource objData = new SQLServerDataSource();
		objData.setServerName(serverName);
		objData.setUser(userName);
		objData.setPassword(password);
		objData.setDatabaseName(databaseName);
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
