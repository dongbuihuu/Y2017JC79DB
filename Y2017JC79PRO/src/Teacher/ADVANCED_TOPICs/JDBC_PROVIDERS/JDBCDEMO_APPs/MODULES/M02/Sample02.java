package MODULES.M02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class Sample02 {
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
				ResultSet objRs = null;
				Statement objStm = null;
				
				//5. Khởi tạo đối tượng Statement thông qua Connection
				objStm = objConnection.createStatement();
				
				//6. Ủy quyền thực thi truy vấn và nhận về Resultset
				String sql = "Select EventName, Price, EventDay, EventMonth, EventYear from cs_Events";
				objRs = objStm.executeQuery(sql);
				
				//7. Duyệt và hiển thị dữ liệu trong Resultset ra ngoài
				while(objRs.next()){
					System.out.println("- Event Name: "+ objRs.getString(1));
					System.out.println("- Price: "+ objRs.getString("Price"));
					System.out.println("- Event Day: "+ objRs.getInt("EventDay"));
					System.out.println("- Event Month: "+ objRs.getInt("EventMonth"));
					System.out.println("- Event Year: "+ objRs.getInt("EventYear"));
					System.out.println();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLServerException e) {
			e.printStackTrace();
		}
	}
}
