package FPP.lectureCode.lesson13.database_javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectManager {
	
	private static final String DB_URL 
		= "jdbc:derby://localhost:1527/FPP_DB;create=true";
	private static final String USERNAME = "app";
	private static final String PASSWORD = "app";
	private static Connection conn = null;
	public Connection getConnection() throws SQLException {
		if(conn == null) {	
			conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			System.out.println("Got connection...");
		}
		return conn;
	}
	
	public void closeConnection(Connection con)  throws SQLException {
		if(con != null && !con.isClosed()) {
			con.close();
		}
	}
}
