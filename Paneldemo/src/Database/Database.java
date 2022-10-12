package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
public Database() {
		
	}
	public static Connection getConnect() {
		Connection connect = null;
		String url ="jdbc:sqlserver://localhost:1433;databaseName=QuanLyCuaHangBanQuanAo";
		try {
			connect = DriverManager.getConnection(url, "sa","12");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connect;
	}
}
