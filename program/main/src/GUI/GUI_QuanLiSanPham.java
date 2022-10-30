package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import entity.LoaiSanPham;


public class GUI_QuanLiSanPham extends JPanel implements ActionListener, MouseListener {

	// Attribute Panel Product Image
	private JPanel panelTopLeft;
	private JLabel lblImg;
	private JButton btnThemAnh;
	private String path;
	// Attribute Panel Product Info
	private JPanel panelTopRight;
	private JLabel lblMaSP, lblTenSP, lblLoaiSP, lblTenTH, lblNuocTH, lblTenNSX, lblSDTNSX, lblEmailNSX, lblKieuDang, lblChatLieu, lblDonVi, lblGioiTinh, lblKichCo, lblMauSac, lblSoLuong, lblGiaBan, lblMoTa;
	private JTextField txtMaSP, txtTenSP, txtTenTH, txtTenNSX, txtSDTNSX, txtEmailNSX, txtKieuDang, txtChatLieu, txtMauSac, txtSoLuong, txtGiaBan;
	private JTextArea txtMoTa;
	private JComboBox cbLoaiSP, cbDonVi, cbGioiTinh, cbNuocTH, cbKichCo;
	private DefaultComboBoxModel cbModelLoaiSP, cbModelDonVi, cbModelGioiTinh, cbModelNuocTH, cbModelKichCo;
	private JTable tblCTSP;
	private DefaultTableModel tblModelCTSP;
	private JScrollPane scrTBLCTSP;
	private JButton btnThemCTSP, btnSuaCTSP, btnXoaSTCP, btnThemSP, btnSuaSP, btnXoaSP;

	// Attribute Panel Product Table
	private JTable tblSanPham;
	private DefaultTableModel tblModelSanPham;
	private JScrollPane scrTBLModelSanPham;

