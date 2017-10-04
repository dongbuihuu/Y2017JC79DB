package ADVANCED_TOPICS.JDBC_PROVIDERS.DEMO_APPs;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import ConnectionMAN.SQLConnects;
import Entitys.SQLEntity;

public class SELECT_DEMO_PROC_01 {
	
	public static void main(String[] args) {
		//1. Khai báo đối tượng Connection
		Connection objConnection;
		
		//2. Khai báo và khởi tạo đối tượng thuộc của thư viên sqljdbc4.0.jar --> chứa các tham số cấu hình
		//cho việc kết nối tới CSDL
		SQLEntity objEntity = new SQLEntity();
		objEntity.setsServerName("127.0.0.1");
		objEntity.setsUserName("sa");
		objEntity.setsPassWord("nothing");
		objEntity.setsDatabaseName("TICKETBOX_DB");
		objEntity.setiPortNumber(1433);
		
		//3. Mở kết nối và nhận về đối tượng chứa thông tin kết nối
		try {
			objConnection = new SQLConnects().OpenConnections(objEntity);
			
			//4. Kiểm tra trạng thái kết nối
			try {
				if(!objConnection.isClosed()){
					//5. Khai báo 1 phát biểu truy vấn cấu trúc của SQL Server
					String sQuery = "{call Y2016JC66_SELECT_DEMO()}";
					
					//6. Khai báo các đối tượng cần cho xử lý này
					ResultSet objRs;
					CallableStatement objCmst;
					
					//7. KHởi tạo đối tượng cần cho việc ủy quyền thực thi truy vấn
					objCmst = objConnection.prepareCall(sQuery);
					
					//8. Thực thi nghiệp vụ và nhận về tập bản ghi
					objRs  = objCmst.executeQuery();
					
					//9. Duyệt tập hợp và trình diễn
					while(objRs.next()){
						System.out.println("+ EventName: "+ objRs.getString("EventName"));
						System.out.println("+ Price: "+ objRs.getString("Price"));
						System.out.println();
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
