package first_programming_truongnm.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class JDBC_Check_Connection {

	public static void main(String[] args) {
		Connection objConnection = null;
		SQLServerDataSource objData = new SQLServerDataSource();
		objData.setUser("sa");
		objData.setPassword("sa");
		objData.setDatabaseName("DEMOBANKING");
		objData.setPortNumber(1433);
		objData.setServerName("localhost");

		try {
			objConnection = objData.getConnection();
		} catch (SQLServerException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			if (!objConnection.isClosed()) {
				System.out.println("Connect Successfull");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
