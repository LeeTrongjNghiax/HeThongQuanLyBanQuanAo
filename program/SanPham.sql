insert into NhanVien values(N'NV001', N'Nguyễn Toán', 1, N'2002-12-12', N'Bình Định', N'toan@mail.com', N'Nhân Viên', N'2020-12-12',' 2020020220', N'2012-12-12')

insert into LoaiSanpham values (N'AT', N'Áo thun')
insert into LoaiSanpham values (N'ASM', N'Áo Sơ Mi')
insert into LoaiSanpham values (N'QT', N'Quần Tây')
insert into LoaiSanpham values (N'QJ', N'Quần Jean')
insert into LoaiSanpham values (N'AK', N'Áo Khoác')
insert into LoaiSanpham values (N'DSN', N'Đầm Sát Nách')
insert into LoaiSanpham values (N'QV', N'Quần Váy')

INSERT INTO SanPham VALUES
(N'AT001', N'Áo Thun Cổ Tròn Y Nguyên Bản 18+ Ver87', N'Cotton', N'Cổ tròn Y', 1, N'cái', N'Thân thiện, Thấm hút thoát ẩm, Mềm mại, Kiểm soát mùi, Điều hòa nhiệt, Họa tiết in dẻo + phối le mí tay, Nên giặt chung với sản phẩm cùng màu, Không dùng thuốc tẩy hoặc xà phòng có tính tẩy mạnh, Nên phơi trong bóng râm để giữ sp bền màu',
N'Yame', N'Việt Nam', N'Y Original', N'0287307144', N'cskh@yame.vn', N'Việt Nam', '', N'AT', N'NV001')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
(N'trắng', N'S', 20, 181000, N'AT001'),
(N'trắng', N'M', 20, 181000, N'AT001'),
(N'trắng', N'L', 20, 181000, N'AT001'),
(N'trắng', N'XL', 20, 181000, N'AT001')

INSERT INTO SanPham VALUES
(N'ASM002', 'Áo Sơ Mi Tay Dài Sợi Modal Tối Giản M11', N'Kate', N'Tay dài', 1, N'cái', N'Thành phần: 12% modal và 88% superfine\n- Ít nhăn và dễ ủi\n- Nhanh khô và thoáng mát\nHDSD:\n- Áo sơ mi màu phơi trong bóng râm để tránh bạc màu phần vai áo\n- Áo sơ mi trắng có thể phơi ngoài nắng để áo trắng sáng hơn ( không phơi quá lâu )',
N'Yame', N'Việt Nam', N'Y Original', N'0287307144', N'cskh@yame.vn', N'Việt Nam', '', N'AT', N'NV001')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
(N'trắng', N'S', 29, 255000, N'ASM002'),
(N'trắng', N'M', 28, 255000, N'ASM002'),
(N'trắng', N'L', 30, 255000, N'ASM002'),
(N'trắng', N'XL', 34, 255000, N'ASM002'),
(N'tím', N'S', 35, 255000, N'ASM002'),
(N'tím', N'M', 35, 255000, N'ASM002'),
(N'tím', N'L', 35, 255000, N'ASM002'),
(N'tím', N'XL', 35, 255000, N'ASM002'),
('đen', N'S', 36, 255000, N'ASM002'),
('đen', N'M', 36, 255000, N'ASM002'),
('đen', N'L', 36, 255000, N'ASM002'),
('đen', N'XL', 36, 255000, N'ASM002'),
(N'xanh đen', N'S', 36, 255000, N'ASM002'),
(N'xanh đen', N'M', 23, 255000, N'ASM002'),
(N'xanh đen', N'L', 20, 255000, N'ASM002'),
(N'xanh đen', N'XL', 10, 255000, N'ASM002'),
('đỏ', N'S', 35, 255000, N'ASM002'),
('đỏ', N'M', 35, 255000, N'ASM002'),
('đỏ', N'L', 35, 255000, N'ASM002'),
('đỏ', N'XL', 35, 255000, N'ASM002'),
(N'xanh biển', N'S', 28, 255000, N'ASM002'),
(N'xanh biển', N'M', 27, 255000, N'ASM002'),
(N'xanh biển', N'L', 30, 255000, N'ASM002'),
(N'xanh biển', N'XL', 15, 255000, N'ASM002')

