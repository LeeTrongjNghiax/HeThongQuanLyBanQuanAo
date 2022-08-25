package dao;

import java.sql.*;
import connectDB.ConnectDB;

public class General_DAO {
  public boolean backup() {
    Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement ps = null;
		int n = 0;
		try {
			// ps = con.prepareStatement("BACKUP DATABASE QuanLyNhanVien TO DISK = 'C:\\Users\\LeeTrongjNghiax\\OneDrive - Industrial University of HoChiMinh City\\year3\\HK1\\phatTrienUngDung\\homeworks\\HeThongQuanLyBanQuanAo\\program\\demo\\querys\\backups.bak'");
			ps = con.prepareStatement("BACKUP DATABASE QuanLyNhanVien TO DISK = 'C:\\backups\\test.bak'");
			n = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
  }

	public boolean restore() {
    Connection con = ConnectDB.getInstance().getConnection();
		PreparedStatement ps = null;
		int n = 0;
		try {
			// ps = con.prepareStatement("BACKUP DATABASE QuanLyNhanVien TO DISK = 'C:\\Users\\LeeTrongjNghiax\\OneDrive - Industrial University of HoChiMinh City\\year3\\HK1\\phatTrienUngDung\\homeworks\\HeThongQuanLyBanQuanAo\\program\\demo\\querys\\backups.bak'");
			ps = con.prepareStatement("USE master; RESTORE DATABASE QuanLyNhanVien FROM DISK = 'C:\\backups\\test.bak'; USE QuanLyNhanVien");
			n = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
  }
}
