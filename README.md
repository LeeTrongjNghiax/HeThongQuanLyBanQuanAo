# **Chào mừng đến với repository cho bài tập làm Hệ Thống Quản Lý Bán Quần Áo của nhóm 6**

## **Mô tả**

Đây là repository để chứa các file liên quan đến hệ thống quản lý bán quần áo của nhóm 6

## Cách sử dụng

- Các bạn sẽ làm việc cũng như viết code thông qua repository này, tải xuống repo mới để cập nhật, viết code, sau đó đưa các thay đổi cũng như mô tả thay đổi thông qua chức năng _**push**_
- Các file liên quan đến tài liệu, word để trong folder _**documents**_
- Các file liên quan đến ứng dụng như java, sql hay hình ảnh dùng trong hệ thống để trong folder _**program**_

### Cách sử dụng folder _**program**_

- Folder _**program**_ là folder gốc để các bạn có thể chạy chương trình chính trong java
- Trong folder _**program**_ có 2 folder con là _**main**_ và _**demo**_. Folder _**main**_ chứa folder _**src**_ chứa source code chương trình chính, là chương trình các bạn sẽ nộp để giảng viên chấm điểm. Tuy nhiên nếu các bạn muốn thử chức năng mới hay công nghệ mới mà các bạn sợ làm hư code trong _**main**_ thì các bạn có thể tạo chương trình demo mới trong _**demo**_ để các bạn thử nghiệm như sao lưu cơ sở dữ liệu (hoặc đơn giản hơn là tạo nhánh mới rồi test trên nhánh đó :slightly_smiling_face:)
- Trong folder _**main**_ ngoài folder _**src**_ ra còn có:
  - Folder _**lib**_ để các bạn bỏ các thư viện cần thiết vào
  - Folder _**images**_ để các bạn bỏ các hình ảnh cần dùng (các hình ảnh này nên được phân cấp để dễ quản lý)
  - Folder _**querys**_ để các bạn tạo các file truy vấn cần thiết để import dữ liệu mẫu
  
- Để các bạn dễ hình dung thì nhánh cây của chương trình sẽ nhìn gần giống như thế này

  1. program
     1. main
        1. src
           1. GUIs
              1. quanLyKho.java
              2. quanLySanPham.java
              3. ...
           2. Entitys
              1. NhanVien.java
              2. QuanLy.java
              3. ...
           3. connectDB
              1. connectDB.java
           4. DAOs
              1. nhanVienDAO.java
              2. ...
        2. lib
           1. sqljdbc4.jar
           2. ...
        3. images
           1. HangHoa
              1. hang1.png
              2. hang2.png
              3. ...
           2. ...
        4. querys
           1. nhapHangHoa.sql
           2. nhapNhanVien.sql
           3. nhapQuanLy.sql
           4. ...
     2. demo (cấu trúc thư mục gần giống src)
  2. documents
     1. document_1.docx
     2. document_2.docx
