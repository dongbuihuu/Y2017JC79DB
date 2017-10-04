package JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.DEMOJDBC.Mod02;
import java.sql.Connection;
import CONNECTIONMAN.*;

public class Sample01 {
	public static void main(String[] args) {
		//1. Khai báo và khởi tạo đối tượng
		Connection objConnection = null;		
		IMICSQLServerManager obj = new IMICSQLServerManager();
			
		//4. Sử dụng thuộc tính getConnection để nhận về 1 đối tượng
		  // chứa đầy đủ thông tin kết nối.
		try {
			objConnection = obj.OpenConnection(
					"192.168.0.220", 
					"y2016jc36", 
					"nothing", 
					"TICKETBOX_DB", 
					1433);
			
			//5. Kiểm tra trạng thái kết nối(Thành công/Thất bại)?
			if(!objConnection.isClosed()){
				System.out.println("Kết nối tới CSDL thành công!!!");
			}else{
				System.out.println("Rất tiếc cho chuyên gia :<");
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
