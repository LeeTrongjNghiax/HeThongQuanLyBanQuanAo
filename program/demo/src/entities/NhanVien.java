package entities;

public class NhanVien {
	private String maNV;
	private String hoTen;
	private int tuoi;
	private PhongBan phong;
	private float tienLuong;
	
	public NhanVien() {
		super();
	}

	public NhanVien(String maNV, String hoTen, int tuoi, PhongBan phong, float tienLuong) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.phong = phong;
		this.tienLuong = tienLuong;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public PhongBan getPhong() {
		return phong;
	}

	public void setPhong(PhongBan phong) {
		this.phong = phong;
	}

	public double getTienLuong() {
		return tienLuong;
	}

	public void setTienLuong(float tienLuong) {
		this.tienLuong = tienLuong;
	}

	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", tuoi=" + tuoi + ", phong=" + phong + ", tienLuong="
				+ tienLuong + "]";
	}
}
