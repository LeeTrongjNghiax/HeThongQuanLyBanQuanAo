insert into LoaiSanpham values ('AT', 'Ao thun')
insert into LoaiSanpham values ('ASM', 'Ao So Mi')
insert into LoaiSanpham values ('QT', 'Quan Tay')
insert into LoaiSanpham values ('QJ', 'Quan Jean')
insert into LoaiSanpham values ('AK', 'Ao Khoac')
insert into LoaiSanpham values ('DSN', 'Đam Sat Nach')
insert into LoaiSanpham values ('DB', 'Đam Baby-doll')
insert into LoaiSanpham values ('DD', 'Đam Dai')
insert into LoaiSanpham values ('QV', 'Quan Vay')
insert into LoaiSanpham values ('QD', 'Quan Dai')
insert into LoaiSanpham values ('QS', 'Quan Short')
insert into LoaiSanpham values ('JS', 'Jumpsuit')
insert into LoaiSanpham values ('VQ', 'Vay quan')
insert into LoaiSanpham values ('CV', 'Chan vay')

select * from LoaiSanpham

select * from SanPham

INSERT INTO SanPham VALUES
('AT001', 'Áo Thun Cổ Tròn Y Nguyên Bản 18+ Ver87', 'Cotton', 'Cổ tròn Y', 1, 'cái', 'Than thien Tham hut thoat am Mem mai Kiem soat mui Dieu hoa nhiet Hoa tiet in deo phoi le mi tay Nen giat chung voi san pham cung mau Khong dung thuoc tay hoac xa phong co tinh tay manh Nen phoi trong bong ram de giu sp ben mau',
'Yame', 'Việt Nam', 'Y Original', '0287307144', 'cskh@yame.vn', 'Việt Nam', '', 'AT', 'NV0001')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('trắng', 'S', 20, 181000, 'AT001'),
('trắng', 'M', 20, 181000, 'AT001'),
('trắng', 'L', 20, 181000, 'AT001'),
('trắng', 'XL', 20, 181000, 'AT001')

INSERT INTO SanPham VALUES
('ASM002',N 'Áo Sơ Mi Tay Dài Sợi Modal Tối Giản M11', 'Kate', 'Tay dài', 1, 'cái', 'Thành phần: 12% modal và 88% superfine\n- Ít nhăn và dễ ủi\n- Nhanh khô và thoáng mát\nHDSD:\n- Áo sơ mi màu phơi trong bóng râm để tránh bạc màu phần vai áo\n- Áo sơ mi trắng có thể phơi ngoài nắng để áo trắng sáng hơn ( không phơi quá lâu )',
'Yame', 'Việt Nam', 'Y Original', '0287307144', 'cskh@yame.vn', 'Việt Nam', '', 'ASM','NV0001')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('trắng', 'S', 12, 255000, 'ASM002'),
('trắng', 'M', 12, 255000, 'ASM002'),
('trắng', 'L', 12, 255000, 'ASM002'),
('trắng', 'XL', 12, 255000, 'ASM002'),
('tím', 'S', 12, 255000, 'ASM002'),
('tím', 'M', 12, 255000, 'ASM002'),
('tím', 'L', 12, 255000, 'ASM002'),
('tím', 'XL', 12, 255000, 'ASM002'),
('đen', 'S', 12, 255000, 'ASM002'),
('đen', 'M', 12, 255000, 'ASM002'),
('đen', 'L', 12, 255000, 'ASM002'),
('đen', 'XL', 12, 255000, 'ASM002'),
('xanh đen', 'S', 12, 255000, 'ASM002'),
('xanh đen', 'M', 12, 255000, 'ASM002'),
('xanh đen', 'L', 12, 255000, 'ASM002'),
('xanh đen', 'XL', 12, 255000, 'ASM002'),
('đỏ', 'S', 12, 255000, 'ASM002'),
('đỏ', 'M', 12, 255000, 'ASM002'),
('đỏ', 'L', 12, 255000, 'ASM002'),
('đỏ', 'XL', 12, 255000, 'ASM002'),
('xanh biển', 'S', 12, 255000, 'ASM002'),
('xanh biển', 'M', 12, 255000, 'ASM002'),
('xanh biển', 'L', 12, 255000, 'ASM002'),
('xanh biển', 'XL', 12, 255000, 'ASM002')

