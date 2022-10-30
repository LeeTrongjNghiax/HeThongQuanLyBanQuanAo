package connect_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect_DB {
	public static Connection con = null;
	private static Connect_DB instance = new Connect_DB();	
	
	public static Connect_DB getInstance() {
		return instance;
	}
	public void connect() {
		String url = "jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;databaseName=QuanLyCuaHangBanQuanAo";
		String user = "sa";
		String password = "123";
		
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Connected");
		} catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Cannot Connect");
		}
	}
	public static Connection getConnection() {
		return con;
	}
	public static void main(String[] args) throws SQLException {
		Connect_DB.getInstance().connect();
	}
}
