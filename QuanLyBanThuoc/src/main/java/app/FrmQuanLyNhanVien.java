package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class FrmQuanLyNhanVien extends JPanel {

	private JFrame frame;
	private JTextField txttim;
	private JTextField txthoten;
	private JTextField txtdiachi;
	private JTextField txtchucvu;
	private JTextField txtsdt;
	private JTable tbl;
	private JLabel lblNewLabel;


	/**
	 * Create the application.
	 */
	public FrmQuanLyNhanVien() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1043, 736);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		
		
		JPanel pMain = new JPanel();
		pMain.setBackground(Color.WHITE);
		pMain.setBounds(-62, -132, 1102, 848);
		add(pMain);
		pMain.setLayout(null);
		
		JLabel lblQLNV = new JLabel("Quản lý nhân viên ");
		lblQLNV.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblQLNV.setBounds(91, 160, 236, 53);
		pMain.add(lblQLNV);
		
		JLabel lblTim = new JLabel("Tìm kiếm:");
		lblTim.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblTim.setBounds(442, 176, 75, 28);
		pMain.add(lblTim);
		
		txttim = new JTextField();
		txttim.setColumns(10);
		txttim.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		txttim.setBounds(550, 177, 228, 32);
		txttim.setBorder(new LineBorder(new Color(91, 155, 213)));
		pMain.add(txttim);
		
		JButton btntim = new JButton("Tìm");
		btntim.setFont(new Font("Tahoma", Font.BOLD, 15));
		btntim.setBackground(new Color(41, 242, 255));
		btntim.setBounds(815, 176, 93, 32);
		pMain.add(btntim);
		
		JLabel lblhoten = new JLabel("Họ và tên:");
		lblhoten.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblhoten.setBounds(120, 223, 107, 32);
		pMain.add(lblhoten);
		
		txthoten = new JTextField();
		txthoten.setColumns(10);
		txthoten.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		txthoten.setBounds(198, 223, 172, 32);
		txthoten.setBorder(new LineBorder(new Color(91, 155, 213)));
		pMain.add(txthoten);
		
		JLabel lblsdt = new JLabel("Số điện thoại:");
		lblsdt.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblsdt.setBounds(407, 223, 107, 32);
		pMain.add(lblsdt);
		
		JLabel lblngaysinh = new JLabel("Ngày sinh:");
		lblngaysinh.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblngaysinh.setBounds(734, 219, 107, 32);
		pMain.add(lblngaysinh);
		
		JDateChooser datengaysx = new JDateChooser();
		datengaysx.setBounds(831, 227, 190, 28);
		pMain.add(datengaysx);
		
		JLabel lbldiachi = new JLabel("Địa chỉ:");
		lbldiachi.setFont(new Font("SansSerif", Font.BOLD, 15));
		lbldiachi.setBounds(120, 265, 107, 32);
		pMain.add(lbldiachi);
		
		txtdiachi = new JTextField();
		txtdiachi.setColumns(10);
		txtdiachi.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		txtdiachi.setBounds(198, 265, 172, 33);
		txtdiachi.setBorder(new LineBorder(new Color(91, 155, 213)));
		pMain.add(txtdiachi);
		
		JLabel lblgioitinh = new JLabel("Giới tính");
		lblgioitinh.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblgioitinh.setBounds(407, 265, 107, 32);
		pMain.add(lblgioitinh);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(511, 265, 138, 32);
		pMain.add(comboBox);
		
		JLabel lblchucvu = new JLabel("Chức vụ");
		lblchucvu.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblchucvu.setBounds(734, 265, 107, 32);
		pMain.add(lblchucvu);
		
		txtchucvu = new JTextField();
		txtchucvu.setColumns(10);
		txtchucvu.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		txtchucvu.setBounds(831, 268, 188, 32);
		txtchucvu.setBorder(new LineBorder(new Color(91, 155, 213)));
		pMain.add(txtchucvu);
		
		JButton btnthem = new JButton("Thêm");
		btnthem.setForeground(Color.BLACK);
		btnthem.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnthem.setBackground(Color.CYAN);
		btnthem.setBounds(274, 319, 107, 33);
		pMain.add(btnthem);
		
		txtsdt = new JTextField();
		txtsdt.setColumns(10);
		txtsdt.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		txtsdt.setBounds(511, 223, 172, 32);
		txtsdt.setBorder(new LineBorder(new Color(91, 155, 213)));
		pMain.add(txtsdt);
		
		JButton btnsua = new JButton("Sửa");
		btnsua.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnsua.setBackground(Color.CYAN);
		btnsua.setBounds(424, 319, 89, 33);
		pMain.add(btnsua);
		
		JButton btnlammoi = new JButton("Làm mới");
		btnlammoi.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnlammoi.setBackground(Color.CYAN);
		btnlammoi.setBounds(577, 319, 107, 33);
		pMain.add(btnlammoi);
		
		JButton btnhuy = new JButton("Hủy tài khoản");
		btnhuy.setForeground(Color.BLACK);
		btnhuy.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnhuy.setBackground(Color.CYAN);
		btnhuy.setBounds(734, 319, 140, 33);
		pMain.add(btnhuy);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(83, 379, 974, 397);
		pMain.add(scrollPane);
		
		String column[] = { "Mã nhân viên","Họ tên","Giới tính", "Ngày sinh","Địa chỉ","Chứ vụ","Số điện thoại"};
		DefaultTableModel modelthuoc = new DefaultTableModel(column, 0);
		tbl = new JTable(modelthuoc);
		scrollPane.setViewportView(tbl);
		
		JTableHeader tbHeader = tbl.getTableHeader();
		tbHeader.setBackground(new Color(91, 155, 213,80));
		tbHeader.setForeground(Color.CYAN);
		tbHeader.setFont(new Font("SansSerif", Font.BOLD, 20));
		
		
		tbl.setSelectionBackground(new Color(91, 155, 213,30));
		tbl.setSelectionForeground(new Color(91, 155, 213));
		tbl.setRowHeight(30);
		
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("data\\img\\bg.png"));
		lblNewLabel.setBounds(40, 136, 1052, 712);
		pMain.add(lblNewLabel);
		
		JButton btnLammoi = new JButton("Làm mới");
		btnLammoi.setBackground(Color.CYAN);
		btnLammoi.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnLammoi.setBounds(947, 176, 110, 32);
		pMain.add(btnLammoi);
		
	
	}
}
