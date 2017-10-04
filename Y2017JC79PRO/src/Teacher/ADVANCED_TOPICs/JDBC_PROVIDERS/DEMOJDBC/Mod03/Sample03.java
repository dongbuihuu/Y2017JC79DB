package JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.DEMOJDBC.Mod03;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class Sample03 {
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
				//5. Khai báo đối tượng
				Statement objSt;
				ResultSet objRs;
				
				//6. Khởi tạo Statement
				objSt = objConnection.createStatement();
				objRs =  objSt.executeQuery("Select EventName, Price, EventDay From cs_Events Where EventMonth = 6");
				
				//7. Duyệt và hiển thị tập bản ghi
				while(objRs.next()){
					System.out.println("+ EventName = "
									+ objRs.getString("EventName"));
					System.out.println("+ Price = "
									+ objRs.getString("Price"));
					System.out.println("+ EventDay = "+ 
									objRs.getInt(3));
					System.out.println();
				}
			}			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
