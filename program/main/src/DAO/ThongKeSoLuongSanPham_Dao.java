package DAO;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import connect_DB.Connect_DB;
import entity.ThongKeSoLuongSanPham;

public class ThongKeSoLuongSanPham_Dao {
	
	public ArrayList<ThongKeSoLuongSanPham> ThongKeSoLuongSp(String loai,Object ngayMoc, Object NgayHan){
		ArrayList<ThongKeSoLuongSanPham> lSanPhams = new ArrayList<>();
		Connection con = new Connect_DB().getConnect();
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
	public ArrayList<ThongKeSoLuongSanPham> ThongKeSoLuongSpTheoTop(String loai,Object ngayMoc, Object NgayHan){
		ArrayList<ThongKeSoLuongSanPham> lSanPhams = new ArrayList<>();
//		System.out.println(loai);
//		System.out.println(ngayMoc);
//		System.out.println(NgayHan);
		Connection con = new Connect_DB().getConnect();
		String sqlTOPString = "\r\n"
				+ "select SanPham.tenSanPham, SUM(ChiTietHoaDon.soLuong),SUM(HoaDon.tienNhan)  tienban\r\n"
				+ "from ChiTietHoaDon inner join SanPham \r\n"
				+ "on ChiTietHoaDon.maSanPham = SanPham.maSanPham inner join LoaiSanPham\r\n"
				+ "on LoaiSanPham.maLoaiSanPham = SanPham.maLoaiSanPham inner join HoaDon\r\n"
				+ "on HoaDon.maHoaDon = ChiTietHoaDon.maHoaDon\r\n"
				+ "where LoaiSanPham.tenLoaiSanPham  = '"+loai+"' \r\n"
				+ "and HoaDon.thoiGianTaoHoaDon >=  '"+ngayMoc+"'\r\n"
				+ "and  HoaDon.thoiGianTaoHoaDon <=  '"+NgayHan+"'  \r\n"
				+ "group by tenSanPham order By tienban DESC";
//		System.out.println(sqlTOPString);
		
		try {
			Statement statement = con.createStatement();
			ResultSet rs =  statement.executeQuery(sqlTOPString);
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
}
