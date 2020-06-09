package JDBCConnectMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class JDBCConnectMySQL {
	private static String DB_URL = "jdbc:mysql://localhost:3306/DataStudent";
	private static String USER_NAME = "root";
	private static String PASSWORD = "";
	Connection conn;
	Statement stsm;
	PreparedStatement pst;

	public JDBCConnectMySQL() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DataStudent", "root", "");
			System.out.println("connect successfully!");
		} catch (Exception ex) {
			System.out.println("connect failure!");
			ex.printStackTrace();
		}
	}

	public ResultSet get(String query) {
		stsm = null;
		try {
			stsm = conn.createStatement();
			return stsm.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void add(String query) {
		try {
			stsm = conn.createStatement();
			stsm.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(String query) {
		try {
			stsm = conn.createStatement();
			stsm.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void upadte(String query) {
		try {
			stsm = conn.createStatement();
			stsm.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}