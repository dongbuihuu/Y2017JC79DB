package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.JDBC_PROVIDERS.DEMO12062017;

import java.sql.Connection;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class SAMPLE01 {
	public static void main(String[] args) {
		//1. 
		Connection objConnection;
		
		//2. 
		SQLServerDataSource objDataSource = new SQLServerDataSource();
		objDataSource.setServerName("127.0.0.1");
		objDataSource.setUser("sa");
		objDataSource.setPassword("nothing");
		objDataSource.setDatabaseName("TICKETBOX_DB");
		objDataSource.setPortNumber(1433);
		
		//3. 
		try {
			objConnection = objDataSource.getConnection();
			try {
				if(!objConnection.isClosed()){
					System.out.println(":D");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLServerException e) {
			e.printStackTrace();
		}
	}	
}
