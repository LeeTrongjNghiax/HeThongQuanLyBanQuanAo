package entity;

public class ThongKeDoanhThu {
	protected String doiTuong;
	protected int soluongHoDon;
	protected double soTien;
	public String getDoiTuong() {
		return doiTuong;
	}
	public void setDoiTuong(String doiTuong) {
		this.doiTuong = doiTuong;
	}
	public int getSoluongHoDon() {
		return soluongHoDon;
	}
	public void setSoluongHoDon(int soluongHoDon) {
		this.soluongHoDon = soluongHoDon;
	}
	public double getSoTien() {
		return soTien;
	}
	public void setSoTien(double soTien) {
		this.soTien = soTien;
	}
	@Override
	public String toString() {
		return "ThongKeDoanhThu [doiTuong=" + doiTuong + ", soluongHoDon=" + soluongHoDon + ", soTien=" + soTien + "]";
	}
	public ThongKeDoanhThu(String doiTuong, int soluongHoDon, double soTien) {
		super();
		this.doiTuong = doiTuong;
		this.soluongHoDon = soluongHoDon;
		this.soTien = soTien;
	}
	public ThongKeDoanhThu() {
		super();
	}
	
	
}