INSERT INTO SanPham VALUES
('AT003', 'Áo Thun Cổ Trụ Đơn Giản Ngân Hà Space Ver17', 'Cotton Compact', 'Cổ trụ', 1, 'cái', 'Chất liệu: Cotton Compact\nThành phần: 100% Cotton\n- Thân thiện\n- Thấm hút thoát ẩm\n- Mềm mại\n- Kiểm soát mùi\n- Điều hòa nhiệt\n+ Họa tiết In dẻo + in nước\n- HDSD:\n+ Nên giặt chung với sản phẩm cùng màu\n+ Không dùng thuốc tẩy hoặc xà phòng có tính tẩy mạnh\n+ Nên phơi trong bóng râm để giữ sp bền màu',
'Yame', 'Việt Nam', 'Y Original', '0287307141', 'cskh@yame.vn', 'Việt Nam','','AT','NV0001')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('trắng', 'S', 12, 255000, 'AT003'),
('trắng', 'M', 12, 255000, 'AT003'),
('trắng', 'L', 12, 255000, 'AT003'),
('trắng', 'XL', 12, 255000, 'AT003')

INSERT INTO SanPham VALUES
('QT004', 'Quần Tây Tối Giản HG17', 'Poly', 'Tối giản', 1, 'cái', 'Chất liệu: Vải Quần Tây\nThành phần: 82% polyester 14% rayon 4% spandex\n- Mềm mại\n- Thoáng khí\n- Thân thiện với mối trường\n- Hút ẩm tốt',
'Yame', 'Việt Nam', 'Y Original', '0287301441', 'cskh@yame.vn', 'Việt Nam', '', 'QT', 'NV0001')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('đen', 'XS', 12, 325000, 'QT004'),
('đen', 'S', 12, 325000, 'QT004'),
('đen', 'M', 12, 325000, 'QT004'),
('đen', 'L', 12, 325000, 'QT004'),
('đen', 'XL', 12, 325000, 'QT004'),
('xám', 'XS', 12, 325000, 'QT004'),
('xám', 'S', 12, 325000, 'QT004'),
('xám', 'M', 9, 325000, 'QT004'),
('xám', 'L', 5, 325000, 'QT004'),
('xám', 'XL', 4, 325000, 'QT004')

INSERT INTO SanPham VALUES
('QJ005', 'Quần Jean Skinny Tối Giản A05', 'Jean Cotton', 'Skinny', 1, 'cái', 'Chất liệu: Jean Cotton\nThành phần: 98% cotton 2% spandex\n- Độ bền cao\n- Mặc mát, rất thoải mái.',
'Yame', 'Việt Nam', 'Y Original', '0273071441', 'cskh@yame.vn', 'Việt Nam', '', 'QJ', 'NV0001')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('đen', 'XS', 20, 425000, 'QJ005'),
('đen', 'S', 20, 425000, 'QJ005'),
('đen', 'M', 20, 425000, 'QJ005'),
('đen', 'L', 20, 425000, 'QJ005'),
('đen', 'XL', 20, 425000, 'QJ005')

INSERT INTO SanPham VALUES
('AK006', 'Áo Khoác Lá Cổ Đơn Giản 12VAHDT Vạn Xuân Kiến Quốc Ver3', 'Poly', 'Lá cổ đơn giản', 1, 'cái', 'Chất liệu: Vài Dù\nThành phần: 100% poly\n- Trượt nước\n+ Logo Vạn Xuân Kiến Quốc ép cực quang\n- Viền phản quang dây kéo\n- Túi trong có dây kéo tiện dụng\n- Khóa kéo cao qua cổ thích hợp đi trời nắng\n- Nhiều túi tiện lợi\n- Reverse Coil Zipper\n(Những chiếc khoá túi này có bề mặt ngoài dẹp, phẳng trong khi răng khoá thì ở trong)',
'Yame', 'Việt Nam', 'Y Original', '0873071441', 'cskh@yame.vn', 'Việt Nam', '', 'AK', 'NV0002')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('đen', 'S', 20, 455000, 'AK006'),
('đen', 'M', 20, 455000, 'AK006'),
('đen', 'L', 20, 455000, 'AK006'),
('đen', 'XL', 20, 455000, 'AK006')

