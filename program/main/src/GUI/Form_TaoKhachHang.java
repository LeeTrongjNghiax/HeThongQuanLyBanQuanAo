package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class Form_TaoKhachHang extends JFrame implements ActionListener{
	private JLabel lblTieuDe, 
				lblMaKhachHang, lblTenKhachHang, lblGioiTinh, 
				lblSdt, lblNgaySinh, lblEmail;
	private JTextField txtMaKhachHang, txtTenKhachHang,txtEmail,txtSdt,txtNgaySinh;
	private JButton btnHuy, btnThem, btnLamMoi;
	private JComboBox<String> cbGioiTinh;
	private JDateChooser ngaySinh;

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int with = screenSize.width;
	int height = screenSize.height;

//	private DAO_KhachHang kh_dao;
	
	public static void main(String[] args) {
		new Form_TaoKhachHang().setVisible(true);
	}
	
	public Form_TaoKhachHang() {
		// TODO Auto-generated method stub
//		try {
//			connectDB.getInstance().connect();
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("Kết nối dữ liệu thành công");
//		}
		setSize(800	, 180);
		setUndecorated(true);
		setLocationRelativeTo(null);
		panelKhachHang();
	}
	
	private void panelKhachHang() {
		// TODO Auto-generated method stub
		JPanel panel = new JPanel();
		add(panel);
		
		panel.setBackground(new Color(147, 190, 221));
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		// Panel Input Info
		JPanel panelTop;
		panel.add(panelTop = new JPanel());
		panelTop.setBackground(new Color(147, 190, 221));
		panelTop.setLayout(new BoxLayout(panelTop, BoxLayout.Y_AXIS));
		
		// Header
		panelTop.add(Box.createVerticalStrut(20));
		Box bTitle = Box.createHorizontalBox();
		bTitle.add(lblTieuDe = new JLabel("LTNT SHOP"));
		lblTieuDe.setFont(new Font("Arial",Font.BOLD,20));
		panelTop.add(bTitle);
		panelTop.add(Box.createVerticalStrut(20));
		
		// ID Customer
		Box bRowKH1 = Box.createHorizontalBox();
		bRowKH1.add(Box.createHorizontalStrut(20));
		bRowKH1.add(lblMaKhachHang = new JLabel("Mã khách hàng: "));
		bRowKH1.add(txtMaKhachHang = new JTextField());

		// Name Customer
		bRowKH1.add(lblTenKhachHang = new JLabel("Tên khách hàng: "));
		bRowKH1.add(txtTenKhachHang = new JTextField());
		
		// Gender
		bRowKH1.add(lblGioiTinh =new JLabel("Giới tính"));
		bRowKH1.add(cbGioiTinh=new JComboBox<>());
		cbGioiTinh.addItem("Nữ");
		cbGioiTinh.addItem("Nam");
		bRowKH1.add(cbGioiTinh);
		bRowKH1.add(Box.createHorizontalStrut(20));
		panelTop.add(bRowKH1);
		panelTop.add(Box.createVerticalStrut(20));
		
		// Telephone
		Box bRowKH2 = Box.createHorizontalBox();
		bRowKH2.add(Box.createHorizontalStrut(20));
		bRowKH2.add(lblSdt = new JLabel("Số Điện Thoại: "));
		bRowKH2.add(txtSdt = new JTextField());
		
		// Birthday
		bRowKH2.add(Box.createHorizontalStrut(5));
		lblNgaySinh = new JLabel("Ngày Sinh: ");
		bRowKH2.add(lblNgaySinh);
		bRowKH2.add(ngaySinh = new JDateChooser());
		ngaySinh.setDateFormatString("yyyy-MM-dd");
		bRowKH2.add(Box.createHorizontalStrut(20));
		
		// Email
		bRowKH2.add(lblEmail = new JLabel("Email: "));
		bRowKH2.add(txtEmail = new JTextField());
		bRowKH2.add(Box.createHorizontalStrut(20));
		panelTop.add(bRowKH2);
		panelTop.add(Box.createVerticalStrut(20));
		
		// Panel Button 
		JPanel panelChucNang;
		panel.add(panelChucNang = new JPanel());
		panelChucNang.setBackground(new Color(147, 190, 221));
		panelChucNang.setLayout(new BoxLayout(panelChucNang, BoxLayout.Y_AXIS));
		
		Box bChucNang = Box.createHorizontalBox();
		bChucNang.add(btnThem = new JButton("Thêm"));
		bChucNang.add(Box.createHorizontalStrut(50));
		bChucNang.add(btnLamMoi = new JButton("Làm mới"));
		bChucNang.add(Box.createHorizontalStrut(50));
		bChucNang.add(btnHuy = new JButton("Hủy"));
		panelChucNang.add(bChucNang);
		panelChucNang.add(Box.createVerticalStrut(20));
		
		// Event
		btnThem.addActionListener(this);
		btnHuy.addActionListener(this);
		btnLamMoi.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(btnThem)) {
			
		} else if(o.equals(btnLamMoi)) {
			
		} else if(o.equals(btnHuy)) {
			this.dispose();
		}
	}
}
