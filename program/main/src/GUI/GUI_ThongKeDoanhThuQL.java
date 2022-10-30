package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Iterator;

import javax.imageio.ImageIO;
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

import org.jfree.chart.ChartPanel;

import com.toedter.calendar.JDateChooser;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;


//
//import com.toedter.calendar.JDateChooser;
//
//import dao.Thongke_DAO;
//import entity.ThongKeDoanhThu;

public class GUI_ThongKeDoanhThuQL extends JPanel implements ActionListener{
	private static JDateChooser Fromdate;
	private static JDateChooser Todate;
	private JButton btnTimTKDT;
	private JPanel pnEast;
	private JButton btnInTKDT;
	private JPanel pnbtn;
	private JTextField txttongtien;
	private JLabel lbtonghd;
	private JTextField txttongHD;
	private static JComboBox cbbdoituong;
//	static Thongke_DAO tkDao = new Thongke_DAO();
	private JTable tableTKDT;
	private DefaultTableModel modelTK;
	private JScrollPane scrollPane;
	private JPanel pnCenterTxt;
	SimpleDateFormat spDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	private DefaultTableModel modelTopNV;
	private JTable tableTOPNV;
	private JScrollPane sctopNV;
	public GUI_ThongKeDoanhThuQL() {
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
		pnwChucNang.add(Box.createVerticalStrut(80));

		JLabel lbfrom = new JLabel("Từ: ");
		pnwFrom.setLayout(new BoxLayout(pnwFrom,BoxLayout.X_AXIS));
		Fromdate = new JDateChooser();
		java.sql.Date date = new java.sql.Date(2017-1900, 12-1, 30);
		Fromdate.setDateFormatString("dd/MM/yyyy");
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

		pwnTo.add(lbto);
		pwnTo.add(Todate);
		Todate.setDateFormatString("dd/MM/yyyy");
		Date datenowDate = new Date();
		Todate.setDate(datenowDate);
		pwnTo.setBackground(new Color(147,190,222));
		pnwChucNang.add(pwnTo);
		pnwChucNang.setPreferredSize(new Dimension(250,200));
		pnwChucNang.add(Box.createVerticalStrut(30));


		JPanel pwnDoiTuong = new JPanel();
		pwnDoiTuong.setLayout(new BoxLayout(pwnDoiTuong,BoxLayout.X_AXIS));
		JLabel lbDoiTuong = new JLabel("Đối Tượng: ");
		cbbdoituong = new JComboBox<>();
		cbbdoituong.addItem("Nhân Viên");
		cbbdoituong.addItem("Khách Hàng");
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
		modelTopNV = new DefaultTableModel();
		modelTopNV.addColumn("Họ Và Tên");
		modelTopNV.addColumn("Số Tiền Thu/Nhận Được");
		tableTOPNV = new JTable(modelTopNV);
		sctopNV = new JScrollPane(tableTOPNV);
		sctopNV.setBorder(BorderFactory.createTitledBorder("Top doanh thu/ tiêu phí nhiều nhất"));
		pnWest.add(sctopNV);
		pnWest.setPreferredSize(new Dimension(230,750));		
		// PANEL CENTER
		JPanel pnCenter = new JPanel();
		pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));
		add(pnCenter,BorderLayout.CENTER);
		JLabel lbtitle = new JLabel("THỐNG KÊ DOANH THU");
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
		pnCenterTxt.setBorder(BorderFactory.createTitledBorder("Tổng Doanh Thu và Số Lượng Hoá Đơn"));
		pnCenterTxt.setBackground(new Color(147,190,222));
		pnCenter.add(new JLabel("BẢNG THỐNG KÊ"));
		modelTK = new DefaultTableModel();
		modelTK.addColumn("Tên");
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
		pnEast.setBorder(BorderFactory.createTitledBorder("Bảng Thống Kê"));
		pnEast.setPreferredSize(new Dimension(505, 791));
		pnEast.add(Box.createVerticalStrut(300));

		lbtongtien.setPreferredSize(lbtonghd.getPreferredSize());
		btnTimTKDT.addActionListener(this);
		btnInTKDT.addActionListener(this);

		txttongHD.setDisabledTextColor(Color.blue);
		txttongtien.setDisabledTextColor(Color.blue);

	}
	public static JFreeChart createChart() {
		JFreeChart barChart = ChartFactory.createBarChart(
				"BIỂU ĐỒ DOANH THU",
				"Tên", "Số Tiền",
				createDataset(), PlotOrientation.VERTICAL, false, false, false);
		return barChart;
	}

	private static CategoryDataset createDataset() {
		final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		DecimalFormat deci = new DecimalFormat("####,####.000VND");
		String a  = cbbdoituong.getSelectedItem().toString();
		try {
			if (a.equals("Nhân Viên")) {
				SimpleDateFormat spDateFormat = new SimpleDateFormat("yyyy-MM-dd");
				String DateMoc = spDateFormat.format(Fromdate.getDate());
				String DateDen = spDateFormat.format(Todate.getDate());
				java.sql.Date ngayMocDate = java.sql.Date.valueOf(DateMoc);
				java.sql.Date DateDenDate = java.sql.Date.valueOf(DateDen);
//				for (ThongKeDoanhThu tKeDoanhThu : tkDao.thongKeDoanhThuNV(ngayMocDate, DateDenDate)) {
//					dataset.addValue(tKeDoanhThu.getSoTien(), "Số tiền", tKeDoanhThu.getDoiTuong());
//
//				}
			} else {
				SimpleDateFormat spDateFormat = new SimpleDateFormat("yyyy-MM-dd");
				String DateMoc = spDateFormat.format(Fromdate.getDate());
				String DateDen = spDateFormat.format(Todate.getDate());
				java.sql.Date ngayMocDate = java.sql.Date.valueOf(DateMoc);
				java.sql.Date DateDenDate = java.sql.Date.valueOf(DateDen);
//				for (ThongKeDoanhThu tKeDoanhThu : tkDao.thongKeDoanhThuKH(ngayMocDate, DateDenDate)) {
//					dataset.addValue(tKeDoanhThu.getSoTien(), "Số tiền", tKeDoanhThu.getDoiTuong());
//
//				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataset;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o.equals(btnTimTKDT)) {
			if (!CheckFormTKSP()) {
				return;

			}else {
				ChartPanel chartPanel = new ChartPanel(createChart());
				pnEast.removeAll();
				pnEast.revalidate();
				pnEast.repaint();
				pnEast.add(chartPanel);
				String a  = cbbdoituong.getSelectedItem().toString();
				if (a.equals("Nhân Viên")) {
					lammoitable();
					SimpleDateFormat spDateFormat = new SimpleDateFormat("yyyy-MM-dd");
					String DateMoc = spDateFormat.format(Fromdate.getDate());
					String DateDen = spDateFormat.format(Todate.getDate());
					java.sql.Date ngayMocDate = java.sql.Date.valueOf(DateMoc);
					java.sql.Date DateDenDate = java.sql.Date.valueOf(DateDen);
//					for (ThongKeDoanhThu thongKeDoanhThu : tkDao.thongKeDoanhThuNV(ngayMocDate, DateDenDate)) {
//						Object row[] = {thongKeDoanhThu.getDoiTuong(),thongKeDoanhThu.getSoluongHoDon(),thongKeDoanhThu.getSoTien()};
//						modelTK.addRow(row);
//
//					}
//					DecimalFormat topDoanhThu = new DecimalFormat("###,###.000VNĐ");
//					for (ThongKeDoanhThu tkdtTopDoanhThu : tkDao.thongKeDoanhThuTOPNV(ngayMocDate, DateDenDate)) {
//						Object row[] = {tkdtTopDoanhThu.getDoiTuong(),topDoanhThu.format(tkdtTopDoanhThu.getSoTien())};
//						modelTopNV.addRow(row);
//
//					}
					FillInText();
				} else {
					lammoitable();

					String DateMoc = spDateFormat.format(Fromdate.getDate());
					String DateDen = spDateFormat.format(Todate.getDate());
					java.sql.Date ngayMocDate = java.sql.Date.valueOf(DateMoc);
					java.sql.Date DateDenDate = java.sql.Date.valueOf(DateDen);
//					for (ThongKeDoanhThu thongKeDoanhThu : tkDao.thongKeDoanhThuKH(ngayMocDate, DateDenDate)) {
//						Object row[] = {thongKeDoanhThu.getDoiTuong(),thongKeDoanhThu.getSoluongHoDon(),thongKeDoanhThu.getSoTien()};
//						modelTK.addRow(row);
//
//					}
//					for (ThongKeDoanhThu tkdtTopDoanhThu : tkDao.thongKeTOPDoanhThuKH(ngayMocDate, DateDenDate)) {
//						Object row[] = {tkdtTopDoanhThu.getDoiTuong(),tkdtTopDoanhThu.getSoTien()};
//						modelTopNV.addRow(row);
//
//					}
					FillInText();

				}

			}
		}
		else if (o.equals(btnInTKDT)) {
			Date date = new Date();
			SimpleDateFormat spDateFormat = new SimpleDateFormat("hh:mm:ss");
			String dateString = spDateFormat.format(date);
			String listString[] = dateString.split(":");
			BufferedImage img = new BufferedImage(pnEast.getWidth(), pnEast.getHeight(), BufferedImage.TYPE_INT_RGB);
			pnEast.paint(img.getGraphics());
			try {
				ImageIO.write(img, "png", new File("C:\\Users\\Administrator\\Desktop\\TKDT"+listString[0]+listString[1]+listString[2]+".png"));
				JOptionPane.showMessageDialog(null,"Xuất Thống Kê Doanh Thu "+ cbbdoituong.getSelectedItem().toString() +" Thành Công");

			} catch (Exception e1) {

			}
		}
	}
	public void lammoitable() {
		while (modelTK.getRowCount()!=0) {
			modelTK.removeRow(0);	
		}
		while (modelTopNV.getRowCount()!=0) {
			modelTopNV.removeRow(0);

		}
	}
	public void FillInText() {
		int total = 0;
		double totaltien = 0;
		for (int i = 0; i < modelTK.getRowCount(); i++) {
			int sum =  (int) tableTKDT.getValueAt(i, 1);
			Double sumtien =  (Double) tableTKDT.getValueAt(i, 2);
			total += sum;
			totaltien += sumtien;
		}
		DecimalFormat deci = new DecimalFormat("###,###.000VND");

		String stringhd= Integer.toString(total);
		String stringtien = Double.toString(totaltien);


		txttongtien.setText("");
		txttongHD.setText("");
		txttongtien.setText(deci.format(totaltien));
		txttongHD.setText(stringhd);
	}
	public boolean CheckFormTKSP() {
		SimpleDateFormat spDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date nowDate = new Date();
		if (Fromdate.getDate()==null || !(spDateFormat.format(Fromdate.getDate()).toString().matches("^(0[1-9]|[1-2][0-9]|3[0-1])[/](0[1-9]|1[0-2])[/]20\\d{2}$"))) {
			JOptionPane.showMessageDialog(this, "Ngày Kết Thúc Không Được Rỗng Và Phải Đúng Định Dạng dd/MM/20yy");
			return false;
		}
		else if(Todate.getDate()==null || !(spDateFormat.format(Todate.getDate()).toString().matches("^(0[1-9]|[1-2][0-9]|3[0-1])[/](0[1-9]|1[0-2])[/]20\\d{2}$"))){
			JOptionPane.showMessageDialog(this, "Ngày Kết Thúc Không Được Rỗng Và Phải Đúng Định Dạng");
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
}



