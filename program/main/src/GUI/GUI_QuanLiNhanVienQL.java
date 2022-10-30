package GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import DAO.NhanVien_DAO;
import entity.NhanVien;

//import connect.connectDB;
import DAO.NhanVien_DAO;
//import entity.NhanVien;

public class GUI_QuanLiNhanVienQL extends JPanel implements ActionListener,MouseListener {

	private JTable tableNhanVien;
	private DefaultTableModel modelNhanVien;
	private JLabel lblTieuDe,lblMaNV,lblTenNV,
				lblSdt,lblGioiTinh,lblNgaySinh,lblEmail,lblNgayVaoLam,
				lblCMND,lblChucVu,lblDiaChi,lblThanhPho,lblQuan,lblPhuong;
	private JTextField txtTenNV,txtEmail,txtCMND,
	txtDiaChi,txtTim,txtMaNV,txtSdt;

	private JButton btnXoa,btnSua,btnThem,btnTim,btnLamMoi;

	private DefaultTableModel model;
	private JComboBox<String> cbChucVu;
	private JComboBox<String> cbPhuong;
	private JComboBox<String> cbQuan;
	private JComboBox<String> cbGioiTinh;
	private JComboBox<String> cbThanhPho;
	private NhanVien_DAO nv_DAO;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int with = screenSize.width;
	int height = screenSize.height;
	private JDateChooser ngaySinh;
	private JDateChooser ngayVaoLam;

	//private Date dateNgaySinh;
	//private Date dateNgayVaoLam;
	private String Strname;


