package JAVACORE_TRAINING.ADVANCED_TOPICs.JDBC_PROVIDERS.DEMOJDBC.Mod07;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class Module07 {
	public static void main(String[] args) {
		// 1. Khai báo khởi tạo đối tượng
        Connection objConnection;
        
        // 2. Khai báo & khởi tạo đối tượng trong thư viện sqljdbc4.0.jar
        SQLServerDataSource objDts = new SQLServerDataSource();          
        
        // 3. Thiết lập tham số cấu hình hệ thống        
        objDts.setServerName("127.0.0.1");
        objDts.setUser("sa");
        objDts.setPassword("nothing");
        objDts.setDatabaseName("TICKETBOX_DB");
        objDts.setPortNumber(1433);

		// 3. Kiểm tra trạng thái kết nối tới CSDL
		try {
			objConnection = objDts.getConnection();
			if (!objConnection.isClosed()) {
				// 4. Khởi tạo CallableStatement thông qua Connections
                CallableStatement objCmst;
                ResultSet objRs;
                //String sSQL = "Select EventName, Price, EventDay From Events";
                objCmst = objConnection.prepareCall("{call SP_DANHSACHSUKIENDEMOCOTHAMSO(?,?)}");
                objCmst.setInt("EVENTMONTH", 6);
                objCmst.setInt("EVENTDAY", 11);
                
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
