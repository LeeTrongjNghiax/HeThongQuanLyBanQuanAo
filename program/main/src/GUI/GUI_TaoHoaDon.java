package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.DocumentException;

import connect_DB.Connect_DB;

public class GUI_TaoHoaDon extends JPanel implements ActionListener, KeyListener, MouseListener {
	// Attribute Panel Customer
	private JLabel lblSDTKH, lblTenKH, lblNgaySinh, lblCapDoKH;
	private JTextField txtSDTKH, txtTenKH, txtNgaySinhKH, txtCapDoKH;
	private JButton btnTimKiemKH, btnTaoKH;

	// Attribute Panel Order Detail
	private JTable tblCTHD;
	private DefaultTableModel tblModelCTHD;
	private JScrollPane scrTBLCTHD;
	private JPanel panelCTHD;

	// Attribute Panel Purchase
	private JPanel panelThanhToan;
	private JButton btnThanhToan, btnHuyThanhToan;
	private JLabel lblTongSoLuongSP, lblTongCong, lblTienGiam, lblTienPhaiThanhToan, lblTienNhan, lblTienTra;
	private JTextField txtTongSoLuongSP, txtTongCong, txtTienGiam, txtTienPhaiThanhToan, txtTienNhan, txtTienTra;

	// Attribute Panel Search Product
	private JPanel panelTimKiemSP;
	private JLabel lblTenSP, lblMauSac, lblKichCo;
	private JTextField txtTenSP;
	private JList listMauSac, listKichCo;
	private DefaultListModel listModelMauSac, listModelKichCo;
	private JScrollPane scrListMauSac, scrListKichCo, scrTBLTimKiemSP;
	private JButton btnTimKiemSP, btnLamMoi, btnThemVaoHoaDon;
	private JTable tblTimKiemSP;
	private DefaultTableModel tblModelTimKiemSP;
	
	public GUI_TaoHoaDon(JFrame frame) {
		// TODO Auto-generated constructor stub
//		try {
//			Connect_DB.getInstance().connect();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		createGUI(frame);
	}