INSERT INTO SanPham VALUES
('AK007', 'Áo Khoác Classic Tối Giản Ver6', 'Poly', 'Đơn giản', 1, 'cái', 'Chất liệu: Vải Dù\nThành phần: 100% poly\n- Chống tia UV\n- Cản gió\n- Nhanh khô\n- Bền màu tốt\n-Trượt nước\n+ Túi trong tiện dụng\n+ Reverse Coil Zipper\n(Những chiếc khoá túi này có bề mặt ngoài dẹp, phẳng trong khi răng khoá thì ở trong)\n- Tặng kèm túi đựng áo khoác',
'Yame', 'Việt Nam', 'Y Original', '0287307141', 'cskh@yame.vn', 'Việt Nam', '', 'AK', 'NV0002')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('xanh đen', 'S', 20, 385000, 'AK007'),
('xanh đen', 'M', 20, 385000, 'AK007'),
('xanh đen', 'L', 20, 385000, 'AK007'),
('xanh đen', 'XL', 20, 385000, 'AK007')



INSERT INTO SanPham VALUES
('QS009', 'Quần Short Đơn Giản Y Nguyên Bản Ver38', 'Cotton 2 da', 'Đơn Giản', 1, 'cái', 'Chất liệu: COTTON DOUBLE FACE\n- Vải sợi Cotton được dệt theo "DOUBLE-FACE" có cấu trúc 2 bề mặt giống nhau, có thể sử dụng được cả 2 mặt vải .\nThành phần: 87% Cotton 13% Polyester\n- Co giãn\n- Độ bền cao\n- Thoáng Khí\n- Nhanh khô\n+ Họa tiết in dẻo\n+ Hai túi bên hông Reverse Coil Zipper (Những chiếc khoá túi này có bề mặt ngoài dẹp, phẳng trong khi răng khoá thì ở trong)',
'Yame', 'Việt Nam', 'Y Original', '0283071441', 'cskh@yame.vn', 'Việt Nam', '', 'QS', 'NV0002')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('đen', 'S', 20, 287000, 'QS009'),
('đen', 'M', 20, 287000, 'QS009'),
('đen', 'L', 20, 287000, 'QS009'),
('đen', 'XL', 20, 287000, 'QS009')

INSERT INTO SanPham VALUES
('AT010', 'Áo thun cổ tròn', 'Cotton', 'cổ tròn', 1, 'cái', 'Chất liệu: 100% Cotton thiên nhiên - 85% Polyster\nMềm mại, dễ chịu và tôn dáng khi mặc\nChất liệu co giãn 4 chiều, đem lại sự thoải mái suốt ngày dài\nBền đẹp, không nhão, không xù lông khi sử dụng\nSản xuất tại xưởng 10 năm kinh nghiệm tại TP Hồ Chí Minh',
'Yame', 'Việt Nam', 'Y Original', '0280978900', 'cskh@yame.vn', 'Việt Nam', '', 'AT', 'NV0002')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('trắng', 'S', 12, 123000, 'AT010'),
('trắng', 'M', 12, 123000, 'AT010'),
('trắng', 'L', 12, 123000, 'AT010'),
('vàng', 'S', 12, 123000, 'AT010'),
('vàng', 'M', 12, 123000, 'AT010'),
('vàng', 'L', 12, 123000, 'AT010'),
('hồng', 'S', 12, 123000, 'AT010'),
('hồng', 'M', 12, 123000, 'AT010'),
('hồng', 'L', 11, 123000, 'AT010'),
('nâu', 'S', 12, 123000, 'AT010'),
('nâu', 'M', 12, 123000, 'AT010'),
('nâu', 'L', 12, 123000, 'AT010')

INSERT INTO SanPham VALUES
('QS011', 'Quần Short Thần Cổ Đại Aides Ver1', 'Cotton', 'short', 1, 'cái', 'Chất liệu: Jean Cotton\nThành phần: 100% cotton\n- Độ bền cao\n- Thoáng mát\n- Thoải mái\n+ Họa tiết khắc lazer\n+ logo TPR\n+ Wash thời trang',
'Yame', 'Việt Nam', 'Y Original', '0280978900', 'cskh@yame.vn', 'Việt Nam', '', 'QS', 'NV0003')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('xanh trang', 'S', 12, 199500, 'AT010'),
('xanh trang', 'M', 12, 199500, 'AT010'),
('xanh trang', 'L', 12, 199500, 'AT010'),
('xanh trang', 'XL', 12, 199500, 'AT010')

