create database QLBHTTrang

USE QLBHTTrang

CREATE TABLE NhanVien(
	maNhanVien VARCHAR(6) PRIMARY KEY,
	tenNhanVien NVARCHAR(100) NOT NULL,
	soDienThoai VARCHAR(10) NOT NULL,
	gioiTinh BIT NOT NULL,
	ngaySinh DATE NOT NULL,
	email VARCHAR(100) NOT NULL,
	ngayVaoLam DATE NOT NULL,	
	chungMinhNhanDan VARCHAR(12) NOT NULL,
	chucVu NVARCHAR(50) NOT NULL,
	thanhpho NVARCHAR(100) NOT NULL,
	quan NVARCHAR(100) NOT NULL,
	huyen NVARCHAR(100) NOT NULL,
	diaChi NVARCHAR(100) NOT NULL
)

CREATE TABLE KhachHang(
	maKhachHang VARCHAR(30) PRIMARY KEY,
	tenKhachHang NVARCHAR(100) NOT NULL,
	gioiTinh BIT NOT NULL,
	soDienThoai VARCHAR(10) NOT NULL,
	ngaySinh DATE NOT NULL,
	email VARCHAR(100),
	diemTichLuy INT check (diemTichLuy >= 0)
)

CREATE TABLE TaiKhoan(
	tenTaiKhoan VARCHAR(30) PRIMARY KEY,
	matKhau VARCHAR(50) NOT NULL,
	maNhanVien VARCHAR(6) NOT NULL,

	FOREIGN KEY (maNhanVien) REFERENCES NhanVien(maNhanVien) on delete cascade
)

CREATE TABLE LoaiSanPham(
	maLoaiSanPham VARCHAR(30) PRIMARY KEY,
	tenLoaiSanPham NVARCHAR(50) NOT NULL
)

CREATE TABLE SanPham(
	maSanPham VARCHAR(30) PRIMARY KEY,
	tenSanPham NVARCHAR(100) NOT NULL,
	chatLieu NVARCHAR(50) NOT NULL,
	kieuDang NVARCHAR(50) NOT NULL,
	phuHopGioiTinh BIT NOT NULL,
	donViSanPham NVARCHAR(10) NOT NULL,
	moTaSanPham NVARCHAR(1000) NOT NULL,
	thuongHieu NVARCHAR(50) NOT NULL,
	nuocThuongHieu NVARCHAR(50) NOT NULL,
	tenNhaSanXuat NVARCHAR(50) NOT NULL,
	soDienThoaiNhaSanXuat VARCHAR(10) NOT NULL,
	emailNhaSanXuat VARCHAR(50) NOT NULL,
	duongDan NVARCHAR(300) NOT NULL,
	maLoaiSanPham VARCHAR(30) NOT NULL,
	maNhanVien VARCHAR(6) NOT NULL,

	FOREIGN KEY (maLoaiSanPham) REFERENCES LoaiSanPham(maLoaiSanPham),
	FOREIGN KEY (maNhanVien) REFERENCES NhanVien(maNhanVien)
)

CREATE TABLE ChiTietSanPham(
	maSanPham VARCHAR(30) NOT NULL,
	kichCo VARCHAR(5) NOT NULL,
	mauSac VARCHAR(100) NOT NULL,
	soLuong INT NOT NULL,
	giaNhap FLOAT NOT NULL,

	FOREIGN KEY (maSanPham) REFERENCES SanPham(maSanPham) on delete cascade
)

CREATE TABLE HoaDon(
	maHoaDon VARCHAR(10) PRIMARY KEY, 
	thoiGianTaoHoaDon DATETIME NOT NULL,
	maKhachHang VARCHAR(30) NOT NULL,
	maNhanVien VARCHAR(6) NOT NULL,
	caLamViec INT NOT NULL,
	tongTien FLOAT NOT NULL,
	tongGiam FLOAT NOT NULL,
	tongPhaiTra FLOAT NOT NULL,
	tienNhan FLOAT NOT NULL,
	tienTra FLOAT NOT NULL,	

	FOREIGN KEY (maKhachHang) REFERENCES KhachHang(maKhachHang),
	FOREIGN KEY (maNhanVien) REFERENCES NhanVien(maNhanVien)
)

CREATE TABLE ChiTietHoaDon(
	maHoaDon VARCHAR(10), 
	maSanPham VARCHAR(30) not null,
	tenSanPham NVARCHAR(30) NOT NULL,	
    soLuong INT NOT NULL,
	giaBan FLOAT NOT NULL,

	FOREIGN KEY (maSanPham) REFERENCES SanPham(maSanPham),
	FOREIGN KEY (maHoaDon) REFERENCES HoaDon(maHoaDon) on delete cascade,
)
