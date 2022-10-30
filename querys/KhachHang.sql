USE QuanLyCuaHangBanQuanAo;

INSERT INTO KhachHang VALUES 
('KH001',N'Trần Vĩnh Phúc', 1, '0997293380', '1981-08-14', 'phucvinh81gmail.com'),
('KH002',N'Lê Văn Mạnh', 1, '0119881308', '1983-09-02', 'manhcute0902@gmail.com'),
('KH003',N'Mai Bảo Bình', 0, '0109317846', '1987-04-04', 'baobinh352@gmail.com'),
('KH004',N'Trần Tuyết Nhi', 0, '0572839929', '1999-06-20', 'tuyetnhi0572839929@gmail.com'),
('KH005',N'Trần Vĩnh Phúc', 1, '0821858940', '1999-09-26', 'tvinhphuc642@gmail.com'),
('KH006',N'Nguyễn Hoài Kiệt', 1, '0703589794', '1999-07-04', 'kiethoainguyen54@gmail.com'),
('KH007',N'Đặng Ngọc Nga', 0, '0359922235', '1998-10-16', 'saudoi@gmail.com'),
('KH008',N'Lương Đức Mạnh', 1, '0159233564', '1998-03-10', 'manhgiaovien3@gmail.com'),
('KH009',N'Ngô Anh Tài', 1, '0755991317', '1993-05-09', 'anhtaingo0509@gmail.com'),
('KH010',N'Phùng Lê Mạnh Hưng', 1, '0650584334', '1992-11-14', 'plmh0650584334@gmail.com'),
('KH011',N'Trần Đặng Anh Thư', 0, '0747361011', '1990-01-23', 'trandanganhthu@gmail.com'),
('KH012',N'Phạm Thị Ngọc Dung', 0, '0108664220', '1989-12-31', 'dung1231@gmail.com'),
('KH013',N'Đỗ Tú Quyên', 0, '0448493100', '1987-11-15', 'quyendo0448493100@gmail.com'),
('KH014',N'Nguyễn Mạnh Tuân', 1, '0047951894', '1982-10-22', 'mtuan15111987@gmail.com'),
('KH015',N'Lê Trần Đức Mạnh', 1, '0285223471', '1980-03-29', 'ltdm2903@gmail.com'),
('KH016',N'Nguyễn Thị Ý Ngọc', 0, '0971530782', '1979-10-27', 'yngockute123456@gmail.com'),
('KH017',N'Phùng Ngô Bảo Yến', 0, '0637665371', '1975-11-25', 'yenvuive2511@gmail.com'),
('KH018',N'Nguyễn Trần Tú Quyên', 0, '0164508224', '1978-08-31', 'tuquyen0164508224@gmail.com'),
('KH019',N'Võ Trần Thanh Hà', 0, '0969499040', '1974-12-08', 'thanhhanhanvien542@gmail.com'),
('KH020',N'Trương Minh Hữu', 1, '0446857522', '1974-04-13', 'minhhuuhocgioi431@gmail.com'),
('KH021',N'Ngô Minh Hiếu', 1, '0739210564', '1973-11-04', 'hieuhoihon0411@gmail.com'),
('KH022',N'Trần Ngọc Bảo Yến', 0, '0063258129', '1970-07-15', 'baoyen@gmail.com'),
('KH023',N'Lê Thị Ngọc Minh', 0, '0698916681', '1970-06-15', 'ltnm0698916681@gmail.com'),
('KH024',N'Nguyễn Trần Anh Thư', 0, '0063817281', '1969-01-06', 'AnhThuThanhThanh@gmail.com'),
('KH025',N'Lê Thị Minh Tâm', 0, '0500344196', '1968-07-19', 'minhtamtranthi@gmail.com'),
('KH026',N'Trần Thị Ngọc Thư', 0, '0151796344', '1964-05-17', 'ngocthu0517@gmail.com'),
('KH027',N'Nguyễn Bảo Yến', 0, '0186183866', '2002-03-07', 'baoyenanhvan@gmail.com'),
('KH028',N'Nguyễn Đặng Anh Thư', 0, '0917669719', '1974-12-08', 'anhthu0917669719@gmail.com'),
('KH029',N'Ngô Đức Bình', 1, '0942620610', '1989-12-31', 'binhbeboi@gmail.com'),
('KH030',N'Nguyễn Ý Lam', 0, '0054979108', '1964-05-17', 'lamlanhleo0054979108@gmail.com')

INSERT INTO TaiKhoan(tenTaiKhoan, matKhau, maKhachHang, maNhanVien) VALUES
('phucvinh', '0123456789', '', 'KH001'),

SELECT * FROM KhachHang;
DELETE FROM KhachHang;