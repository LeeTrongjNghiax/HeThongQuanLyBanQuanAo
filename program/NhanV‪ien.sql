INSERT INTO NhanVien(maNhanVien, tenNhanVien, ngaySinh, gioiTinh, diaChi, soDienThoai, email, ngayVaoLam, chucVu, chungMinhNhanDan) VALUES
('NV001', N'Nguyễn Đức Long', '01/01/2002', 1, '114/64 Van Kiep', '0764670490', 'longbao@gmail.com', '03/10/2022', 'Quản lí', '565278468568'),
('NV002', N'Lê Trọng Nghĩa', '07/03/2002', 1, '45/1 Đinh Bộ Lĩnh', '0764670499', 'leetrongjnghiax0938225745@gmail.com', '03/10/2022', 'Nhân viên', '232347052039'),
('NV003', N'Nguyễn Quang Toán', '02/10/2002', 1, '34/1 DH Cong Nghiep', '0764670492', 'toanlmao@gmail.com', '03/10/2022', 'Nhân viên', '851855948331'),
('NV004', N'Mai Thị Thu Thúy', '10/10/2007', 1, '14/1000 Nơ Trang Long', '0764670493', 'maithuy@gmail.com', '01/10/2022', 'Giám đốc trưởng', '596859921815')

INSERT INTO TaiKhoan(tenTaiKhoan, matKhau, maKhachHang, maNhanVien) VALUES
('nguyenduclong1234', '123456', '', 'NV001'),
('leetrongjnghiax0938225745', '123456', '', 'NV002'),
('toanmicay', '123456', '', 'NV003'),
('chothuy', '123456', '', 'NV004'),

SELECT * FROM NhanVien

SELECT * FROM TaiKhoan