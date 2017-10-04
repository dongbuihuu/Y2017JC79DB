package JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.DEMO28042017.MOD02;

import java.sql.Connection;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import SQLLibrary.SQLConnects;
import SQLLibrary.SQLParams;

public class ConnectSQLServerDemo {
	public static void main(String[] args) {
		//1. Khai báo đối tượng
		SQLParams objParam = new SQLParams();
		objParam.setsServerName("192.168.0.220");
		objParam.setsUserName("y2017cs05");
		objParam.setsPassWord("nothing");
		objParam.setsDatabaseName("TICKETBOX_DB");
		objParam.setiPortNumber(1433);
		
		SQLConnects objConnect = new SQLConnects();
		try {
			Connection objConnection = objConnect.OpenConnection(objParam);
			
			//2. 
			try {
				if(!objConnection.isClosed()){
					System.out.println("Mở kết nối thành công!!!");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLServerException e) {
			e.printStackTrace();
		}
	}
}
