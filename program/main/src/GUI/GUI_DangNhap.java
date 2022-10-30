package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import entity.NhanVien;
import entity.TaiKhoan;

public class GUI_DangNhap extends JFrame implements ActionListener, KeyListener{
	private JLabel lblTieuDe,lblAccount, lblPassword, lblSignInStatus;
	private JTextField txtAccount;
	private JPasswordField txtPassword;
	private JButton btnSignIn, btnExit;
	private JCheckBox cbShowPass;

	public GUI_DangNhap() {
		// TODO Auto-generated method stub
		setTitle("Đăng Nhập");
		setSize(500, 250);
		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated(true);
		createGUI();
	}

	private void createGUI() {
		// TODO Auto-generated method stub
		JPanel panel;
		add(panel = new JPanel());
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.setBackground(new Color(147, 190, 221));

		JPanel panelLeft, panelRight;

		panel.add(panelLeft = new JPanel());
		panelLeft.setBackground(new Color(147, 190, 221));
		panelLeft.setPreferredSize(new Dimension(200, 300));
		panelLeft.setLayout(new BoxLayout(panelLeft, BoxLayout.Y_AXIS));
		ImageIcon icon = new ImageIcon("C:\\Users\\Admin\\Desktop\\logoBrand.jpg");
		Image scaledLogo = icon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		ImageIcon logo = new ImageIcon(scaledLogo);
		JLabel lblLogo = new JLabel(" ",logo, (int)JLabel.CENTER_ALIGNMENT);
		panelLeft.add(lblLogo);

		panel.add(panelRight = new JPanel());
		panelRight.setBackground(new Color(147, 190, 221));
		panelRight.setPreferredSize(new Dimension(400, 300));
		panelRight.setLayout(new BoxLayout(panelRight, BoxLayout.Y_AXIS));

		panelRight.add(Box.createVerticalStrut(30));

		panelRight.add(lblTieuDe = new JLabel("Đăng Nhập"));
		lblTieuDe.setFont(new Font("Times New Roman", Font.BOLD, 24));
		panelRight.add(Box.createVerticalStrut(30));

		Box bAccount, bPassword, bSignIn, bChucNang, bChucNang1;

		bAccount = Box.createHorizontalBox();
		bPassword = Box.createHorizontalBox();
		bChucNang = Box.createHorizontalBox();
		bChucNang1 = Box.createHorizontalBox(); 

		bAccount.add(Box.createHorizontalStrut(20));
		bAccount.add(lblAccount = new JLabel("Tài Khoản"));
		bAccount.add(Box.createHorizontalStrut(5));
		bAccount.add(txtAccount = new JTextField());
		txtAccount.setSize(new Dimension(50, 10));
		bAccount.add(Box.createHorizontalStrut(50));

		bPassword.add(Box.createHorizontalStrut(20));
		bPassword.add(lblPassword = new JLabel("Mật Khẩu"));
		bPassword.add(Box.createHorizontalStrut(9));
		bPassword.add(txtPassword = new JPasswordField());
		txtPassword.setEchoChar('*');
		bPassword.add(Box.createHorizontalStrut(50));

		bChucNang.add(cbShowPass = new JCheckBox("Hiển Thị Mật Khẩu", null));
		cbShowPass.setBackground(new Color(147, 190, 221));

		bChucNang1.add(Box.createHorizontalStrut(30));
		bChucNang1.add(btnSignIn = new JButton("Đăng Nhập", null));
		bChucNang1.add(Box.createHorizontalStrut(30));
		bChucNang1.add(btnExit = new JButton("Thoát"));

		panelRight.add(bAccount);
		panelRight.add(Box.createVerticalStrut(10));
		panelRight.add(bPassword);
		panelRight.add(Box.createVerticalStrut(10));
		panelRight.add(bChucNang);
		panelRight.add(Box.createVerticalStrut(10));
		panelRight.add(bChucNang1);
		panelRight.add(Box.createVerticalStrut(50));

		// Event 
		cbShowPass.addActionListener(this);
		btnSignIn.addActionListener(this);
		btnExit.addActionListener(this);

		txtPassword.addKeyListener(this);
	}

	private void dangNhap() {
		//
		String taiKhoan = txtAccount.getText();
		String matKhau = txtPassword.getText();
		
		TaiKhoan tk = new TaiKhoan(taiKhoan, matKhau);
		
		//
		
		this.dispose();
		NhanVien nv = new NhanVien();
		new GUI_TrangChu(nv).setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();

		if(o.equals(cbShowPass)) {
			if(cbShowPass.isSelected()) {
				txtPassword.setEchoChar((char)0);
			}else {
				txtPassword.setEchoChar('*');
			}			
		} else if(o.equals(btnSignIn)) {
			dangNhap();
		} else if(o.equals(btnExit)) {
			System.exit(0);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		Object o =e.getKeyCode();
		if(o.equals(KeyEvent.VK_ENTER)) {
			dangNhap();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}	
}
