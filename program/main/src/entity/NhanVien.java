package entity;

import java.sql.Date;

public class NhanVien {
	private String maNhanVien;
	private String tenNhanVien;
	private Date ngaySinh;
	private boolean gioiTinh;
	private String diaChi, phuong, quan, thanhPho;
	private String chungMinhNhanDan;
	private String sDT;
	private String email;
	private Date ngayVaoLam;
	private String chucVu;
	
	public NhanVien() {
		super();
	}
	// String phuong, String quan, String thanhPho,
	public NhanVien(String maNhanVien, String tenNhanVien, Date ngaySinh, boolean gioiTinh, String diaChi,
			 String chungMinhNhanDan, String sDT, String email,
			Date ngayVaoLam, String chucVu) {
		super();
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		// this.phuong = phuong;
		// this.quan = quan;
		// this.thanhPho = thanhPho;
		this.sDT = sDT;
		this.email = email;
		this.chucVu = chucVu;
		this.ngayVaoLam = ngayVaoLam;
		this.chungMinhNhanDan = chungMinhNhanDan;

	}
	
	public String getMaNhanVien() {
		return maNhanVien;
	}
	
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	
	public Date getNgaySinh() {
		return ngaySinh;
	}
	
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	public String getDiaChi() {
		return diaChi;
	}
	
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public String getPhuong() {
		return phuong;
	}
	
	public void setPhuong(String phuong) {
		this.phuong = phuong;
	}
	
	public String getQuan() {
		return quan;
	}
	
	public void setQuan(String quan) {
		this.quan = quan;
	}
	
	public String getThanhPho() {
		return thanhPho;
	}
	
	public void setThanhPho(String thanhPho) {
		this.thanhPho = thanhPho;
	}
	
	public String getChungMinhNhanDan() {
		return chungMinhNhanDan;
	}
	
	public void setChungMinhNhanDan(String chungMinhNhanDan) {
		this.chungMinhNhanDan = chungMinhNhanDan;
	}
	
	public String getsDT() {
		return sDT;
	}

	public void setsDT(String sDT) {
		this.sDT = sDT;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getNgayVaoLam() {
		return ngayVaoLam;
	}
	
	public void setNgayVaoLam(Date ngayVaoLam) {
		this.ngayVaoLam = ngayVaoLam;
	}
	
	public String getChucVu() {
		return chucVu;
	}
	
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	
}
