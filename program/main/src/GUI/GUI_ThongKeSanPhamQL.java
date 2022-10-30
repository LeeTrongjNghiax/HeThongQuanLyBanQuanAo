package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import com.toedter.calendar.JDateChooser;

//import com.toedter.calendar.JDateChooser;
//
//import dao.ThongKeSLSP;
//import entity.ThongKeSoLuongSanPham;


public class GUI_ThongKeSanPhamQL extends JPanel implements ActionListener{
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int with = screenSize.width;
	int height = screenSize.height;

	private static JDateChooser Fromdate;
	private static JDateChooser Todate;
	private JButton btnTimTKDT;
	private JPanel pnEast;
	private JButton btnInTKDT;
	private JPanel pnbtn;
	private JTextField txttongHD;
	private JTextField txttongtien;
	private static JComboBox cbbdoituong;
//	static ThongKeSLSP tkdao = new ThongKeSLSP();
	private DefaultTableModel modelTK;
	private DefaultTableModel DmodelTopSp;
	private JPanel pnCenterTxt;
	private JLabel lbtonghd;
	private JTable tableTKDT;
	private JScrollPane scrollPane;
	private DefaultTableModel modelTopSP;
	private JTable tabletopSP;
	private JScrollPane sctopNV;
	private JTextField txtTenNV;
	//Image imgImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\Downloads\\logo (2)\\logo\\logo.jpg");
	public GUI_ThongKeSanPhamQL() {
//		setSize(with,height);
		panelTKcon();
	}
	private void panelTKcon() {
		// PANEL WEST
		setLayout(new BorderLayout());
		setBackground(new Color(147,190,222));
		JPanel pnWest = new JPanel();
		pnWest.setLayout(new BoxLayout(pnWest, BoxLayout.Y_AXIS));
		add(pnWest,BorderLayout.WEST);
		JPanel pncenHD = new JPanel();
		JPanel pncenTien = new JPanel();
		JPanel pnwChucNang = new JPanel();
		pnwChucNang.setBorder(BorderFactory.createTitledBorder("Chức Năng"));
		pnWest.add(pnwChucNang);
		JPanel pnwFrom = new JPanel();
		pnwChucNang.setLayout(new BoxLayout(pnwChucNang, BoxLayout.Y_AXIS));
		pnwChucNang.setBackground(new Color(147,190,222));

		JLabel lbfrom = new JLabel("Từ: ");
		pnwFrom.setLayout(new BoxLayout(pnwFrom,BoxLayout.X_AXIS));
		Fromdate = new JDateChooser();
		java.sql.Date date = new java.sql.Date(2017-1900, 12-1, 30);
		Fromdate.setDate(date);
		lbfrom.setBackground(new Color(147,190,222));
		pnwFrom.add(lbfrom);
		pnwFrom.add(Fromdate);
		pnwChucNang.add(pnwFrom);
		pnwFrom.setBackground(new Color(147,190,222));
		pnwChucNang.add(Box.createVerticalStrut(30));


		JPanel pwnTo = new JPanel();
		pwnTo.setLayout(new BoxLayout(pwnTo,BoxLayout.X_AXIS));
		JLabel lbto = new JLabel("Đến: ");
		Todate = new JDateChooser();
		java.sql.Date date1 = new java.sql.Date(2021-1900, 12-1, 30);
		Todate.setDate(date1);
		pwnTo.add(lbto);
		pwnTo.add(Todate);
		pwnTo.setBackground(new Color(147,190,222));
		pnwChucNang.add(pwnTo);
		pnwChucNang.setPreferredSize(new Dimension(250,200));
		pnwChucNang.add(Box.createVerticalStrut(30));


		JPanel pwnDoiTuong = new JPanel();
		pwnDoiTuong.setLayout(new BoxLayout(pwnDoiTuong,BoxLayout.X_AXIS));
		JLabel lbDoiTuong = new JLabel("Loại Sản Phẩm: ");
		cbbdoituong = new JComboBox<>();
		cbbdoituong.addItem("Áo So Mi");
		cbbdoituong.addItem("Quần Tây");
		pwnDoiTuong.add(lbDoiTuong);
		pwnDoiTuong.add(cbbdoituong);
		pnwChucNang.add(pwnDoiTuong);
		pnwChucNang.add(Box.createVerticalStrut(30));
		pwnDoiTuong.setBackground(new Color(147,190,222));

		btnTimTKDT = new JButton("Tìm Kiếm");
		btnInTKDT = new JButton("In Thống Kê");
		pnbtn = new JPanel();
		pnbtn.setLayout(new BoxLayout(pnbtn,BoxLayout.X_AXIS));
		pnbtn.add(btnTimTKDT);
		pnbtn.setBackground(new Color(147,190,222));
		pnbtn.add(Box.createHorizontalStrut(20));
		pnbtn.add(btnInTKDT);
		pnwChucNang.add(pnbtn);
		pnwChucNang.add(Box.createVerticalStrut(380));
		lbto.setPreferredSize(lbDoiTuong.getPreferredSize());
		lbfrom.setPreferredSize(lbDoiTuong.getPreferredSize());
		modelTopSP = new DefaultTableModel();
		modelTopSP.addColumn("Sản Phẩm");
		modelTopSP.addColumn("Số Tiền Bán Được");
		tabletopSP = new JTable(modelTopSP);
		sctopNV = new JScrollPane(tabletopSP);
		sctopNV.setBorder(BorderFactory.createTitledBorder("Top Sản Phẩm Được Bán Nhiều Nhất"));
		pnWest.add(sctopNV);
		pnWest.setPreferredSize(new Dimension(230,750));
		// PANEL CENTER
		JPanel pnCenter = new JPanel();
		pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));
		add(pnCenter,BorderLayout.CENTER);
		JLabel lbtitle = new JLabel("THỐNG KÊ SẢN PHẨM");
		lbtitle.setFont(new Font("Helvetica Neue", Font.BOLD, 33));
		pnCenter.add(lbtitle);
		pnCenter.add(Box.createVerticalStrut(15));
		pnCenter.setBackground(new Color(147,190,222));
		pncenHD.setLayout(new BoxLayout(pncenHD,BoxLayout.X_AXIS));
		pncenTien.setLayout(new BoxLayout(pncenTien,BoxLayout.X_AXIS));
		pnCenter.setBorder(BorderFactory.createTitledBorder("Tổng Thống Kê"));

		lbtonghd = new JLabel("Tổng Số Hoá Đơn");
		txttongHD = new JTextField();
		JLabel lbtongtien = new JLabel("Tổng Số Tiền");
		lbtongtien.setBackground(new Color(147,190,222));
		pnCenterTxt = new JPanel();
		pnCenterTxt.setLayout(new BoxLayout(pnCenterTxt, BoxLayout.Y_AXIS));
		txttongtien = new JTextField();
		txttongHD.setEnabled(false);
		txttongtien.setEnabled(false);
		pncenHD.add(lbtonghd);
		pncenHD.add(txttongHD);
		pncenHD.setBackground(new Color(147,190,222));
		pncenTien.add(lbtongtien);
		pncenTien.add(txttongtien);
		pnCenter.setBackground(new Color(147,190,222));
		pnCenterTxt.add(pncenHD);
		pnCenterTxt.add(Box.createVerticalStrut(15));
		pnCenterTxt.add(pncenTien);
		pncenTien.setBackground(new Color(147,190,222));
		pnCenterTxt.add(Box.createVerticalStrut(15));
		pnCenter.add(pnCenterTxt);
		pnCenterTxt.setBorder(BorderFactory.createTitledBorder("Tổng Số Lượng Sản Phẩm Bán Ra và Số Tiền Thu Được Theo Thời Gian"));
		pnCenterTxt.setBackground(new Color(147,190,222));
		pnCenter.add(new JLabel("BẢNG THỐNG KÊ"));
		modelTK = new DefaultTableModel();
		modelTK.addColumn("Tên Sản Phẩm");
		modelTK.addColumn("Số Lượng Hoá Đơn: ");
		modelTK.addColumn("Số Tiền Thu Được");

		tableTKDT = new JTable(modelTK);
		tableTKDT.setFillsViewportHeight(true);
		scrollPane = new JScrollPane(tableTKDT);
		scrollPane.setPreferredSize(new Dimension(520, 700));
		pnCenter.add(scrollPane);
		// PANEL EAST
		pnEast = new JPanel();
		pnEast.setLayout(new BoxLayout(pnEast, BoxLayout.Y_AXIS));
		add(pnEast,BorderLayout.EAST);
		pnEast.setBorder(BorderFactory.createTitledBorder("Bảng Thống Kê Sản Phẩm"));
		pnEast.setPreferredSize(new Dimension(600, 100));
		pnEast.add(Box.createVerticalStrut(80));

		Fromdate.setDateFormatString("dd/MM/yyyy");
		Todate.setDateFormatString("dd/MM/yyyy");
		lbtongtien.setPreferredSize(lbtonghd.getPreferredSize());
		txttongtien.setSelectedTextColor(new Color(0,0,0));
		btnTimTKDT.addActionListener(this);
		btnInTKDT.addActionListener(this);

		txttongHD.setDisabledTextColor(Color.blue);
		txttongtien.setDisabledTextColor(Color.blue);

	}
	public static JFreeChart createChart() {
		JFreeChart barChart = ChartFactory.createBarChart(
				"BIỂU ĐỒ SẢN PHẨM BÁN ĐƯỢC",
				"Tên Sản Phẩm", "Số Tiền",
				createDataset(), PlotOrientation.VERTICAL, false, false, false);
		return barChart;
	}

	private static CategoryDataset createDataset() {
		final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		String doituong  = cbbdoituong.getSelectedItem().toString();
		try {


			SimpleDateFormat spDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String DateMoc = spDateFormat.format(Fromdate.getDate());
			String DateDen = spDateFormat.format(Todate.getDate());
			java.sql.Date ngayMocDate = java.sql.Date.valueOf(DateMoc);
			java.sql.Date DateDenDate = java.sql.Date.valueOf(DateDen);
//			for (ThongKeSoLuongSanPham tKeSoLuongSanPham : tkdao.ThongKeSoLuongSp(doituong,ngayMocDate,DateDenDate)) {
//				dataset.addValue(tKeSoLuongSanPham.getSoLuong(), "Số Lượng Sản Phẩm", tKeSoLuongSanPham.getSp());
//			}

		} catch (Exception e) {

		}
		return dataset;
	}
	public boolean CheckFormTKSP() {
		SimpleDateFormat spDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date nowDate = new Date();
		if (Fromdate.getDate()==null || !(spDateFormat.format(Fromdate.getDate()).toString().matches("^(0[1-9]|[1-2][0-9]|3[0-1])[/](0[1-9]|1[0-2])[/]20\\d{2}$"))) {
			JOptionPane.showMessageDialog(this, "Ngày Kết Thúc Không Được Rỗng Và Phải Đúng Định Dạng dd/MM/20yy");
			return false;
		}
		else if(Todate.getDate()==null || !(spDateFormat.format(Todate.getDate()).toString().matches("^(0[1-9]|[1-2][0-9]|3[0-1])[/](0[1-9]|1[0-2])[/]20\\d{2}$"))){
			JOptionPane.showMessageDialog(this, "Ngày Kết Thúc Không Được Rỗng Và Phải Đúng Định Dạng dd/MM/20yy");
			return false;
		}  			
		else if(Fromdate.getDate().after(Todate.getDate())){
			JOptionPane.showMessageDialog(this, "Ngày Kết Thúc Không Được Bé Hơn Ngày Bắt Đầu");
			return false;
		}
		else if (Todate.getDate().after(nowDate)) {
			JOptionPane.showMessageDialog(this, "Không Vượt Quá Ngày "+ spDateFormat.format(nowDate));
			return false;
		}

		return true;
	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		Object o = e.getSource();
//		if (o.equals(btnTimTKDT)) {
//			SimpleDateFormat spDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//			if (!CheckFormTKSP()) {
//				return;
//			}
//			else {
//				ChartPanel chartPanel = new ChartPanel(createChart());
//				pnEast.removeAll();
//				pnEast.revalidate();
//				pnEast.repaint();
//				pnEast.add(chartPanel);
//				String doituong  = cbbdoituong.getSelectedItem().toString();
//				while(modelTK.getRowCount()!=0) {
//					modelTK.removeRow(0);
//				}
//				while (modelTopSP.getRowCount()!=0) {
//					modelTopSP.removeRow(0);
//				}
//
//				SimpleDateFormat spDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
//				String DateMoc = spDateFormat1.format(Fromdate.getDate());
//				String DateDen = spDateFormat1.format(Todate.getDate());
//
//
//				java.sql.Date ngayMocDate = java.sql.Date.valueOf(DateMoc);
//				java.sql.Date DateDenDate = java.sql.Date.valueOf(DateDen);
//
//				for (ThongKeSoLuongSanPham tKeSoLuongSanPham : tkdao.ThongKeSoLuongSp(doituong,ngayMocDate,DateDenDate)) {
//					Object opp[] = {tKeSoLuongSanPham.getSp(),tKeSoLuongSanPham.getSoLuong(),tKeSoLuongSanPham.getDoanhthu()};
//					modelTK.addRow(opp);
//				}
//				DecimalFormat TopDoanhThu = new DecimalFormat("###,###.000VNĐ");
//				for (ThongKeSoLuongSanPham tksp: tkdao.ThongKeSoLuongSpTheoTop(doituong,ngayMocDate,DateDenDate)) {
//
//					Object oppTop[] = {tksp.getSp(),TopDoanhThu.format(tksp.getDoanhthu()) };
//					modelTopSP.addRow(oppTop);
//				}
//				int total = 0;
//				double totaltien = 0;
//				for (int i = 0; i < modelTK.getRowCount(); i++) {
//					int sum =  (int) tableTKDT.getValueAt(i, 1);
//					Double sumtien =  (Double) tableTKDT.getValueAt(i, 2);
//					total += sum;
//					totaltien += sumtien;
//				}
//				DecimalFormat deci = new DecimalFormat("###,###.000VND");
//
//				String stringhd= Integer.toString(total);
//				String stringtien = Double.toString(totaltien);
//
//
//				txttongtien.setText("");
//				txttongHD.setText("");
//				txttongtien.setText(deci.format(Double.parseDouble(stringtien)));
//				txttongHD.setText(stringhd);
//
//			}
//
//		}
//
//		if (o.equals(btnInTKDT)) {
//			Date date = new Date();
//			SimpleDateFormat spDateFormat = new SimpleDateFormat("hh:mm:ss");
//			String dateString = spDateFormat.format(date);
//			String listString[] = dateString.split(":");
//			BufferedImage img = new BufferedImage(pnEast.getWidth(), pnEast.getHeight(), BufferedImage.TYPE_INT_RGB);
//			pnEast.paint(img.getGraphics());
//			String doituong  = cbbdoituong.getSelectedItem().toString();
//			if (doituong.equals("Áo So Mi")) {
//				try {
//					ImageIO.write(img, "png", new File("..\\Downloads\\ASM"+listString[0]+listString[1]+listString[2]+".png"));
//					JOptionPane.showMessageDialog(null,"Xuất Thống Kê Sản Phẩm Thành Công");
//
//				} catch (Exception e1) {
//				}
//			}
//
//		}
//	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

//	
//		public boolean regexNV() {
//		if (txtTenNV.getText().length() > 0 && !(txtTenNV.getText().matches("[A-Z][a-z]*([\\sA-Za-z]*)*"))) {
//			JOptionPane.showMessageDialog(this,"Không Được Rỗng Và Kí Tự Phải Lớn Hơn 0 bắt đầu là kí Tự Hoa");
//			return false;
//		} 
//		if(txtSodienThoai.getText().length() > 0 && !(txtSodienThoai.getText().matches("\\d{10}"))) {
//			JOptionPane.showMessageDialog(this,"Không Được Rỗng, Số điện thoại phải 10 kí tự số");
//			return false;
//		}
//		if(txtmail.getText().length() > 0 && !(txtmail.getText().matches("^[A-Za-z0-9]{4}([A-Za-z0-9])*[@]([gmail|yahoo])[.](com)$"))) {
//			JOptionPane.showMessageDialog(this,"Không Được Rỗng ít nhất tên mail phải 5 kí tự, định dạng xxxxx@gmail.com hoặc @yahoo.com");
//			return false;
//		}
//		if(txtCMND.getText().length() > 0 && !(txtCMND.getText().matches("\\d{10}"))) {
//			JOptionPane.showMessageDialog(this,"Chứng Minh Nhân Dân không được rỗng và có 10 số");
//			return false;
//		}
//		if(txtdiachi.getText().length() > 0 && !(txtdiachi.getText().matches("[A-Za-z0-9][A-Za-z0-9]*([\\sA-Za-z0-9]*)*"))) {
//			JOptionPane.showMessageDialog(this,"Địa Chỉ Không được rỗng không chứa kí tự đặt biệt");
//			return false;
//		}
//		return true;
//	}
	

}

