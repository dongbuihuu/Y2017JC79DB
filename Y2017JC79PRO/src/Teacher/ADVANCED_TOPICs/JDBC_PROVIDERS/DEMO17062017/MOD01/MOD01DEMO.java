package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.JDBC_PROVIDERS.DEMO17062017.MOD01;

import java.sql.Connection;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class MOD01DEMO {
	public static void main(String[] args) {
		//1. Khai báo đối tượng
		Connection objConnection;
		
		//2. Khai báo & thiết lập các tham số kết nối
		SQLServerDataSource objData = new SQLServerDataSource();
		objData.setServerName("127.0.0.1");
		objData.setUser("sa");
		objData.setPassword("nothing");
		objData.setDatabaseName("TICKETBOX_DB");
		objData.setPortNumber(1433);
		
		//3. Thực thi mở kết nối tới csdl SQL
		try {
			objConnection = objData.getConnection();
			if(!objConnection.isClosed()){
				System.out.println("Mở kết nối thành công!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
