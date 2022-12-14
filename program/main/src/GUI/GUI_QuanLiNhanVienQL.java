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
import connect_DB.Connect_DB;
import entity.NhanVien;

//import connect.connectDB;
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
	NhanVien_DAO dao=new NhanVien_DAO();
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int with = screenSize.width;
	int height = screenSize.height;
	private JDateChooser ngaySinh;
	private JDateChooser ngayVaoLam;

	//private Date dateNgaySinh;
	//private Date dateNgayVaoLam;
	NhanVien_DAO nvdao = new NhanVien_DAO();
	private String Strname;


	public GUI_QuanLiNhanVienQL() {
<<<<<<< HEAD
//		try {
//			connectDB.getInstance().connect();
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("K???t n???i th??nh c??ng");
//		}
//
=======
		Connect_DB.getInstance().connect();

		nv_DAO = new NhanVien_DAO();
>>>>>>> 4d0d792a74bbfbb1cb32e6798ac0df31cb21e9fe
		panelNhanVien();
		setBackground(new Color(147, 190, 221));

	}
	private void panelNhanVien() {
		setLayout(new BorderLayout());
		
		// TODO Auto-generated method stub
		Box b = Box.createVerticalBox();
		Box bcenter = Box.createHorizontalBox();
		Box b0, b1,b2,b3;
		b.add(Box.createHorizontalStrut(40));
		b.add(Box.createVerticalStrut(20));
		// ti??u ????? 
		b.add(b0=Box.createHorizontalBox());
		JLabel lblTieuDe=new JLabel("LTNT SHOP");
		b0.add(lblTieuDe);
		lblTieuDe.setFont(new Font("Arial",Font.BOLD,20) );
		b.add(Box.createVerticalStrut(20));

		// m?? nh??n vi??n
		b.add(b1 = Box.createHorizontalBox());
		b1.add(Box.createHorizontalStrut(20));
		JLabel lblMaNV = new JLabel("M?? nh??n vi??n: ");
		txtMaNV = new JTextField();
		b1.add(lblMaNV);
		b1.add(txtMaNV);
		b1.add(Box.createHorizontalStrut(20));
		txtMaNV.setPreferredSize(new Dimension(400, 25));
		b.add(Box.createVerticalStrut(10));
		// t??n nh??n vi??n
		JLabel lblten = new JLabel("T??n nh??n vi??n: ");
		txtTenNV = new JTextField();
		b1.add(lblten);
		b1.add(txtTenNV);
		txtTenNV.setPreferredSize(new Dimension(500, 25));
		b.add(Box.createVerticalStrut(10));
		
		//s??? ??i???n tho???i
		JLabel lblSdt = new JLabel("S??? ??i???n Tho???i: ");
		txtSdt = new JTextField();
		b1.add(lblSdt);
		b1.add(txtSdt);
		txtSdt.setPreferredSize(new Dimension(240, 25));
		// gi???i t??nh
		JLabel lblGioiTinh =new JLabel("Gi???i t??nh");
		b1.add(Box.createHorizontalStrut(5));
		b1.add(cbGioiTinh=new JComboBox<>());
		cbGioiTinh.addItem("N???");
		cbGioiTinh.addItem("Nam");
		cbGioiTinh.setPreferredSize(new Dimension(100,25));
		b1.add(lblGioiTinh);
		b1.add(cbGioiTinh);
		// ng??y sinh
		b.add(b2 = Box.createHorizontalBox());
		b2.add(Box.createHorizontalStrut(20));
		JLabel lblNgaySinh = new JLabel("Ng??y Sinh: ");
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
		// ng??y v??o l??m
		JLabel lblNgayVaoLam = new JLabel("Ng??y v??o l??m:");
		b2.add(lblNgayVaoLam);
		ngayVaoLam = new JDateChooser();
		b2.add(ngayVaoLam);
		ngayVaoLam.setDateFormatString("yyyy-MM-dd");
		ngayVaoLam.setPreferredSize(new Dimension(100,25)); 
		b2.add(Box.createHorizontalStrut(20));
		// ch???ng minh nh??n d??n		
		JLabel lblCMDN= new JLabel("CMND:");
		b2.add(lblCMDN);
		txtCMND = new JTextField();
		b2.add(txtCMND);
		txtCMND.setPreferredSize(new Dimension(100, 25));
		b.add(Box.createVerticalStrut(20));

		// ch???c v???
		b.add(b3 = Box.createHorizontalBox());
		b3.add(Box.createHorizontalStrut(20));
		JLabel lblChucVu=new JLabel("Ch???c v???");
		cbChucVu =new JComboBox();
		cbChucVu.addItem("Nh??n vi??n b??n h??ng");
		cbChucVu.addItem("Qu???n l??");
		cbChucVu.setPreferredSize(new Dimension(150,25));
		b3.add(lblChucVu);
		b3.add(cbChucVu);
		b.add(Box.createVerticalStrut(10));
		
		//th??nh ph???
		JLabel lblThanhPho = new JLabel("Th??nh Ph???: ");
		cbThanhPho = new JComboBox();
		cbThanhPho.addItem("H??? Ch?? Minh");
		cbThanhPho.addItem("B??nh ?????nh");
		cbThanhPho.addItem("Qu???ng Nam");
		cbThanhPho.addItem("Qu???ng Ng??i");
		cbThanhPho.addItem("???? L???t");
		cbThanhPho.addItem("Ph?? Y??n");
		cbThanhPho.addItem("???? N???ng");
		
		cbThanhPho.setPreferredSize(new Dimension(170,25));
		b3.add(lblThanhPho);
		b3.add(cbThanhPho);
		// qu???n/huy???n
		JLabel lblQuan = new JLabel("Qu???n/Huy???n: ");
		cbQuan = new JComboBox();
		
		cbQuan.addItem("G?? V???p");
		cbQuan.addItem("An Nh??n");
		cbQuan.addItem("Ph?? M???");
		cbQuan.addItem("Tam Ky");
		cbQuan.setPreferredSize(new Dimension(170,25));
		
		b3.add(lblQuan);
		b3.add(cbQuan);
		// ph?????ng/x??
		JLabel lblPhuong = new JLabel("Ph?????ng/X??: ");
		cbPhuong = new JComboBox();
		
		cbPhuong.addItem("Nh??n H??a");
		cbPhuong.addItem("Nh??n T??n");
		cbPhuong.addItem("Nh??n Th???");
		cbPhuong.addItem("Nh??n L???c");
		cbPhuong.addItem("Nh??n Kh??nh");
		cbPhuong.addItem("Nh??n M???");
		cbPhuong.addItem("N??i Thanh H???i An");
		
		
		
		cbPhuong.setPreferredSize(new Dimension(170,25));
		
		b3.add(lblPhuong);
		b3.add(cbPhuong);
		// ?????a ch???
		JLabel lblDiachi = new JLabel("?????a Ch???: ");
		txtDiaChi = new JTextField();
		b3.add(lblDiachi);
		b3.add(txtDiaChi);
		txtDiaChi.setPreferredSize(new Dimension(70, 25));
		b.add(Box.createVerticalStrut(20));
		add(b,BorderLayout.CENTER);
		b.add(Box.createVerticalStrut(10));
		// table
		bcenter.add(bcenter = Box.createVerticalBox());
		String header[] = {"M?? nh??n vi??n","T??n nh??n vi??n","S??? ??i???n Tho???i","Gi???i T??nh","Ng??y Sinh","Email","Ng??y v??o l??m","CMND","Ch???c v???","Th??nh Ph???","Qu???n/Huy???n","Ph?????ng/X??","?????a ch???"};
		model = new DefaultTableModel(header,0);
		tableNhanVien = new JTable(model);
		JScrollPane scroll = new JScrollPane(tableNhanVien);
		scroll.setPreferredSize(new Dimension(with, 520));

		tableNhanVien.setRowHeight(30);
		tableNhanVien.setAutoCreateRowSorter(true);
		bcenter.setBorder(BorderFactory.createTitledBorder("B???NG NH??N VI??N"));
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

		pnlLeft.add(new JLabel("Nh???p th??ng tin c???n t??m: "));
		pnlLeft.add(txtTim = new JTextField(50));
		txtTim.setPreferredSize(new Dimension(100, 35));
		pnlLeft.add(btnTim = new JButton("T??m"));
		btnTim.setPreferredSize(new Dimension(120, 40));


		pnlRight.add(btnThem = new JButton("Th??m"));
		btnThem.setPreferredSize(new Dimension(120, 40));

		pnlRight.add(btnSua = new JButton("S???a"));
		btnSua.setPreferredSize(new Dimension(120, 40));


		pnlRight.add(btnXoa = new JButton("X??a"));
		btnXoa.setPreferredSize(new Dimension(120, 40));

		pnlRight.add(btnLamMoi = new JButton("L??m m???i"));
		btnLamMoi.setPreferredSize(new Dimension(120, 40));

		lblNgaySinh.setPreferredSize(lblMaNV.getPreferredSize());
		lblChucVu.setPreferredSize(lblMaNV.getPreferredSize());
		txtMaNV.setEditable(false);
		// s??? ki???n 
		tableNhanVien.addMouseListener(this);
		btnThem.addActionListener(this);
		btnSua.addActionListener(this);
		btnXoa.addActionListener(this);
		btnTim.addActionListener(this);
		btnLamMoi.addActionListener(this);
		try {
			loadDuLieu();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int row =tableNhanVien.getSelectedRow();
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
			
//			System.out.println(year);
//			System.out.println(month);
//			System.out.println(day);
			
			txtEmail.setText(tableNhanVien.getValueAt(row, 5).toString());
			
//			ngayVaoLam.setDate(new java.util.Date(tableNhanVien.getValueAt(row, 6).toString()));
			String NgayVaoLamString[] = tableNhanVien.getValueAt(row, 6).toString().split("-");
			int year1 = Integer.parseInt(NgayVaoLamString[0]);
			int month1 = Integer.parseInt(NgayVaoLamString[1]);
			int day1 = Integer.parseInt(NgayVaoLamString[2]);
		
			Date datevaolam = new Date(year1-1900, month1-1, day1);
			ngayVaoLam.setDate(datevaolam);
//	
//			System.out.println(year1);
//			System.out.println(month1);
//			System.out.println(day1);
			
			txtCMND.setText(tableNhanVien.getValueAt(row, 7).toString());
			
			cbChucVu.setSelectedItem(tableNhanVien.getValueAt(row, 8).toString());
			String Thanhpho = tableNhanVien.getValueAt(row, 9).toString();	
			cbThanhPho.setSelectedItem(Thanhpho);
			String quan = tableNhanVien.getValueAt(row, 10).toString();	
			System.out.println(quan);
			cbQuan.setSelectedItem(quan);
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
			if (validData()) {
				ThemNhanVien();
			}
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
	// x??a r???ng
	private void LamMoiNhanVien() {
		txtMaNV.setText("");
		txtMaNV.setText("");
		txtTenNV.setText("");
		txtSdt.setText("");
		cbGioiTinh.setSelectedItem("");
		ngaySinh.setDate(null);
		txtEmail.setText("");
		ngayVaoLam.setDate(null);
		txtCMND.setText("");
		cbChucVu.setSelectedItem("");
		cbThanhPho.setSelectedItem("");
		cbQuan.setSelectedItem("");
		cbPhuong.setSelectedItem("");
		txtDiaChi.setText("");
		txtMaNV.requestFocus();

	}
	// load d??? li???u
	public void docDuLieuDatabaseVaoTable() {
		NhanVien_DAO ds = new NhanVien_DAO();
		SimpleDateFormat spd = new SimpleDateFormat("yyyy-MM-dd");
		ArrayList<NhanVien> dsnv =  ds.getAllNhanVien();
		for (NhanVien nhanVien : dsnv) {
			Object rowData[] = {
				nhanVien.getMaNhanVien(), 
				nhanVien.getTenNhanVien(),
				nhanVien.getsDT(),
				nhanVien.isGioiTinh() ? "N???" : "Nam",
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
		public void loadDuLieu() throws SQLException, ClassNotFoundException{
			while (model.getRowCount()!=0) {
				model.removeRow(0);
				
			}
			for (NhanVien nhanVien : nvdao.getAllNhanVien()) {
				model.addRow(new Object[] {nhanVien.getMaNhanVien(),nhanVien.getTenNhanVien(),nhanVien.getsDT(),nhanVien.isGioiTinh()==false ? "Nam":"N???" ,nhanVien.getNgaySinh().toString(),nhanVien.getEmail(),nhanVien.getNgayVaoLam().toString(),nhanVien.getChungMinhNhanDan(),nhanVien.getChucVu(),nhanVien.getThanhPho(),nhanVien.getQuan(),nhanVien.getPhuong(),nhanVien.getDiaChi()});
			}
			tableNhanVien.setModel(model);
			}


	// th??m 
	private void  ThemNhanVien() {

		try {
			java.util.Date dateNOW = new java.util.Date();
			SimpleDateFormat spDateFormat = new SimpleDateFormat("ddMMyyyyhhmmss");
			System.out.println(dateNOW);
			String dateString = spDateFormat.format(dateNOW);
			System.out.println(dateString);

			String Manv = "NV"+dateString;
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
			String quan = cbQuan.getSelectedItem().toString();
			String Phuong = cbPhuong.getSelectedItem().toString();
			String diachi = txtDiaChi.getText();
			NhanVien nv = new NhanVien(Manv, TenNv, nsinh, gt, diachi, Phuong, quan, thanhpho, cmnd, sdt, email, nvl, chucvu);
			System.out.println(nv.toString());
			if(nvdao.createNhanVien(nv)) {
				JOptionPane.showMessageDialog(this, "Th??m nh??n vi??n th??nh c??ng");
				loadDuLieu();
			}else {
				JOptionPane.showMessageDialog(this, "Th??m nh??n vi??n kh??ng th??nh c??ng");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//x??a
	private void XoaNhanVien() {
		int row =tableNhanVien.getSelectedRow();
		if(row >=0) {
			String maNhanVien =(String) tableNhanVien.getValueAt(row, 0);
			int mess=JOptionPane.showConfirmDialog(this, "B???n c?? ch???c l?? mu???n x??a d??ng n??y kh??ng???", "Ch?? ??", JOptionPane.YES_NO_OPTION);
			if(mess == JOptionPane.YES_OPTION) {
				if(nvdao.deleteNhanVien(maNhanVien)) {
					model.removeRow(row);
					JOptionPane.showMessageDialog(this, "X??a nh??n vi??n th??nh c??ng");
					try {
						loadDuLieu();
					} catch (ClassNotFoundException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else {
					JOptionPane.showMessageDialog(this, "X??a nh??n vi??n  kh??ng th??nh c??ng");
				}
			}
		}
		

	}
//	//s???a 
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

			if(nvdao.upDateNhanVien(nv)) {
//				
				loadDuLieu();
			}else {
				JOptionPane.showMessageDialog(this, "C???p nh???t nh??n vi??n kh??ng th??nh c??ng");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// t??m theo t??n 
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
		JOptionPane.showMessageDialog(this, "T??m th???y nh??n vi??n ");

	}
// t??m theo m?? 
//	private void TimNhanVienTheoSDT() {
//		model.addColumn(0);
//		
//	}

	private boolean validData() {	
		String ten = txtTenNV.getText();
		String diachi = txtDiaChi.getText();
		
		if (!(ten.length()>0 && ten.matches("[A-Za-z\\s]+"))) {		
			JOptionPane.showMessageDialog(this,"T??n Kh??ng ???????c R???ng");
			return false;
		} 
		if(txtSdt.getText().length()  <= 0 ){
				JOptionPane.showMessageDialog(this, "Kh??ng ???????c r???ng");
				txtSdt.requestFocus();
				return false;
		}
		if(!(txtSdt.getText().matches("[0][0-9]{9}"))){
			JOptionPane.showMessageDialog(this, " s??? ?????u ti??n l?? s??? 0 t???i ??a nh???p 10 s???");			
			return false;
		}
		if(txtCMND.getText().length() <= 0) {
				JOptionPane.showMessageDialog(this, "CMND kh??ng ???????c nh???p ch??? ");
				return false;
		}
		if(!(txtCMND.getText().matches("\\d{9}"))) {
			JOptionPane.showMessageDialog(this, "CMND kh??ng ???????c nh???p ch??? v?? nh???p 9 s???");
			return false;
		}
		if(txtEmail.getText().length() <= 0) {
					JOptionPane.showMessageDialog(this,"Email kh??ng ???????c r???ng");
					return false;
		}	
		if(!(txtEmail.getText().matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$"))) {
			JOptionPane.showMessageDialog(this,"??t nh???t t??n mail ph???i 4 k?? t??? tr??? l??n ");
			return false;
		}	
		if(!(diachi.length()>0&&diachi.matches("[A-Za-z0-9\s]+"))) {
					JOptionPane.showMessageDialog(this,"?????a ch??? kh??ng ???????c r???ng");
					return false;
		}		
		return true;

		}
}