	public GUI_QuanLiNhanVienQL() {
//		try {
//			connectDB.getInstance().connect();
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("Kết nối thành công");
//		}
//
		nv_DAO = new NhanVien_DAO();
		panelNhanVien();
		setBackground(new Color(147, 190, 221));

	}
	private void panelNhanVien() {
		// TODO Auto-generated method stub
		Box b = Box.createVerticalBox();
		Box bcenter = Box.createHorizontalBox();
		Box b0, b1,b2,b3;
		b.add(Box.createHorizontalStrut(40));
		b.add(Box.createVerticalStrut(20));
		// tiêu đề 
		b.add(b0=Box.createHorizontalBox());
		JLabel lblTieuDe=new JLabel("LTNT SHOP");
		b0.add(lblTieuDe);
		lblTieuDe.setFont(new Font("Arial",Font.BOLD,20) );
		b.add(Box.createVerticalStrut(20));

		// mã nhân viên
		b.add(b1 = Box.createHorizontalBox());
		b1.add(Box.createHorizontalStrut(20));
		JLabel lblMaNV = new JLabel("Mã nhân viên: ");
		txtMaNV = new JTextField();
		b1.add(lblMaNV);
		b1.add(txtMaNV);
		b1.add(Box.createHorizontalStrut(20));
		txtMaNV.setPreferredSize(new Dimension(400, 25));
		b.add(Box.createVerticalStrut(10));
		// tên nhân viên
		JLabel lblten = new JLabel("Tên nhân viên: ");
		txtTenNV = new JTextField();
		b1.add(lblten);
		b1.add(txtTenNV);
		txtTenNV.setPreferredSize(new Dimension(500, 25));
		b.add(Box.createVerticalStrut(10));
		
		//số điện thoại
		JLabel lblSdt = new JLabel("Số Điện Thoại: ");
		txtSdt = new JTextField();
		b1.add(lblSdt);
		b1.add(txtSdt);
		txtSdt.setPreferredSize(new Dimension(240, 25));
		// giới tính
		JLabel lblGioiTinh =new JLabel("Giới tính");
		b1.add(Box.createHorizontalStrut(5));
		b1.add(cbGioiTinh=new JComboBox<>());
		cbGioiTinh.addItem("Nữ");
		cbGioiTinh.addItem("Nam");
		cbGioiTinh.setPreferredSize(new Dimension(100,25));
		b1.add(lblGioiTinh);
		b1.add(cbGioiTinh);
		// ngày sinh
		b.add(b2 = Box.createHorizontalBox());
		b2.add(Box.createHorizontalStrut(20));
		JLabel lblNgaySinh = new JLabel("Ngày Sinh: ");
		b2.add(lblNgaySinh);
		ngaySinh = new JDateChooser();
		b2.add(ngaySinh);
		ngaySinh.setDateFormatString("yyyy-MM-dd");
		ngaySinh.setPreferredSize(new Dimension(230,25));
		//email
		b2.add(Box.createHorizontalStrut(5));
		JLabel lblEmail = new JLabel("Email:              ");
		txtEmail = new JTextField();
		b2.add(lblEmail);
		b2.add(txtEmail);
		txtEmail.setPreferredSize(new Dimension(100, 25));
		// ngày vào làm
		JLabel lblNgayVaoLam = new JLabel("Ngày vào làm:");
		b2.add(lblNgayVaoLam);
		ngayVaoLam = new JDateChooser();
		b2.add(ngayVaoLam);
		ngayVaoLam.setDateFormatString("yyyy-MM-dd");
		ngayVaoLam.setPreferredSize(new Dimension(100,25)); 
		b2.add(Box.createHorizontalStrut(20));
		// chứng minh nhân dân		
		JLabel lblCMDN= new JLabel("CMND:");
		b2.add(lblCMDN);
		txtCMND = new JTextField();
		b2.add(txtCMND);
		txtCMND.setPreferredSize(new Dimension(100, 25));
		b.add(Box.createVerticalStrut(20));

		// chức vụ
		b.add(b3 = Box.createHorizontalBox());
		b3.add(Box.createHorizontalStrut(20));
		JLabel lblChucVu=new JLabel("Chức vụ");
		cbChucVu =new JComboBox();
		cbChucVu.addItem("Nhân viên bán hàng");
		cbChucVu.addItem("Quản lí");
		cbChucVu.setPreferredSize(new Dimension(150,25));
		b3.add(lblChucVu);
		b3.add(cbChucVu);
		b.add(Box.createVerticalStrut(10));
		
		//thành phố
		JLabel lblThanhPho = new JLabel("Thành Phố: ");
		cbThanhPho = new JComboBox();
		cbThanhPho.addItem("Hồ Chí Minh");
		cbThanhPho.addItem("Bình Định");
		cbThanhPho.addItem("Quảng Nam");
		cbThanhPho.addItem("Quảng Ngãi");
		cbThanhPho.addItem("Đà Lạt");
		cbThanhPho.addItem("Phú Yên");
		cbThanhPho.addItem("Đà Nẵng");
		
		cbThanhPho.setPreferredSize(new Dimension(100,25));
		b3.add(lblThanhPho);
		b3.add(cbThanhPho);
		// quận/huyện
		JLabel lblQuan = new JLabel("Quận/Huyện: ");
		cbQuan = new JComboBox();
		cbQuan.setPreferredSize(new Dimension(100,25));
		cbQuan.addItem("Gò Vấp");
		cbQuan.addItem("An Nhơn");
		cbQuan.addItem("Phù Mỹ");
		
		b3.add(lblQuan);
		b3.add(cbQuan);
		// phường/xã
		JLabel lblPhuong = new JLabel("Phường/Xã: ");
		cbPhuong = new JComboBox();
		cbPhuong.setPreferredSize(new Dimension(100,25));
		cbPhuong.addItem("Nhơn Tân");
		cbPhuong.addItem("Nhơn Thọ");
		cbPhuong.addItem("Nhơn Lộc");
		cbPhuong.addItem("Nhơn Khánh");
		cbPhuong.addItem("Nhơn Mỹ");
		cbPhuong.addItem("Nhơn Hòa");
		b3.add(lblPhuong);
		b3.add(cbPhuong);
		// địa chỉ
		JLabel lblDiachi = new JLabel("Địa Chỉ: ");
		txtDiaChi = new JTextField();
		b3.add(lblDiachi);
		b3.add(txtDiaChi);
		txtDiaChi.setPreferredSize(new Dimension(100, 25));
		b.add(Box.createVerticalStrut(20));
		add(b);
		b.add(Box.createVerticalStrut(10));
		// table
		bcenter.add(bcenter = Box.createVerticalBox());
		String header[] = {"Mã nhân viên","Tên nhân viên","Số Điện Thoại","Giới Tính","Ngày Sinh","Email","Ngày vào làm","CMND","Chức vụ","Thành Phố","Quận/Huyện","Phường/Xã","Địa chỉ"};
		model = new DefaultTableModel(header,0);

		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(tableNhanVien = new JTable(model));
		scroll.setPreferredSize(new Dimension(with, 520));

		tableNhanVien.setRowHeight(30);
		tableNhanVien.setAutoCreateRowSorter(true);
		bcenter.setBorder(BorderFactory.createTitledBorder("BẢNG NHÂN VIÊN"));
		bcenter.add(scroll);
		//
		b.add(Box.createVerticalStrut(20));
		b.add(bcenter,BorderLayout.CENTER);
		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		split.setPreferredSize(new Dimension(with, 60));
		add(split, BorderLayout.SOUTH);

		JPanel pnlLeft, pnlRight;
		split.add(pnlLeft = new JPanel());
		split.add(pnlRight = new JPanel());

		pnlLeft.add(new JLabel("Nhập thông tin cần tìm: "));
		pnlLeft.add(txtTim = new JTextField(50));
		txtTim.setPreferredSize(new Dimension(100, 35));
		pnlLeft.add(btnTim = new JButton("Tìm"));
		btnTim.setPreferredSize(new Dimension(120, 40));


		pnlRight.add(btnThem = new JButton("Thêm"));
		btnThem.setPreferredSize(new Dimension(120, 40));

		pnlRight.add(btnSua = new JButton("Sửa"));
		btnSua.setPreferredSize(new Dimension(120, 40));


		pnlRight.add(btnXoa = new JButton("Xóa"));
		btnXoa.setPreferredSize(new Dimension(120, 40));

		pnlRight.add(btnLamMoi = new JButton("Làm mới"));
		btnLamMoi.setPreferredSize(new Dimension(120, 40));

		lblNgaySinh.setPreferredSize(lblMaNV.getPreferredSize());
		lblChucVu.setPreferredSize(lblMaNV.getPreferredSize());
		// sự kiện 
		tableNhanVien.addMouseListener(this);
		btnThem.addActionListener(this);
		btnSua.addActionListener(this);
		btnXoa.addActionListener(this);
		btnTim.addActionListener(this);
		btnLamMoi.addActionListener(this);
		docDuLieuDatabaseVaoTable();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int row =tableNhanVien.getSelectedRow();
//		NhanVien nv  = new NhanVien();

		if(row>=0) {
			txtMaNV.setText(tableNhanVien.getValueAt(row, 0).toString());
			txtTenNV.setText(tableNhanVien.getValueAt(row, 1).toString());
			txtSdt.setText(tableNhanVien.getValueAt(row, 2).toString());
			cbGioiTinh.setSelectedItem(tableNhanVien.getValueAt(row, 3).toString());
			
			String NgaySinhString[] = tableNhanVien.getValueAt(row, 4).toString().split("-");
			int year = Integer.parseInt(NgaySinhString[0]);
			int month = Integer.parseInt(NgaySinhString[1]);
			int day = Integer.parseInt(NgaySinhString[2]);
			
			Date datengayssinh = new Date(year-1900, month-1, day);
			ngaySinh.setDate(datengayssinh);
			
			System.out.println(year);
			System.out.println(month);
			System.out.println(day);
			
			txtEmail.setText(tableNhanVien.getValueAt(row, 5).toString());
			
//			ngayVaoLam.setDate(new java.util.Date(tableNhanVien.getValueAt(row, 6).toString()));
			String NgayVaoLamString[] = tableNhanVien.getValueAt(row, 6).toString().split("-");
			int year1 = Integer.parseInt(NgayVaoLamString[0]);
			int month1 = Integer.parseInt(NgayVaoLamString[1]);
			int day1 = Integer.parseInt(NgayVaoLamString[2]);
		
			Date datevaolam = new Date(year1-1900, month1-1, day1);
			ngayVaoLam.setDate(datevaolam);
	
			System.out.println(year1);
			System.out.println(month1);
			System.out.println(day1);
			
			txtCMND.setText(tableNhanVien.getValueAt(row, 7).toString());
			cbChucVu.setSelectedItem(tableNhanVien.getValueAt(row, 8).toString());
			cbThanhPho.setSelectedItem(tableNhanVien.getValueAt(row, 9).toString());
			cbQuan.setSelectedItem(tableNhanVien.getValueAt(row, 10).toString());
			cbPhuong.setSelectedItem(tableNhanVien.getValueAt(row, 11).toString());
			txtDiaChi.setText(tableNhanVien.getValueAt(row, 12).toString());

			txtMaNV.requestFocus(getFocusTraversalKeysEnabled());

		}
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o= e.getSource();
		if(o.equals(btnThem)){
//			if (validData()==true) {
//				
//			}
			ThemNhanVien();
		}
		else if(o.equals(btnSua)) {
			SuaNhanVien();
		}
		else if(o.equals(btnXoa)) {
			XoaNhanVien();
		}
		else if(o.equals(btnTim)) {
			TimNhanVien();
		}
		else if(o.equals(btnLamMoi)) {
			LamMoiNhanVien();
		}
	}
	// xóa rỗng
	private void LamMoiNhanVien() {
		txtMaNV.setText("");
		txtMaNV.setText("");
		txtTenNV.setText("");
		txtSdt.setText("");
		cbGioiTinh.setSelectedItem("");
		ngaySinh.setDateFormatString("");
		txtEmail.setText("");
		ngayVaoLam.setDateFormatString("");
		txtCMND.setText("");
		cbChucVu.setSelectedItem("");
		cbThanhPho.setSelectedItem("");
		cbQuan.setSelectedItem("");
		cbPhuong.setSelectedItem("");
		txtDiaChi.setText("");
		txtMaNV.requestFocus();

	}
	// load dữ liệu
	public void docDuLieuDatabaseVaoTable() {
		NhanVien_DAO ds = new NhanVien_DAO();
		SimpleDateFormat spd = new SimpleDateFormat("yyyy-MM-dd");
		ArrayList<NhanVien> dsnv =  ds.getAllNhanVien();
		for (NhanVien nhanVien : dsnv) {
			Object rowData[] = {
				nhanVien.getMaNhanVien(), 
				nhanVien.getTenNhanVien(),
				nhanVien.getsDT(),
				nhanVien.isGioiTinh() ? "Nữ" : "Nam",
				spd.format( nhanVien.getNgaySinh() ),
				nhanVien.getEmail(),
				spd.format( nhanVien.getNgayVaoLam() ),
				nhanVien.getChungMinhNhanDan(),
				nhanVien.getChucVu(),
				nhanVien.getThanhPho(),
				nhanVien.getQuan(),
				nhanVien.getPhuong(),
				nhanVien.getDiaChi()
			};
			model.addRow(rowData);
		}
		tableNhanVien.setModel(model);
	}
	//	public void loadDuLieu() throws SQLException, ClassNotFoundException{
	//		DAO_NhanVien dao=new DAO_NhanVien();
	//		ArrayList<NhanVien> list=dao.getAllNhanVien();
	//		model.setRowCount(0);
	//		for (NhanVien nhanVien : list) {
	//			model.addRow(new Object[] {nhanVien.getMaNhanVien(),nhanVien.getTenNhanVien(),nhanVien.getSdt(),nhanVien.isGioiTinh()==false ? "Nam":"Nữ" ,nhanVien.getNgaySinh().toString(),nhanVien.getEmail(),nhanVien.getNgayVaoLam().toString(),nhanVien.getChungMinhNhanDan(),nhanVien.getChucVu(),nhanVien.getThanhPho(),nhanVien.getQuan(),nhanVien.getPhuong(),nhanVien.getDiaChi()});
	//		}
	//		tableNhanVien.setModel(model);
	//		}


