package entity;

public class ChiTietHoaDon {
	private HoaDon hoaDon;
	private SanPham sanPham;
	private int soLuong;
	private double giaBan;
	
	public ChiTietHoaDon(HoaDon hoaDon, SanPham sanPham, int soLuong, double giaBan) {
		super();
		this.hoaDon = hoaDon;
		this.sanPham = sanPham;
		this.soLuong = soLuong;
		this.giaBan = giaBan;
	}
	
	public HoaDon getHoaDon() {
		return hoaDon;
	}


	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public SanPham getSanPham() {
		return sanPham;
	}
	
	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
	
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	public double getGiaBan() {
		return giaBan;
	}
	
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	
}
