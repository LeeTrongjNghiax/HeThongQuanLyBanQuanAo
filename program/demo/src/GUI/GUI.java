package GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import connectDB.ConnectDB;
import dao.NhanVien_DAO;
import dao.PhongBan_DAO;
import dao.General_DAO;
import entities.NhanVien;
import entities.PhongBan;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GUI extends JFrame implements ActionListener {
  JLabel lMain, lMaNhanVien, lHo, lTuoi, lTienLuong, lNhapMaSo, lPhong;
  JButton bTim, bThem, bXoaTrang, bXoa, bSua, bSaoLuu, bPhucHoi;
  JTextField tfMaNhanVien, tfHo, tfTuoi, tfTienLuong, tfNhapMaSo;
  JPanel pMain, pNorth, pCenter, pSouth, pSouthLeft, pSouthRight;
  Box bMain, b1, b2, b3, b4, b5;
  DefaultTableModel dtm;
  JTable table;
  JScrollPane sp;
  JComboBox<String> cb;
  private NhanVien_DAO nv_dao;
  private PhongBan_DAO pb_dao;
  private General_DAO g_dao;

  public GUI() {
    super("^-^");
    nv_dao = new NhanVien_DAO();
    pb_dao = new PhongBan_DAO();
    g_dao = new General_DAO();
    ConnectDB.getInstance().connect();
	  
    //---------------------------------------------------------------------------------

    lMain = new JLabel("THÔNG TIN NHÂN VIÊN");
    lMain.setFont(new Font("monospace", Font.BOLD, 20));
    lMain.setForeground(new Color(0, 0, 255));

    lMaNhanVien = new JLabel("Mã nhân viên: ");
    lHo = new JLabel("Họ: ");
    lTuoi = new JLabel("Tuổi: ");
    lTienLuong = new JLabel("Tiền lương: ");
    lNhapMaSo = new JLabel("Nhập mã số:");
    lPhong = new JLabel("Phòng: ");

    lHo.setPreferredSize(lMaNhanVien.getPreferredSize());
    lTuoi.setPreferredSize(lHo.getPreferredSize());
    lTienLuong.setPreferredSize(lTuoi.getPreferredSize());
    lPhong.setPreferredSize(lTuoi.getPreferredSize());

    bTim = new JButton("Tìm");
    bThem = new JButton("Thêm");
    bXoaTrang = new JButton("Xoá trắng");
    bXoa = new JButton("Xoá");
    bSua = new JButton("Sửa");
    bSaoLuu = new JButton("Sao Lưu");
    bPhucHoi = new JButton("Phục hồi");

    tfMaNhanVien = new JTextField(20);
    tfHo = new JTextField(10);
    tfTuoi = new JTextField(10);
    tfTienLuong = new JTextField(10);
    tfNhapMaSo = new JTextField(10);

    //---------------------------------------------------------------------------------

    pNorth = new JPanel();
    pNorth.add(lMain);
    add(pNorth, BorderLayout.NORTH);

    //---------------------------------------------------------------------------------

    pCenter = new JPanel();
    pCenter.setLayout(new BoxLayout(pCenter, BoxLayout.Y_AXIS));

    bMain = Box.createVerticalBox();
    b1 = Box.createHorizontalBox();
    b2 = Box.createHorizontalBox();
    b3 = Box.createHorizontalBox();
    b4 = Box.createHorizontalBox();
    b5 = Box.createHorizontalBox();

    b1.add(lMaNhanVien);
    b1.add(tfMaNhanVien);

    b2.add(lHo);
    b2.add(tfHo);

    b3.add(lTuoi);
    b3.add(tfTuoi);

    cb = new JComboBox<>();
    cb.setEditable(false);
    ArrayList<PhongBan> dsPhongBan = pb_dao.getAllTbPhongBan();
    for (PhongBan pb : dsPhongBan) {
    	cb.addItem(pb.getMaPhong());
    } 

    b4.add(lPhong);
    b4.add(cb);
    b4.add(lTienLuong);
    b4.add(tfTienLuong);

    //---------------------------------------------------------------------------------

    String[] cols = {"Mã NV", "Họ Tên", "Tuổi", "Phòng", "Tiền lương"};
    dtm = new DefaultTableModel(cols, 0);
    table = new JTable();
    JScrollPane sp = new JScrollPane(table);
    b5.add(sp);

		//---------------------------------------------------------------------------------

    bMain.add(b1);
    bMain.add(Box.createVerticalStrut(10));
    bMain.add(b2);
    bMain.add(Box.createVerticalStrut(10));
    bMain.add(b3);
    bMain.add(Box.createVerticalStrut(10));
    bMain.add(b4);
    bMain.add(Box.createVerticalStrut(10));
    bMain.add(b5);
    
    //---------------------------------------------------------------------------------

    pCenter.add(bMain);
    pCenter.setBorder(new EmptyBorder(5, 5, 5, 5));

    add(pCenter, BorderLayout.CENTER);

    //---------------------------------------------------------------------------------

    pSouth = new JPanel();
    pSouth.setLayout(new BoxLayout(pSouth, BoxLayout.X_AXIS));

    pSouthLeft = new JPanel();
    pSouthLeft.setLayout(new BoxLayout(pSouthLeft, BoxLayout.X_AXIS));
    pSouthLeft.add(lNhapMaSo);
    pSouthLeft.add(tfNhapMaSo);
    pSouthLeft.add(bTim);
    pSouthLeft.setBorder(new EmptyBorder(5, 5, 5, 5));

    pSouthRight = new JPanel();
    pSouthRight.setLayout(new BoxLayout(pSouthRight, BoxLayout.X_AXIS));
    pSouthRight.add(bThem);
    pSouthRight.add(bXoaTrang);
    pSouthRight.add(bXoa);
    pSouthRight.add(bSua);
    pSouthRight.add(bSaoLuu);
    pSouthRight.add(bPhucHoi);
    pSouthLeft.setBorder(new EmptyBorder(5, 5, 5, 5));

    JSplitPane splitP = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pSouthLeft, pSouthRight);

    pSouth.add(splitP);

    add(pSouth, BorderLayout.SOUTH);

    //---------------------------------------------------------------------------------

    bTim.addActionListener(this);
    bThem.addActionListener(this);
    bXoaTrang.addActionListener(this);
    bXoa.addActionListener(this);
    bSua.addActionListener(this);
    bSaoLuu.addActionListener(this);
    bPhucHoi.addActionListener(this);

    //---------------------------------------------------------------------------------

    setSize(700, 400);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    DocDuLieuDatabaseVaoTable();
  }

  public static boolean isNumeric(String strNum) {
    if (strNum == null) {
      return false;
    }
    try {
      Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
      return false;
    }
    return true;
  }

  public void actionPerformed(ActionEvent e) {
    Object o = e.getSource();

    if (o == bTim) btnTim();
    if (o == bThem) btnThem();
    if (o == bXoaTrang) btnXoaTrang();
    if (o == bXoa) btnXoa();
    if (o == bSua) btnSua();
    if (o == bSaoLuu) btnSaoLuu();
    if (o == bPhucHoi) btnPhucHoi();
  }

  public static void main(String[] args) {
    new GUI();
  }
  
  public void btnTim() {
	
  }
  
  public void btnThem() {
    String maNV = tfMaNhanVien.getText();
    String hoTen = tfHo.getText();
    int tuoi = Integer.parseInt(tfTuoi.getText());
    float luong = Float.parseFloat(tfTienLuong.getText());
    String pb = cb.getSelectedItem().toString();
    PhongBan phongBan = new PhongBan(pb);
    NhanVien nhanVien = new NhanVien(maNV, hoTen, tuoi, phongBan, luong);
    try {
      nv_dao.create(nhanVien);
      dtm.addRow(
        new Object[] {
          nhanVien.getMaNV(),
          nhanVien.getHoTen(),
          nhanVien.getTuoi(),
          nhanVien.getPhong().getMaPhong(),
          nhanVien.getTienLuong()
        }
      );
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, "Trùng mã nhân viên");
    }
  }

  public void btnXoaTrang() {
	  tfMaNhanVien.setText("");
    tfHo.setText("");
    tfHo.setText("");
    tfTuoi.setText("");
    tfTienLuong.setText("");
  }
  
  public void btnXoa() {
	  int row = table.getSelectedRow();
    if (row >= 0) {
      String maNV = (String) table.getValueAt(row, 0);
      if (nv_dao.delete(maNV)) {
        dtm.removeRow(row);
      }
    } else {
      JOptionPane.showConfirmDialog(this, "Phải chọn dòng cần xoá");
    }
  }
 
  public void btnSua() {
    int row = table.getSelectedRow();
    
    NhanVien nhanVien = new NhanVien(
      tfMaNhanVien.getText(),
      tfHo.getText(),
      Integer.parseInt(tfTuoi.getText()),
      new PhongBan(cb.getSelectedItem().toString()),
      Float.parseFloat(tfTienLuong.getText())
    );

    if (row >= 0) {
      if (nv_dao.update(nhanVien)) {
        dtm.setValueAt(tfHo.getText(), row, 1);
        dtm.setValueAt(tfTuoi.getText(), row, 2);
        dtm.setValueAt(cb.getSelectedItem().toString(), row, 3);
        dtm.setValueAt(tfTienLuong.getText(), row, 4);
      }
    } else {
      JOptionPane.showMessageDialog(this, "Phải chọn dòng cần sửa");
    }
  }
  
  public void DocDuLieuDatabaseVaoTable() {
	  NhanVien_DAO dsnv = new NhanVien_DAO();
    ArrayList<NhanVien> list = dsnv.getAllTbNhanVien();

    for (NhanVien nv : list) {
      String[] rowData = {
        nv.getMaNV(),
        nv.getHoTen(),
        nv.getTuoi() + "",
        nv.getPhong().getMaPhong(),
        nv.getTienLuong() + ""
      };
      dtm.addRow(rowData);
    }
    table.setModel(dtm);
  }

  public void btnSaoLuu() {
    if (g_dao.backup()) 
      JOptionPane.showMessageDialog(this, "Sao lưu thành công");
    else
      JOptionPane.showMessageDialog(this, "Sao lưu không thành công");
  }

  public void btnPhucHoi() {
    if (g_dao.restore()) {
      JOptionPane.showMessageDialog(this, "Phục hồi thành công");
    } else {
      JOptionPane.showMessageDialog(this, "Phục hồi không thành công");
    }
    DocDuLieuDatabaseVaoTable();
  }
}