INSERT INTO SanPham VALUES
(N'AT003', 'Áo Thun Cổ Trụ Đơn Giản Ngân Hà Space Ver17', N'Cotton Compact', N'Cổ trụ', 1, N'cái', N'Chất liệu: Cotton Compact\nThành phần: 100% Cotton\n- Thân thiện\n- Thấm hút thoát ẩm\n- Mềm mại\n- Kiểm soát mùi\n- Điều hòa nhiệt\n+ Họa tiết In dẻo + in nước\n- HDSD:\n+ Nên giặt chung với sản phẩm cùng màu\n+ Không dùng thuốc tẩy hoặc xà phòng có tính tẩy mạnh\n+ Nên phơi trong bóng râm để giữ sp bền màu',
N'Yame', N'Việt Nam', N'Y Original', N'0287307144', N'cskh@yame.vn', N'Việt Nam', '', N'AT', N'NV001')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
(N'trắng', N'S', 35, 255000, N'AT003'),
(N'trắng', N'M', 35, 255000, N'AT003'),
(N'trắng', N'L', 35, 255000, N'AT003'),
(N'trắng', N'XL', 35, 255000, N'AT003')

INSERT INTO SanPham VALUES
(N'QT004', N'Quần Tây Tối Giản HG17', N'Poly', N'Tối giản', 1, N'cái', N'Chất liệu: Vải Quần Tây\nThành phần: 82% polyester 14% rayon 4% spandex\n- Mềm mại\n- Thoáng khí\n- Thân thiện với mối trường\n- Hút ẩm tốt',
N'Yame', N'Việt Nam', N'Y Original', N'0287307144', N'cskh@yame.vn', N'Việt Nam', '', N'AT', N'NV001')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('đen', N'XS', 35, 325000, N'QT004'),
('đen', N'S', 35, 325000, N'QT004'),
('đen', N'M', 35, 325000, N'QT004'),
('đen', N'L', 35, 325000, N'QT004'),
('đen', N'XL', 35, 325000, N'QT004'),
(N'xám', N'XS', 20, 325000, N'QT004'),
(N'xám', N'S', 17, 325000, N'QT004'),
(N'xám', N'M', 9, 325000, N'QT004'),
(N'xám', N'L', 5, 325000, N'QT004'),
(N'xám', N'XL', 4, 325000, N'QT004')

INSERT INTO SanPham VALUES
(N'QJ005', N'Quần Jean SkiNy Tối Giản A05', N'Jean Cotton', N'SkiNy', 1, N'cái', N'Chất liệu: Jean Cotton\nThành phần: 98% cotton 2% spandex\n- Độ bền cao\n- Mặc mát, rất thoải mái.',
N'Yame', N'Việt Nam', N'Y Original', N'0287307144', N'cskh@yame.vn', N'Việt Nam', '', N'AT', N'NV001')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('đen', N'XS', 36, 425000, N'QJ005'),
('đen', N'S', 34, 425000, N'QJ005'),
('đen', N'M', 35, 425000, N'QJ005'),
('đen', N'L', 35, 425000, N'QJ005'),
('đen', N'XL', 35, 425000, N'QJ005')

INSERT INTO SanPham VALUES
(N'AK006', 'Áo Khoác Lá Cổ Đơn Giản 12VAHDT Vạn Xuân Kiến Quốc Ver3', N'Poly', N'Lá cổ đơn giản', 1, N'cái', N'Chất liệu: Vài Dù\nThành phần: 100% poly\n- Trượt nước\n+ Logo Vạn Xuân Kiến Quốc ép cực quang\n- Viền phản quang dây kéo\n- Túi trong có dây kéo tiện dụng\n- Khóa kéo cao qua cổ thích hợp đi trời nắng\n- Nhiều túi tiện lợi\n- Reverse Coil Zipper\n(Những chiếc khoá túi này có bề mặt ngoài dẹp, phẳng trong khi răng khoá thì ở trong)',
N'Yame', N'Việt Nam', N'Y Original', N'0287307144', N'cskh@yame.vn', N'Việt Nam', '', N'AT', N'NV001')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('đen', N'S', 35, 455000, N'AK006'),
('đen', N'M', 34, 455000, N'AK006'),
('đen', N'L', 32, 455000, N'AK006'),
('đen', N'XL', 34, 455000, N'AK006')

