package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.JDBC_PROVIDERS.DEMO17062017.MOD02;

import java.sql.Connection;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import JC19SQLConnection.SQLConnect;

public class MOD02DEMO {
	public static void main(String[] args) {
		//1. Khai báo đối tượng
		Connection objConnection;
		
		//2. Khai báo & thiết lập các tham số kết nối
		JC19SQLConnection.SQLConnect objData = new SQLConnect();					
		
		//3. Thực thi mở kết nối tới csdl SQL
		try {
			objConnection = objData.OpenConnection(
						"127.0.0.1", 
						"nothing", "sa", "TICKETBOX_DB", 1433);
			if(!objConnection.isClosed()){
				System.out.println("Mở kết nối thành công!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