INSERT INTO SanPham VALUES
('AT012', 'Áo Thun Cổ Tròn Thiên Nhiên Kì Vĩ Beetle Ver1', 'Cotton', 'Cổ Tròn', 1, 'cái', 'Chất liệu: Cotton 2 chiều\nThành phần: 100% Cotton\n- Co dãn 2 chiều\n- Thấm hút mồ hôi tốt mang lại cảm giác thoáng mát\n+ Hoa tiết in nước',
'Yame', 'Việt Nam', 'Y Original', '0280978900', 'cskh@yame.vn', 'Việt Nam', '', 'AT', 'NV0003')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('trang', 'S', 1, 250000, 'AT010'), 
('trang', 'M', 1, 250000, 'AT010'), 
('trang', 'L', 2, 250000, 'AT010'), 
('trang', 'XL', 2, 250000, 'AT010')

INSERT INTO SanPham VALUES
('AT013', 'Áo Thun Cổ Trụ Ngân Hà Space Ver18', 'Cotton Compact 2S', 'cổ Trụ', 1, 'cái', 'Chất liệu: Cotton Compact\nThành phần: 100% Cotton\n- Thân thiện\n- Thấm hút thoát ẩm\n- Mềm mại\n- Kiểm soát mùi\n- Điều hòa nhiệt\n+ Họa tiết in bột nổi\n- HDSD:\n+ Nên giặt chung với sản phẩm cùng màu\n+ Không dùng thuốc tẩy hoặc xà phòng có tính tẩy mạnh\n+ Nên phơi trong bóng râm để giữ sp bền màu',
'Yame', 'Việt Nam', 'Y Original', '0280978900', 'cskh@yame.vn', 'Việt Nam', '', 'AT', 'NV0003')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('den', 'S', 12, 280000, 'AT012'), 
('den', 'M', 12, 280000, 'AT012'), 
('den', 'L', 12, 280000, 'AT012'), 
('den', 'XL', 15, 285000, 'AT012')

INSERT INTO SanPham VALUES
('QD014', 'Quần Dài Vải Đơn Giản Y Nguyên Bản Ver17', 'Cotton 2 Da', 'Dài', 1, 'cái', 'Chất liệu: COTTON DOUBLE FACE\n- Vải sợi Cotton được dệt theo "DOUBLE-FACE" có cấu trúc 2 bề mặt giống nhau, có thể sử dụng được cả 2 mặt vải .\nThành phần: 85% Cotton 15% Polyester\n- Co giãn\n- Độ bền cao\n- Thoáng Khí\n- Nhanh khô\n+ Họa tiết thêu thường\n+ Kẹp logo Y_ORIGINAL túi sau',
'Yame', 'Việt Nam', 'Y Original', '0280978900', 'cskh@yame.vn', 'Việt Nam', '', 'QD', 'NV0003')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('nau kem', 'S', 12, 397000, 'QD014'), 
('nau kem', 'M', 12, 397000, 'QD014'), 
('nau kem', 'L', 12, 397000, 'QD014')

INSERT INTO SanPham VALUES
('ASM015', 'Áo Sơ Mi Tay Dài Đơn Giản Y Nguyên Bản Ver32', 'Cotton 2 Da', 'Dài', 1, 'cái', 'Nguyên Bản Ver32\nChất liệu: Vải Caro\nThành phần : 70% Polyester 30% Rayon\n+ Phối logo kim loại',
'Yame', 'Việt Nam', 'Y Original', '0280978900', 'cskh@yame.vn', 'Việt Nam', '', 'ASM', 'NV0003')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('lam vang', 'S', 12, 457000, 'ASM015'), 
('lam vang', 'M', 12, 457000, 'ASM015'), 
('lam vang', 'L', 12, 457000, 'ASM015'), 
('lam vang', 'XL', 12, 457000, 'ASM015')

