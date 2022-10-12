package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Database.Database;
import entity.ThongKeDoanhThu;
import entity.ThongKeSoLuongSanPham;


public class ThongKeSLSP {
	public ArrayList<ThongKeSoLuongSanPham> ThongKeSoLuongSp(String loai,Object ngayMoc, Object NgayHan){
		ArrayList<ThongKeSoLuongSanPham> lSanPhams = new ArrayList<>();
		Connection con = new Database().getConnect();
		String sqlString = "select SanPham.tenSanPham, SUM(ChiTietHoaDon.soLuong),SUM(HoaDon.tienNhan)"
				+ " from ChiTietHoaDon inner join SanPham on ChiTietHoaDon.maSanPham = SanPham.maSanPham  "
				+ "inner join LoaiSanPham on LoaiSanPham.maLoaiSanPham = SanPham.maLoaiSanPham "
				+ "inner join HoaDon on HoaDon.maHoaDon = ChiTietHoaDon.maHoaDon"
				+ " where LoaiSanPham.tenLoaiSanPham = '"+loai
				+ "' and HoaDon.thoiGianTaoHoaDon >=  '"+ngayMoc
				+ "' and  HoaDon.thoiGianTaoHoaDon <=  '"+NgayHan
				+ "' group by tenSanPham";
		
		try {
			Statement statement = con.createStatement();
			ResultSet rs =  statement.executeQuery(sqlString);
			while (rs.next()) {
				String tenSp = rs.getString(1);
				int soluong = rs.getInt(2);
				double tongtien = rs.getDouble(3);
				ThongKeSoLuongSanPham tKeSl = new ThongKeSoLuongSanPham(tenSp, soluong, tongtien);
				lSanPhams.add(tKeSl);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return lSanPhams;
		
	}
	public ArrayList<ThongKeSoLuongSanPham> tksp(Date NgayMoc,Date NgayHan){
		ArrayList<ThongKeSoLuongSanPham> lSanPhams = new ArrayList<>();
		Connection connection = new Database().getConnect();
		String sqlString = "select SanPham.tenSanPham, SUM(ChiTietHoaDon.soLuong),SUM(HoaDon.tienNhan)\r\n"
				+ "				 from ChiTietHoaDon inner join SanPham on ChiTietHoaDon.maSanPham = SanPham.maSanPham  \r\n"
				+ "				 inner join LoaiSanPham on LoaiSanPham.maLoaiSanPham = SanPham.maLoaiSanPham \r\n"
				+ "				 inner join HoaDon on HoaDon.maHoaDon = ChiTietHoaDon.maHoaDon\r\n"
				+ "				 where LoaiSanPham.tenLoaiSanPham = 'Ã�o SÆ¡ Mi' \r\n"
				+ "				 and HoaDon.thoiGianTaoHoaDon >=  ? \r\n"
				+ "				 and  HoaDon.thoiGianTaoHoaDon <=  ?\r\n"
				+ "				 group by tenSanPham ";
		try {
			PreparedStatement statement = connection.prepareStatement(sqlString);
			statement.setDate(1, NgayMoc);
			statement.setDate(2, NgayHan);
			ResultSet rSet = statement.executeQuery();
			while (rSet.next()) {
				ThongKeSoLuongSanPham sPham = new ThongKeSoLuongSanPham(rSet.getString(1), rSet.getInt(2), rSet.getDouble(3));
				lSanPhams.add(sPham);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lSanPhams;
	}
	public ArrayList<ThongKeSoLuongSanPham> thongKeDoanhThuSP(String loai,Date NgayMoc,Date NgayHan){
	
		ArrayList<ThongKeSoLuongSanPham> tkdt = new ArrayList<>();
		Connection con = new Database().getConnect();
		String sql = "select SanPham.tenSanPham, SUM(ChiTietHoaDon.soLuong),SUM(HoaDon.tienNhan)\r\n"
				+ "				 from ChiTietHoaDon inner join SanPham on ChiTietHoaDon.maSanPham = SanPham.maSanPham  \r\n"
				+ "				 inner join LoaiSanPham on LoaiSanPham.maLoaiSanPham = SanPham.maLoaiSanPham \r\n"
				+ "				 inner join HoaDon on HoaDon.maHoaDon = ChiTietHoaDon.maHoaDon\r\n"
				+ "				 where LoaiSanPham.tenLoaiSanPham = ? \r\n"
				+ "				 and HoaDon.thoiGianTaoHoaDon >=  ? \r\n"
				+ "				 and  HoaDon.thoiGianTaoHoaDon <=  ?\r\n"
				+ "				 group by tenSanPham ";
		try {
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setNString(1, loai);
			statement.setDate(2, NgayMoc);
			statement.setDate(3, NgayHan);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
			String tenNV = rs.getString(1);
			int SoHD = rs.getInt(2);
			double sotien = rs.getDouble(3);
			ThongKeSoLuongSanPham tK = new ThongKeSoLuongSanPham(tenNV, SoHD, sotien);	
			tkdt.add(tK);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return tkdt;
		
	}
}
