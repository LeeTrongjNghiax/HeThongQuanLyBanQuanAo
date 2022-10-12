package paneldemo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
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

import dao.ThongKeSLSP;
import entity.ThongKeSoLuongSanPham;

public class ThongKeSanPham extends JFrame implements ActionListener{
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
	static ThongKeSLSP tkdao = new ThongKeSLSP();
	private DefaultTableModel modelTK;
	//Image imgImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\Downloads\\logo (2)\\logo\\logo.jpg");
public ThongKeSanPham() {
	setSize(with,height);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setResizable(false);
	panelTKcon();
}
private void panelTKcon() {
	// PANEL WEST
	JPanel pnWest = new JPanel();
	pnWest.setLayout(new BoxLayout(pnWest, BoxLayout.Y_AXIS));
	add(pnWest,BorderLayout.WEST);
	
//	JPanel pnNoCen = new JPanel();
//	JPanel pnNoWest = new JPanel();
//	pnNoCen.setLayout(new BoxLayout(pnNoCen, BoxLayout.Y_AXIS));
//	pnNoWest.setLayout(new BoxLayout(pnNoWest, BoxLayout.Y_AXIS));
//pnNoCen.add(lbtitle);
	JPanel pncenHD = new JPanel();
	JPanel pncenTien = new JPanel();
	
	
	JPanel pnwChucNang = new JPanel();
	pnwChucNang.add(Box.createVerticalStrut(100));
	pnwChucNang.setBorder(BorderFactory.createTitledBorder("Chức Năng"));
	pnWest.add(pnwChucNang);
	JPanel pnwFrom = new JPanel();
	pnwChucNang.setLayout(new BoxLayout(pnwChucNang, BoxLayout.Y_AXIS));
	
	JLabel lbfrom = new JLabel("Từ: ");
	pnwFrom.setLayout(new BoxLayout(pnwFrom,BoxLayout.X_AXIS));
	Fromdate = new JDateChooser();
	pnwFrom.add(lbfrom);
	pnwFrom.add(Fromdate);
	pnwChucNang.add(pnwFrom);
	pnwChucNang.add(Box.createVerticalStrut(30));
	
	JPanel pwnTo = new JPanel();
	pwnTo.setLayout(new BoxLayout(pwnTo,BoxLayout.X_AXIS));
	JLabel lbto = new JLabel("Đến: ");
	Todate = new JDateChooser();
	pwnTo.add(lbto);
	pwnTo.add(Todate);
	pnwChucNang.add(pwnTo);
	pnwChucNang.add(Box.createVerticalStrut(30));
	
	
	JPanel pwnDoiTuong = new JPanel();
	pwnDoiTuong.setLayout(new BoxLayout(pwnDoiTuong,BoxLayout.X_AXIS));
	JLabel lbDoiTuong = new JLabel("Loại Sản Phẩm: ");
	cbbdoituong = new JComboBox<>();
	cbbdoituong.addItem("Áo Sơ Mi");
	cbbdoituong.addItem("Quần Tây");
	cbbdoituong.addItem("Giày Bitis");
	pwnDoiTuong.add(lbDoiTuong);
	pwnDoiTuong.add(cbbdoituong);
	pnwChucNang.add(pwnDoiTuong);
	pnwChucNang.add(Box.createVerticalStrut(30));
	
	btnTimTKDT = new JButton("Tìm Kiếm");
	btnInTKDT = new JButton("In Thống Kê");
	pnbtn = new JPanel();
	pnbtn.setLayout(new BoxLayout(pnbtn,BoxLayout.X_AXIS));
	pnbtn.add(btnTimTKDT);
	pnbtn.add(Box.createHorizontalStrut(20));
	pnbtn.add(btnInTKDT);
	pnwChucNang.add(pnbtn);
	pnwChucNang.add(Box.createVerticalStrut(380));
	lbto.setPreferredSize(lbDoiTuong.getPreferredSize());
	lbfrom.setPreferredSize(lbDoiTuong.getPreferredSize());
	pnWest.add(Box.createVerticalStrut(50));
	pnwChucNang.setPreferredSize(new Dimension(400,500));
	
	// PANEL CENTER
	JPanel pnCenter = new JPanel();
	pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));
	add(pnCenter,BorderLayout.CENTER);
	pnCenter.add(Box.createVerticalStrut(190));
	JLabel lbtitle = new JLabel("THỐNG KÊ SẢN PHẨM");
	lbtitle.setFont(new Font("Helvetica Neue", Font.BOLD, 30));
	pnCenter.add(lbtitle);
	pnCenter.add(Box.createVerticalStrut(15));
	pncenHD.setLayout(new BoxLayout(pncenHD,BoxLayout.X_AXIS));
	pncenTien.setLayout(new BoxLayout(pncenTien,BoxLayout.X_AXIS));
	JLabel lbtonghd = new JLabel("Tổng Số Sản Phẩm");
	txttongHD = new JTextField();
	txttongHD.setEditable(false);
	JLabel lbtongtien = new JLabel("Tổng Số Tiền");
	txttongtien = new JTextField();
	txttongtien.setEditable(false);
	pncenHD.add(lbtonghd);
	pncenHD.add(txttongHD);
	pncenTien.add(lbtongtien);
	pncenTien.add(txttongtien);
	pnCenter.add(pncenHD);
	pnCenter.add(Box.createVerticalStrut(15));
	pnCenter.add(pncenTien);
	pnCenter.add(Box.createVerticalStrut(15));
	pnCenter.add(new JLabel("BẢNG THỐNG KÊ"));
	modelTK = new DefaultTableModel();
	modelTK.addColumn("Sản Phẩm");
	modelTK.addColumn("Số Lượng Bán: ");
	modelTK.addColumn("Số Tiền Thu Được");
	JTable tableTKDT = new JTable(modelTK);
	JScrollPane scrollPane = new JScrollPane(tableTKDT);
	scrollPane.setPreferredSize(new Dimension(700, 500));
	pnCenter.add(scrollPane);