	// thêm 
	private void  ThemNhanVien() {

		try {
			String Manv = txtMaNV.getText();
			String TenNv = txtTenNV.getText();
			String sdt = txtSdt.getText();
			String GioiTinh = cbGioiTinh.getSelectedItem().toString();
			Boolean gt = null;
			if (GioiTinh.equals("Nam")) {
				gt = true;
			} else {
				gt = false;
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String dateSinh = sdf.format(ngaySinh.getDate());
			java.sql.Date nsinh =java.sql.Date.valueOf(dateSinh);
			String email = txtEmail.getText();
			String dateVaoLam = sdf.format(ngayVaoLam.getDate());
			java.sql.Date nvl =java.sql.Date.valueOf(dateVaoLam);
			String cmnd = txtCMND.getText();
			String chucvu = cbChucVu.getSelectedItem().toString();
			String thanhpho = cbThanhPho.getSelectedItem().toString();			
			String quan = cbChucVu.getSelectedItem().toString();
			String Phuong = cbPhuong.getSelectedItem().toString();
			String diachi = txtDiaChi.getText();
//			NhanVien nv = new NhanVien(Manv, TenNv, sdt, gt, nsinh, email, nvl, cmnd, chucvu, thanhpho, quan, Phuong, diachi);
//			System.out.println(nv);
//			if(nv_dao.createNhanVien(nv)) {
//				model.addRow(new Object[] {nv.getMaNhanVien(),nv.getTenNhanVien(),nv.getSdt(),nv.isGioiTinh() ? "Nam" : "Nữ"  ,sdf.format(nv.getNgaySinh()) ,nv.getEmail()
//						,sdf.format(nv.getNgayVaoLam()),nv.getChungMinhNhanDan(),nv.getChucVu(),nv.getThanhPho(),nv.getQuan(),nv.getPhuong(),nv.getDiaChi()});
//				JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công");
//			}else {
//				JOptionPane.showMessageDialog(this, "Thêm nhân viên không thành công");
//			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//xóa
	private void XoaNhanVien() {
		int row =tableNhanVien.getSelectedRow();
		if(row >=0) {
			String maNhanVien =(String) tableNhanVien.getValueAt(row, 0);
			int mess=JOptionPane.showConfirmDialog(this, "Bạn có chắc là muốn xóa dòng này không???", "Chú ý", JOptionPane.YES_NO_OPTION);
			if(mess == JOptionPane.YES_OPTION) {
//				if(nv_dao.deleteNhanVien(maNhanVien)) {
//					model.removeRow(row);
//					JOptionPane.showMessageDialog(this, "Xóa nhân viên thành công");
//				}else {
//					JOptionPane.showMessageDialog(this, "Xóa nhân viên  không thành công");
//				}


			}
		}

	}
//	//sửa 
	private void SuaNhanVien() {
		try {

			int row = tableNhanVien.getSelectedRow();
			NhanVien nv = new NhanVien();

			nv.setMaNhanVien(txtMaNV.getText());
			nv.setTenNhanVien(txtTenNV.getText());
			nv.setsDT(txtSdt.getText());
			nv.setGioiTinh(Boolean.parseBoolean(cbGioiTinh.getSelectedItem().toString()));
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String sn = sdf.format(ngaySinh.getDate());
			nv.setNgaySinh(Date.valueOf(sn));
			nv.setEmail(txtEmail.getText());
			String nvl = sdf.format(ngayVaoLam.getDate());
			nv.setNgayVaoLam(Date.valueOf(nvl));
			nv.setChungMinhNhanDan(txtCMND.getText());
			nv.setChucVu(cbChucVu.getSelectedItem().toString());
			nv.setThanhPho(cbThanhPho.getSelectedItem().toString());
			nv.setQuan(cbQuan.getSelectedItem().toString());
			nv.setPhuong(cbPhuong.getSelectedItem().toString());
			nv.setDiaChi(txtDiaChi.getText());

//			if(nv_DAO.upDateNhanVien(nv)) {
//				tableNhanVien.setValueAt(txtTenNV.getText(),row,1);
//				tableNhanVien.setValueAt(txtSdt.getText(),row,2);
//				tableNhanVien.setValueAt(cbGioiTinh.getSelectedItem().toString(),row,3);
//				tableNhanVien.setValueAt(ngaySinh.getDate(),row,4);
//				tableNhanVien.setValueAt(txtEmail.getText(),row,5);
//				tableNhanVien.setValueAt(ngayVaoLam.getDate(),row,6);
//				tableNhanVien.setValueAt(txtCMND.getText(),row,7);
//				tableNhanVien.setValueAt(cbChucVu.getSelectedItem().toString(),row,8);
//				tableNhanVien.setValueAt(cbThanhPho.getSelectedItem().toString(),row,9);
//				tableNhanVien.setValueAt(cbQuan.getSelectedItem().toString(),row,10);
//				tableNhanVien.setValueAt(cbPhuong.getSelectedItem().toString(),row,11);
//				tableNhanVien.setValueAt(txtDiaChi.getText(),row,12);
//				JOptionPane.showMessageDialog(this, "Cập nhật nhân viên thành công");
//			}else {
//				JOptionPane.showMessageDialog(this, "Cập nhật nhân viên không thành công");
//			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// tìm theo tên 
	private void TimNhanVien() {
		model.setRowCount(0);
		Strname = txtTim.getText();

//		for (NhanVien nv : nv_DAO.findNhanVienByName(Strname)) {
//			Object dataRow[]= new Object[13];
//			dataRow[0]=nv.getMaNhanVien();
//			dataRow[1]=nv.getTenNhanVien();
//			dataRow[2]=nv.getsDT();
//			dataRow[3]=nv.isGioiTinh();
//			dataRow[4]=nv.getNgaySinh();
//			dataRow[5]=nv.getEmail();
//			dataRow[6]=nv.getNgayVaoLam();
//			dataRow[7]=nv.getChungMinhNhanDan();
//			dataRow[8]=nv.getChucVu();
//			dataRow[9]=nv.getThanhPho();
//			dataRow[10]=nv.getQuan();
//			dataRow[11]=nv.getPhuong();
//			dataRow[12]=nv.getDiaChi();
//			model.addRow(dataRow);
//		}
		tableNhanVien.setModel(model);	
		JOptionPane.showMessageDialog(this, "Tìm thấy nhân viên ");

	}
// tìm theo mã 
//	private void TimNhanVienTheoSDT() {
//		model.addColumn(0);
//		
//	}

	private boolean validData() {
		String maNhanVien = txtMaNV.getText().trim();
		String tenNhanVien = txtTenNV.getText().trim();
		String sdt = txtSdt.getText().trim();
		String diachi = txtDiaChi.getText().trim();
		String chungMinhNhanDan= txtCMND.getText().trim();
		String email=txtEmail.getText().trim();

		//regex mã
		if(maNhanVien.length() == 0) {
			JOptionPane.showMessageDialog(this, "Bắt buộc nhập mã nhân viên");
			txtMaNV.requestFocus();
			return false;
		}else {
			if(!(maNhanVien.length() > 0 && maNhanVien.matches("^NV[0-9]{5}$"))) {
				JOptionPane.showMessageDialog(this, "Nhập mã theo mẫu");
				txtMaNV.requestFocus();
				return false;
			}
		}
		// regex tên		
		if(tenNhanVien.length() == 0) {
			JOptionPane.showMessageDialog(this, "Bắt buôc nhập họ tên");
			txtTenNV.requestFocus();
			return false;
		}else {
			if (!(tenNhanVien.length() > 0 && tenNhanVien.matches("[A-Z][a-z]*([\\sA-Za-z]*)*"))) {		
				JOptionPane.showMessageDialog(this,"Tên Không Được Rỗng Và Kí Tự Phải Lớn Hơn 0 bắt đầu là kí tự hoa");
				txtTenNV.requestFocus();
			} 
		}
		// regex số điện thoại
		if(sdt.length() == 0) {
			JOptionPane.showMessageDialog(this, "Bắt buôc nhập số điện thoại");
			txtSdt.requestFocus();
			return false;
		}else {	
			if(!(sdt.length() > 0 && sdt.matches("[0-9]{10}"))) {
				JOptionPane.showMessageDialog(this, "Không được nhập chữ và nhập 10 số");
				txtSdt.requestFocus();
				return false;
			}
		}
		// regex chứng mình nhân dân 
		if(chungMinhNhanDan.length()==0) {
			JOptionPane.showMessageDialog(this, "Bắt buộc nhập chứng minh nhân dân nhân viên");
			txtCMND.requestFocus();
			return false;
		}else {
			if(!(chungMinhNhanDan.length() > 0 && chungMinhNhanDan.matches("[0-9]{9}"))) {
				JOptionPane.showMessageDialog(this, "CMND không được nhập chữ và nhập 9 số");
				txtCMND.requestFocus();
				return false;
			}
			// regex địa chỉ
			if(diachi.length() == 0 ) {
				JOptionPane.showMessageDialog(this, "Bắt buộc nhập địa chỉ nhân viên");
				txtDiaChi.requestFocus();
				return false;
			}else {
				if(txtDiaChi.getText().length() > 0 && !(txtDiaChi.getText().matches("[A-Za-z0-9][A-Za-z0-9]*([\\sA-Za-z0-9]*)*"))) {
					JOptionPane.showMessageDialog(this,"Địa chỉ không được rỗng không chứa kí tự đặt biệt");
					return false;
				}
			}
			// regex Email 
			if(email.length() == 0 ) {
				JOptionPane.showMessageDialog(this, "Bắt buộc nhập email nhân viên");
				txtEmail.requestFocus();
				return false;
			}else {
				if(txtEmail.getText().length() > 0 && !(txtEmail.getText().matches("^[A-Za-z0-9]{4}([A-Za-z0-9])*[@]([gmail|yahoo])[.](com)$"))) {
					JOptionPane.showMessageDialog(this,"Email không được rỗng ít nhất tên mail phải 5 kí tự, định dạng xxxxx@gmail.com hoặc @yahoo.com");
					return false;
				}
			}
			return true;

		}

	}
}