INSERT INTO SanPham VALUES
('ASM016', 'ÁO SƠ MI NỮ - TOTODAY - UPTOYOU', 'Cotton', '', 0, 'cái', '',
'Yame', 'Việt Nam', 'Y Original', '0280978900', 'cskh@yame.vn', 'Việt Nam', '', 'ASM', 'NV0004')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('xam den', 'M', 8, 275000, 'ASM016'), 
('xam den', 'L', 8, 275000, 'ASM016'), 
('do hong', 'M', 8, 275000, 'ASM016'), 
('do hong', 'L', 8, 275000, 'ASM016'), 
('vang xam', 'M', 8, 275000, 'ASM016'), 
('vang xam', 'L', 8, 275000, 'ASM016')

INSERT INTO SanPham VALUES
('QV017', 'Quần váy xếp ly', 'Xốp tổ ong', 'Xếp ly', 0, 'cái', 'Quần Short/Quần Short Jeans nữ cao cấp, chất vải ccao cấp.\nSợi vải Jean USA có chứng nhận của Mỹ với độ bền cao, mềm mại và thân thiện cho da\nSản phẩm basic, chất liệu bền bỉ, thoải mái cho đôi chân của bạn\nChất liệu vải jean dày đẹp, có độ cứng cáp, giúp tôn dáng người mặc\nThiết kế theo phong cách mới mới, kiểu dáng trẻ trung, khéo léo tôn dáng',
'Yame', 'Việt Nam', 'Y Original', '0273072441', 'cskh@yame.vn', 'Việt Nam', '', 'QV', 'NV0004')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('đen', 'XS', 12, 336000, 'QV017'),
('đen', 'S', 12, 336000, 'QV017'),
('đen', 'M', 12, 336000, 'QV017'),
('đen', 'L', 12, 336000, 'QV017'),
('đen', 'XL', 12, 336000, 'QV017'),
('da', 'XS', 12, 336000, 'QV017'),
('da', 'S', 12, 336000, 'QV017'),
('da', 'M', 12, 336000, 'QV017'),
('da', 'L', 12, 336000, 'QV017'),
('da', 'XL', 12, 336000, 'QV017')

INSERT INTO SanPham VALUES
('DSN018', 'Đầm sát nách bèo tùng', 'Cotton chéo', 'Sát nách bèo tùng', 0, 'cái', '',
'Yame', 'Việt Nam', 'Y Original', '0283071441', 'cskh@yame.vn', 'Việt Nam', '', 'DSN', 'NV0004')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('đen', 'XS', 20, 264000, 'DSN018'),
('đen', 'S', 20, 264000, 'DSN018'),
('đen', 'M', 20, 264000, 'DSN018'),
('đen', 'L', 20, 264000, 'DSN018'),
('đen', 'XL', 0, 264000, 'DSN018'),
('hồng', 'XS', 0, 264000, 'DSN018'),
('hồng', 'S', 0, 264000, 'DSN018'),
('hồng', 'M', 0, 264000, 'DSN018'),
('hồng', 'L', 0, 264000, 'DSN018'),
('hồng', 'XL', 0, 264000, 'DSN018')

INSERT INTO SanPham VALUES
('QJ019', 'QUẦN JEANS FORM STRAIGHT', 'Denim', 'form straight', 0, 'cái', 'Đặc tính: Trẻ trung - Năng động.\nThể loại: Trang phục dạo phố.\nSize: S/M/L.\nChất liệu: Denim.\nMàu sắc: Xanh nhạt / Xanh đậm.\nLưu ý: Ngâm với nước lạnh qua đêm trước khi sử dụng lần đầu. Không tẩy. Không giặt chung với những sản phẩm dễ xước khác.\nSố đo mẫu nữ: Chiều cao: 168 cm. Số đo 3 vòng: 83 - 59 - 86 (Mặc size S).',
'Yame', 'Việt Nam', 'Y Original', '0283071441', 'cskh@yame.vn', 'Việt Nam', '', 'QJ', 'NV0004')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('xanh nhat', 'S', 20, 588000, 'QJ019'),
('xanh nhat', 'M', 20, 588000, 'QJ019'),
('xanh nhat', 'L', 20, 588000, 'QJ019'),
('xanh dam', 'S', 14, 588000, 'QJ019'),
('xanh dam', 'M', 14, 588000, 'QJ019'),
('xanh dam', 'L', 14, 588000, 'QJ019')

