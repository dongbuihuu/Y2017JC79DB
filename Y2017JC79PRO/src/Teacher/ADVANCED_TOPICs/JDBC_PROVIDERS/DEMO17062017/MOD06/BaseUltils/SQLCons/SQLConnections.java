package BaseUltils.SQLCons;

import java.sql.Connection;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class SQLConnections {
    /***
     * Nghiệp vụ thực thi mở kết nối tới DB SQL Server
     * @param ServerName
     * @param DatabaseName
     * @param UserName
     * @param PassWord
     * @param PortNumber - defaults: 1433
     * @return
     * @throws Exception
     */
    public Connection OpenConections(String ServerName,
                            String DatabaseName, 
                            String UserName,
                            String PassWord,
                            int PortNumber) throws Exception{
        // 1. Khai báo 1 đối tượng chứa thông tin kết nối
        Connection objConnection;

        // 2. Khai báo & khởi tạo đối tượng SqlServerDataSources
        // <sqljdbc4.0.jar>
        // Sử dụng để khai báo tham số kết nối tới SQL Server
        SQLServerDataSource objData = new SQLServerDataSource();
        objData.setServerName(ServerName);
        objData.setDatabaseName(DatabaseName);
        objData.setUser(UserName);
        objData.setPassword(PassWord);
        objData.setPortNumber(PortNumber);
        
        try {
            objConnection = objData.getConnection();            
        } catch (Exception e) {
            throw e;
        }
        return objConnection;
    }
}
