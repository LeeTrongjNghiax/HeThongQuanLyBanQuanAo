package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entities.PhongBan;

public class PhongBan_DAO {
	public ArrayList<PhongBan> getAllTbPhongBan() {
		ArrayList<PhongBan> dsPhong = new ArrayList<PhongBan>();
		try {
			Connection con = ConnectDB.getInstance().getConnection();
			
			String sql = "SELECT * FROM PhongBan";
			Statement statement = con.createStatement();
			
			ResultSet rs = statement.executeQuery(sql);
			
			while (rs.next()) {
				String maPhong = rs.getString(1);
				String tenPhong = rs.getString(2);
				PhongBan pb = new PhongBan(maPhong, tenPhong);
				dsPhong.add(pb);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dsPhong;
	}
}
