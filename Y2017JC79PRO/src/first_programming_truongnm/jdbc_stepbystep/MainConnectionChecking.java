package first_programming_truongnm.jdbc_stepbystep;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainConnectionChecking {

	public static void main(String[] args) {
		Connection objConnection = null;
		ResultSet resultSet = null;
		CallableStatement callableStatement = null;

		JDBCConnectionChecking jdbcConnectionChecking = new JDBCConnectionChecking();
		objConnection = jdbcConnectionChecking.ConnectionChecking("DEMOBANKING", "NGUYENTRUONG", "sa", "sa", 1433);

		try {
			if (!objConnection.isClosed()) {
				callableStatement = objConnection.prepareCall("select top (10) custid, custname from tblCustomers");
				resultSet = callableStatement.executeQuery();
			}
			if (resultSet != null) {
				while (resultSet.next()) {
					System.out.println("Custid: " + resultSet.getString("custid") + " Custname: "
							+ resultSet.getString("custname"));

				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
