package demo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import GUI.Form_TaoKhachHang;

public class demoActionPanel {
	public static void main(String args[]) {
	    final JFrame frame = new JFrame();
	    Container contentPane = frame.getContentPane();
	    JButton b = new JButton("Hide for 5");
	    ActionListener action = new ActionListener() {
	      public void actionPerformed(ActionEvent actionEvent) {
	        frame.setVisible(false);
	        TimerTask task = new TimerTask() {
	          public void run() {
	            frame.setVisible(true);
	          }
	        };
	        Timer timer = new Timer();
	        timer.schedule(task, 5000);
	      }

	    };
	    b.addActionListener(action);
	    AncestorListener ancestor = new AncestorListener() {
	      public void ancestorAdded(AncestorEvent e) {
	        System.out.println("Added");
//	        Form_TaoKhachHang f = new Form_TaoKhachHang();
//	        f.setVisible(true);
	        
	        dumpInfo(e);
	      }

	      public void ancestorMoved(AncestorEvent e) {
	        System.out.println("Moved");
//	        Form_TaoKhachHang f = new Form_TaoKhachHang();
//	        f.setVisible(true);
	        dumpInfo(e);
	      }

	      public void ancestorRemoved(AncestorEvent e) {
	        System.out.println("Removed");
	        Form_TaoKhachHang f = new Form_TaoKhachHang();
	        f.setVisible(true);
	        dumpInfo(e);
	      }

	      private void dumpInfo(AncestorEvent e) {
	        System.out.println("\tAncestor: " + name(e.getAncestor()));
	        System.out.println("\tAncestorParent: "
	            + name(e.getAncestorParent()));
	        System.out.println("\tComponent: " + name(e.getComponent()));
	      }

	      private String name(Container c) {
	        return (c == null) ? null : c.getName();
	      }
	    };
	    b.addAncestorListener(ancestor);
	    contentPane.add(b, BorderLayout.NORTH);
	    frame.setSize(300, 200);
	    frame.setVisible(true);
	  }
	
}