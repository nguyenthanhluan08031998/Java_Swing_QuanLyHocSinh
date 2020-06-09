package ViewModel;

import JDBCConnectMySQL.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

public class LoginViewModel {
	public boolean login(String username, String password) {
		try {
			JDBCConnectMySQL jdbcConnectMySQL = new JDBCConnectMySQL();
			ResultSet rs = jdbcConnectMySQL.get(
					"select * from User where Username = \"" + username + "\" and Password = \"" + password + "\";");
			Vector user = new Vector();
			String pw = null;
			int count = 0;
			while (rs.next()) {
				count++;
			}

			if (count == 1) {
				return true;
			} else
				return false;
		} catch (Exception ex) {
			return false;
		}
	}
}
