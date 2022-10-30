package entity;

public class ThongKeSoLuongSanPham {
	protected String Sp;
	protected int soLuong;
	protected double doanhthu;
	
	public String getSp() {
		return Sp;
	}
	public void setSp(String sp) {
		Sp = sp;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double getDoanhthu() {
		return doanhthu;
	}
	public void setDoanhthu(double doanhthu) {
		this.doanhthu = doanhthu;
	}
	public ThongKeSoLuongSanPham() {
		super();
	}
	public ThongKeSoLuongSanPham(String sp, int soLuong, double doanhthu) {
		super();
		this.Sp = sp;
		this.soLuong = soLuong;
		this.doanhthu = doanhthu;
	}
	@Override
	public String toString() {
		return "ThongKeSoLuongSanPham [Sp=" + Sp + ", soLuong=" + soLuong + ", doanhthu=" + doanhthu + "]";
	}
	
}
