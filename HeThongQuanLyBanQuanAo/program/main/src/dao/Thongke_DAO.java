package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.Statement;
import java.util.ArrayList;

import org.w3c.dom.ls.LSException;

import Database.Database;
import entity.ThongKeDoanhThu;

public class Thongke_DAO{
	public ArrayList<ThongKeDoanhThu> thongKeDoanhThuNV(Object NgayMoc,Object ngayDen){
		ArrayList<ThongKeDoanhThu> tkdt = new ArrayList<>();
		Connection con = new Database().getConnect();
		String sql = "select Nhanvien.tenNhanVien, COUNT(Hoadon.maNhanVien), sum(Hoadon.tiennhan) from HoaDon INNER JOIN Nhanvien  on Nhanvien.maNhanvien = Hoadon.maNhanvien  where  thoigiantaohoadon  >= "
				+ "? and "
				+ "thoigiantaohoadon <= ?  Group By tenNhanVien";
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setDate(1, (Date) NgayMoc);
			statement.setDate(2, (Date) ngayDen);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
			String tenNV = rs.getString(1);
			int SoHD = rs.getInt(2);
			double sotien = rs.getDouble(3);
			ThongKeDoanhThu tK = new ThongKeDoanhThu(tenNV, SoHD, sotien);	
			tkdt.add(tK);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return tkdt;
		
	}
	public ArrayList<ThongKeDoanhThu> thongKeDoanhThuKH(Object NgayMoc,Object ngayDen){
		ArrayList<ThongKeDoanhThu> tkdt = new ArrayList<>();
		Connection con = new Database().getConnect();
		String sql = "select KhachHang.tenKhachHang, COUNT(Hoadon.maKhachHang), sum(Hoadon.tiennhan) from HoaDon  \r\n"
				+ "INNER JOIN\r\n"
				+ "KhachHang  on KhachHang.maKhachHang = Hoadon.maKhachHang  where  thoigiantaohoadon  >= ? and thoigiantaohoadon <= ?  Group By tenKhachHang";
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setDate(1, (Date) NgayMoc);
			statement.setDate(2, (Date) ngayDen);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
			String tenNV = rs.getString(1);
			int SoHD = rs.getInt(2);
			double sotien = rs.getDouble(3);
			ThongKeDoanhThu tK = new ThongKeDoanhThu(tenNV, SoHD, sotien);	
			tkdt.add(tK);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return tkdt;
		
	}
}
