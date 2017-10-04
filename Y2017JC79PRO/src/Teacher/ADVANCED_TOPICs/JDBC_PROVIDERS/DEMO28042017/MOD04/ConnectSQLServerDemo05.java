package JAVACORE_TRAINING.ADVANCED_TOPICS.JDBC_PROVIDERS.DEMO28042017.MOD04;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import SQLLibrary.SQLConnects;
import SQLLibrary.SQLParams;

public class ConnectSQLServerDemo05 {
	
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
					ResultSet objRs = null;
					//Statement objSt = null;
					CallableStatement objCmst = null;
					
					//3. Khởi tạo thông tin Statement
					objCmst = objConnection.prepareCall("{? = call SP_KIEMTRATHONGTINTAIKHOAN(?,?)}");
					
					//3.Thiết lập giá trị cho tham số truyền vào
					objCmst.registerOutParameter(1, Types.TINYINT);
					objCmst.setString("USERNAME", "anv");
					objCmst.setString("PASSWORD", "nothing");
					
					//4. Ủy quyền thực thi và nhận về Resultset
					objCmst.execute();
					
					//5. Nhận kết quả
					byte bValue = objCmst.getByte(1);
										
					//6. Kiểm tra kết quả
					if(bValue > 0)
						System.out.println("- Tài khoản có tồn tại trên hệ thống!!!");
					else
						System.out.println("- Tài khoản ko tồn tại!!!");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLServerException e) {
			e.printStackTrace();
		}
	}
}
