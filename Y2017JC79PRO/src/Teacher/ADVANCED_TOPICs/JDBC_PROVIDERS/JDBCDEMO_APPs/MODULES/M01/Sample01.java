package MODULES.M01;

import java.sql.Connection;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class Sample01 {
	public static void main(String[] args) {
		//1. Khai báo 1 đối tượng Connection để nhận thông tin kết nối
		Connection objConnection;   //java.sql
		
		//2. Khai báo đối tượng chứa thông tin tham số kết nối
		/*
		 * Wifi: Admin!^@^1505
		 * + Server IP: 192.168.0.220
            + Uid: dev_y2017jc23
            + Pwd: nothing
            + Database Name: TICKETBOX_DB
		 * */
		SQLServerDataSource objDataSource = new SQLServerDataSource();
		objDataSource.setServerName("192.168.0.220");
		objDataSource.setUser("dev_y2017jc23");
		objDataSource.setPassword("nothing");
		objDataSource.setDatabaseName("TICKETBOX_DB");
		objDataSource.setPortNumber(1433);
		
		//3. Thực thi mở kết nối và nhận về đối tượng chứa thông tin kết nối
		try {
			objConnection = objDataSource.getConnection();
			
			//4. Kiểm tra trạng thái kết nối
			try {
				if(!objConnection.isClosed()){
					System.out.println("Chúc mừng chuyên gia :d");
				}else System.out.println("Rất tiếc cho chuyên gia :<");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLServerException e) {
			e.printStackTrace();
		}
	}
}