	private void createGUI(JFrame frame) {
		// TODO Auto-generated method stub
		int width = frame.getWidth(), height = frame.getHeight();
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

		JPanel panelLeft;
		add(panelLeft = new JPanel());
		int wPL = width * 2 / 3, hPL = height;
		panelLeft.setPreferredSize(new Dimension(wPL, hPL));
		panelLeft.setLayout(new BoxLayout(panelLeft, BoxLayout.Y_AXIS));

		// Attribute Panel Customer
		JPanel panelThongTinKhachHang;
		panelLeft.add(panelThongTinKhachHang = new JPanel());
		panelThongTinKhachHang.setBorder(BorderFactory.createTitledBorder("Khách Hàng"));
		panelThongTinKhachHang.setLayout(new BoxLayout(panelThongTinKhachHang, BoxLayout.Y_AXIS));
		panelThongTinKhachHang.setPreferredSize(new Dimension(wPL,hPL / 5));
		panelThongTinKhachHang.setBackground(new Color(147, 190, 221));

		panelThongTinKhachHang.add(Box.createVerticalStrut(15));
		Box bRowKH1 = Box.createHorizontalBox();
		bRowKH1.add(lblSDTKH = new JLabel("Số Điện Thoại"));
		bRowKH1.add(Box.createHorizontalStrut(10));
		bRowKH1.add(txtSDTKH = new JTextField(30));
		bRowKH1.add(lblNgaySinh = new JLabel("Ngày Sinh"));
		bRowKH1.add(Box.createHorizontalStrut(10));
		bRowKH1.add(txtNgaySinhKH = new JTextField(30));
		txtNgaySinhKH.setEditable(false);
		panelThongTinKhachHang.add(bRowKH1);
		panelThongTinKhachHang.add(Box.createVerticalStrut(15));

		Box bRowKH2 = Box.createHorizontalBox();
		bRowKH2.add(lblTenKH = new JLabel("Họ Và Tên"));
		bRowKH2.add(Box.createHorizontalStrut(10));
		bRowKH2.add(txtTenKH = new JTextField(30));
		txtTenKH.setEditable(false);
		bRowKH2.add(lblCapDoKH = new JLabel("Cấp Độ"));
		bRowKH2.add(Box.createHorizontalStrut(10));
		bRowKH2.add(txtCapDoKH = new JTextField(30));
		txtCapDoKH.setEditable(false);
		panelThongTinKhachHang.add(bRowKH2);
		panelThongTinKhachHang.add(Box.createVerticalStrut(15));

		Box bRowKH3 = Box.createHorizontalBox();
		bRowKH3.add(btnTimKiemKH = new JButton("Tìm Kiếm"));
		bRowKH3.add(Box.createHorizontalStrut(50));
		bRowKH3.add(btnTaoKH = new JButton("Thêm Mới"));
		panelThongTinKhachHang.add(bRowKH3);
		panelThongTinKhachHang.add(Box.createVerticalStrut(15));

		lblTenKH.setPreferredSize(lblSDTKH.getPreferredSize());
		lblNgaySinh.setPreferredSize(lblSDTKH.getPreferredSize());
		lblCapDoKH.setPreferredSize(lblSDTKH.getPreferredSize());

		// Panel Order Detail
		tblModelCTHD = new DefaultTableModel(new Object[] {"Mã", "Tên Sản Phẩm", "Số Lượng", "Đơn Giá", "Thành Tiền"}, 0);
		tblCTHD = new JTable(tblModelCTHD);
		scrTBLCTHD = new JScrollPane(tblCTHD, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrTBLCTHD.setPreferredSize(new Dimension(wPL,hPL * 3 / 5) );
		panelLeft.add(scrTBLCTHD);

		// Panel Purchase
		panelLeft.add(panelThanhToan = new JPanel());
		panelThanhToan.setBorder(BorderFactory.createTitledBorder("Thanh Toán"));
		panelThanhToan.setLayout(new BoxLayout(panelThanhToan, BoxLayout.Y_AXIS));
		panelThanhToan.setPreferredSize(new Dimension(wPL,hPL / 5));
		panelThanhToan.setBackground(new Color(147, 190, 221));

		panelThanhToan.add(Box.createVerticalStrut(15));
		Box bRowTT1 = Box.createHorizontalBox();
		bRowTT1.add(lblTongCong = new JLabel("Tổng Cộng"));
		bRowTT1.add(txtTongCong = new JTextField(30));
		txtTongCong.setText("0");
		bRowTT1.add(lblTongSoLuongSP = new JLabel("Tổng Số Lượng Sản Phẩm"));
		bRowTT1.add(txtTongSoLuongSP = new JTextField(30));
		txtTongSoLuongSP.setText("0");
		panelThanhToan.add(bRowTT1);
		panelThanhToan.add(Box.createVerticalStrut(15));

		Box bRowTT2 = Box.createHorizontalBox();
		bRowTT2.add(lblTienPhaiThanhToan = new JLabel("Tiền Thanh Toán"));
		bRowTT2.add(txtTienPhaiThanhToan = new JTextField(30));
		txtTienPhaiThanhToan.setText("0");
		bRowTT2.add(lblTienGiam = new JLabel("Tiền Giảm"));
		bRowTT2.add(txtTienGiam = new JTextField(30));
		txtTienGiam.setText("0");
		panelThanhToan.add(bRowTT2);
		panelThanhToan.add(Box.createVerticalStrut(15));
		
		Box bRowTT3 = Box.createHorizontalBox();
		bRowTT3.add(lblTienNhan = new JLabel("Tiền Nhận"));
		bRowTT3.add(txtTienNhan = new JTextField(30));
		txtTienNhan.setText("0");
		bRowTT3.add(lblTienTra = new JLabel("Tiền Trả"));
		bRowTT3.add(txtTienTra = new JTextField(30));
		txtTienTra.setText("0");
		panelThanhToan.add(bRowTT3);
		panelThanhToan.add(Box.createVerticalStrut(15));

		Box bRowTT4 = Box.createHorizontalBox();
		bRowTT4.add(btnThanhToan = new JButton("Thanh Toán"));
		bRowTT4.add(Box.createHorizontalStrut(50));
		bRowTT4.add(btnHuyThanhToan = new JButton("Hủy Thanh Toán"));
		panelThanhToan.add(bRowTT4);
		panelThanhToan.add(Box.createVerticalStrut(15));

		lblTongCong.setPreferredSize(lblTongSoLuongSP.getPreferredSize());
		lblTienNhan.setPreferredSize(lblTongSoLuongSP.getPreferredSize());
		lblTienGiam.setPreferredSize(lblTongSoLuongSP.getPreferredSize());
		lblTienPhaiThanhToan.setPreferredSize(lblTongSoLuongSP.getPreferredSize());
		lblTienTra.setPreferredSize(lblTongSoLuongSP.getPreferredSize());

		txtTongCong.setEditable(false); 
		txtTienTra.setEditable(false);
		txtTongSoLuongSP.setEditable(false);
		txtTienGiam.setEditable(false);
		txtTienPhaiThanhToan.setEditable(false);
		txtTienPhaiThanhToan.setBackground(Color.green);

		JPanel panelRight;
		add(panelRight = new JPanel());
		int wPR = width * 1 / 3, hPR = height;
		panelRight.setPreferredSize(new Dimension(wPR, hPR));
		panelRight.setLayout(new BoxLayout(panelRight, BoxLayout.Y_AXIS));
		panelRight.setBackground(new Color(147, 190, 221));

		// Panel Search Product
		panelRight.add(panelTimKiemSP = new JPanel());
		panelTimKiemSP.setLayout(new BoxLayout(panelTimKiemSP, BoxLayout.Y_AXIS));
		panelTimKiemSP.setBorder(BorderFactory.createTitledBorder("Tìm Kiếm Sản Phẩm"));
		panelTimKiemSP.setPreferredSize(new Dimension(wPR, hPR / 6));
		panelTimKiemSP.setBackground(new Color(147, 190, 221));
		
		panelTimKiemSP.add(Box.createVerticalStrut(15));
		Box bRowTKSP1 = Box.createHorizontalBox();
		bRowTKSP1.add(lblTenSP = new JLabel("Tên Sản Phẩm"));
		bRowTKSP1.add(Box.createHorizontalStrut(10));
		bRowTKSP1.add(txtTenSP = new JTextField(30));
		panelTimKiemSP.add(bRowTKSP1);
		panelTimKiemSP.add(Box.createVerticalStrut(15));

		Box bRowTKSP2 = Box.createHorizontalBox();
		listModelMauSac = new DefaultListModel();
		listMauSac = new JList<>(listModelMauSac);
		scrListMauSac = new JScrollPane(listMauSac, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		listModelKichCo = new DefaultListModel();
		listKichCo = new JList<>(listModelKichCo);
		scrListKichCo = new JScrollPane(listKichCo, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		bRowTKSP2.add(lblMauSac = new JLabel("Màu Sắc"));
		bRowTKSP2.add(Box.createHorizontalStrut(25));
		bRowTKSP2.add(scrListMauSac);
		bRowTKSP2.add(lblKichCo = new JLabel("Kích Cỡ"));
		bRowTKSP2.add(Box.createHorizontalStrut(10));
		bRowTKSP2.add(scrListKichCo);
		panelTimKiemSP.add(bRowTKSP2);
		panelTimKiemSP.add(Box.createVerticalStrut(15));
		
		lblMauSac.setPreferredSize(lblTenSP.getPreferredSize());
		lblKichCo.setPreferredSize(lblTenSP.getPreferredSize());
		
		Box bRowTKSP3 = Box.createHorizontalBox();
		bRowTKSP3.add(btnTimKiemSP = new JButton("Tìm Kiếm"));
		bRowTKSP3.add(Box.createHorizontalStrut(50));
		bRowTKSP3.add(btnLamMoi = new JButton("Làm Mới"));
		panelTimKiemSP.add(bRowTKSP3);
		panelTimKiemSP.add(Box.createVerticalStrut(15));

		tblModelTimKiemSP = new DefaultTableModel(new Object[] {"Mã", "Tên", "Kích Cỡ", "Màu Sắc", "Giá Bán" }, 0);	
		tblTimKiemSP = new JTable(tblModelTimKiemSP);
		scrTBLTimKiemSP = new JScrollPane(tblTimKiemSP, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrTBLTimKiemSP.setPreferredSize(new Dimension(wPR, hPR * 4 / 6));
		panelRight.add(scrTBLTimKiemSP);
		
		panelRight.add(btnThemVaoHoaDon = new JButton("Thêm Vào Hóa Đơn"));
		
		// Event
		// Action Listener
		btnTimKiemSP.addActionListener(this);
		btnTaoKH.addActionListener(this);
		btnThanhToan.addActionListener(this);
		btnHuyThanhToan.addActionListener(this);
		btnTimKiemSP.addActionListener(this);
		btnLamMoi.addActionListener(this);
		btnThemVaoHoaDon.addActionListener(this);
		// Key Listener
		tblCTHD.addKeyListener(this);
		txtTienNhan.addKeyListener(this);
		// Mouse Listener
		tblCTHD.addMouseListener(this);
	}

	private void updateOrder() {
		int soLuongSP = 0;
		double tongTien = 0;
		for(int i = 0; i < tblCTHD.getRowCount(); i++) {
			soLuongSP += Integer.parseInt(tblCTHD.getValueAt(i, 2).toString());
			tongTien += Double.parseDouble(tblCTHD.getValueAt(i, 4).toString());
		}
		txtTongSoLuongSP.setText("" + String.valueOf(soLuongSP));
		txtTongCong.setText("" + String.valueOf(tongTien));
	}
	
	private void removeAllRow(DefaultTableModel tableModel) {
		while(tableModel.getRowCount() > 0) {
			tableModel.removeRow(0);
		}
	}
	
	private boolean checkInputData() {
		String sDT = txtSDTKH.getText();
		String tenSP = txtTenSP.getText();
		String tienNhan = txtTienNhan.getText();
		if(!(sDT.length() > 0) && sDT.matches("^[0]{1}\\d{9,10}")) {
			JOptionPane.showMessageDialog(null, "Số Điện Bao Gồm 11 Số Và Bắt Đầu Bằng Số 0");
			return false;
		} else if(!(tenSP.length() > 0) && tenSP.matches("^[A-Za-z]{2,6}(\\\\s[A-Za-z0-9]*)*")){
			JOptionPane.showMessageDialog(null, "Tên Sản Phẩm Bắt Đầu Bằng Chữ Và Không Có Kí Tự Đặt Biệt");
			return false;
		} else if(!(tienNhan.length() > 0) && tienNhan.matches("^[1-9][0-9]*")) {
			JOptionPane.showMessageDialog(null, "Tiền Nhận Không Được Rỗng Và Không Được Chứa Chữ Và Phải Lớn Hơn 1000");
			return false;
		}
		return true;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(btnTimKiemKH)) {
			timKH();
		} else if(o.equals(btnTaoKH)) {
			new Form_TaoKhachHang().setVisible(true);
		} else if(o.equals(btnTimKiemSP)) {
			timSP();
		} else if(o.equals(btnLamMoi)) {
			lamMoiTimKiemSP();
		} else if(o.equals(btnThemVaoHoaDon)) {
			themVaoHoaDon();
		} else if(o.equals(btnThanhToan)) {
			try {
				thanhToanAction();
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if(o.equals(btnHuyThanhToan)) {
			huyThanhToan();
		}
	}

	private void lamMoiTimKiemSP() {
		// TODO Auto-generated method stub
		txtTenSP.setText("");
		listKichCo.setSelectedIndex(0);
		listMauSac.setSelectedIndex(0);
		removeAllRow(tblModelTimKiemSP);
	}

	private void timSP() {
		// TODO Auto-generated method stub
		String tenSP = txtTenSP.getText();
		
		String sMauSac = "";
		String[] sMauSacArr = null;
		String rsMauSac = "";
		for (Object mauSac : listMauSac.getSelectedValues()) {
			 sMauSac += "Mau sac = " + mauSac + ", ";
        }
		sMauSacArr = sMauSac.split("\\,");
		rsMauSac = rsMauSac.join(" and ", sMauSacArr);
		
		String sKichCo = "";
		String[] sKichCoArr = null;
		String rsKichCo = "";
		for (Object kichCo : listKichCo.getSelectedValues()) {
			 sMauSac += kichCo + ", ";
       }
		sKichCoArr = sMauSac.split("\\,");
		rsKichCo = rsMauSac.join(" and ", sKichCoArr);
		
		// Seach in DataBase
		
		
	}

	private void timKH() {
		// TODO Auto-generated method stub
		String sDT = txtSDTKH.getText();
		
		txtNgaySinhKH.setText("");
		txtTenKH.setText("");
		
		// Chưa phân cấp khách hàng
		
	}

	
	
	private void themVaoHoaDon() {
		// TODO Auto-generated method stub
		
		// Demo
		String sl = JOptionPane.showInputDialog(null, "SL");
		String Gia = JOptionPane.showInputDialog(null, "Gia");
		
//		int row = tblTimKiemSP.getSelectedRow();
//		String maSP = tblTimKiemSP.getValueAt(row, 0).toString();
//		String tenSP = tblTimKiemSP.getValueAt(row, 1).toString();
//		String soLuong = JOptionPane.showInputDialog(null, "Nhập Số Lượng: ");
//		String donGia = tblTimKiemSP.getValueAt(row, 4).toString();
		
		Object[] rowHD = {"1", "1", sl, Gia, String.valueOf(Double.parseDouble(sl) * Double.parseDouble(Gia) )};
		
		tblModelCTHD.addRow(rowHD);
		
		updateOrder();
	}
	
	private void huyThanhToan() {
		// TODO Auto-generated method stub
		txtSDTKH.setText("");
		txtNgaySinhKH.setText("");
		txtTenKH.setText("");
		txtCapDoKH.setText("");
		
		txtTenSP.setText("");
		listKichCo.setSelectedIndex(0);
		listMauSac.setSelectedIndex(0);
		removeAllRow(tblModelTimKiemSP);
		
		txtTienNhan.setText("0");
		txtTienTra.setText("0");
	}

	private void thanhToanAction() throws DocumentException {
		// TODO Auto-generated method stub
		Double tienNhan = Double.parseDouble(txtTienNhan.getText());
		Double tongCong = Double.parseDouble(txtTongCong.getText());
		Double tienTra = Double.parseDouble(txtTienTra.getText());
		
		String SDTKH = txtSDTKH.getText();
		
		if(tienTra >=0 && tienNhan >= tongCong) {
			String maHoaDon = " ";
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
			SimpleDateFormat sdfID = new SimpleDateFormat("ddMMyyyyhhmm");
			String time = sdf.format(new Date());
			int rand = (int)(Math.floor(Math.random() * 100000) + 899999);
			maHoaDon += sdfID.format(new Date())  + String.valueOf(rand);
			
			// Save data base
			for(int i = 0; i < tblCTHD.getRowCount(); i++) {
				String maSP = tblCTHD.getValueAt(i, 0).toString();
				String tenSP = tblCTHD.getValueAt(i, 1).toString();
				String soLuong = tblCTHD.getValueAt(i, 2).toString();
				String donGia = tblCTHD.getValueAt(i, 3).toString();
				
				// Save
				
			}
			
			// Print Order Action
			int option = JOptionPane.showConfirmDialog(null, "Bạn có muốn in hóa đơn");
			
			if(option == JOptionPane.YES_OPTION) {
				OrderSample os = new OrderSample();
				
				// Order Info include order ID, Sale ID, create Date
				os.addOrderInfo(time + " ", maHoaDon + " ", "1");
				
				for(int i = 0; i < tblCTHD.getRowCount(); i++) {
					String maSP = tblCTHD.getValueAt(i, 0).toString();
					String tenSP = tblCTHD.getValueAt(i, 1).toString();
					String soLuong = tblCTHD.getValueAt(i, 2).toString();
					String donGia = tblCTHD.getValueAt(i, 3).toString();
					String thanhTien = tblCTHD.getValueAt(i, 4).toString();
					
					// Print order Detail
					os.addCellOrderDetail(tenSP, maSP, soLuong, donGia, thanhTien);
				}
				// Print order Purchase Info
				os.addPurchaseInfo(txtTongCong.getText()+" ", txtTienNhan.getText() + " ", txtTienTra.getText() + " ");
				// Print Order
				os.printOrder(maHoaDon + " ");
				
				JOptionPane.showMessageDialog(null, "Okie");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Tiền Nhận Không Được Bé Hơn Tổng Cộng");
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getKeyCode();
		if(o.equals(KeyEvent.VK_DELETE)) {
			int row = tblCTHD.getSelectedRow();
			tblModelCTHD.removeRow(row);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		
		if(o.equals(txtTienNhan)) {
			String tongCong= txtTongCong.getText();
			String tienNhan = txtTienNhan.getText();
			double tienTra = Double.parseDouble(tienNhan) - Double.parseDouble(tongCong);
			txtTienTra.setText("" + tienTra);
		} 
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Object o =e.getSource();
		int row = tblCTHD.getSelectedRow();
		if(o.equals(tblCTHD)) {
			if(e.getClickCount() == 1) {
				String soLuong = JOptionPane.showInputDialog(null, "Số Lượng Sản Phẩm :");
				
				tblCTHD.setValueAt(soLuong, row, 2);
				
				updateOrder();
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		Object o =e.getSource();
		int row = tblCTHD.getSelectedRow();
		if(o.equals(tblCTHD)) {
			if(e.isPopupTrigger()) {
				String soLuong = JOptionPane.showInputDialog(null, "Số Lượng Sản Phẩm okie 1 :");
				
//				tblCTHD.setValueAt(soLuong, row, 2);
//				
//				updateOrder();
			}
		
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		Object o =e.getSource();
		int row = tblCTHD.getSelectedRow();
		if(o.equals(tblCTHD)) {
			if(e.isPopupTrigger()) {
				String soLuong = JOptionPane.showInputDialog(null, "Số Lượng Sản Phẩm okie 1 :");
				
				tblCTHD.setValueAt(soLuong, row, 2);
				
				updateOrder();
			}
		}
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
