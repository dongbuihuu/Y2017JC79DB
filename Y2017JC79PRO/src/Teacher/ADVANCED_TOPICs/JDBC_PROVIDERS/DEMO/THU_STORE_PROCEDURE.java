package ADVANCED_TOPICS.JDBC_PROVIDERS.DEMO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class THU_STORE_PROCEDURE {

	public static void main(String[] args) {
		 //1. Khai báo đối tượng Connection 
		Connection objConnection;
		
		//2. Khai báo và cấu hình tham số kết nối
		SQLServerDataSource objDataSource = new SQLServerDataSource();
		objDataSource.setServerName("127.0.0.1");
		objDataSource.setUser("sa");
		objDataSource.setPassword("nothing");
		objDataSource.setDatabaseName("TICKETBOX_DB");
		objDataSource.setPortNumber(1433);
		
		//3. Thực thi mở kết nối
		try {
			objConnection = objDataSource.getConnection();
			try {
				if(!objConnection.isClosed()){
					//4. Khai báo các đối tượng cho việc ủy quyền thực thi truy vấn
					CallableStatement objCmst;
					ResultSet objRs;
					
					//objCmst = objConnection.prepareCall("{call SP_CATTAMTHOI()}");
					objCmst = objConnection.prepareCall("{call SP_CATTAMTHOI_COTHAMSO(?)}");
					objCmst.setInt("EventMonth", 6);
					
					objRs = objCmst.executeQuery();
					while(objRs.next()){
						System.out.println("+ EventName: "+ objRs.getString("EventName"));
						System.out.println("+ Price: "+ objRs.getString("Price"));
						System.out.println("+ EventDay: "+ objRs.getInt("EventDay"));
						System.out.println("+ EventMonth: "+ objRs.getInt("EventMonth"));
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLServerException e) {
			e.printStackTrace();
		}
		
	}
}
