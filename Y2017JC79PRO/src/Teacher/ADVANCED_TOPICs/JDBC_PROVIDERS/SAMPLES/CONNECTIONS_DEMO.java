package JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.SAMPLES;

import java.sql.Connection;
import java.util.ArrayList;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class CONNECTIONS_DEMO {

    /**
     * @param args
     */
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
        
        // 4. Thực thi mở kết nối & nhận về 1 đối tượng chứa thông tin kết nối
    	try {
			objConnection = objDts.getConnection();
			if(!objConnection.isClosed()){
				System.out.println("Kết nối tới csdl thành công!!!");
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

}
