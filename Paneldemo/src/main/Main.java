package main;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import paneldemo.ThongKeSanPham;
import paneldemo.panelThongKe;

public class Main extends JFrame{
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int with = screenSize.width;
	int height = screenSize.height;
	public Main() {
		// TODO Auto-generated constructor stub
		setSize(with,height);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		mainDemo();
		
	}
	private void mainDemo() {
		// TODO Auto-generated method stub
		panelThongKe pnKe = new panelThongKe();//182
		
		getContentPane().add(pnKe);
	

	}
	public static void main(String[] args) {
		new Main().setVisible(true);
		
	}

}