INSERT INTO SanPham VALUES
(N'AK007', 'Áo Khoác Classic Tối Giản Ver6', N'Poly', 'Đơn giản', 1, N'cái', N'Chất liệu: Vải Dù\nThành phần: 100% poly\n- Chống tia UV\n- Cản gió\n- Nhanh khô\n- Bền màu tốt\n-Trượt nước\n+ Túi trong tiện dụng\n+ Reverse Coil Zipper\n(Những chiếc khoá túi này có bề mặt ngoài dẹp, phẳng trong khi răng khoá thì ở trong)\n- Tặng kèm túi đựng áo khoác',
N'Yame', N'Việt Nam', N'Y Original', N'0287307144', N'cskh@yame.vn', N'Việt Nam', '', N'AT', N'NV001')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
(N'xanh đen', N'S', 31, 385000, N'AK007'),
(N'xanh đen', N'M', 33, 385000, N'AK007'),
(N'xanh đen', N'L', 32, 385000, N'AK007'),
(N'xanh đen', N'XL', 32, 385000, N'AK007')

INSERT INTO SanPham VALUES
(N'D007', 'Đầm sát nách bèo tùng', N'Cotton chéo', N'Sát nách bèo tùng', 0, N'cái', '',
N'Yame', N'Việt Nam', N'Y Original', N'0287307144', N'cskh@yame.vn', N'Việt Nam', '', N'AT', N'NV001')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('đen', N'XS', 21, 264000, N'D007'),
('đen', N'S', 14, 264000, N'D007'),
('đen', N'M', 26, 264000, N'D007'),
('đen', N'L', 23, 264000, N'D007'),
('đen', N'XL', 0, 264000, N'D007'),
(N'hồng', N'XS', 0, 264000, N'D007'),
(N'hồng', N'S', 0, 264000, N'D007'),
(N'hồng', N'M', 0, 264000, N'D007'),
(N'hồng', N'L', 0, 264000, N'D007'),
(N'hồng', N'XL', 0, 264000, N'D007')

INSERT INTO SanPham VALUES
(N'QV008', N'Quần váy xếp ly', N'Xốp tổ ong', N'Xếp ly', 0, N'cái', N'Quần Short/Quần Short Jeans nữ cao cấp, chất vải ccao cấp.\nSợi vải Jean USA có chứng nhận của Mỹ với độ bền cao, mềm mại và thân thiện cho da\nSản phẩm basic, chất liệu bền bỉ, thoải mái cho đôi chân của bạn\nChất liệu vải jean dày đẹp, có độ cứng cáp, giúp tôn dáng người mặc\nThiết kế theo phong cách mới mới, kiểu dáng trẻ trung, khéo léo tôn dáng',
N'Yame', N'Việt Nam', N'Y Original', N'0287307144', N'cskh@yame.vn', N'Việt Nam', '', N'AT', N'NV001')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('đen', N'XS', 86, 336000, N'QV008'),
('đen', N'S', 86, 336000, N'QV008'),
('đen', N'M', 86, 336000, N'QV008'),
('đen', N'L', 86, 336000, N'QV008'),
('đen', N'XL', 86, 336000, N'QV008'),
(N'da', N'XS', 86, 336000, N'QV008'),
(N'da', N'S', 86, 336000, N'QV008'),
(N'da', N'M', 86, 336000, N'QV008'),
(N'da', N'L', 86, 336000, N'QV008'),
(N'da', N'XL', 86, 336000, N'QV008')

