package JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.SAMPLES;

import java.sql.Connection;
import ConnectionMAN.ConnectionEntity;
import ConnectionMAN.ConnectionManager;

public class CONNECTIONS_DEMO_WITH_LIBS {

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
				System.out.println("Thưa anh e đã kết nối thành công rồi ạ :D");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
