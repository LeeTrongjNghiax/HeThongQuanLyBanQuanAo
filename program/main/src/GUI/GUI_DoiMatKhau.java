package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class GUI_DoiMatKhau extends JFrame implements ActionListener{

	private JLabel lblHeader, lblMatKhauCu, lblMatKhauMoi, lblXacNhanMatKhauMoi;
	private JPasswordField txtMatKhauCu, txtMatKhauMoi, txtXacNhanMatKhauMoi;
	private JButton btnHienThiMatKhauCu, btnHienThiMatKhauMoi, btnHienThiXacNhanMatKhauMoi, btnDoiMatKhau, btnHuy;
	
	private String pathMKC = "C:\\Users\\Admin\\Desktop\\eyeOpenIcon.png";
	private String pathMKM = "C:\\Users\\Admin\\Desktop\\eyeOpenIcon.png";
	private String pathXNMK = "C:\\Users\\Admin\\Desktop\\eyeOpenIcon.png";
	
	private ImageIcon icon = new ImageIcon(scaleImage("C:\\Users\\Admin\\Desktop\\eyeOpenIcon.png", 20, 15));
	
	public GUI_DoiMatKhau() {
		setSize(400, 270);
		setLocationRelativeTo(null);
		setUndecorated(true);
		createGUI();
	}

	private void createGUI() {
		// TODO Auto-generated method stub
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setBackground(new Color(147, 190, 221));
		
		panel.add(Box.createVerticalStrut(30));
		Box bHeader = Box.createHorizontalBox();
		bHeader.add(lblHeader = new JLabel("Đổi Mật Khẩu"));
		lblHeader.setFont(new Font("Arial", Font.BOLD, 20));
		panel.add(bHeader);
		panel.add(Box.createVerticalStrut(20));
		
		Box bMKC = Box.createHorizontalBox();
		bMKC.add(Box.createHorizontalStrut(10));
		bMKC.add(lblMatKhauCu = new JLabel("Mật Khẩu Cũ"));
		bMKC.add(Box.createHorizontalStrut(10));
		bMKC.add(txtMatKhauCu = new JPasswordField());
		txtMatKhauCu.setEchoChar('*');
		bMKC.add(Box.createHorizontalStrut(10));
		bMKC.add(btnHienThiMatKhauCu = new JButton(icon));
		bMKC.add(Box.createHorizontalStrut(10));
		panel.add(bMKC);
		panel.add(Box.createVerticalStrut(20));
		
		Box bMKM = Box.createHorizontalBox();
		bMKM.add(Box.createHorizontalStrut(10));
		bMKM.add(lblMatKhauMoi= new JLabel("Mật Khẩu Mới"));
		bMKM.add(Box.createHorizontalStrut(10));
		bMKM.add(txtMatKhauMoi = new JPasswordField());
		bMKM.add(Box.createHorizontalStrut(10));
		txtMatKhauMoi.setEchoChar('*');
		bMKM.add(btnHienThiMatKhauMoi = new JButton(icon));
		bMKM.add(Box.createHorizontalStrut(10));
		panel.add(bMKM);
		panel.add(Box.createVerticalStrut(20));
		
		Box bXNMK = Box.createHorizontalBox();
		bXNMK.add(Box.createHorizontalStrut(10));
		bXNMK.add(lblXacNhanMatKhauMoi = new JLabel("Xác Nhận Mật Khẩu Mới"));
		bXNMK.add(Box.createHorizontalStrut(10));
		bXNMK.add(txtXacNhanMatKhauMoi = new JPasswordField());
		bXNMK.add(Box.createHorizontalStrut(10));
		txtXacNhanMatKhauMoi.setEchoChar('*');
		
		bXNMK.add(btnHienThiXacNhanMatKhauMoi = new JButton(icon));
		bXNMK.add(Box.createHorizontalStrut(10));
		panel.add(bXNMK);
		panel.add(Box.createVerticalStrut(20));
		
		Box bChucNang = Box.createHorizontalBox();
		bChucNang.add(btnDoiMatKhau = new JButton("Đổi Mật Khẩu"));
		bChucNang.add(Box.createHorizontalStrut(30));
		bChucNang.add(btnHuy = new JButton("Hủy"));
		panel.add(bChucNang);
		panel.add(Box.createVerticalStrut(30));
		
		lblMatKhauCu.setPreferredSize(lblXacNhanMatKhauMoi.getPreferredSize());
		lblMatKhauMoi.setPreferredSize(lblXacNhanMatKhauMoi.getPreferredSize());
		
		btnHienThiMatKhauCu.setBackground(Color.WHITE);
		btnHienThiMatKhauMoi.setBackground(Color.WHITE);
		btnHienThiXacNhanMatKhauMoi.setBackground(Color.WHITE);
		
		btnHienThiMatKhauCu.addActionListener(this);
		btnHienThiMatKhauMoi.addActionListener(this);
		btnHienThiXacNhanMatKhauMoi.addActionListener(this);
		btnDoiMatKhau.addActionListener(this);
		btnHuy.addActionListener(this);
	}
	
	private Image scaleImage(String path, int w, int h) {
		ImageIcon img = new ImageIcon(path);
		Image image = img.getImage();
        Image scaled = image.getScaledInstance(w, h, Image.SCALE_SMOOTH);
        return scaled;
    }
	
	public static void main(String[] args) {
		new GUI_DoiMatKhau().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(btnHienThiMatKhauCu)) {
			String MKC = "C:\\Users\\Admin\\Desktop\\eyeOpenIcon.png";
			if(pathMKC.equalsIgnoreCase(MKC)) {
				pathMKC = "C:\\Users\\Admin\\Desktop\\eyeCloseIcon.png";
				ImageIcon iconMKC = new ImageIcon(scaleImage(pathMKC, 20, 15));
				btnHienThiMatKhauCu.setIcon(iconMKC);
				txtMatKhauCu.setEchoChar((char)0);
			} else {
				pathMKC = "C:\\Users\\Admin\\Desktop\\eyeOpenIcon.png";
				ImageIcon iconMKC = new ImageIcon(scaleImage(pathMKC, 20, 15));
				btnHienThiMatKhauCu.setIcon(iconMKC);
				txtMatKhauCu.setEchoChar(('*'));
			}
		} else if(o.equals(btnHienThiMatKhauMoi)) {
			String MKM = "C:\\Users\\Admin\\Desktop\\eyeOpenIcon.png";
			if(pathMKM.equalsIgnoreCase(MKM)) {
				pathMKM = "C:\\Users\\Admin\\Desktop\\eyeCloseIcon.png";
				ImageIcon iconMKM = new ImageIcon(scaleImage(pathMKM, 20, 15));
				btnHienThiMatKhauMoi.setIcon(iconMKM);
				txtMatKhauMoi.setEchoChar((char)0);
			} else {
				pathMKM = "C:\\Users\\Admin\\Desktop\\eyeOpenIcon.png";
				ImageIcon iconMKM = new ImageIcon(scaleImage(pathMKM, 20, 15));
				btnHienThiMatKhauMoi.setIcon(iconMKM);
				txtMatKhauMoi.setEchoChar(('*'));
			}
		} else if(o.equals(btnHienThiXacNhanMatKhauMoi)) {
			String XNMK = "C:\\Users\\Admin\\Desktop\\eyeOpenIcon.png";
			if(pathXNMK.equalsIgnoreCase(XNMK)) {
				pathXNMK = "C:\\Users\\Admin\\Desktop\\eyeCloseIcon.png";
				ImageIcon iconXNMK = new ImageIcon(scaleImage(pathXNMK, 20, 15));
				btnHienThiXacNhanMatKhauMoi.setIcon(iconXNMK);
				txtXacNhanMatKhauMoi.setEchoChar((char)0);
			} else {
				pathXNMK = "C:\\Users\\Admin\\Desktop\\eyeOpenIcon.png";
				ImageIcon iconXNMK = new ImageIcon(scaleImage(pathXNMK, 20, 15));
				btnHienThiXacNhanMatKhauMoi.setIcon(iconXNMK);
				txtXacNhanMatKhauMoi.setEchoChar(('*'));
			}
		} else if(o.equals(btnDoiMatKhau)) {
			String MKC = txtMatKhauCu.getText();
			String MKM = txtMatKhauMoi.getText();
			String XNMK = txtXacNhanMatKhauMoi.getText(); 
			
			if(XNMK.contentEquals(MKM)) {
				
			} else {
				JOptionPane.showMessageDialog(null, "Mật Khẩu Xác Nhận Không Giống Mật Khẩu Mới");
			}
		} else if(o.equals(btnHuy)) {
			
			this.dispose();
		}
	}
}
