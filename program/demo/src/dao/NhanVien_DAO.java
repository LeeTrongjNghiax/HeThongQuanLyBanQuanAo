package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entities.NhanVien;
import entities.PhongBan;

public class NhanVien_DAO {
	ArrayList<NhanVien> dsNhanVien;
	NhanVien nv;
	public NhanVien_DAO() {
		dsNhanVien = new ArrayList<NhanVien>();
		nv = new NhanVien();
	}
	public ArrayList<NhanVien> getAllTbNhanVien() {
		try {
			Connection con = ConnectDB.getInstance().getConnection();
			String sql = "SELECT * FROM NhanVien";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			
			while (rs.next()) {
				String maNV = rs.getString(1);
				String hoTen = rs.getString(2);
				int tuoi = rs.getInt(3);
				PhongBan phong = new PhongBan(rs.getString(4));
				float tien = rs.getFloat(5);
				NhanVien nhanVien = new NhanVien(maNV, hoTen, tuoi, phong, tien);
				dsNhanVien.add(nhanVien);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dsNhanVien;
	}
	public boolean create(NhanVien nv) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement ps = null;
		int n = 0;
		try {
			ps = con.prepareStatement("insert into" + " NhanVien values(?, ?, ?, ?, ?)");
			ps.setString(1, nv.getMaNV());
			ps.setString(2, nv.getHoTen());
			ps.setInt(3, nv.getTuoi());
			ps.setString(4, nv.getPhong().getMaPhong());
			ps.setDouble(5, nv.getTienLuong());
			n = ps.executeUpdate();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	public boolean update(NhanVien nv) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement ps = null;
		int n = 0;
		try {
			ps = con.prepareStatement("update NhanVien set hoTen=?, tuoi=?, maPhong=?, tienLuong=? where maNV=?");
			ps.setString(1, nv.getHoTen());
			ps.setInt(2, nv.getTuoi());
			ps.setString(3, nv.getPhong().getMaPhong());
			ps.setDouble(4, nv.getTienLuong());
			ps.setString(5, nv.getMaNV());
			n = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	public boolean delete(String maNV) {
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement ps = null;
		int n = 0;
		try {
			ps = con.prepareStatement("DELETE FROM NhanVien WHERE maNV = ?");
			ps.setString(1, maNV);
			n = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	public ArrayList<NhanVien> getNhanVienTheoPhongBan(String maPhong) {
		ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
		Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement ps = null;
		try {
			String sql = "SELECT * FROM NHANVIEN WHERE maPhong = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, maPhong);
			ResultSet rs = 	ps.executeQuery(sql);
			
			while (rs.next()) {
				String maNV = rs.getString(1);
				String hoTen = rs.getString(2);
				int tuoi = rs.getInt(3);
				PhongBan phong = new PhongBan( rs.getString(4) );
				float tien = rs.getFloat(5);
				
				NhanVien nv = new NhanVien(maNV, hoTen, tuoi, phong, tien);
				dsnv.add(nv);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dsnv;
	}
}