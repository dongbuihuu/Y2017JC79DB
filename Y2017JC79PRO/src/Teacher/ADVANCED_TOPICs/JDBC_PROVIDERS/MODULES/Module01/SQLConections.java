package JAVACORE_TRAINING.ADVANCED_TOPICs.JDBC_PROVIDERS.MODULES.Module01;

import java.sql.Connection;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class SQLConections {
	public static void main(String[] args) {
		//1. Khai báo đối tượng< java.sql.Connection>
		Connection objConnection;
		
		//2. Khai báo đối tượng chứa các tham số kết nối
		SQLServerDataSource objDataSource = new SQLServerDataSource();
		objDataSource.setServerName("192.168.0.220");
		objDataSource.setUser("demo");
		objDataSource.setPassword("nothing");
		objDataSource.setDatabaseName("TICKETBOX_DB");
		objDataSource.setPortNumber(1433);
		
		//3. Thực thi mở kết nối và nhận về đối tượng kết nối
		try {
			objConnection = objDataSource.getConnection();
			
			//4. Kiểm tra trạng thái kết nối
			try {
				if(!objConnection.isClosed()){
					System.out.println("Kết nối thành công!");					
				}else{
					System.out.println("Kết nối thất bại!");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLServerException e) {
			e.printStackTrace();
		}		
	}
}