INSERT INTO SanPham VALUES
('CV020', 'CHÂN VÁY REN FORM BÚT CHÌ', 'Ren cotton thêu sợi len', 'form but chi', 0, 'cái', 'Đặc tính: Nữ tính - Thanh lịch.\nThể loại: Trang phục tiệc, công sở.\nSize: S/M/L.\nMàu: Trắng / Đen.\nChất liệu: Ren cotton thêu sợi len.\nLưu ý: Không tẩy, ngâm, vắt. Giặt tay. Không giặt chung với những sản phẩm dễ gây xước len.\nSố đo mẫu nữ: Chiều cao: 168 cm. Số đo 3 vòng: 83 - 59 - 86 (Mặc size S).',
'Yame', 'Việt Nam', 'Y Original', '0283071441', 'cskh@yame.vn', 'Việt Nam', '', 'CV', 'NV0004')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('trang', 'S', 24, 440000, 'CV020'),
('trang', 'M', 24, 440000, 'CV020'),
('trang', 'L', 24, 440000, 'CV020'),
('den', 'S', 12, 440000, 'CV020'),
('den', 'M', 12, 440000, 'CV020'),
('den', 'L', 12, 440000, 'CV020')

INSERT INTO SanPham VALUES
('VQ021', 'VÁY QUẦN KIỂU ĐẮP PHỐI VIỀN', 'Vải sợi poly tổng hợp', 'dap phoi vien', 0, 'cái', 'Đặc tính: Thanh lịch - Hiện đại - Năng động.\nThể loại: Trang phục dạo phố.\nSize: S/M/L.\nChất liệu: Vải sợi poly tổng hợp.\nMàu sắc: Kem / Mint / Đen.\nLưu ý: Không tẩy, ngâm. Giặt nhẹ. Ủi nhiệt độ thấp. Không giặt chung với những sản phẩm dễ gây xước khác.\nSố đo mẫu nữ: Chiều cao: 168 cm. Số đo 3 vòng: 83 - 59 - 86 (Mặc size S).',
'HNOSS', 'Việt Nam', 'HNOSS', '0305880944', 'hnoss@yame.vn', 'Việt Nam', '', 'VQ', 'NV0004')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('kem', 'S', 24, 440000, 'VQ021'),
('kem', 'M', 24, 440000, 'VQ021'),
('kem', 'L', 24, 440000, 'VQ021'),
('mint', 'S', 10, 440000, 'VQ021'),
('mint', 'M', 10, 440000, 'VQ021'),
('mint', 'L', 10, 440000, 'VQ021'),
('den', 'S', 12, 440000, 'VQ021'),
('den', 'M', 12, 440000, 'VQ021'),
('den', 'L', 12, 440000, 'VQ021')

INSERT INTO SanPham VALUES
('JS022', 'JUMPSUIT TAY LIỀN', 'Vải bố sợi linen', 'tay lien', 0, 'cái', 'Miêu tả: JUMPSUIT TAY LIỀN.\nĐặc tính: Hiện đại - Trẻ trung - Năng động - Phóng khoáng.\nThể loại: Trang phục dạo phố.\nSize: S/M/L.\nChất liệu: Vải bố sợi linen.\nMàu sắc: Hồng/Đen/Vàng/Kem.\nLưu ý: Ủi nhiệt độ thấp.\nSố đo mẫu nữ: Chiều cao: 168 cm. Số đo 3 vòng: 83 - 59 - 86 (Mặc size S). Lưu ý: Sản phẩm form nhỏ, thông số Eo: S (60-62), M (63-66), L (67-70).',
'HNOSS', 'Việt Nam', 'HNOSS', '0305880944', 'hnoss@yame.vn', 'Việt Nam', '', 'JS', 'NV0004')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('hong', 'S', 23, 489000, 'JS022'),
('hong', 'M', 25, 489000, 'JS022'),
('hong', 'L', 16, 489000, 'JS022'),
('den', 'S', 15, 489000, 'JS022'),
('den', 'M', 14, 489000, 'JS022'),
('den', 'L', 19, 489000, 'JS022'),
('vang', 'S', 20, 489000, 'JS022'),
('vang', 'M', 22, 489000, 'JS022'),
('vang', 'L', 26, 489000, 'JS022'),
('kem', 'S', 11, 489000, 'JS022'),
('kem', 'M', 12, 489000, 'JS022'),
('kem', 'L', 23, 489000, 'JS022')

