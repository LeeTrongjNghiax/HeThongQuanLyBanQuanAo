//package DAO;
//
//import java.sql.*;
//import java.util.ArrayList;
//
//import connect_DB.Connect_DB;
//import entity.KhachHang;
//
//public class KhachHang_DAO {
//  
//  ArrayList<KhachHang> dskh ;
//  KhachHang kh ;
//  public KhachHang_DAO() {
//    dskh = new ArrayList<KhachHang>();
//    kh = new KhachHang();
//  }
//  public ArrayList<KhachHang>getAllKhachHang(){
//
//    try {
//      Connect_DB.getInstance();
//      Connection con = Connect_DB.getCon();
//      String sql="Select * from KhachHang";
//      Statement statement= con.createStatement();
//      ResultSet rs=statement.executeQuery(sql);
//      while(rs.next()) {
//        String maKhachHang = rs.getString(1);
//        String tenKhachHang = rs.getString(2);
//        Boolean gioiTinh=rs.getBoolean(3);
//        String soDienThoai = rs.getString(4);
//        Date ngaySinh =  rs.getDate(5);
//        String email = rs.getString(6);
//        int diemTichLuy = rs.getInt(7);
//        KhachHang kh =new KhachHang(maKhachHang, tenKhachHang, gioiTinh, soDienThoai, ngaySinh, email, diemTichLuy);
//        dskh.add(kh);
//      }
//
//    }catch(Exception e) {
//      e.printStackTrace();
//    }
//    return dskh;
//
//  }
//  // add
//  public boolean createKhachHang (KhachHang kh)
//  {
//    Connection con = Connect_DB.getInstance().getCon();
//    PreparedStatement stmt = null;
//    int n = 0;
//    try {
//      stmt = con.prepareStatement("insert into "+" KhachHang values (?,?,?,?,?,?)");
//      stmt.setString(1, kh.getMaKhachHang());
//      stmt.setString(2, kh.getTenKhachHang());
//      stmt.setBoolean(3, kh.isGioiTinh()?true:false);
//      stmt.setString(4, kh.getSoDienThoai());
//      stmt.setDate(5, kh.getNgaySinh());
//      stmt.setString(6, kh.getEmail());
//      n = stmt.executeUpdate();
//    } catch (Exception e) {
//
//      e.printStackTrace();
//    }
//    return n > 0 ;
//  }
//  //delete
//  public boolean deleteKhachHang(String maKhachHang) {
//    Connection con = Connect_DB.getInstance().getCon();
//    PreparedStatement stmt = null;
//    int n = 0;
//    try {
//      stmt=con.prepareStatement("delete from KhachHang where maKhachHang = ?");
//      stmt.setString(1, maKhachHang);
//      n=stmt.executeUpdate();
//    } catch (Exception e) {
//      e.printStackTrace();
//    }
//    return n>0;
//
//  }
//  // update
//  public boolean upDateKhachHang(KhachHang kh)
//  {
//    Connect_DB.getInstance();
//    Connection con = Connect_DB.getCon();
//    PreparedStatement stmt = null;
//    int n = 0;
//    try {
//      stmt = con.prepareStatement("update KhachHang set tenKhachHang=?,gioiTinh=?,sodienthoai=?,ngaySinh=?,email=? where maKhachHang=? ");
//
//      stmt.setString(1, kh.getTenKhachHang());
//      stmt.setBoolean(2, kh.isGioiTinh()? true : false);
//      stmt.setString(3, kh.getSoDienThoai());
//      stmt.setDate(4,kh.getNgaySinh());
//      stmt.setString(5, kh.getEmail());
//      stmt.setString(6,kh.getMaKhachHang());
//      n = stmt.executeUpdate();
//    } catch (Exception e) {
//
//      e.printStackTrace();
//    }
//    return n > 0 ;  
//  }
//  // find 
//  public ArrayList<KhachHang> findKhachHangByName(String name) {
//    ResultSet rs=null;
//    Statement stmt=null;
//    ArrayList<KhachHang>list=new ArrayList<KhachHang>(); 
//    try {
//      String sql = "select * from KhachHang where tenKhachHang like N'%"+name+"%'";
//      Connection con = Connect_DB.getCon();
//      stmt = con.createStatement();
//      rs = stmt.executeQuery(sql);
//      while(rs.next())
//      {
//        String maKhachHang=rs.getString(1);
//        String tenKhachHang=rs.getString(2);
//        String sdt=rs.getString(3);
//        Boolean gt=rs.getBoolean(4);
//        Date ngaySinh=rs.getDate(5);
//        String email=rs.getString(6);
//        int diemTichLuy = rs.getInt(7);
//        KhachHang kh = new KhachHang(maKhachHang, tenKhachHang, gt, sdt, ngaySinh, email, diemTichLuy);
//        
//        list.add(kh);
//      }
//    } catch (Exception e) {
//      e.printStackTrace();
//    }
//    return list;
//
//  }
//}
