package demo;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import GUI.Form_TaoKhachHang;

public class demo2 extends JFrame implements AncestorListener, MouseListener{
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	public demo2() {
		setSize(500, 500);
		add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		panel.add(panel1);
		panel1.setBackground(Color.red);
		
		panel.add(panel2);
		panel2.setBackground(Color.blue);
		panel.addAncestorListener(this);
		panel.addMouseListener(this);
		panel1.addMouseListener(this);
		panel2.addMouseListener(this);
	}

	public static void main(String[] args) {
		new demo2().setVisible(true);
	}
	
	@Override
	public void ancestorAdded(AncestorEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ancestorRemoved(AncestorEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ancestorMoved(AncestorEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(panel1)) {
			new Form_TaoKhachHang().setVisible(true);
		} else if(e.getSource().equals(panel2)) {
			JOptionPane.showMessageDialog(null, "Panel 2");
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
