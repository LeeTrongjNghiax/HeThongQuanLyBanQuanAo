package paneldemo;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class panelNhanVien extends JFrame implements ActionListener{
	private JTextField txtdiachi;
	private JComponent txtMa;
	private JTextField txtten;
	private JTextField txtEmail;
	private Component txtsdtkhachhang;
	private JDateChooser ngaysinh;
	private Button btnthem;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int with = screenSize.width;
	int height = screenSize.height;
	public panelNhanVien() {
		setSize(with,height);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panelNhanViencon();
	}
	private void panelNhanViencon() {
		Box b = Box.createVerticalBox();
		Box bcenter = Box.createHorizontalBox();
		
		Box b1,b2,b3,b4,b5,bcenter1,bcenter2;
		b.add(Box.createVerticalStrut(10));
		
		b.add(b1 = Box.createHorizontalBox());
		JLabel lbMa = new JLabel("Mã Khách hàng: ");
		txtMa = new JTextField();
		b1.add(lbMa);
		b1.add(txtMa);
		
		
		b.add(Box.createVerticalStrut(10));
		
		
		JLabel lbten = new JLabel("Tên Khách hàng: ");
		txtten = new JTextField();
		b1.add(lbten);
		b1.add(txtten);
		b.add(Box.createVerticalStrut(10));
		JLabel lbsdt = new JLabel("Số Điện Thoại: ");
		txtsdtkhachhang = new JTextField();
		b1.add(lbsdt);
		b1.add(txtsdtkhachhang);
		
		
		
		b.add(b2 = Box.createHorizontalBox());
		JLabel lbngaysinh = new JLabel("Ngày Sinh: ");
		b2.add(lbngaysinh);
		b2.add(ngaysinh = new JDateChooser());
		b2.add(Box.createHorizontalStrut(20));
		JLabel lbemail = new JLabel("Email: ");
		txtEmail = new JTextField();
		b2.add(lbemail);
		b2.add(txtEmail);
//		txtEmail.setPreferredSize(new Dimension(40, 10));
		JLabel lbgioitinh = new JLabel("Giới Tính: ");
		JComboBox Gioitinhbox = new JComboBox<>();
		Gioitinhbox.setPreferredSize(new Dimension(100,20));
		Gioitinhbox.addItem("Nam");
		Gioitinhbox.addItem("Nữ");
		b2.add(lbgioitinh);
		b2.add(Gioitinhbox);
		
		
		b.add(Box.createVerticalStrut(10));
		b.add(b3 = Box.createHorizontalBox());
		JLabel thanhphoJLabel = new JLabel("Thành Phố: ");
		JComboBox thanhphoBox = new JComboBox();
		thanhphoBox.setPreferredSize(new Dimension(100,20));
		b3.add(thanhphoJLabel);
		b3.add(thanhphoBox);
		JLabel lbquan = new JLabel("Quận: ");
		JComboBox cbbquanBox = new JComboBox();
		cbbquanBox.setPreferredSize(new Dimension(100,20));
		b3.add(lbquan);
		b3.add(cbbquanBox);
		JLabel lbphuong = new JLabel("Phường: ");
		JComboBox cbbphuong = new JComboBox();
		cbbphuong.setPreferredSize(new Dimension(100,20));
		b3.add(lbphuong);
		b3.add(cbbphuong);
		JLabel lbdiachi = new JLabel("Địa Chỉ: ");
		txtdiachi = new JTextField();
		b3.add(lbdiachi);
		b3.add(txtdiachi);
		
		b.add(Box.createVerticalStrut(10));
		b.add(b4 = Box.createHorizontalBox());
		JLabel timkiemJLabel = new JLabel("Tìm Kiếm Khách Hàng: ");
		JTextField timkiemField = new JTextField();
		timkiemField.setPreferredSize(new Dimension(100,20));
		b4.add(timkiemJLabel);
		b4.add(timkiemField);
		add(b,BorderLayout.NORTH);
		
		b.add(Box.createVerticalStrut(10));
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Mã Khách hàng");
		model.addColumn("Tên Khách hàng");
		model.addColumn("Số Điện Thoại");
		model.addColumn("Ngày Sinh");
		model.addColumn("Email");
		model.addColumn("Giới Tính");
		model.addColumn("Thành Phố");
		model.addColumn("Quận");
		model.addColumn("Địa Chỉ");
		JTable table = new JTable(model);
		JScrollPane scrolltable = new JScrollPane(table);
		bcenter.add(bcenter1 = Box.createVerticalBox());
		bcenter1.add(scrolltable);
		scrolltable.setPreferredSize(new Dimension(800, 200));
		
		bcenter.add(bcenter2 = Box.createVerticalBox());
		btnthem = new Button("Thêm");
		Button btncapnhap = new Button("Cập Nhập");
		Button btnxoa = new Button("Xoá");
		
		btnthem.setPreferredSize(new Dimension(20,10));
		bcenter2.add(btnthem);
		bcenter2.add(Box.createVerticalStrut(10));
		bcenter2.add(btncapnhap);
		bcenter2.add(Box.createVerticalStrut(10));
		bcenter2.add(btnxoa);
		add(bcenter,BorderLayout.CENTER);
		
		
		
		lbMa.setPreferredSize(timkiemJLabel.getPreferredSize());
		thanhphoJLabel.setPreferredSize(timkiemJLabel.getPreferredSize());
		lbngaysinh.setPreferredSize(timkiemJLabel.getPreferredSize());
		
		btnthem.addActionListener(this);
		
	}
	public static void main(String[] args) {
		new panelNhanVien().setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();
		if (object.equals(btnthem)) {
			//xác định Dạng Ngày
			SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
			String d1  = ((JTextField)ngaysinh.getDateEditor().getUiComponent()).getText();
			//Dùng date JDK lấy ngày
			java.util.Date ngayDate = ngaysinh.getDate();
			//Định Dạng Ngày ra chuỗi
			String date1 = sp.format(ngayDate);
			//Lấy Ngày theo chuỗi
			String d01[] = date1.split("-");
			//parse theo Date SQL
			Date ngaDate = new Date(Integer.parseInt(d01[0])-1900, Integer.parseInt(d01[1])-1,Integer.parseInt(d01[2]));
			Date ngaDate1 = Date.valueOf(date1);
			System.out.println(date1);//2022-10-14
			System.out.println(ngaDate);//2022-10-14
			System.out.println("Ngày Dùng value of"+ngaDate1);//2022-10-14
			System.out.println(d1);//14 thg 10, 2022
			for (int i=0;i<d01.length;i++) {
				System.out.println(d01[i]);//2022
				//10 
				//14
				
			}
			
		}
	}

}
