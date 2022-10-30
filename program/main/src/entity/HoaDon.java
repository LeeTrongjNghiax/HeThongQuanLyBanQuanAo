package entity;

import java.sql.Date;

public class HoaDon {
	private String maHoaDon;
	private Date ngayTaoHoaDon;
	private NhanVien nhanVien;
	private KhachHang khachHang;
	private int caLamViec;
	private double tongCong;
	private double tienGiam;
	private double tienNhan;
	private double tienTra;
	
	public HoaDon(String maHoaDon) {
		super();
		this.maHoaDon = maHoaDon;
	}

	public HoaDon(String maHoaDon, Date ngayTaoHoaDon, NhanVien nhanVien, KhachHang khachHang, int caLamViec,
			double tongCong, double tienGiam, double tienNhan, double tienTra) {
		super();
		this.maHoaDon = maHoaDon;
		this.ngayTaoHoaDon = ngayTaoHoaDon;
		this.nhanVien = nhanVien;
		this.khachHang = khachHang;
		this.caLamViec = caLamViec;
		this.tongCong = tongCong;
		this.tienGiam = tienGiam;
		this.tienNhan = tienNhan;
		this.tienTra = tienTra;
	}

	public String getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public Date getNgayTaoHoaDon() {
		return ngayTaoHoaDon;
	}

	public void setNgayTaoHoaDon(Date ngayTaoHoaDon) {
		this.ngayTaoHoaDon = ngayTaoHoaDon;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public int getCaLamViec() {
		return caLamViec;
	}

	public void setCaLamViec(int caLamViec) {
		this.caLamViec = caLamViec;
	}

	public double getTongCong() {
		return tongCong;
	}

	public void setTongCong(double tongCong) {
		this.tongCong = tongCong;
	}

	public double getTienGiam() {
		return tienGiam;
	}

	public void setTienGiam(double tienGiam) {
		this.tienGiam = tienGiam;
	}

	public double getTienNhan() {
		return tienNhan;
	}

	public void setTienNhan(double tienNhan) {
		this.tienNhan = tienNhan;
	}

	public double getTienTra() {
		return tienTra;
	}

	public void setTienTra(double tienTra) {
		this.tienTra = tienTra;
	}
	
}
