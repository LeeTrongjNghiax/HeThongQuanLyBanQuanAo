CREATE DATABASE QuanLyCuaHangBanQuanAo;

USE QuanLyCuaHangBanQuanAo;

CREATE TABLE NhanVien(
	maNhanVien NVARCHAR(6) PRIMARY KEY,
	tenNhanVien NVARCHAR(100) NOT NULL,
	soDienThoai NVARCHAR(10) NOT NULL,
	gioiTinh BIT NOT NULL,
	ngaySinh DATE NOT NULL,
	email NVARCHAR(100) NOT NULL,
	ngayVaoLam DATE NOT NULL,
	chungMinhNhanDan NVARCHAR(12) NOT NULL,
	chucVu NVARCHAR(50) NOT NULL,
	thanhpho NVARCHAR(100) NOT NULL,
	quan NVARCHAR(100) NOT NULL,
	huyen NVARCHAR(100) NOT NULL,
	diaChi NVARCHAR(100) NOT NULL
)
GO

CREATE TABLE KhachHang(
	maKhachHang NVARCHAR(30) PRIMARY KEY,
	tenKhachHang NVARCHAR(100) NOT NULL,
	gioiTinh BIT NOT NULL,
	soDienThoai NVARCHAR(10) NOT NULL,
	ngaySinh DATE NOT NULL,
	email NVARCHAR(100) NOT NULL,
	diemTichLuy INT NOT NULL
)

CREATE TABLE TaiKhoan(
	tenTaiKhoan NVARCHAR(30) PRIMARY KEY,
	matKhau NVARCHAR(50) NOT NULL,
	maKhachHang NVARCHAR(30) NOT NULL,
	maNhanVien NVARCHAR(30) NOT NULL,

	FOREIGN KEY (maKhachHang) REFERENCES KhachHang(maKhachHang) on delete cascade,
	FOREIGN KEY (maNhanVien) REFERENCES NhanVien(maNhanVien) on delete cascade
)

CREATE TABLE LoaiSanPham(
	maLoaiSanPham NVARCHAR(30) PRIMARY KEY,
	tenLoaiSanPham NVARCHAR(50) NOT NULL
)

CREATE TABLE SanPham(
	maSanPham NVARCHAR(30) PRIMARY KEY,
	tenSanPham NVARCHAR(100) NOT NULL,
	chatLieu NVARCHAR(50) NOT NULL,
	kieuDang NVARCHAR(50) NOT NULL,
	phuHopGioiTinh NVARCHAR(50) NOT NULL,
	donViSanPham NVARCHAR(10) NOT NULL,
	moTaSanPham NVARCHAR(1000) NOT NULL,
	thuongHieu NVARCHAR(50) NOT NULL,
	nuocThuongHieu NVARCHAR(50) NOT NULL,
	tenNhaSanXuat NVARCHAR(50) NOT NULL,
	soDienThoaiNhaSanXuat NVARCHAR(10) NOT NULL,
	emailNhaSanXuat NVARCHAR(50) NOT NULL,
	noiSanXuat NVARCHAR(50) NOT NULL,
	duongDan NVARCHAR(300) NOT NULL,
	maLoaiSanPham NVARCHAR(30) NOT NULL,
	maNhanVien NVARCHAR(30) NOT NULL,

	FOREIGN KEY (maLoaiSanPham) REFERENCES LoaiSanPham(maLoaiSanPham),
	FOREIGN KEY (maNhanVien) REFERENCES NhanVien(maNhanVien)
)

CREATE TABLE ChiTietSanPham(
	mauSac NVARCHAR(100) NOT NULL,
	kichCo NVARCHAR(3) NOT NULL,
	soLuong INT NOT NULL,
	giaNhap FLOAT NOT NULL,
	maSanPham NVARCHAR(30) NOT NULL,

	FOREIGN KEY (maSanPham) REFERENCES SanPham(maSanPham),
)

CREATE TABLE HoaDon(
	maHoaDon NVARCHAR(10) PRIMARY KEY, 
	thoiGianTaoHoaDon DATETIME NOT NULL,
	caLamViec INT NOT NULL,
	tienNhan FLOAT NOT NULL,
	maKhachHang NVARCHAR(30) NOT NULL,
	maNhanVien NVARCHAR(30) NOT NULL,

	FOREIGN KEY (maKhachHang) REFERENCES KhachHang(maKhachHang),
	FOREIGN KEY (maNhanVien) REFERENCES NhanVien(maNhanVien)
)

CREATE TABLE ChiTietHoaDon(
	soLuong INT NOT NULL,
	maSanPham NVARCHAR(30) NOT NULL,
	maHoaDon NVARCHAR(10), 

	FOREIGN KEY (maSanPham) REFERENCES SanPham(maSanPham),
	FOREIGN KEY (maHoaDon) REFERENCES HoaDon(maHoaDon)
)

DROP TABLE KhachHang
DROP TABLE NhanVien
DROP TABLE TaiKhoan
DROP TABLE LoaiSanPham
DROP TABLE SanPham
DROP TABLE ChiTietSanPham
DROP TABLE HoaDon
DROP TABLE ChiTietHoaDon
