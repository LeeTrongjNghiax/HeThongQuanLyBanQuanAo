package entity;

public class ChiTietSanPham {
	private SanPham sanPham;
	private String kichCo, mauSac;
	private int soLuong;
	private double giaBan;
	
	public ChiTietSanPham(SanPham sanPham, String kichCo, String mauSac, int soLuong, double giaBan) {
		super();
		this.sanPham = sanPham;
		this.kichCo = kichCo;
		this.mauSac = mauSac;
		this.soLuong = soLuong;
		this.giaBan = giaBan;
	}
	
	public SanPham getSanPham() {
		return sanPham;
	}
	
	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
	
	public String getKichCo() {
		return kichCo;
	}
	
	public void setKichCo(String kichCo) {
		this.kichCo = kichCo;
	}
	
	public String getMauSac() {
		return mauSac;
	}
	
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
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