INSERT INTO SanPham VALUES
('DD023', 'ĐẦM DÀI RÃ NGỰC CHỮ V NGƯỢC', 'Spandex', 'ra nguc chu V nguoc', 0, 'cái', 'Miêu tả: Đầm dài rã ngực chữ V ngược.\nĐặc tính: Trẻ trung - Nữ tính.\nThể loại: Trang phục dạo phố.\nSize: S/M/L.\nChất liệu: Spandex.\nMàu sắc: Đen / Kem.\nLưu ý: Không tẩy, vắt. Không ngâm. Ủi với chế độ thấp hoặc ủi hơi nước. Không giặt chung với những sản phẩm dễ gây xước lụa.\nSố đo mẫu nữ: Chiều cao: 168 cm. Số đo 3 vòng: 83 - 59 - 86 (Mặc size S).',
'HNOSS', 'Việt Nam', 'HNOSS', '0305880944', 'hnoss@yame.vn', 'Việt Nam', '', 'DD', 'NV0004')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('den', 'S', 23, 539000, 'DD023'),
('den', 'M', 23, 539000, 'DD023'),
('den', 'L', 23, 539000, 'DD023'),
('kem', 'S', 23, 539000, 'DD023'),
('kem', 'M', 23, 539000, 'DD023'),
('kem', 'L', 23, 539000, 'DD023')

INSERT INTO SanPham VALUES
('DB024', 'ĐẦM BABY-DOLL TAY PHỒNG', 'Vải sợi poly mềm', 'tay phong', 0, 'cái', 'Miêu tả: ĐẦM BABY-DOLL TAY PHỒNG.\nĐặc tính: Nữ tính - Trẻ trung.\nThể loại: Trang phục dạo phố.\nSize: S/M/L\nChất liệu: Vải sợi poly mềm.\nMàu sắc: Hồng / Đen.\nLưu ý: Không tẩy, ngâm. Giặt nhẹ. Ủi nhiệt độ thấp. Không giặt chung với những sản phẩm dễ gây xước khác.\nSố đo mẫu nữ: Chiều cao: 168 cm. Số đo 3 vòng: 83 - 59 - 86 (Mặc size S).',
'HNOSS', 'Việt Nam', 'HNOSS', '0305880944', 'hnoss@yame.vn', 'Việt Nam', '', 'DB', 'NV0004')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('den', 'S', 23, 539000, 'DB024'),
('den', 'M', 23, 539000, 'DB024'),
('den', 'L', 23, 539000, 'DB024'),
('hong', 'S', 23, 539000, 'DB024'),
('hong', 'M', 23, 539000, 'DB024'),
('hong', 'L', 23, 539000, 'DB024')

INSERT INTO SanPham VALUES
('QS025', 'QUẦN SHORT TÚI KIỂU LAI BẦU', 'Vải bố sợi linen', 'tui kieu lai bau', 0, 'cái', 'Miêu tả: QUẦN SHORT TÚI KIỂU LAI BẦU.\nĐặc tính: Nữ tính - Trẻ trung - Năng động.\nThể loại: Trang phục dạo phố.\nSize: S/M/L.\nChất liệu: Vải bố sợi linen.\nMàu sắc: Hồng / Nâu.\nLưu ý: Không tẩy, ngâm. Không giặt chung với những sản phẩm dễ gây xước linen.\nSố đo mẫu nữ: Chiều cao: 168 cm. Số đo 3 vòng: 83 - 59 - 86 (Mặc size S).',
'HNOSS', 'Việt Nam', 'HNOSS', '0305880944', 'hnoss@yame.vn', 'Việt Nam', '', 'QS', 'NV0004')

INSERT INTO ChiTietSanPham(mauSac, kichCo, soLuong, giaNhap, maSanPham) VALUES
('den', 'S', 23, 391000, 'QS025')

SELECT * FROM ChiTietSanPham
SELECT * FROM SanPham
SELECT * FROM LoaiSanPham
DELETE FROM ChiTietSanPham
DELETE FROM SanPham
DELETE FROM LoaiSanPham
