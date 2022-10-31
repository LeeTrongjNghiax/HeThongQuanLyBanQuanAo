package DAO;

import java.sql.*;
import java.sql.Date;
import java.util.*;

import connect_DB.Connect_DB;
import entity.NhanVien;

public class NhanVien_DAO {
  ArrayList<NhanVien> dsnv ;
	NhanVien nv ;
	public NhanVien_DAO() {
		dsnv = new ArrayList<NhanVien>();
		nv = new NhanVien();
	}

	public ArrayList<NhanVien>getAllNhanVien(){
		ArrayList<NhanVien> dsnv1 = new ArrayList<NhanVien>();
		try {
			Connection con= new Connect_DB().getConnect();
			String sql="Select * from NhanVien";
			Statement statement = con.createStatement();
			ResultSet rs=statement.executeQuery(sql);
			while(rs.next()) {
				String maNhanVien = rs.getString(1);
				String tenNhanVien = rs.getString(2);
				String soDienThoai = rs.getString(3);
				Boolean gioiTinh=rs.getBoolean(4);
				Date ngaySinh =  rs.getDate(5);
				String email = rs.getString(6);
				Date ngayVaoLam = rs.getDate(7);
				String chungMinhNhanDan = rs.getString(8);
				String chucVu =  rs.getString(9);
				String thanhPho = rs.getString(10);
				String quan = rs.getString(11);
				String phuong = rs.getString(12);
				String diaChi= rs.getString(13);
				NhanVien nv=new NhanVien(maNhanVien, tenNhanVien, ngaySinh, gioiTinh, diaChi, phuong, quan, thanhPho, chungMinhNhanDan, soDienThoai, email, ngayVaoLam, chucVu);
				dsnv1.add(nv);
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		return dsnv1;

	}

	//----add nhân viên 
	public boolean createNhanVien (NhanVien nv)
	{	
		Connection con = new Connect_DB().getConnect();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			stmt = con.prepareStatement("insert into NhanVien values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
			stmt.setString(1,nv.getMaNhanVien());
			stmt.setString(2, nv.getTenNhanVien());
			stmt.setString(3, nv.getsDT());
			stmt.setBoolean(4, nv.isGioiTinh()? true : false);
			stmt.setDate(5, nv.getNgaySinh());
			stmt.setString(6, nv.getEmail());
			stmt.setDate(7,nv.getNgayVaoLam());
			stmt.setString(8, nv.getChungMinhNhanDan());
			stmt.setString(9, nv.getChucVu());
			stmt.setString(10, nv.getThanhPho());
			stmt.setString(11, nv.getQuan());
			stmt.setString(12,nv.getPhuong());
			stmt.setString(13,nv.getDiaChi());
			n = stmt.executeUpdate();
		} catch (Exception e) {

			e.printStackTrace();
		}
		return n > 0 ;
	}

	public boolean deleteNhanVien(String maNhanVien) {
		Connection con = new Connect_DB().getConnect();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			stmt=con.prepareStatement("delete from NhanVien where maNhanVien =?");
			stmt.setString(1, maNhanVien);
			n=stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n>0;

	}
		//---update----//
		public boolean upDateNhanVien(NhanVien nv)
		{
			
			Connection con = new Connect_DB().getConnect();
			PreparedStatement stmt = null;
			int n = 0;
			try {
				stmt = con.prepareStatement("update NhanVien set tenNhanVien=?,sodienthoai=?,gioiTinh=?,ngaySinh=?,email=?,ngayVaoLam=?,chungMinhNhanDan=?,chucVu=?,thanhPho=?,Quan=?,huyen=?,diaChi=? where maNhanVien=? ");
				
				stmt.setString(1, nv.getTenNhanVien());
				stmt.setString(2, nv.getsDT());
				stmt.setBoolean(3, nv.isGioiTinh()? true : false);
				stmt.setDate(4, nv.getNgaySinh());
				stmt.setString(5, nv.getEmail());
				stmt.setDate(6,nv.getNgayVaoLam());
				stmt.setString(7, nv.getChungMinhNhanDan());
				stmt.setString(8, nv.getChucVu());
				stmt.setString(9, nv.getThanhPho());
				stmt.setString(10, nv.getQuan());
				stmt.setString(11,nv.getPhuong());
				stmt.setString(12,nv.getDiaChi());
				stmt.setString(13,nv.getMaNhanVien());
				
				n = stmt.executeUpdate();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			return n > 0 ;  
		}
}
////find
//	public ArrayList<NhanVien> findNhanVienByName(String name) {
//		ResultSet rs=null;
//		Statement stmt=null;
//		ArrayList<NhanVien>list=new ArrayList<NhanVien>(); 
//		try {
//			String sql = "select * from NhanVien  where tenNhanVien like N'%"+name+"%'";
//			Connection con = Connect_DB.getCon();
//			stmt = con.createStatement();
//			rs = stmt.executeQuery(sql);
//			while(rs.next())
//			{
//				String maNV=rs.getString(1);
//				String tenNV=rs.getString(2);
//				String sdt=rs.getString(3);
//				Boolean gt=rs.getBoolean(4);
//				Date ngaySinh=rs.getDate(5);
//				String Email=rs.getString(6);
//				Date ngayVaoLam=rs.getDate(7);
//				String cmnd=rs.getString(8);
//				String chucVu=rs.getString(9).toString();
//				String thanhPho=rs.getString(10).toString();
//				String quan=rs.getString(11).toString();
//				String phuong=rs.getString(12).toString();
//				String diaChi=rs.getString(13);
//				
//				NhanVien nv =new NhanVien(maNV, tenNV, ngaySinh, gt, diaChi, phuong, quan, thanhPho, cmnd, sdt, Email, ngayVaoLam, chucVu);
//				list.add(nv);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return list;
//	
//	}
//	// find phone
////	public void findNhanVienPhone(String sdt) {
////		ResultSet rs=null;
////		Statement stmt=null;
////		try {
////			String sql = "select * from NhanVien  where soDienThoai =?";
////			Connection con = connectDB.getConnection();
////			stmt = con.createStatement();
////			rs = stmt.executeQuery(sql);
////			while(rs.next()) {
////				String maNV=rs.getString(1);
////				String tenNV=rs.getString(2);
////				String soDienThoai=rs.getString(3);
////				Boolean gt=rs.getBoolean(4);
////				Date ngaySinh=rs.getDate(5);
////				String Email=rs.getString(6);
////				Date ngayVaoLam=rs.getDate(7);
////				String cmnd=rs.getString(8);
////				String chucVu=rs.getString(9).toString();
////				String thanhPho=rs.getString(10).toString();
////				String quan=rs.getString(11).toString();
////				String phuong=rs.getString(12).toString();
////				String diaChi=rs.getString(13);
////			}
////		} catch (Exception e) {
////			e.printStackTrace();
//}
