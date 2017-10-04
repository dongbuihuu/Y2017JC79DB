package JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.DEMO28042017.MOD01;

import java.sql.Connection;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class ConnectSQLServerDemo {
	public static void main(String[] args) {
		//1. Khai báo đối tượng chứa các tham số cấu hình cần cho kết nối
		SQLServerDataSource objDataSource = new SQLServerDataSource();
		objDataSource.setServerName("192.168.0.220");
		objDataSource.setUser("y2017cs05");
		objDataSource.setPassword("nothing");
		objDataSource.setDatabaseName("TICKETBOX_DB");
		objDataSource.setPortNumber(1433);
		
		//2. Thực thi mở kết nối và nhận về 1 đối tượng chứa thông tin kết nối
		try {
			Connection objConnection = objDataSource.getConnection();
			
			//3. Kiểm tra trạng thái kết nối --> Kết nối thành công mới thực thi tiếp các nghiệp vụ
			try {
				if(!objConnection.isClosed()){
					System.out.println("Kết nối tới CSDL thành công!!!");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLServerException e) {
			e.printStackTrace();
		}
	}
}
