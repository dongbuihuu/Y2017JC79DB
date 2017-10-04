package JAVACORE_TRAINING.ADVANCED_TOPICs.JDBC_PROVIDERS.MODULES.Module02;

import java.sql.Connection;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import SQLLibs.ConnectEntity;
import SQLLibs.LibSQLConections;

public class SQLConections02 {
	public static void main(String[] args) {
		Connection objConnection;
		//1. Khai báo tham số
		LibSQLConections obj = new LibSQLConections();
		ConnectEntity objEntity = new ConnectEntity();
		objEntity.setsServerName("192.168.0.220");
		objEntity.setsUserName("demo");
		objEntity.setsPassWord("nothing");
		objEntity.setsDatabaseName("TICKETBOX_DB");
		objEntity.setiPortNumber(1433);
		
		//2. Thực thi mở kết nối và nhận về đối tượng kết nối
		try {
			objConnection = obj.OpenConnections(objEntity);
			
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
