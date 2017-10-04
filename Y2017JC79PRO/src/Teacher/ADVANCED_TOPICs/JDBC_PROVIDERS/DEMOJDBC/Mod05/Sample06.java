package JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.DEMOJDBC.Mod05;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import CONNECTIONMAN.IMICSQLServerManager;

public class Sample05 {
	public static void main(String[] args) {
		// 1. Khai báo và khởi tạo đối tượng
		Connection objConnection = null;
		IMICSQLServerManager obj = new IMICSQLServerManager();

		// 4. Sử dụng thuộc tính getConnection để nhận về 1 đối tượng
		// chứa đầy đủ thông tin kết nối.
		try {
			objConnection = obj.OpenConnection("192.168.0.220", "y2016jc36", "nothing", "TICKETBOX_DB", 1433);

			// 5. Kiểm tra trạng thái kết nối(Thành công/Thất bại)?
			if (!objConnection.isClosed()) {
				//6. Khai báo 02 đối tượng:
				ResultSet objRs;
				CallableStatement objCmst = null;
				
				//7. Khởi tạo đối tượng CallableStatements thông qua đối tượng
			    //connection.
				objCmst = objConnection
									.prepareCall("{call SP_EVENT_BY(?,?)}");
				
				//8. Thiết lập tham số truyền vào cho thủ tục đó
				objCmst.setInt("EventMonth", 6); //@EventMonth = 6
				objCmst.setInt("EventYear", 2016); //@EventYear = 2016
				
				//9. Thực thi truy vấn
				objRs = objCmst.executeQuery();
				
				//10. Duyệt tập bản ghi trong ResultSet thông qua vòng lặp While()
			   // với pt objRs.Next(): T/F?
				while (objRs.next()) {
					System.out.println("+ EventName: "
								+ objRs.getString("EventName"));	
					System.out.println("+ Price: "
								+ objRs.getString("Price"));
					System.out.println("+ EventDay: "
								+ objRs.getInt(3));
					System.out.println();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
