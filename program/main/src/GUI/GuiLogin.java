package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class GuiLogin implements ActionListener{

	private JFrame frame;
	private JTextField txttaikhoan;
	private JTextField txtmatkhau;
	private JPanel panel;
	private JLabel lbimg;
	private JLabel lbquanly;
	private JLabel lbtaiKhoan;
	private JLabel lbmatkhau;
	private JButton btnquenmatkhau;
	private JButton btnlogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiLogin window = new GuiLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GuiLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBackground(Color.WHITE);
		frame.setResizable(false);
		frame.getContentPane().setForeground(Color.WHITE);
		
		frame.setSize(500,400);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane();
		frame.getContentPane().setLayout(null);
		
		txttaikhoan = new JTextField();
		txttaikhoan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txttaikhoan.setBounds(275, 157, 201, 41);
		frame.getContentPane().add(txttaikhoan);
		txttaikhoan.setColumns(10);
		
		txtmatkhau = new JTextField();
		txtmatkhau.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtmatkhau.setColumns(10);
		txtmatkhau.setBounds(275, 208, 201, 41);
		frame.getContentPane().add(txtmatkhau);
		
		btnlogin = new JButton("Đăng Nhập");
		btnlogin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnlogin.setBounds(188, 279, 116, 41);
		frame.getContentPane().add(btnlogin);
		
		btnquenmatkhau = new JButton("Quên Mật Khẩu");
		btnquenmatkhau.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnquenmatkhau.setBounds(325, 279, 151, 41);
		frame.getContentPane().add(btnquenmatkhau);
		
		panel = new JPanel();
		panel.setBounds(10, 10, 168, 310);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lbimg = new JLabel();
		lbimg.setIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\avtlogin1.JPG"));
		lbimg.setBounds(10, 10, 148, 300);
		panel.add(lbimg);
		
		lbquanly = new JLabel("QUẢN LÝ CỬA HÀNG");
		lbquanly.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lbquanly.setHorizontalAlignment(SwingConstants.CENTER);
		lbquanly.setBounds(187, 38, 289, 77);
		frame.getContentPane().add(lbquanly);
		
		lbtaiKhoan = new JLabel("Tài Khoản");
		lbtaiKhoan.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbtaiKhoan.setBounds(188, 156, 77, 41);
		frame.getContentPane().add(lbtaiKhoan);
		
		lbmatkhau = new JLabel("Mật Khẩu");
		lbmatkhau.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbmatkhau.setBounds(188, 208, 77, 41);
		frame.getContentPane().add(lbmatkhau);
		btnlogin.addActionListener(this);
		
		

	}

	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o.equals(btnlogin)) {
			String tk = txttaikhoan.getText();
			String mk = txtmatkhau.getText();
			if (tk.equals("")) {
				JOptionPane.showMessageDialog(null, "Tài Khoản Không Được Để Trống 1");
			} 
			else if(mk.equals("123456")){
				System.out.println(tk +"/"+ mk);
				
			}else {
				JOptionPane.showMessageDialog(null, "Mật Khẩu Sai");
			}
			
		}
		
		
	}
}
