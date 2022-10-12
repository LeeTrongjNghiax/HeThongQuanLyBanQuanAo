package paneldemo;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class panelSanPham extends JFrame implements ActionListener{

	private JTextField txtMasanpham;
	private JTextField txtTensanpham;
	private JComboBox cbbchatlieu;
	private JTextField txtkieudang;
	private JComboBox cbbgioitinh;
	private JComboBox cbbdonvi;
	private JComboBox cbbkichco;
	private JTextField txtsoluong;
	private JTextField txtNhasx;
	private JTextField txtSdtnsx;
	private JTextField txtEmailnsx;
	private JTextField txtThuonghieu;
	private JTextField txtnuocthuonghieu;
	private JTextArea txtmota;
	private Button btnchonfileButton;
	private JLabel lbhinhanhsanpham;
	private JScrollPane scrollSanPham;
	private JTable tableSp;
	private DefaultTableModel modelSanpham;
	int sizelogo = 130;
	private JLabel lbanhsanpham;
	private JPanel panelAnh;
	private ImageIcon imgSanpham;
	private ImageIcon imgSanphamnhap;
	private JPanel panelbtn;
	private JButton btnThem;
	private JButton btnXoa;
	private JButton btnCapnhap;
	private JButton btnTimkiem;
	private JButton btnsua;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int with = screenSize.width;
	int height = screenSize.height;
	private JTextField txtgiaban;
	private JLabel lbkieudang;
	private JComboBox cbbkieudang;
	private JComboBox cbbmausac;
	private JTextField txtTenThuonghieu;
	public panelSanPham() {
		setSize(with, height);
		setLocationRelativeTo(null);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panelNhanVienchild();
		
	}
	private void panelNhanVienchild() {
		JPanel panelNhap = new JPanel();
		panelNhap.setLayout(new BorderLayout());
		panelNhap.setBackground(new Color(51,133,217));
		Box boxleft = Box.createVerticalBox();
		Box boxright = Box.createVerticalBox();
		add(panelNhap, BorderLayout.CENTER);
		panelNhap.add(boxright,BorderLayout.NORTH);
		//Khai Báo Các Box Trong box right
		Box bright1,bright2,bright3,bright4,bright5,bright6,bright7,bright8;
		boxright.add(Box.createVerticalStrut(10));
		
		//box right 1
		boxright.add(bright1=boxleft.createHorizontalBox());
		JLabel maSanphamJLabel = new JLabel("Mã Sản Phẩm: ");
		txtMasanpham = new JTextField();
		txtMasanpham.setPreferredSize(new Dimension(200, 20));
		bright1.add(maSanphamJLabel);
		bright1.add(txtMasanpham);
		JLabel tenSanphamJLabel = new JLabel("Tên Sản Phẩm: ");
		txtTensanpham = new JTextField();
		bright1.add(tenSanphamJLabel);
		bright1.add(txtTensanpham);
		JLabel lbloaiSanpham = new JLabel("Loại Sản Phẩm: ");
		JComboBox cbbloaisp = new JComboBox<>();
		cbbloaisp.setPreferredSize(new Dimension(100,20));
		bright1.add(lbloaiSanpham);
		bright1.add(cbbloaisp);
		txtTensanpham.setPreferredSize(new Dimension(200, 20));
		boxright.add(Box.createVerticalStrut(10));
		//end box 1
		
		
		
		
		//box right2
		boxright.add(bright2 = Box.createHorizontalBox());
//		JLabel lbChatlieu = new JLabel("Chất Liệu: ");
//		cbbchatlieu  = new JComboBox<>();
//		cbbchatlieu.setPreferredSize(new Dimension(100, 20));
		
//		bright2.add(lbChatlieu);
//		bright2.add(cbbchatlieu);
		JLabel lbgiaban = new JLabel("Giá Bán");
		txtgiaban = new JTextField();
		bright2.add(lbgiaban);
		bright2.add(txtgiaban);
//		txtgiaban.setPreferredSize(new Dimension(1,4));
		bright2.add(boxleft.createHorizontalStrut(15));
		JLabel lbkichco = new JLabel("Kích Cỡ: ");
		cbbkichco = new JComboBox();
		bright2.add(lbkichco);
		bright2.add(cbbkichco);
		cbbkichco.setPreferredSize(new Dimension(90, 20));
		bright2.add(boxleft.createHorizontalStrut(15));
//		JLabel lbkieudang = new JLabel("Kiểu Dáng: ");
//		txtkieudang = new JTextField();
//		bright2.add(lbkieudang);
//		bright2.add(txtkieudang);
		JLabel lbsoluong = new JLabel("Số Lượng: ");
		txtsoluong = new JTextField();
		bright2.add(lbsoluong);
		bright2.add(txtsoluong);
		bright2.add(boxleft.createHorizontalStrut(15));
		JLabel lbgioitinh = new JLabel("Giới Tính: ");
		cbbgioitinh  = new JComboBox<>();
		bright2.add(lbgioitinh);
		bright2.add(cbbgioitinh);
		cbbgioitinh.setPreferredSize(new Dimension(90, 20));
		
		
		
		
		
		//end box 2
		boxright.add(boxleft.createVerticalStrut(10));
		//box right3
		boxright.add(bright3 = Box.createHorizontalBox());
		
		
		
//		JLabel lbsoluong = new JLabel("Số Lượng: ");
//		txtsoluong = new JTextField();
//		JLabel lbsoluong = new JLabel("Số Lượng: ");
//		txtsoluong = new JTextField();
//		bright3.add(lbsoluong);
//		bright3.add(txtsoluong);
		lbkieudang = new JLabel("Kiểu Dáng: ");
		cbbkieudang = new JComboBox();
		bright3.add(lbkieudang);
		bright3.add(cbbkieudang);
		
		
		JLabel lbmausac = new JLabel("Màu Sắc: ");
		cbbmausac = new JComboBox();
		bright3.add(lbmausac);
		bright3.add(cbbmausac);
		
		
		JLabel lbchatlieu = new JLabel("Chất Liệu: ");
		cbbchatlieu = new JComboBox();
		bright3.add(lbchatlieu);
		bright3.add(cbbchatlieu);

		
		JLabel lbdonvi = new JLabel("Đơn Vị: ");
		cbbdonvi = new JComboBox();
		bright3.add(lbdonvi);
		bright3.add(cbbdonvi);
		cbbdonvi.setPreferredSize(new Dimension(40, 20));
		//end box 3
		
		
		//box right 4
		boxright.add(Box.createVerticalStrut(10));
		boxright.add(bright4=Box.createHorizontalBox());

		JLabel lbtennsx = new JLabel("Tên Nhà Sản Xuất: ");
		txtNhasx = new JTextField();
		JLabel lbSdtnsx = new JLabel("Số Điện Thoại Nhà Sản Xuất: ");
		txtSdtnsx = new JTextField();
		JLabel lbEmailnsx = new JLabel("Email Nhà Sản Xuất: ");
		txtEmailnsx = new JTextField();
		bright4.add(lbtennsx);
		bright4.add(txtNhasx);
		bright4.add(lbSdtnsx);
		bright4.add(txtSdtnsx);
		bright4.add(lbEmailnsx);
		bright4.add(txtEmailnsx);
		//end box 4
		
		
		
		//box right 5
		boxright.add(Box.createVerticalStrut(10));
		boxright.add(bright5=Box.createHorizontalBox());
		JLabel lbnuocthuonghieu = new JLabel("Nước Thương Hiệu: ");
		txtnuocthuonghieu = new JTextField();
		JLabel lbtenthuonghieu = new JLabel("Tên Thương Hiệu: ");
		txtTenThuonghieu = new JTextField();
		
		bright5.add(lbnuocthuonghieu);
		bright5.add(txtnuocthuonghieu);
		bright5.add(lbtenthuonghieu);
		bright5.add(txtTenThuonghieu);
		btnchonfileButton = new Button("Chọn File Ảnh");
		
	
		bright5.add(btnchonfileButton);
		btnchonfileButton.setPreferredSize(new Dimension(100, 20));
		
		//end box 5
		
		
		//box right 6
		Box boxrightcenter = Box.createVerticalBox();
		boxrightcenter.add(boxleft.createVerticalStrut(20));
		boxrightcenter.add(bright6 = Box.createHorizontalBox());
		JLabel lbmota = new JLabel("Mô Tả Sản Phẩm: ");
		txtmota = new JTextArea();
		bright6.add(lbmota);
		bright6.add(txtmota);
		
		panelNhap.add(boxrightcenter, BorderLayout.CENTER);
		//end box 6
		//Box Chức Năng
		
		Box boxchucnang;
		boxrightcenter.add(boxleft.createVerticalStrut(10));
		boxchucnang = Box.createVerticalBox();
		boxrightcenter.add(boxchucnang);
		panelbtn = new JPanel();
		btnThem = new JButton("Thêm");
		btnXoa = new JButton("Xoá");
		btnCapnhap = new JButton("Cập Nhập");
		btnTimkiem = new JButton("Tìm Kiếm");
		btnsua = new JButton("Sửa");
			
		panelbtn.setLayout(new BoxLayout(panelbtn, BoxLayout.X_AXIS));
		panelbtn.add(btnThem);
		panelbtn.add(Box.createHorizontalStrut(20));
		panelbtn.add(btnXoa);
		panelbtn.add(Box.createHorizontalStrut(20));
		panelbtn.add(btnCapnhap);
		panelbtn.add(Box.createHorizontalStrut(20));
		panelbtn.add(btnTimkiem);
		panelbtn.add(Box.createHorizontalStrut(20));
		panelbtn.add(btnsua);
		panelbtn.setBackground(new Color(51,133,217));
		
		boxchucnang.add(panelbtn);
		boxright.add(boxleft.createVerticalStrut(10));
		//End Box
		modelSanpham = new DefaultTableModel();
		modelSanpham.addColumn("Mã Sản Phẩm");
		modelSanpham.addColumn("Tên Sản Phẩm");
		modelSanpham.addColumn("Loại Sản Phẩm");
		modelSanpham.addColumn("Giá Bán");
		modelSanpham.addColumn("Kích Cỡ");
		modelSanpham.addColumn("Số lượng");
		modelSanpham.addColumn("Kiểu Dáng");
		modelSanpham.addColumn("Chất liệu");
		modelSanpham.addColumn("Màu");
		modelSanpham.addColumn("Đơn Vị");
		modelSanpham.addColumn("Tên Nhà Sản Xuất");
		modelSanpham.addColumn("Số Điện Thoại Nhà sản Xuất");
		modelSanpham.addColumn("Email liên lạc");
		modelSanpham.addColumn("Nước Thương Hiệu");
		modelSanpham.addColumn("Tên Thương Hiệu");
		tableSp = new JTable(modelSanpham);
		scrollSanPham = new JScrollPane(tableSp);
		scrollSanPham.setPreferredSize(new Dimension(30, 300));
		tableSp.setFillsViewportHeight(true);
		add(scrollSanPham,BorderLayout.SOUTH);
		// Xong Panel Nhap
		//panel anh
		panelAnh = new JPanel();
		panelAnh.setLayout(new BorderLayout());
		//Ảnh sản Phẩm
		lbanhsanpham = new JLabel();
		lbhinhanhsanpham = new JLabel();
//		lbhinhanhsanpham
		lbhinhanhsanpham.setBorder(BorderFactory.createLineBorder(Color.black));
		panelAnh.add(lbanhsanpham,BorderLayout.NORTH);
		panelAnh.add(lbhinhanhsanpham,BorderLayout.CENTER);
		panelAnh.setPreferredSize(new Dimension(500, 300));
		add(panelAnh,BorderLayout.EAST);

		btnThem.setPreferredSize(btnTimkiem.getPreferredSize());
		btnXoa.setPreferredSize(btnTimkiem.getPreferredSize());
		btnCapnhap.setPreferredSize(btnTimkiem.getPreferredSize());
		lbmota.setPreferredSize(lbnuocthuonghieu.getPreferredSize());
		maSanphamJLabel.setPreferredSize(lbnuocthuonghieu.getPreferredSize());
		lbtennsx.setPreferredSize(lbnuocthuonghieu.getPreferredSize());
		lbgiaban.setPreferredSize(lbnuocthuonghieu.getPreferredSize());
		lbkieudang.setPreferredSize(lbnuocthuonghieu.getPreferredSize());
		btnchonfileButton.addActionListener(this);

	}
	public static void main(String[] args) {
		new panelSanPham().setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object  object = e.getSource();
		if (object.equals(btnchonfileButton)) {
			JFileChooser fileChooser = new JFileChooser();
			FileNameExtensionFilter imgfilter = new FileNameExtensionFilter("Hình Ảnh", "jpg","png");
			fileChooser.setFileFilter(imgfilter);
			fileChooser.setMultiSelectionEnabled(false);
			int x = fileChooser.showDialog(this, "Chọn Ảnh");
			if (x==fileChooser.APPROVE_OPTION) {
				File file = fileChooser.getSelectedFile();
				
				
				lbhinhanhsanpham.setText("");
				imgSanpham = new ImageIcon(file.getAbsolutePath());
				Image imgImage = imgSanpham.getImage();
				Image imgspImage = imgImage.getScaledInstance(lbhinhanhsanpham.getWidth(),lbhinhanhsanpham.getHeight(), Image.SCALE_FAST);
				imgSanphamnhap = new ImageIcon(imgspImage);
				lbhinhanhsanpham.setIcon(imgSanphamnhap);
				System.out.println(fileChooser.getSelectedFile());
				System.out.println(file.getAbsolutePath());
				
			}
		}
		
	}
}
