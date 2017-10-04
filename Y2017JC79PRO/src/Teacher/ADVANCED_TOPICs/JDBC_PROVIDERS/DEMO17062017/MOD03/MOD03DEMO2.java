package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.JDBC_PROVIDERS.DEMO17062017.MOD03;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import JC19SQLConnection.SQLConnect;

public class MOD03DEMO2 {
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
				//4. Khai báo các đối tượng
				ResultSet objRs;
				CallableStatement objCmst;
				//String sSQL = "SELECT EventName, Price, EventDay FROM cs_Events";
				
				//5. Khởi tạo đối tượng CallableStatement qua Connection
				objCmst = objConnection.prepareCall("{call SPGetEvents()}");
				
				//6. Thực thi nhận về tập bản ghi --> đưa vào Resultset
				objRs = objCmst.executeQuery();
				
				//7. Duyệt và hiển thị
				if(objRs != null){
					while(objRs.next()){
						System.out.println("- Event Name: "+ objRs.getString(1));
						System.out.println("- Price: "+ objRs.getString("Price"));
						System.out.println("- Event Day: "+ objRs.getInt("EventDay"));
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
