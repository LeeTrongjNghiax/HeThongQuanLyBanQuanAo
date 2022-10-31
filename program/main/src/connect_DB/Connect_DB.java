package connect_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect_DB {
<<<<<<< HEAD
	public static Connection getConnect() {
		Connection connect = null;
		String url ="jdbc:sqlserver://localhost:1433;databaseName=QuanLyCuaHangBanQuanAo";
=======
	public static Connection con = null;
	private static Connect_DB instance = new Connect_DB();	
	
	public static Connect_DB getInstance() {
		return instance;
	}
	public void connect() {
		String url = "jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;databaseName=QuanLyCuaHangBanQuanAo";
		String user = "sa";
		String password = "12";
		
>>>>>>> 4d0d792a74bbfbb1cb32e6798ac0df31cb21e9fe
		try {
			connect = DriverManager.getConnection(url, "sa","12");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connect;
	}
}

