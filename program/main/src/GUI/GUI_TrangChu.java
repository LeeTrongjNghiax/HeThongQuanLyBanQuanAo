package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import entity.NhanVien;
import entity.TaiKhoan;

public class GUI_TrangChu extends JFrame implements ActionListener{
	
	private JLabel lblRealTime;
	
	private JMenuBar menuBar;
	
	private JMenu menuSanPham, menuHoaDon, menuNhanVien, menuKhachHang, menuThongKe, menuTroGiup, menuTaiKhoan;
	
	private JMenuItem itemQuanLiSanPham, 
					itemTaoHoaDon, 
					itemQuanLiNhanVien, 
					itemQuanLiKhachHang, 
					itemThongKeDoanhThuNV, itemThongKeDoanhThuQL, itemThongKeSanPhamQL, 
					itemThongTinCaNhan, itemDoiMatKhau, itemDangXuat, itemThoat;
	
	public GUI_TrangChu(NhanVien nv) {
		// TODO Auto-generated constructor stub
		setExtendedState(this.MAXIMIZED_BOTH);
		setUndecorated(true);
		
		setJMenuBar(menuBar = new JMenuBar());
		
		menuBar.add(menuSanPham = new JMenu("Sản Phẩm"));
		menuBar.add(menuHoaDon = new JMenu("Hóa Đơn"));
		menuBar.add(menuNhanVien = new JMenu("Nhân Viên"));
		menuBar.add(menuKhachHang = new JMenu("Khách Hàng"));
		menuBar.add(menuThongKe = new JMenu("Thống Kê"));
		menuBar.add(menuTroGiup = new JMenu("Trợ Giúp"));
		menuBar.add(Box.createHorizontalGlue());
		menuBar.add(lblRealTime = new JLabel());
		lblRealTime.setFont(new Font("Arial", Font.BOLD, 18));
		realTime();
		menuBar.add(Box.createHorizontalStrut(50));
		menuBar.add(Box.createHorizontalGlue());
		menuBar.add(menuTaiKhoan = new JMenu("Tài Khoản"));
		menuBar.add(Box.createHorizontalStrut(50));
		
		menuSanPham.add(itemQuanLiSanPham = new JMenuItem("Quản Lí Sản Phẩm"));
		
		menuHoaDon.add(itemTaoHoaDon = new JMenuItem("Tạo Hóa Đơn"));
		
		menuNhanVien.add(itemQuanLiNhanVien = new JMenuItem("Quản Lí Nhân Viên"));
		
		menuKhachHang.add(itemQuanLiKhachHang = new JMenuItem("Quản Lí Khách Hàng"));
		
		menuThongKe.add(itemThongKeDoanhThuNV = new JMenuItem("Thống Kê Doanh Thu"));
		menuThongKe.add(itemThongKeDoanhThuQL = new JMenuItem("Thống Kê Tổng Doanh Thu"));
		menuThongKe.add(itemThongKeSanPhamQL = new JMenuItem("Thống Kê Sản Phẩm"));
		
		menuTaiKhoan.add(itemThongTinCaNhan = new JMenuItem("Thông Tin Cá Nhân"));
		menuTaiKhoan.add(itemDoiMatKhau = new JMenuItem("Đổi Mật Khẩu"));
		menuTaiKhoan.add(itemDangXuat = new JMenuItem("Đăng Xuất"));
		menuTaiKhoan.add(itemThoat = new JMenuItem("Thoát"));
		
		// Check 
//		if(nv.getChucVu().equalsIgnoreCase("Quan Li")) {
//			itemThongKeDoanhThuNV.setVisible(false);
//		} else {
//			menuNhanVien.setVisible(false);
//			menuKhachHang.setVisible(false);
//			menuNhanVien.setVisible(false);
//			itemThongKeDoanhThuQL.setVisible(false);
//			itemThongKeSanPhamQL.setVisible(false);
//		}
		
		// Event
		itemQuanLiSanPham.addActionListener(this);
		itemTaoHoaDon.addActionListener(this);
		itemQuanLiNhanVien.addActionListener(this);
		itemQuanLiKhachHang.addActionListener(this);
		itemThongKeDoanhThuNV.addActionListener(this);
		itemThongKeDoanhThuQL.addActionListener(this);
		itemThongKeSanPhamQL.addActionListener(this);
		itemThongTinCaNhan.addActionListener(this);
		itemDoiMatKhau.addActionListener(this);
		itemDangXuat.addActionListener(this);
		itemThoat.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(itemQuanLiSanPham)) {
			// TODO Auto-generated constructor stub
			switchPanel(new GUI_QuanLiSanPhamQL(this));
		} else if(o.equals(itemTaoHoaDon)) {
			// TODO Auto-generated constructor stub
			switchPanel(new GUI_TaoHoaDon(this));
		} else if(o.equals(itemQuanLiNhanVien)) {
			// TODO Auto-generated constructor stub
			switchPanel(new GUI_QuanLiNhanVienQL());
		} else if(o.equals(itemQuanLiKhachHang)) {
			// TODO Auto-generated constructor stub
			switchPanel(new GUI_QuanLiKhachHangQL());
		} else if(o.equals(itemThongKeDoanhThuNV)) {
			// TODO Auto-generated constructor stub
			switchPanel(new GUI_ThongKeDoanhThuNV(this));
		} else if(o.equals(itemThongKeSanPhamQL)) {
			// TODO Auto-generated constructor stub
			switchPanel(new GUI_ThongKeSanPhamQL());
		} else if(o.equals(itemThongKeDoanhThuQL)) {
			// TODO Auto-generated constructor stub
			switchPanel(new GUI_ThongKeDoanhThuQL());
		} else if(o.equals(itemThongTinCaNhan)) {
			// TODO Auto-generated constructor stub
			switchPanel(new GUI_ThongTinCaNhan());
		} else if(o.equals(itemDoiMatKhau)) {
			// TODO Auto-generated constructor stub
			new GUI_DoiMatKhau().setVisible(true);
		} else if(o.equals(itemDangXuat)) {
			// TODO Auto-generated constructor stub
			int option = JOptionPane.showConfirmDialog(null, "Bạn Muốn Đăng Xuất", "Đăng Xuất", JOptionPane.YES_NO_OPTION);
			if(option == JOptionPane.YES_OPTION) {
				this.dispose();
				new GUI_DangNhap().setVisible(true);
			}
		} else if(o.equals(itemThoat)) {
			// TODO Auto-generated constructor stub
			int option = JOptionPane.showConfirmDialog(null, "Bạn Muốn Thoát Ứng Dụng", "Thoát Ứng Dụng", JOptionPane.YES_NO_OPTION);
			if(option == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}
		
	}
	
	private void realTime() {
		// TODO Auto-generated constructor stub
		Timer t = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              lblRealTime.setText(
                 DateFormat.getDateTimeInstance().format(new Date())
              );
            }
         });
         t.setRepeats(true);
         t.setCoalesce(true);
         t.setInitialDelay(0);
         t.start();
	}
	
	private void switchPanel(JPanel panel) {
		// TODO Auto-generated constructor stub
		setContentPane(panel);
		validate();
		invalidate();
	}
}
