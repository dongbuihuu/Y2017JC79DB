package JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.SAMPLES;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import ConnectionMAN.ConnectionEntity;
import ConnectionMAN.ConnectionManager;

public class QUERY_SAMPLE01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1. Khai báo khởi tạo đối tượng
		Connection objConnection;
		ConnectionManager obj = new ConnectionManager();

		// 2. Khai báo & khởi tạo đối tượng trong thư viện
		ConnectionEntity objEntity = new ConnectionEntity();
		objEntity.setsServerName("127.0.0.1");
		objEntity.setsUserName("sa");
		objEntity.setsPassWord("nothing");
		objEntity.setsDatabaseName("TICKETBOX_DB");
		objEntity.setsPortNumber(1433);

		// 3. Kiểm tra trạng thái kết nối tới CSDL
		try {
			objConnection = obj.OpenConnection(objEntity);
			if (!objConnection.isClosed()) {
				// 4. Khởi tạo CallableStatement thông qua Connections
                CallableStatement objCmst;
                ResultSet objRs;
                String sSQL = "Select EventName, Price, EventDay From Events";
                objCmst = objConnection.prepareCall(sSQL);
                
				// 5. Ủy quyền thực thi truy vấn & nhận về tập bản ghi --> ResultSet
                objRs = objCmst.executeQuery();

				// 6. Duyệt & hiển thị ra bên ngoài
                while(objRs.next()){
                	System.out.println("+ Event Name: "+ objRs.getString("EventName"));
                	System.out.println("+ Price: "+ objRs.getString(2));
                	System.out.println("+ Event Day: "+ objRs.getString("EventDay"));
                	System.out.println();
                }
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