	public GUI_QuanLiSanPham(JFrame frame) {
		// TODO Auto-generated constructor stub
		int width = frame.getWidth(), height = frame.getHeight();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		JPanel panelTop;
		int wPT = width, hPT = height * 2 / 3;
		add(panelTop = new JPanel());
		panelTop.setLayout(new BoxLayout(panelTop, BoxLayout.X_AXIS));
		panelTop.setPreferredSize(new Dimension(wPT, hPT));

		// Panel Product Image
		panelTop.add(panelTopLeft = new JPanel());
		int wPTL = wPT / 3, hPTL = hPT;
		panelTopLeft.setPreferredSize(new Dimension(wPTL, hPTL));
		panelTopLeft.setLayout(new BoxLayout(panelTopLeft, BoxLayout.Y_AXIS));
		panelTopLeft.add(Box.createHorizontalStrut(wPTL / 5));
		panelTopLeft.setBackground(new Color(147, 190, 221));

		Box b = Box.createVerticalBox();

		Box bImage = Box.createHorizontalBox();
		ImageIcon icon = new ImageIcon(scaleImage("C:\\Users\\Admin\\Desktop\\imageIcon.jfif", wPTL / 2, wPTL / 2 ));
		bImage.add(lblImg = new JLabel(icon));
		b.add(bImage);
		b.add(Box.createVerticalStrut(10));

		Box bChucNang = Box.createHorizontalBox();
		bChucNang.add(btnThemAnh = new JButton("Thêm Ảnh"));
		b.add(bChucNang);

		panelTopLeft.add(b);
		panelTopLeft.add(Box.createVerticalStrut(hPTL / 4));

		// Panel Product Info
		panelTop.add(panelTopRight = new JPanel());
		panelTopRight.setLayout(new BoxLayout(panelTopRight, BoxLayout.Y_AXIS));
		panelTopRight.setPreferredSize(new Dimension(wPT * 2 /3, hPT));
		panelTopRight.setBackground(new Color(147, 190, 221));

		panelTopRight.add(Box.createVerticalStrut(15));
		Box bRowProduct1 = Box.createHorizontalBox();
		bRowProduct1.add(lblMaSP = new JLabel("Mã Sản Phẩm"));
		bRowProduct1.add(Box.createHorizontalStrut(15));
		bRowProduct1.add(txtMaSP = new JTextField(30));
		txtMaSP.setEditable(false);
		bRowProduct1.add(Box.createHorizontalStrut(20));
		bRowProduct1.add(lblTenNSX = new JLabel("Tên Sản Phẩm"));
		bRowProduct1.add(Box.createHorizontalStrut(10));
		bRowProduct1.add(txtTenSP = new JTextField(30));
		bRowProduct1.add(Box.createHorizontalStrut(20));
		bRowProduct1.add(lblLoaiSP = new JLabel("Loại Sản Phẩm"));
		bRowProduct1.add(Box.createHorizontalStrut(10));
		bRowProduct1.add(cbLoaiSP = new JComboBox<>(cbModelLoaiSP = new DefaultComboBoxModel<>(new Object[] {"Ao Thun"})));
		cbModelLoaiSP.addElement("Them");
		panelTopRight.add(bRowProduct1);
		panelTopRight.add(Box.createVerticalStrut(15));

		Box bRowProduct2 = Box.createHorizontalBox();
		bRowProduct2.add(lblTenTH = new JLabel("Tên Thương Hiệu"));
		bRowProduct2.add(Box.createHorizontalStrut(10));
		bRowProduct2.add(txtTenTH = new JTextField(30));
		bRowProduct2.add(Box.createHorizontalStrut(20));
		bRowProduct2.add(lblNuocTH = new JLabel("Nước Thương Hiệu"));
		bRowProduct2.add(Box.createHorizontalStrut(10));
		bRowProduct2.add(cbNuocTH = new JComboBox<>(cbModelNuocTH = new DefaultComboBoxModel<>(new Object[] {"Viet Nam"})));
		panelTopRight.add(bRowProduct2);
		panelTopRight.add(Box.createVerticalStrut(15));

		Box bRowProduct3 = Box.createHorizontalBox();
		bRowProduct3.add(lblTenNSX = new JLabel("Tên NSX"));
		bRowProduct3.add(Box.createHorizontalStrut(23));
		bRowProduct3.add(txtTenNSX = new JTextField(30));
		bRowProduct3.add(Box.createHorizontalStrut(20));
		bRowProduct3.add(lblSDTNSX = new JLabel("SDT NSX"));
		bRowProduct3.add(Box.createHorizontalStrut(10));
		bRowProduct3.add(txtSDTNSX = new JTextField(30));
		bRowProduct3.add(Box.createHorizontalStrut(20));
		bRowProduct3.add(lblEmailNSX = new JLabel("Email NSX"));
		bRowProduct3.add(Box.createHorizontalStrut(10));
		bRowProduct3.add(txtEmailNSX = new JTextField(30));
		panelTopRight.add(bRowProduct3);
		panelTopRight.add(Box.createVerticalStrut(15));

		Box bRowProduct4 = Box.createHorizontalBox();
		bRowProduct4.add(lblKieuDang = new JLabel("Kiểu Dáng"));
		bRowProduct4.add(Box.createHorizontalStrut(17));
		bRowProduct4.add(txtKieuDang = new JTextField(30));
		bRowProduct4.add(Box.createHorizontalStrut(20));
		bRowProduct4.add(lblChatLieu = new JLabel("Chất Liệu"));
		bRowProduct4.add(Box.createHorizontalStrut(10));
		bRowProduct4.add(txtChatLieu = new JTextField(30));
		bRowProduct4.add(Box.createHorizontalStrut(20));
		bRowProduct4.add(lblDonVi = new JLabel("Đơn Vị"));
		bRowProduct4.add(Box.createHorizontalStrut(10));
		bRowProduct4.add(cbDonVi = new JComboBox<>(cbModelDonVi = new DefaultComboBoxModel<>(new Object[] {"Cai", "Doi", "Bo"})));
		bRowProduct4.add(Box.createHorizontalStrut(20));
		bRowProduct4.add(lblGioiTinh = new JLabel("Gioi Tinh"));
		bRowProduct4.add(Box.createHorizontalStrut(10));
		bRowProduct4.add(cbGioiTinh = new JComboBox<>(cbModelGioiTinh = new DefaultComboBoxModel<>(new Object[] {"Nam", "Nu", "Unisex"})));
		panelTopRight.add(bRowProduct4);
		panelTopRight.add(Box.createVerticalStrut(15));

		Box bRowProduct5 = Box.createHorizontalBox();
		bRowProduct5.add(lblKichCo = new JLabel("Kích Cỡ"));
		bRowProduct5.add(Box.createHorizontalStrut(10));
		bRowProduct5.add(cbKichCo = new JComboBox<>(cbModelKichCo = new DefaultComboBoxModel<>(new Object[] {"S", "M", "L", "XL"})));
		bRowProduct5.add(Box.createHorizontalStrut(20));
		bRowProduct5.add(lblMauSac = new JLabel("Màu Sắc"));
		bRowProduct5.add(Box.createHorizontalStrut(10));
		bRowProduct5.add(txtMauSac = new JTextField(30));
		bRowProduct5.add(Box.createHorizontalStrut(20));
		bRowProduct5.add(lblSoLuong = new JLabel("Số Lượng"));
		bRowProduct5.add(Box.createHorizontalStrut(10));
		bRowProduct5.add(txtSoLuong = new JTextField(30));
		bRowProduct5.add(Box.createHorizontalStrut(20));
		bRowProduct5.add(lblGiaBan = new JLabel("Giá Bán"));
		bRowProduct5.add(Box.createHorizontalStrut(10));
		bRowProduct5.add(txtGiaBan = new JTextField(30));
		panelTopRight.add(bRowProduct5);
		panelTopRight.add(Box.createVerticalStrut(15));

		Box bRowProduct6 = Box.createHorizontalBox();
		bRowProduct6.add(Box.createHorizontalStrut(50));
		bRowProduct6.add(tblCTSP = new JTable(tblModelCTSP = new DefaultTableModel(new Object[] {"Kích Cỡ", "Màu Sắc", "Số Lượng", "Giá Bán"}, 0)));
		bRowProduct6.add(Box.createHorizontalStrut(50));
		panelTopRight.add(bRowProduct6);
		panelTopRight.add(Box.createVerticalStrut(15));

		Box bRowProduct7 = Box.createHorizontalBox();
		bRowProduct7.add(btnThemCTSP = new JButton("Thêm"));
		bRowProduct7.add(Box.createHorizontalStrut(50));
		bRowProduct7.setPreferredSize(new Dimension(150, 20));
		bRowProduct7.add(btnSuaCTSP = new JButton("Sửa"));
		bRowProduct7.add(Box.createHorizontalStrut(50));
		bRowProduct7.add(btnXoaSTCP = new JButton("Xóa"));
		panelTopRight.add(bRowProduct7);
		panelTopRight.add(Box.createVerticalStrut(15));

		Box bRowProduct8 = Box.createHorizontalBox();
		scrTBLCTSP = new JScrollPane(tblCTSP = new JTable(tblModelCTSP = new DefaultTableModel(new Object[] {"Kích Cỡ","Màu Sắc", "Số Lượng", "Giá Bán"},  0)), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		bRowProduct8.add(scrTBLCTSP);
		panelTopRight.add(bRowProduct8);
		panelTopRight.add(Box.createVerticalStrut(15));

		Box bRowProduct9 = Box.createHorizontalBox();
		JScrollPane scrTXTMoTa;
		bRowProduct9.add(lblMoTa = new JLabel("Mô Tả"));
		bRowProduct9.add(scrTXTMoTa = new JScrollPane(txtMoTa = new JTextArea(10, 5), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
		panelTopRight.add(bRowProduct9);
		panelTopRight.add(Box.createVerticalStrut(15));

		Box bRowProduct10 = Box.createHorizontalBox();
		bRowProduct10.add(btnThemSP = new JButton("Thêm Sản Phẩm"));
		bRowProduct10.add(Box.createHorizontalStrut(50));
		bRowProduct10.add(btnSuaSP = new JButton("Sửa Sản Phẩm"));
		bRowProduct10.add(Box.createHorizontalStrut(50));
		bRowProduct10.add(btnXoaSP = new JButton("Xóa Sản Phẩm"));
		panelTopRight.add(bRowProduct10);
		panelTopRight.add(Box.createVerticalStrut(15));

		lblMaSP.setPreferredSize(lblTenTH.getPreferredSize());
		lblTenNSX.setPreferredSize(lblTenTH.getPreferredSize());
		lblKieuDang.setPreferredSize(lblTenTH.getPreferredSize());
		lblMoTa.setPreferredSize(lblTenTH.getPreferredSize());

		JPanel panelBottom;
		int wPB = width, hPB = height / 3;
		add(panelBottom = new JPanel());
		panelBottom.setLayout(new BoxLayout(panelBottom, BoxLayout.Y_AXIS));
		panelBottom.setPreferredSize(new Dimension(wPB, hPB));

		// Panel Product Table
		tblModelSanPham = new DefaultTableModel(new Object[]{"Mã Sản Phẩm", "Tên Sản Phẩm", "Tên Thương Hiệu", "Tên Nhà Sản Xuất", "Kiểu Dáng", "Chất Liệu", "Giới Tính"}, 0);
		tblSanPham = new JTable(tblModelSanPham);
		scrTBLModelSanPham = new JScrollPane(tblSanPham, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrTBLModelSanPham.setPreferredSize(new Dimension(wPB, hPB *4/5));

		panelBottom.add(scrTBLModelSanPham);

		// Event
		// Action Listener
		cbLoaiSP.addActionListener(this);
		btnThemAnh.addActionListener(this);
		btnThemCTSP.addActionListener(this); 
		btnSuaCTSP.addActionListener(this); 
		btnXoaSTCP.addActionListener(this); 
		btnThemSP.addActionListener(this);
		btnSuaSP.addActionListener(this);
		btnXoaSP.addActionListener(this);
		// Mouse Listener
		tblCTSP.addMouseListener(this);
		tblSanPham.addMouseListener(this);
	}

	private void removeAllRow(DefaultTableModel tableModel) {
		while (tableModel.getRowCount() > 0) {
			tableModel.removeRow(0);
		}
	}

	private Image scaleImage(String path, int w, int h) {
		ImageIcon img = new ImageIcon(path);
		Image image = img.getImage();
		Image scaled = image.getScaledInstance(w, h, Image.SCALE_SMOOTH);
		return scaled;
	}

	private void clearTextFieldCTSP() {
		cbKichCo.setSelectedIndex(0);
		txtMauSac.setText("");
		txtSoLuong.setText("");
		txtGiaBan.setText("");
	}
	
	private void clearTextFieldSP() {
		txtTenSP.setText("");
		cbLoaiSP.setSelectedIndex(0);
		txtTenTH.setText("");
		cbNuocTH.setSelectedIndex(0);
		txtTenNSX.setText("");
		txtSDTNSX.setText("");
		txtEmailNSX.setText("");
		txtKieuDang.setText("");
		txtChatLieu.setText("");
		cbGioiTinh.setSelectedIndex(0);
		cbDonVi.setSelectedIndex(0);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(cbLoaiSP)) {
			themLoaiSP();
		} else if(o.equals(btnThemAnh)) {
			themAnh();
		} else if(o.equals(btnThemCTSP)) {
			themCTSP();
		} else if(o.equals(btnSuaCTSP)) {
			suaCTSP();
		} else if(o.equals(btnXoaSTCP)) {
			xoaCTSP();
		} else if(o.equals(btnThemSP)) {
			themSP();
		} else if(o.equals(btnSuaSP)) {
			suaSP();
		} else if(o.equals(btnXoaSP)) {
			xoaSP();
		}
	}

	private void themLoaiSP() {
		// TODO Auto-generated method stub
		String opt = cbLoaiSP.getSelectedItem().toString();
		if(opt.equalsIgnoreCase("Them")) {
			String tenLoaiSPMoi = JOptionPane.showInputDialog(null, "Nhập Loại Sản Phẩm: ");
			String[] sArr = tenLoaiSPMoi.split("\\s");
			String maLoai = "";
			for(String a : sArr) {
				maLoai += a.substring(0, 1);
			}
			JOptionPane.showMessageDialog(null, maLoai);
			// Save Data Base
			LoaiSanPham loaiSPMoi = new LoaiSanPham(maLoai, tenLoaiSPMoi);
			
			
		}
	}

	private void themAnh() {
		// TODO Auto-generated method stub
		JFileChooser file = new JFileChooser();
		file.setCurrentDirectory(new File(System.getProperty("user.home")));
		//filtering files
		FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","png");
		file.addChoosableFileFilter(filter);
		int res = file.showSaveDialog(null);
		//if the user clicks on save in Jfilechooser
		if(res == JFileChooser.APPROVE_OPTION){
			File selFile = file.getSelectedFile();
			path = selFile.getAbsolutePath();
			ImageIcon icon = new ImageIcon(scaleImage(path, lblImg.getWidth(), lblImg.getHeight()));
			lblImg.setIcon(icon);
		}
	}

	private void xoaSP() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, path);

	}

	private void suaSP() {
		// TODO Auto-generated method stub
	}

	private void themSP() {
		// TODO Auto-generated method stub
		String tenSP = txtTenSP.getText();
		String loaiSP = cbLoaiSP.getSelectedItem().toString();
		String tenTH = txtTenTH.getText();
		String nuocTH = cbNuocTH.getSelectedItem().toString();
		String tenNSX = txtTenNSX.getText();
		String SDTNSX = txtSDTNSX.getText();
		String emailNSX = txtEmailNSX.getText();
		String kieuDang = txtKieuDang.getText();
		String chatLieu = txtChatLieu.getText();
		String gioiTinh = cbGioiTinh.getSelectedItem().toString();
		String donVi = cbDonVi.getSelectedItem().toString();
		String linkAnh = path;
		
		String[] s = loaiSP.split("\\s");
		String maSP = "";
		for (String w : s) {
			maSP += w.substring(0, 1).toUpperCase();  
		}
		int rand = (int) (Math.floor(Math.random() * 100000) + 899999);
		maSP += String.valueOf(rand);

		Object[] rowSP = {maSP, tenSP, tenTH, tenNSX, kieuDang, chatLieu, gioiTinh};

		tblModelSanPham.addRow(rowSP);
		
		
	}

	private void xoaCTSP() {
		// TODO Auto-generated method stub
		int row = tblCTSP.getSelectedRow();
		tblModelCTSP.removeRow(row);
	}

	private void suaCTSP() {
		// TODO Auto-generated method stub
		int row = tblCTSP.getSelectedRow();

		String kichCo = cbKichCo.getSelectedItem().toString();
		String mauSac = txtMauSac.getText();
		String soLuong = txtSoLuong.getText();
		String giaBan = txtGiaBan.getText();

		Object[] rowCTSP = {kichCo, mauSac, soLuong, giaBan};

		tblModelCTSP.removeRow(row);
		tblModelCTSP.addRow(rowCTSP);
		
		clearTextFieldCTSP();
	}

	private void themCTSP() {
		// TODO Auto-generated method stub
		String kichCo = cbKichCo.getSelectedItem().toString();
		String mauSac = txtMauSac.getText();
		String soLuong = txtSoLuong.getText();
		String giaBan = txtGiaBan.getText();

		Object[] rowCTSP = {kichCo, mauSac, soLuong, giaBan};
		tblModelCTSP.addRow(rowCTSP);

		clearTextFieldCTSP();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(tblCTSP)) {
			int rowCTSP = tblCTSP.getSelectedRow();

			String kichCo = tblCTSP.getValueAt(rowCTSP, 0).toString();
			String mauSac = tblCTSP.getValueAt(rowCTSP, 1).toString();
			String soLuong = tblCTSP.getValueAt(rowCTSP, 2).toString();
			String giaBan = tblCTSP.getValueAt(rowCTSP, 3).toString();

			cbKichCo.setSelectedItem(kichCo + "");
			txtMauSac.setText(mauSac + "");
			txtSoLuong.setText(soLuong + "");
			txtGiaBan.setText(giaBan + "");
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
}