INSERT INTO SanPham VALUES
(N'AT009', 'Áo thun cổ tròn', N'Cotton', N'cổ tròn', 0, N'cái', N'Chất liệu: 100% Cotton thiên nhiên - 85% Polyster\nMềm mại, dễ chịu và tôn dáng khi mặc\nChất liệu co giãn 4 chiều, đem lại sự thoải mái suốt ngày dài\nBền đẹp, không nhão, không xù lông khi sử dụng\nSản xuất tại xưởng 10 năm kinh nghiệm tại TP Hồ Chí Minh',
N'Yame', N'Việt Nam', N'Y Original', N'0287307144', N'cskh@yame.vn', N'Việt Nam', '', N'AT', N'NV001')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
(N'trắng', N'S', 86, 123000, N'AT009'),
(N'trắng', N'M', 86, 123000, N'AT009'),
(N'trắng', N'L', 86, 123000, N'AT009'),
(N'vàng', N'S', 86, 123000, N'AT009'),
(N'vàng', N'M', 86, 123000, N'AT009'),
(N'vàng', N'L', 86, 123000, N'AT009'),
(N'hồng', N'S', 86, 123000, N'AT009'),
(N'hồng', N'M', 86, 123000, N'AT009'),
(N'hồng', N'L', 86, 123000, N'AT009'),
(N'nâu', N'S', 86, 123000, N'AT009'),
(N'nâu', N'M', 86, 123000, N'AT009'),
(N'nâu', N'L', 86, 123000, N'AT009')

INSERT INTO SanPham VALUES
(N'QS010', N'Quần Short Đơn Giản Y Nguyên Bản Ver38', N'Cotton 2 da', 'đơn giản', 1, N'cái', N'Chất liệu: COTTON DOUBLE FACE\n- Vải sợi Cotton được dệt theo "DOUBLE-FACE" có cấu trúc 2 bề mặt giống nhau, có thể sử dụng được cả 2 mặt vải .\nThành phần: 87% Cotton 13% Polyester\n- Co giãn\n- Độ bền cao\n- Thoáng Khí\n- Nhanh khô\n+ Họa tiết in dẻo\n+ Hai túi bên hông Reverse Coil Zipper (Những chiếc khoá túi này có bề mặt ngoài dẹp, phẳng trong khi răng khoá thì ở trong)',
N'Yame', N'Việt Nam', N'Y Original', N'0287307144', N'cskh@yame.vn', N'Việt Nam', '', N'AT', N'NV001')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('đen', N'S', 35, 287000, N'QS010'),
('đen', N'M', 34, 287000, N'QS010'),
('đen', N'L', 34, 287000, N'QS010'),
('đen', N'XL', 35, 287000, N'QS010'),

INSERT INTO SanPham VALUES
(N'QJ011', N'Quần Jean Slimfit Đơn Giản Thần Cổ Đại Valknut Ver1', N'Cotton Plus', 'đơn giản', 1, N'cái', N'Cổ Đại Valknut Ver1\nChất liệu: Jean Cotton\nThành phần: 98% cotton 2% spandex\n- Co giãn tốt\n- Độ bền cao\n- Thoáng mát\n+ Họa tiết thêu\n+ Wash thời trang',
N'Yame', N'Việt Nam', N'Y Original', N'0287307144', N'cskh@yame.vn', N'Việt Nam', '', N'AT', N'NV001')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('đen', N'XS', 35, 425000, N'QJ011'),
('đen', N'S', 35, 425000, N'QJ011'),
('đen', N'M', 35, 425000, N'QJ011'),
('đen', N'L', 35, 425000, N'QJ011'),
('đen', N'XL', 35, 425000, N'QJ011'),

INSERT INTO SanPham VALUES
(N'QJ011', N'Quần Jean Slimfit Đơn Giản Thần Cổ Đại Valknut Ver1', N'Cotton Plus', 'đơn giản', 1, N'cái', N'Cổ Đại Valknut Ver1\nChất liệu: Jean Cotton\nThành phần: 98% cotton 2% spandex\n- Co giãn tốt\n- Độ bền cao\n- Thoáng mát\n+ Họa tiết thêu\n+ Wash thời trang',
N'Yame', N'Việt Nam', N'Y Original', N'0287307144', N'cskh@yame.vn', N'Việt Nam', '', N'AT', N'NV001')

SELECT * FROM ChiTietSanPham
SELECT * FROM SanPham
SELECT * FROM LoaiSanPham

DELETE FROM ChiTietSanPham
DELETE FROM SanPham
DELETE FROM LoaiSanPham