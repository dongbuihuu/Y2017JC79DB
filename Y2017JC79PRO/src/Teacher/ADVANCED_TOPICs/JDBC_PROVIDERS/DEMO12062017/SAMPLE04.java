package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.JDBC_PROVIDERS.DEMO12062017;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class SAMPLE04 {
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
					CallableStatement objCsmt;
					objCsmt = objConnection.prepareCall("{call Sp_DanhSach_SuKien_Thang(?)}");
					objCsmt.setInt("EventMonth", 6);
					objRs = objCsmt.executeQuery();
					while(objRs.next()){					
						System.out.println("- EventName: "+ objRs.getString("EventName"));
						System.out.println("- Price: "+ objRs.getString("Price"));
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
