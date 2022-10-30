USE QuanLyCuaHangBanQuanAo;
GO

INSERT INTO NhanVien values 
('NV0001', N'Nguyễn Đức Long', '0789112534', 1, '2002-12-08','longbao@gmail.com','2021-07-11','231478992136',N'Quản lí',N'Quảng Nam','Tam Ky','Núi Thanh Hội An','')
INSERT INTO NhanVien values 
('NV0002', N'Nguyễn Quang Toán', '0326978123', 1, '2002-02-12','tonnguyen@gmail.com','2021-07-11','281476322137',N'Nhân viên bán hàng',N'Quảng Nam','Tam Ky','Núi Thanh Hội An','')
INSERT INTO NhanVien values 
('NV0003', N'Lê Trọng Nghĩa', '0789112534', 1, '2002-07-07','nghiaabc@gmail.com','2021-07-11','231478992144',N'Quản lí',N'Quảng Nam','Tam Ky','Núi Thanh Hội An','')
INSERT INTO NhanVien values 
('NV0004', N'Mai Thị Thu Thúy', '0789112534', 0, '2002-09-28','thybling@gmail.com','2021-07-11','2314666661',N'Quản lí',N'Quảng Nam','Tam Ky','Núi Thanh Hội An','')
GO

INSERT INTO TaiKhoan VALUES
('nguyenduclong1234', '123456', 'NV0001'),
('leetrongjnghiax0938225745', '123456', 'NV0002'),
('toanmicay', '123456', 'NV0003'),
('chothuy', '123456', 'NV0004')
GO