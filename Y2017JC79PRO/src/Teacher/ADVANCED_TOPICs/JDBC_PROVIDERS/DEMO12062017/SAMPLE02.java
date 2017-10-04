package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.JDBC_PROVIDERS.DEMO12062017;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class SAMPLE02 {
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
					ResultSet objRs;
					Statement objSt;
					objSt = objConnection.createStatement();
					objRs = objSt.executeQuery("Select * From cs_Events where EventDay = 5 and EventYear = 2016");
					while(objRs.next()){
						System.out.println("- EventId: "+ objRs.getString("EventId"));
						System.out.println("- EventName: "+ objRs.getString("EventName"));
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLServerException e) {
			e.printStackTrace();
		}
	}	
}
