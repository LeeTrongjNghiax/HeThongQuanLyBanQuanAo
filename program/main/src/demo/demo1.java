package demo;

import javax.swing.JOptionPane;

public class demo1 {
	public static void main(String[] args) {
		String s = "";
		for(int i = 0; i<2;i++) {
			String b = ""+String.valueOf(i);
			s += "mau = " + b + ",";
		}
		String[] s1 = null;
		s1 = s.split("\\,");
		String m = "";
		m = s.join(" and ", s1);
		System.out.println(m);
	}
}