//	
//	pnNoWest.setPreferredSize(new Dimension(200, 300));
//	pnnorth.add(pnNoWest,BorderLayout.WEST);
//	pnnorth.add(pnNoCen,BorderLayout.CENTER);
	java.sql.Date date1 = new java.sql.Date(2022-1900, 12-1, 30);
	Todate.setDate(date1);
	java.sql.Date date = new java.sql.Date(2017-1900, 12-1, 30);
	Fromdate.setDate(date);
	
	
	// PANEL EAST
	pnEast = new JPanel();
	pnEast.setLayout(new BoxLayout(pnEast, BoxLayout.Y_AXIS));
	add(pnEast,BorderLayout.EAST);
	pnEast.setBorder(BorderFactory.createTitledBorder("Bảng Thống Kê Sản Phẩm Bán Được"));
	pnEast.setPreferredSize(new Dimension(500, 600));
	
	lbtongtien.setPreferredSize(lbtonghd.getPreferredSize());
	btnTimTKDT.addActionListener(this);
	btnInTKDT.addActionListener(this);
}
public static void main(String[] args) {
	new ThongKeSanPham().setVisible(true);
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
					for (ThongKeSoLuongSanPham tKeSoLuongSanPham : tkdao.ThongKeSoLuongSp(doituong,ngayMocDate,DateDenDate)) {
						dataset.addValue(tKeSoLuongSanPham.getSoLuong(), "Số Lượng Sản Phẩm", tKeSoLuongSanPham.getSp());
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
			String doituong  = cbbdoituong.getSelectedItem().toString();
				while(modelTK.getRowCount()!=0) {
					modelTK.removeRow(0);
				}
		
					SimpleDateFormat spDateFormat = new SimpleDateFormat("yyyy-MM-dd");
					String DateMoc = spDateFormat.format(Fromdate.getDate());
					String DateDen = spDateFormat.format(Todate.getDate());
					java.sql.Date ngayMocDate = java.sql.Date.valueOf(DateMoc);
					java.sql.Date DateDenDate = java.sql.Date.valueOf(DateDen);
//					System.out.println(doituong);
//					System.out.println(ngayMocDate);
//					System.out.println(DateDenDate);
//					System.out.println(tkdao.tksp(ngayMocDate,DateDenDate));
//					System.out.println(tkdao.ThongKeSoLuongSp(doituong,ngayMocDate,DateDenDate));
					for (ThongKeSoLuongSanPham tKeSoLuongSanPham : tkdao.ThongKeSoLuongSp(doituong,ngayMocDate,DateDenDate)) {
						Object opp[] = {tKeSoLuongSanPham.getSp(),tKeSoLuongSanPham.getSoLuong(),tKeSoLuongSanPham.getDoanhthu()};
						modelTK.addRow(opp);
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
			        ImageIO.write(img, "png", new File("..\\Paneldemo\\TKSP"+listString[0]+listString[1]+listString[2]+".png"));
			        JOptionPane.showMessageDialog(null,"Xuất Thống Kê Sản Phẩm Thành Công");

			    } catch (Exception e1) {
			        
		}
	}
}

}
