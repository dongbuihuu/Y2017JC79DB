package JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.DEMO28042017.MOD03;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
					String sQuery = "SELECT EventName, Price, EventDay FROM cs_Events";
					ResultSet objRs = null;
					Statement objSt = null;
					
					//3. Khởi tạo thông tin Statement
					objSt = objConnection.createStatement();
					//objSt = objConnection.prepareStatement(sQuery);
					
					//3. Ủy quyền thực thi và nhận về Resultset
					objRs = objSt.executeQuery(sQuery);
					
					//4. Kiểm tra kết quả
					if(objRs != null){
						while (objRs.next()) {
							System.out.println("- EventName: "+ objRs.getString(1));
							System.out.println("- Price: "+ objRs.getString("Price"));
							System.out.println("- EventDay: "+ objRs.getInt("EventDay"));
							System.out.println();
						}
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
