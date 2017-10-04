package JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.DEMOJDBC.Mod01;

import java.sql.Connection;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class Sample01 {
	
	public static void main(String[] args) {
		//1. Khai báo và khởi tạo đối tượng
		Connection objConnection;
		
		//2. Khởi tạo đối tượng và thiết lập tham số kết nối
		SQLServerDataSource objDataSource = new SQLServerDataSource();
		objDataSource.setServerName("192.168.0.220");
		objDataSource.setUser("y2016jc36");
		objDataSource.setPassword("nothing");
		objDataSource.setDatabaseName("TICKETBOX_DB");
		objDataSource.setPortNumber(1433);
		
		//3. Thực thi mở kết nối
		try {
			objConnection = objDataSource.getConnection();
			
			//4. Kiểm tra trạng thái kết nối		
				if(!objConnection.isClosed()){
					System.out.println("Mở kết nối thành công :D");
				}			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
