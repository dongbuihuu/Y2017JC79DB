package ADVANCED_TOPICS.JDBC_PROVIDERS.DEMO_APPs;

import java.sql.Connection;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import ConnectionMAN.SQLConnects;
import Entitys.SQLEntity;

public class ConnectToSQLDemoWithJAR {
	
	public static void main(String[] args) {
		//1. Khai báo đối tượng Connection
		Connection objConnection;
		
		//2. Khai báo và khởi tạo đối tượng thuộc của thư viên sqljdbc4.0.jar --> chứa các tham số cấu hình
		//cho việc kết nối tới CSDL
		SQLEntity objEntity = new SQLEntity();
		objEntity.setsServerName("127.0.0.1");
		objEntity.setsUserName("sa");
		objEntity.setsPassWord("nothing");
		objEntity.setsDatabaseName("TICKETBOX_DB");
		objEntity.setiPortNumber(1433);
		
		//3. Mở kết nối và nhận về đối tượng chứa thông tin kết nối
		try {
			objConnection = new SQLConnects().OpenConnections(objEntity);
			
			//4. Kiểm tra trạng thái kết nối
			try {
				if(!objConnection.isClosed()){
					System.out.println("Kết nối tới csdl SQL thành công!!!");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLServerException e) {
			e.printStackTrace();
		}
	}
}
