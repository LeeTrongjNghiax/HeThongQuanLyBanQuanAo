package paneldemo;

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


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;



import com.toedter.calendar.JDateChooser;

import dao.Thongke_DAO;
import entity.ThongKeDoanhThu;

public class panelThongKe extends JPanel implements ActionListener{
		
	
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
		static Thongke_DAO tkDao = new Thongke_DAO();
		private JTable tableTKDT;
		private DefaultTableModel modelTK;
		private JScrollPane scrollPane;
		//Image imgImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\Downloads\\logo (2)\\logo\\logo.jpg");
	public panelThongKe() {
//		setSize(with,height);
//		setLocationRelativeTo(null);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setResizable(false);
		panelTKcon();
	}
	private void panelTKcon() {
		// PANEL WEST
		setBackground(new Color(147,190,222));
		JPanel pnWest = new JPanel();
		pnWest.setLayout(new BoxLayout(pnWest, BoxLayout.Y_AXIS));
		add(pnWest,BorderLayout.WEST);
		
//		JPanel pnNoCen = new JPanel();
//		JPanel pnNoWest = new JPanel();
//		pnNoCen.setLayout(new BoxLayout(pnNoCen, BoxLayout.Y_AXIS));
//		pnNoWest.setLayout(new BoxLayout(pnNoWest, BoxLayout.Y_AXIS));
//	pnNoCen.add(lbtitle);
		JPanel pncenHD = new JPanel();
		JPanel pncenTien = new JPanel();
//		JLabel lbicon = new JLabel(icon);
//		pnWest.add(lbicon);
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
		java.sql.Date date1 = new java.sql.Date(2022-1900, 12-1, 30);
		Todate.setDate(date1);
		pwnTo.add(lbto);
		pwnTo.add(Todate);
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
		DefaultTableModel modelTopNV = new DefaultTableModel();
		modelTopNV.addColumn("Họ Và Tên");
		modelTopNV.addColumn("Số Tiền Thu/Nhận Được");
		JTable tableTOPNV = new JTable(modelTopNV);
		JScrollPane sctopNV = new JScrollPane(tableTOPNV);
		pnWest.add(sctopNV);
		pnWest.setPreferredSize(new Dimension(230,750));
//		pnWest.add(Box.createVerticalStrut(50));
		
		// PANEL CENTER
		JPanel pnCenter = new JPanel();
		pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));
		add(pnCenter,BorderLayout.CENTER);
