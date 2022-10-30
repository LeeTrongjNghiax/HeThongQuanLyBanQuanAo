package GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class GUI_ThongKeDoanhThuNV extends JPanel implements ActionListener {
	private JLabel lblNgayLamViec, lblCaLamViec, lblDoanhThu;
	private JDateChooser dateChooserNgayLamViec;
	private JComboBox cbCaLamViec;
	private DefaultComboBoxModel cbModelCaLamViec;
	private JButton btnThongKe, btnLamMoi;
	private JScrollPane scrTBLThongKe,scrTBLThongKe1;
	private JTable tblThongKe;
	private DefaultTableModel tblModelThongKe;
	
	public GUI_ThongKeDoanhThuNV(JFrame frame) {
		
		createGUI(frame);
	}

	private void createGUI(JFrame frame) {
		// TODO Auto-generated method stub
		
		int width = frame.getWidth(), height = frame.getHeight();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel panelNhap;
		add(panelNhap = new JPanel());
//		panelNhap.setPreferredSize(new Dimension(10, 10));
		Box bNhap = Box.createHorizontalBox();
		
		bNhap.add(lblNgayLamViec = new JLabel("Ngày Làm Việc: "));
		bNhap.add(dateChooserNgayLamViec = new JDateChooser());
		bNhap.add(lblCaLamViec = new JLabel("Ca Làm Việc"));
		bNhap.add(cbCaLamViec = new JComboBox(cbModelCaLamViec = new DefaultComboBoxModel(new Object[] {"1", "2", "Cả Hai"})));
		bNhap.add(btnThongKe = new JButton("Thống Kê"));
		bNhap.add(btnLamMoi = new JButton("Làm Mới"));
		panelNhap.add(bNhap);
		
		JPanel panelBang;
		add(panelBang = new JPanel());
		panelBang.setLayout(new BoxLayout(panelBang, BoxLayout.Y_AXIS));
		tblModelThongKe = new DefaultTableModel(new Object[] {"Mã Hóa Đơn", "Ngày Tạo", "Tổng Cộng"}, 0);
		tblThongKe = new JTable(tblModelThongKe);
		scrTBLThongKe = new JScrollPane(tblThongKe, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		panelBang.add(scrTBLThongKe);
		
		JPanel panelTongCong;
		add(panelTongCong = new JPanel());
		panelTongCong.add(lblDoanhThu = new JLabel("Doanh Thu: "));
		
		// Event
		btnThongKe.addActionListener(this);
		btnLamMoi.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
