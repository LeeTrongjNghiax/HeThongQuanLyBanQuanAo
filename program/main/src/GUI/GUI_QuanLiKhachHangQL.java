package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class GUI_QuanLiKhachHangQL extends JPanel implements ActionListener, MouseListener {
	private JLabel lblTieuDe,lblMaKhachHang,lblTenKhachHang,lblSdt,lblGioiTinh,lblNgaySinh,lblEmail;
	private JTable tableKhachHang;
	private JTextField txtMaKhachHang, txtTenKhachHang,txtEmail,txtSdt,txtNgaySinh,txtTim;
	private JButton btnXoa,btnSua,btnThem,btnTim,btnLamMoi;
	private DefaultTableModel model;
	private JComboBox<String> cbGioiTinh;
	private JDateChooser ngaySinh;
	private String Strname;

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int with = screenSize.width;
	int height = screenSize.height;

//	private DAO_KhachHang kh_dao;
	public GUI_QuanLiKhachHangQL() {
//		try {
//			connectDB.getInstance().connect();
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("Kết nối dữ liệu thành công");
//		}
//		setSize(900	, 800);

//		kh_dao=new DAO_KhachHang();
		panelKhachHang();
		setBackground(new Color(147, 190, 221));

	}
	private void panelKhachHang() {
		Box b = Box.createVerticalBox();
		Box bcenter = Box.createHorizontalBox();
		Box b0, b1,b2;
		b.add(Box.createVerticalStrut(20));
		// tiêu đề
		b.add(b0=Box.createHorizontalBox());
		JLabel lblTieuDe=new JLabel("LTNT SHOP");
		b0.add(lblTieuDe);
		lblTieuDe.setFont(new Font("Arial",Font.BOLD,20) );
		b.add(Box.createVerticalStrut(20));
		// mã
		b.add(b1 = Box.createHorizontalBox());
		b1.add(Box.createHorizontalStrut(20));
		lblMaKhachHang = new JLabel("Mã khách hàng: ");
		txtMaKhachHang = new JTextField();
		b1.add(lblMaKhachHang);
		b1.add(txtMaKhachHang);
		txtMaKhachHang.setPreferredSize(new Dimension(270, 25));
		b.add(Box.createVerticalStrut(10));
		// tên
		lblTenKhachHang = new JLabel("Tên khách hàng: ");
		txtTenKhachHang = new JTextField();
		b1.add(lblTenKhachHang);
		b1.add(txtTenKhachHang);
		txtTenKhachHang.setPreferredSize(new Dimension(500, 25));
		b.add(Box.createVerticalStrut(10));
		// giới tính
		lblGioiTinh =new JLabel("Giới tính");
		b1.add(Box.createHorizontalStrut(5));
		b1.add(cbGioiTinh=new JComboBox<>());
		cbGioiTinh.addItem("Nữ");
		cbGioiTinh.addItem("Nam");
		cbGioiTinh.setPreferredSize(new Dimension(100,25));
		b1.add(lblGioiTinh);
		b1.add(cbGioiTinh);
		// sdt
		b.add(b2 = Box.createHorizontalBox());
		b2.add(Box.createHorizontalStrut(20));
		lblSdt = new JLabel("Số Điện Thoại: ");
		txtSdt = new JTextField();
		b2.add(lblSdt);
		b2.add(txtSdt);
		txtSdt.setPreferredSize(new Dimension(200, 25));
		// ngày sinh
		b2.add(Box.createHorizontalStrut(5));
		lblNgaySinh = new JLabel("Ngày Sinh:         ");
		b2.add(lblNgaySinh);
		b2.add(ngaySinh = new JDateChooser());
		ngaySinh.setDateFormatString("yyyy-MM-dd");
		ngaySinh.setPreferredSize(new Dimension(100,25));
		b2.add(Box.createHorizontalStrut(20));
		// email
		lblEmail = new JLabel("Email: ");
		txtEmail = new JTextField();
		b2.add(lblEmail);
		b2.add(txtEmail);
		txtEmail.setPreferredSize(new Dimension(100, 25));
		b.add(Box.createVerticalStrut(10));
		add(b);

		// table
		b.add(Box.createVerticalStrut(5));
		bcenter.add(bcenter = Box.createVerticalBox());
		bcenter.setBorder(BorderFactory.createTitledBorder("BẢNG KHÁCH HÀNG "));
		String header[] = {" Mã khách hàng","Tên khách hàng","Giới Tính","Số Điện Thoại","Ngày Sinh","Email"};
		model = new DefaultTableModel(header,0);
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(tableKhachHang = new JTable(model));
		scroll.setPreferredSize(new Dimension(with, 620));
		tableKhachHang.setRowHeight(30);
		tableKhachHang.setAutoCreateRowSorter(true);
		bcenter.add(scroll);
		b.add(bcenter, BorderLayout.CENTER);
		// button 
		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		split.setPreferredSize(new Dimension(with, 70));
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

		lblSdt.setPreferredSize(lblMaKhachHang.getPreferredSize());

		// xử lí
		tableKhachHang.addMouseListener(this);
		btnThem.addActionListener(this);
		btnSua.addActionListener(this);
		btnXoa.addActionListener(this);
		btnLamMoi.addActionListener(this);
		btnTim.addActionListener(this);
//		docDuLieuDatabaseVaoTable();

	}
	
	// load dữ liệu
//	private void docDuLieuDatabaseVaoTable() {
//		DAO_KhachHang ds = new DAO_KhachHang();
//		SimpleDateFormat spd = new SimpleDateFormat("yyyy-MM-dd");
//		ArrayList<KhachHang> dskh =  ds.getAllKhachHang();
//		for (KhachHang khachHang : dskh) {
//			Object rowData[] = {
//					khachHang.getMaKhachHang(),khachHang.getTenKhachHang(),khachHang.isGioiTinh()?"Nữ" :"Nam" ,khachHang.getSoDienThoai() ,spd.format(khachHang.getNgaySinh()),khachHang.getEmail()};
//			model.addRow(rowData);
//		}
//		tableKhachHang.setModel(model);
//	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int row =tableKhachHang.getSelectedRow();

		if(row >= 0)
		{
			txtMaKhachHang.setText(tableKhachHang.getValueAt(row, 0).toString());
			txtTenKhachHang.setText(tableKhachHang.getValueAt(row, 1).toString());
			cbGioiTinh.setSelectedItem(tableKhachHang.getValueAt(row, 2).toString());
			txtSdt.setText(tableKhachHang.getValueAt(row, 3).toString());
//			ngaySinh.setDateFormatString(tableKhachHang.getValueAt(row, 4).toString());

			String NgaySinhString[] = tableKhachHang.getValueAt(row, 4).toString().split("-");
			int year = Integer.parseInt(NgaySinhString[0]);
			int month = Integer.parseInt(NgaySinhString[1]);
			int day = Integer.parseInt(NgaySinhString[2]);
			
			Date datengayssinh = new Date(year-1900, month-1, day);
			ngaySinh.setDate(datengayssinh);
			
			System.out.println(year);
			System.out.println(month);
			System.out.println(day);
			
			txtEmail.setText(tableKhachHang.getValueAt(row, 5).toString());
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
		Object o= e.getSource();
		if(o.equals(btnThem)){
//			ThemKhachHang();
		}
		else if(o.equals(btnSua)) {

			SuaKhachHang();
		}
		else if(o.equals(btnXoa)) {
			XoaKhachHang();
		}
		else if(o.equals(btnTim)) {
			TimKhachHang();
		}
		else if(o.equals(btnLamMoi)) {
			LamMoiKhachHang();
		}

	}
	// xóa rỗng
	private void LamMoiKhachHang() {
		txtMaKhachHang.setText("");
		txtTenKhachHang.setText("");
		cbGioiTinh.setSelectedItem("");
		txtSdt.setText("");
		ngaySinh.setDateFormatString("");
		txtEmail.setText("");
		txtMaKhachHang.requestFocus();
	}

	// thêm 
//	private void ThemKhachHang() {
//		try {
//			String maKhachHang = txtMaKhachHang.getText();
//			String tenKhachHang = txtTenKhachHang.getText();
//			String gioiTinh = cbGioiTinh.getSelectedItem().toString();
//			Boolean gt = null;
//			if (gioiTinh.equals("Nam")) {
//				gt = true;
//			} else {
//				gt = false;
//			}
//			String soDienThoai = txtSdt.getText();
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//			String sn = sdf.format(ngaySinh.getDate());
//			Date ngaysinh = Date.valueOf(sn);
//			String email = txtEmail.getText();
//			KhachHang kh = new KhachHang(maKhachHang, tenKhachHang, gt, soDienThoai, ngaysinh, email);
//			if (kh_dao.createKhachHang(kh)) {
//				model.addRow(new Object[] {kh.getMaKhachHang(),kh.getTenKhachHang(),kh.isGioiTinh()?"Nam":"Nữ",kh.getSoDienThoai(),sdf.format(kh.getNgaySinh()),kh.getEmail()});
//				JOptionPane.showMessageDialog(this, "Thêm khách hàng thành công");
//			}else {
//				JOptionPane.showMessageDialog(this, "Thêm khách hàng không thành công");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//	}
	// xóa
	private void XoaKhachHang() {
		int row =tableKhachHang.getSelectedRow();
		if(row >=0) {
			String maKhachHang =(String) tableKhachHang.getValueAt(row, 0);
			int mess=JOptionPane.showConfirmDialog(this, "Bạn có chắc là muốn xóa dòng này không???", "Chú ý", JOptionPane.YES_NO_OPTION);
			if(mess == JOptionPane.YES_OPTION) {
//				if(kh_dao.deleteKhachHang(maKhachHang)) {
//					model.removeRow(row);
//					JOptionPane.showMessageDialog(this, "Xóa khách hàng thành công");
//				}else {
//					JOptionPane.showMessageDialog(this, "Xóa khách hàng không thành công");
//				}
			}
		}

	}
	// sửa
	private void SuaKhachHang() {
//		try {
//			int row = tableKhachHang.getSelectedRow();
//			KhachHang kh = new KhachHang();
//			kh.setMaKhachHang(txtMaKhachHang.getText());
//			kh.setTenKhachHang(txtTenKhachHang.getText());
//			kh.setGioiTinh(Boolean.parseBoolean(cbGioiTinh.getSelectedItem().toString()));
//			kh.setSoDienThoai(txtSdt.getText());
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//			String sn = sdf.format(ngaySinh.getDate());
//			kh.setNgaySinh(Date.valueOf(sn));
//			kh.setEmail(txtEmail.getText());
//			if(kh_dao.upDateKhachHang(kh)) {
//				tableKhachHang.setValueAt(txtTenKhachHang.getText(),row,1);
//				tableKhachHang.setValueAt(cbGioiTinh.getSelectedItem().toString(),row,2);
//				tableKhachHang.setValueAt(txtSdt.getText(),row,3);
//				tableKhachHang.setValueAt(ngaySinh.getDate(),row,4);
//				tableKhachHang.setValueAt(txtEmail.getText(),row,5);
//				JOptionPane.showMessageDialog(this, "Cập nhật khách hàng thành công");
//			}else {
//				JOptionPane.showMessageDialog(this, "Cập nhật khách hàng không thành công");
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}
	// tìm 
	private void TimKhachHang() {
		model.setRowCount(0);
		Strname=txtTim.getText();
//		for (KhachHang kh : kh_dao.findKhachHangByName(Strname)) {
//			Object dataRow[]= new Object[6];
//			dataRow[0]=kh.getMaKhachHang();
//			dataRow[1]=kh.getTenKhachHang();
//			dataRow[2]=kh.isGioiTinh()?"Nam":"Nữ";
//			dataRow[3]=kh.getSoDienThoai();
//			dataRow[4]=kh.getNgaySinh();
//			dataRow[5]=kh.getEmail();
//			model.addRow(dataRow);
//		}
		tableKhachHang.setModel(model);	
		JOptionPane.showMessageDialog(this, "Tìm thấy khách hàng ");
	}
}
