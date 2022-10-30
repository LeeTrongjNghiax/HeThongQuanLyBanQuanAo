
package GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class GUI_ThongTinCaNhan extends JPanel implements ActionListener{
	private JTextField txtdiachi;
	private JComponent txtMa;
	private JTextField txtten;
	private JTextField txtEmail;
	private Component txtSDTKH;
	private JDateChooser ngaysinh;
	private Button btnsua,btnluu;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int with = screenSize.width;
	int height = screenSize.height;
	private ImageIcon imgImage;
	
	public GUI_ThongTinCaNhan() {
		setBackground(new Color(147,190,221));
		panelNhanViencon();
		setVisible(true);
	}
	
	private void panelNhanViencon() {
		setLayout(new BorderLayout());
		Box b = Box.createVerticalBox();
		Box bcenter = Box.createHorizontalBox();
		Box b1,b2,b3,b4,b5,b6,b7,b8,bcenter1,bcenter2,boxlb;

		JPanel pnThongTinCaNhan = new JPanel();
		JPanel pnThongTinCaNhanTitle = new JPanel();
		pnThongTinCaNhan.setLayout(new FlowLayout());
		JLabel lbThongTinCaNhan = new JLabel("Thông Tin Nhân Viên");
		lbThongTinCaNhan.setFont(new Font("Verdana",Font.BOLD,30));
		JLabel lbAnhCaNhan = new JLabel("");
		lbAnhCaNhan.setSize(new Dimension(400, 400));
		pnThongTinCaNhanTitle.add(lbThongTinCaNhan);
		pnThongTinCaNhan.add(lbAnhCaNhan);
		lbAnhCaNhan.setBorder(BorderFactory.createTitledBorder("Ảnh Nhân Viên"));
		lbAnhCaNhan.setBorder(BorderFactory.createLineBorder(Color.black));
		b.add(pnThongTinCaNhanTitle);
		b.add(pnThongTinCaNhan);
		b.add(Box.createVerticalStrut(10));
		b.setBorder(BorderFactory.createTitledBorder("Thông Tin Cá Nhân"));
		
		b.add(b1 = Box.createHorizontalBox());			
		JLabel lbten = new JLabel("Tên Nhân Viên: ");
		txtten = new JTextField();
		b1.add(lbten);
		b1.add(txtten);
		b.add(Box.createVerticalStrut(10));
		
		JLabel lbgioitinh = new JLabel("Giới Tính: ");
		JComboBox Gioitinhbox = new JComboBox<>();
		Gioitinhbox.setPreferredSize(new Dimension(100,20));
		Gioitinhbox.addItem("Nam");
		Gioitinhbox.addItem("Nữ");
		b1.add(lbgioitinh);
		b1.add(Gioitinhbox);
		
		JLabel lbdantoc = new JLabel("Dân Tộc: ");
		JComboBox cbbdantoc = new JComboBox<>();
		cbbdantoc.setPreferredSize(new Dimension(100,20));
		cbbdantoc.addItem("kinh");
		cbbdantoc.addItem("Nữ");
		b1.add(lbdantoc);
		b1.add(cbbdantoc);
		
		b.add(Box.createVerticalStrut(20));
		b.add(b2 = Box.createHorizontalBox());
		JLabel lbsdt = new JLabel("Số Điện Thoại: ");
		txtSDTKH = new JTextField();
		b2.add(lbsdt);
		b2.add(txtSDTKH);
		
		JLabel lbngaysinh = new JLabel("Ngày Sinh: ");
		b2.add(lbngaysinh);
		b2.add(ngaysinh = new JDateChooser());
		b2.add(Box.createHorizontalStrut(20));
		JLabel lbemail = new JLabel("Email: ");
		txtEmail = new JTextField();
		b2.add(lbemail);
		b2.add(txtEmail);
		
		b.add(Box.createVerticalStrut(20));
		b.add(b3 = Box.createHorizontalBox());
		JLabel lbthanhpho = new JLabel("Thành Phố: ");
		JComboBox cbbthanhpho = new JComboBox();
		cbbthanhpho.setPreferredSize(new Dimension(150,20));
		b3.add(lbthanhpho);
		b3.add(cbbthanhpho);
		JLabel lbquan = new JLabel("Quận: ");
		JComboBox cbbquanBox = new JComboBox();
		cbbquanBox.setPreferredSize(new Dimension(150,20));
		b3.add(lbquan);
		b3.add(cbbquanBox);
		JLabel lbphuong = new JLabel("Phường: ");
		JComboBox cbbphuong = new JComboBox();
		cbbphuong.setPreferredSize(new Dimension(150,20));
		b3.add(lbphuong);
		b3.add(cbbphuong);
		JLabel lbdiachi = new JLabel("Địa Chỉ: ");
		txtdiachi = new JTextField();
		b3.add(lbdiachi);
		b3.add(txtdiachi);
		
		b.add(Box.createVerticalStrut(20));
		b.add(b4 = Box.createHorizontalBox());
		JLabel lbcmnd = new JLabel("Chứng Minh Nhân dân: ");
		JTextField txtcmnd = new JTextField();
		b4.add(lbcmnd);
		b4.add(txtcmnd);
		JLabel lbngaycap = new JLabel("Ngày Cấp: ");
		JDateChooser DateNgayCap = new JDateChooser();
		b4.add(lbngaycap);
		b4.add(DateNgayCap);
		JLabel lbnoicap = new JLabel("Nơi Cấp: ");
		JTextField txtnoicap = new JTextField();
		b4.add(lbnoicap);
		b4.add(txtnoicap);
		
		b.add(Box.createVerticalStrut(30));
		b.add(b5 = Box.createVerticalBox());
		
	
		b5.add(Box.createVerticalStrut(20));
		b5.add(b6 = Box.createHorizontalBox());
		
		JLabel lbmaNV = new JLabel("Mã Nhân Viên: ");
		JTextField txtManv = new JTextField();
		
		b6.add(lbmaNV);
		b6.add(txtManv);
		JLabel lbngaylam = new JLabel("Ngày vào làm: ");
		JDateChooser DateNgayVaolam = new JDateChooser();
		b6.add(lbngaylam);
		b6.add(DateNgayVaolam);
		b5.add(Box.createVerticalStrut(10));
		b5.add(b7 = Box.createHorizontalBox());
		JLabel lbChucVu = new JLabel("Chức Vụ: ");
		JComboBox cbbchucvu = new JComboBox();
		b7.add(lbChucVu);
		b7.add(cbbchucvu);
		b7.add(Box.createHorizontalStrut(1000));
		b5.add(Box.createVerticalStrut(100));
		
		
		
		b.add(Box.createVerticalStrut(10));
		add(b,BorderLayout.CENTER);
		btnsua = new Button("Sửa");
		btnluu = new Button("Lưu");
	

		JPanel pnlsouth = new JPanel();
//		pnlsouth.setLayout(new BoxLayout(pnlsouth, BoxLayout.X_AXIS));
//		pnlsouth.setLayout(new bord);
		add(pnlsouth,BorderLayout.SOUTH);
//		pnlsouth.add(Box.createHorizontalStrut(550));
		pnlsouth.add(btnsua);
		btnsua.setPreferredSize(new Dimension(160, 45));
//		btnsua.setFont(new Font("Time new roman", 30, 30));
//		pnlsouth.add(Box.createHorizontalStrut(50));
		pnlsouth.add(btnluu);
		btnluu.setPreferredSize(new Dimension(160, 45));
//		pnlsouth.add(Box.createHorizontalStrut(550));
		
		
		pnlsouth.add(Box.createVerticalStrut(10));
		b5.setBackground(new Color(147,190,221));
		b5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		b5.setBorder(BorderFactory.createTitledBorder("Thông Tin Công Việc"));
		
		pnlsouth.setBackground(new Color(147,190,221));
		pnThongTinCaNhan.setBackground(new Color(147,190,221));
		pnThongTinCaNhanTitle.setBackground(new Color(147,190,221));
	
		lbmaNV.setPreferredSize(lbcmnd.getPreferredSize());
		lbsdt.setPreferredSize(lbcmnd.getPreferredSize());
		lbthanhpho.setPreferredSize(lbcmnd.getPreferredSize());
		lbChucVu.setPreferredSize(lbcmnd.getPreferredSize());
		lbten.setPreferredSize(lbcmnd.getPreferredSize());
		
		String imgString = "C:\\Users\\Admin\\Desktop\\imageIcon.jfif";
		imgImage = new ImageIcon(imgString);
		Image imgSanphamnhap = imgImage.getImage();
		Image imgspImage = imgSanphamnhap.getScaledInstance(lbAnhCaNhan.getWidth(),lbAnhCaNhan.getHeight(), Image.SCALE_FAST);
		imgImage = new ImageIcon(imgspImage);
		lbAnhCaNhan.setIcon(imgImage);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
//		Object object = e.getSource();
//		if (object.equals(btnthem)) {
//			//xác định Dạng Ngày
//			SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
//			String d1  = ((JTextField)ngaysinh.getDateEditor().getUiComponent()).getText();
//			//Dùng date JDK lấy ngày
//			java.util.Date ngayDate = ngaysinh.getDate();
//			//Định Dạng Ngày ra chuỗi
//			String date1 = sp.format(ngayDate);
//			//Lấy Ngày theo chuỗi
//			String d01[] = date1.split("-");
//			//parse theo Date SQL
//			Date ngaDate = new Date(Integer.parseInt(d01[0])-1900, Integer.parseInt(d01[1])-1,Integer.parseInt(d01[2]));
//			Date ngaDate1 = Date.valueOf(date1);
//			System.out.println(date1);//2022-10-14
//			System.out.println(ngaDate);//2022-10-14
//			System.out.println("Ngày Dùng value of"+ngaDate1);//2022-10-14
//			System.out.println(d1);//14 thg 10, 2022
//			for (int i=0;i<d01.length;i++) {
//				System.out.println(d01[i]);//2022
//				//10 
//				//14
//				
//			}
//			
//		}
	}

}
