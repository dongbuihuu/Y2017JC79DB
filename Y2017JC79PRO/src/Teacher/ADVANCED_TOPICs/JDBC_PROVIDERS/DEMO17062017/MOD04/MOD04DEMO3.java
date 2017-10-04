package JAVACORE_TRAINING.TEACHER.ADVANCED_TOPICs.JDBC_PROVIDERS.DEMO17062017.MOD04;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import JC19SQLConnection.SQLConnect;

public class MOD04DEMO3 {
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
				objCmst = objConnection.prepareCall
						            ("{call SP_DELETE_STUDENT(?)}");
				objCmst.setInt("RollNo", 2);			
				
				//6. Thực thi nhận về tập bản ghi --> đưa vào Resultset
				objCmst.execute();
				
				//7.
				short shOpt = (short)JOptionPane.showConfirmDialog(null,
								"Bạn có xem dữ liệu ko?", "Thông báo",
									JOptionPane.YES_NO_OPTION);
				
				if(shOpt == 0){
					//5. Khởi tạo đối tượng CallableStatement qua Connection
					objCmst = objConnection.prepareCall("{call SP_GetStudent()}");
					
					//6. Thực thi nhận về tập bản ghi --> đưa vào Resultset					
					objRs = objCmst.executeQuery();
					
					//7. Duyệt và hiển thị
					if(objRs.getRow() > 0){
						while(objRs.next()){
							System.out.println("- RollNo: "+ objRs.getInt(1));
							System.out.println("- FullName: "
														+ objRs.getString("FullName"));
							System.out.println("- Email: "
														+ objRs.getString("Email"));
							System.out.println("- Mobile: "
														+ objRs.getString("Mobile"));
							System.out.println("- Mark: "
														+ objRs.getFloat("Mark"));
						}
					}else{
						System.out.println("Ko còn dữ liệu :D");
					}
				}
				else{
					JOptionPane.showMessageDialog(null, "Cảm ơn vì bạn Thúy ko muốn xem!!!");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
