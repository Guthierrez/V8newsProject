package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexaoDao {
	public static Connection createConnection() {
		Connection conn;
		try{  
			Class.forName("org.apache.derby.jdbc.ClientDriver");  
	    }catch (ClassNotFoundException e) {  
	    	System.out.println("Driver nao encontrdao!");  
	    }  

		try {
			String url = "jdbc:derby://localhost/V8news;create=true";
			conn = DriverManager.getConnection(url, "news", "123");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return conn;
	}

	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			
		}
	}

	public static  void close(Connection conn, Statement stmt) {
		close(conn, stmt, null);
	}

}