//		pnCenter.add(Box.createVerticalStrut(190));
		JLabel lbtitle = new JLabel("THỐNG KÊ DOANH THU");
		lbtitle.setFont(new Font("Helvetica Neue", Font.BOLD, 33));
		pnCenter.add(lbtitle);
		pnCenter.add(Box.createVerticalStrut(15));
		pnCenter.setBackground(new Color(147,190,222));
		pncenHD.setLayout(new BoxLayout(pncenHD,BoxLayout.X_AXIS));
		pncenTien.setLayout(new BoxLayout(pncenTien,BoxLayout.X_AXIS));

		lbtonghd = new JLabel("Tổng Số Hoá Đơn");
		txttongHD = new JTextField();
		JLabel lbtongtien = new JLabel("Tổng Số Tiền");
		lbtongtien.setBackground(new Color(147,190,222));
		txttongtien = new JTextField();
		txttongHD.setEnabled(false);
		txttongtien.setEnabled(false);
		pncenHD.add(lbtonghd);
		pncenHD.add(txttongHD);
		pncenHD.setBackground(new Color(147,190,222));
		pncenTien.add(lbtongtien);
		pncenTien.add(txttongtien);
		pnCenter.setBackground(new Color(147,190,222));
		pnCenter.add(pncenHD);
		pnCenter.add(Box.createVerticalStrut(15));
		pnCenter.add(pncenTien);
		pncenTien.setBackground(new Color(147,190,222));
		pnCenter.add(Box.createVerticalStrut(15));
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
//		
//		pnNoWest.setPreferredSize(new Dimension(200, 300));
//		pnnorth.add(pnNoWest,BorderLayout.WEST);
//		pnnorth.add(pnNoCen,BorderLayout.CENTER);
		
		
		// PANEL EAST
		pnEast = new JPanel();
		pnEast.setLayout(new BoxLayout(pnEast, BoxLayout.Y_AXIS));
		add(pnEast,BorderLayout.EAST);
		pnEast.setBorder(BorderFactory.createTitledBorder("Bảng Thống Kê"));
		pnEast.setPreferredSize(new Dimension(615, 791));
		pnEast.add(Box.createVerticalStrut(300));
		
		lbtongtien.setPreferredSize(lbtonghd.getPreferredSize());
		btnTimTKDT.addActionListener(this);
		btnInTKDT.addActionListener(this);

	}
	
	public static void main(String[] args) {
		new panelThongKe().setVisible(true);
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
	        DecimalFormat deci = new DecimalFormat("####,#######.0000VND");
	        String a  = cbbdoituong.getSelectedItem().toString();
	        try {
				if (a.equals("Nhân Viên")) {
					SimpleDateFormat spDateFormat = new SimpleDateFormat("yyyy-MM-dd");
					String DateMoc = spDateFormat.format(Fromdate.getDate());
					String DateDen = spDateFormat.format(Todate.getDate());
					java.sql.Date ngayMocDate = java.sql.Date.valueOf(DateMoc);
					java.sql.Date DateDenDate = java.sql.Date.valueOf(DateDen);
//					System.out.println(ngayMocDate);
//					System.out.println(DateDenDate);
					for (ThongKeDoanhThu tKeDoanhThu : tkDao.thongKeDoanhThuNV(ngayMocDate, DateDenDate)) {
						dataset.addValue(tKeDoanhThu.getSoTien(), "Số tiền", tKeDoanhThu.getDoiTuong());
						
					}
				} else {
					SimpleDateFormat spDateFormat = new SimpleDateFormat("yyyy-MM-dd");
					String DateMoc = spDateFormat.format(Fromdate.getDate());
					String DateDen = spDateFormat.format(Todate.getDate());
					java.sql.Date ngayMocDate = java.sql.Date.valueOf(DateMoc);
					java.sql.Date DateDenDate = java.sql.Date.valueOf(DateDen);
//					System.out.println(ngayMocDate);
					for (ThongKeDoanhThu tKeDoanhThu : tkDao.thongKeDoanhThuKH(ngayMocDate, DateDenDate)) {
						dataset.addValue(tKeDoanhThu.getSoTien(), "Số tiền", tKeDoanhThu.getDoiTuong());
						
					}
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
				ChartPanel chartPanel = new ChartPanel(createChart());
				pnEast.removeAll();
				pnEast.revalidate();
				pnEast.repaint();
				pnEast.add(chartPanel);
				String a  = cbbdoituong.getSelectedItem().toString();
				if (a.equals("Nhân Viên")) {
					while (modelTK.getRowCount()!=0) {
							modelTK.removeRow(0);	
					}
						SimpleDateFormat spDateFormat = new SimpleDateFormat("yyyy-MM-dd");
						String DateMoc = spDateFormat.format(Fromdate.getDate());
						String DateDen = spDateFormat.format(Todate.getDate());
						java.sql.Date ngayMocDate = java.sql.Date.valueOf(DateMoc);
						java.sql.Date DateDenDate = java.sql.Date.valueOf(DateDen);
						for (ThongKeDoanhThu thongKeDoanhThu : tkDao.thongKeDoanhThuNV(ngayMocDate, DateDenDate)) {
							Object row[] = {thongKeDoanhThu.getDoiTuong(),thongKeDoanhThu.getSoluongHoDon(),thongKeDoanhThu.getSoTien()};
							modelTK.addRow(row);
							
						}
						int total = 0;
						double totaltien = 0;
						for (int i = 0; i < modelTK.getRowCount(); i++) {
							int sum =  (int) tableTKDT.getValueAt(i, 1);
							Double sumtien =  (Double) tableTKDT.getValueAt(i, 2);
							total += sum;
							totaltien += sumtien;
						}
						DecimalFormat deci = new DecimalFormat("####,#######.0000VND");

						String stringhd= Integer.toString(total);
						String stringtien = Double.toString(totaltien);
						
						
						txttongtien.setText("");
						txttongHD.setText("");
						txttongtien.setText(stringtien);
						txttongHD.setText(stringhd);
					} else {
						while (modelTK.getRowCount()!=0) {
							modelTK.removeRow(0);	
					}
						SimpleDateFormat spDateFormat = new SimpleDateFormat("yyyy-MM-dd");
						String DateMoc = spDateFormat.format(Fromdate.getDate());
						String DateDen = spDateFormat.format(Todate.getDate());
						java.sql.Date ngayMocDate = java.sql.Date.valueOf(DateMoc);
						java.sql.Date DateDenDate = java.sql.Date.valueOf(DateDen);
						for (ThongKeDoanhThu thongKeDoanhThu : tkDao.thongKeDoanhThuKH(ngayMocDate, DateDenDate)) {
							Object row[] = {thongKeDoanhThu.getDoiTuong(),thongKeDoanhThu.getSoluongHoDon(),thongKeDoanhThu.getSoTien()};
							modelTK.addRow(row);
							
						}
						int total = 0;
						double totaltien = 0;
						for (int i = 0; i < modelTK.getRowCount(); i++) {
							int sum =  (int) tableTKDT.getValueAt(i, 1);
							Double sumtien =  (Double) tableTKDT.getValueAt(i, 2);
							total += sum;
							totaltien += sumtien;
						}
						DecimalFormat deci = new DecimalFormat("####,#######.0000VND");

						String stringhd= Integer.toString(total);
						String stringtien = Double.toString(totaltien);
						
						
						txttongtien.setText("");
						txttongHD.setText("");
						txttongtien.setText(stringtien);
						txttongHD.setText(stringhd);
											
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
				        ImageIO.write(img, "png", new File("..\\Paneldemo\\TKDT"+listString[0]+listString[1]+listString[2]+".png"));
				        JOptionPane.showMessageDialog(null,"Xuất Thống Kê Doanh Thu "+ cbbdoituong.getSelectedItem().toString() +" Thành Công");

				    } catch (Exception e1) {
				        
			}
		}
	}
}



