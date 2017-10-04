package MODULES.M06.Views;

import java.sql.Connection;
import java.util.List;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import MODULES.M06.Controllers.EventController;
import MODULES.M06.Entity.EventEntity;

public class frmEvents {	
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
					
					//4. Khai báo và khởi tạo đối tượng
					EventController objController = new EventController(objConnection);
					
					//5. Thực thi để nhận về 1 Resultset
					List<EventEntity> lisEvent = objController.SelectData();
					for (EventEntity eventEntity : lisEvent) {
						System.out.println("- Event Name: "+ eventEntity.getsEventName());
						System.out.println("- Price: "+ eventEntity.getsPrice());
						System.out.println("- Event Day: "+ eventEntity.getiEventDay());
						System.out.println("- Event Month: "+ eventEntity.getiEventMonth());
						System.out.println("- Event Year: "+ eventEntity.getiEventYear());
						System.out.println();
					}									
				}catch(Exception ex){
					System.out.println(ex.getMessage());
				}
	}
}	
