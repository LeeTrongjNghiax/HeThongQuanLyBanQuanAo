package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	public static Connection con = null;
	private static ConnectDB instance = new ConnectDB();
	public static ConnectDB getInstance() {
		return instance;
	}
	public void connect() {
		String url = "jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;databaseName=QuanLyNhanVien";
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
	public static void disconect() {
		if (con != null) {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static Connection getConnection() {
		return con;
	}
	public static void main(String[] args) {
		ConnectDB.getInstance().connect();
	}
}
