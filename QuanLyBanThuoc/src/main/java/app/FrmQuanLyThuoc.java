package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import com.toedter.calendar.JDateChooser;

public class FrmQuanLyThuoc extends JPanel {

	private JFrame frame;
	private JTextField txttimkiemthuoc;
	private JTable tbl;
	private JTextField txttenthuoc;
	private JTextField txtloaithuoc;
	private JTextField txtsoluong;
	private JTextField txtdongia;
	private JTextField txttenncc;
	private JTextField txtdiachi;
	private JTextField txtnuocsx;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public FrmQuanLyThuoc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1031, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		setLayout(null);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 1370, 700);
		add(panel_1);
		panel_1.setLayout(null);
		
		JButton btntim = new JButton("Tìm");
		btntim.setFont(new Font("Tahoma", Font.BOLD, 15));
		btntim.setBackground(new Color(41, 242, 255));
//		jbtim.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		btntim.setBounds(836, 41, 93, 33);
		panel_1.add(btntim);
		
		JButton btnthem = new JButton("Thêm");
		btnthem.setBackground(Color.CYAN);
		btnthem.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnthem.setForeground(Color.BLACK);
		btnthem.setBounds(195, 229, 107, 33);
		panel_1.add(btnthem);
		
		JButton btnxoa = new JButton("Xóa");
		btnxoa.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnxoa.setBackground(Color.CYAN);
		btnxoa.setBounds(382, 229, 93, 33);
		panel_1.add(btnxoa);
		
		JButton btnsua = new JButton("Sửa");
		btnsua.setBackground(Color.CYAN);
		btnsua.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnsua.setBounds(547, 229, 89, 33);
		panel_1.add(btnsua);
		
		JButton btnlammoi = new JButton("Làm mới");
		btnlammoi.setBackground(Color.CYAN);
		btnlammoi.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnlammoi.setBounds(714, 229, 107, 33);
		panel_1.add(btnlammoi);
		
		JLabel lbltimthuoc = new JLabel("Tìm kiếm:");
		lbltimthuoc.setFont(new Font("SansSerif", Font.BOLD, 15));
		lbltimthuoc.setBounds(483, 41, 80, 32);
		panel_1.add(lbltimthuoc);
		
		JLabel lbltieudequanlythuoc = new JLabel("Quản lý thuốc");
		lbltieudequanlythuoc.setFont(new Font("SansSerif", Font.BOLD, 25));
		lbltieudequanlythuoc.setBounds(10, 29, 178, 48);
		panel_1.add(lbltieudequanlythuoc);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 273, 977, 397);
		String column[] = { "Mã thuốc","Tên thuốc","Loại thuốc", "Ngày SX","Hạn SD","Đơn giá","Số lượng","Tên NCC","Địa chỉ","Nước SX"};
		DefaultTableModel modelthuoc = new DefaultTableModel(column, 0);
		
		JLabel lbltenthuong = new JLabel("Tên thuốc:");
		lbltenthuong.setFont(new Font("SansSerif", Font.BOLD, 15));
		lbltenthuong.setBounds(31, 88, 107, 32);
		panel_1.add(lbltenthuong);
		
		JLabel lblloaithuoc = new JLabel("Loại thuốc:");
		lblloaithuoc.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblloaithuoc.setBounds(359, 88, 114, 32);
		panel_1.add(lblloaithuoc);
		
		JLabel lblsoluong = new JLabel("Số lượng:");
		lblsoluong.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblsoluong.setBounds(701, 91, 120, 26);
		panel_1.add(lblsoluong);
		
		JLabel lbldongia = new JLabel("Đơn giá:");
		lbldongia.setFont(new Font("SansSerif", Font.BOLD, 15));
		lbldongia.setBounds(31, 131, 93, 32);
		panel_1.add(lbldongia);
		
		JLabel lbltenncc = new JLabel("Tên NCC:");
		lbltenncc.setFont(new Font("SansSerif", Font.BOLD, 15));
		lbltenncc.setBounds(31, 174, 102, 27);
		panel_1.add(lbltenncc);
		
		JLabel lblngaysx = new JLabel("Ngày SX:");
		lblngaysx.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblngaysx.setBounds(359, 131, 93, 32);
		panel_1.add(lblngaysx);
		
		JLabel lbldiachi = new JLabel("Địa chỉ:");
		lbldiachi.setFont(new Font("SansSerif", Font.BOLD, 15));
		lbldiachi.setBounds(359, 171, 80, 32);
		panel_1.add(lbldiachi);
		
		JLabel lblhansd = new JLabel("Hạn SD:");
		lblhansd.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblhansd.setBounds(701, 128, 81, 32);
		panel_1.add(lblhansd);
		
		JLabel lblnuocsx = new JLabel("Nước SX:");
		lblnuocsx.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblnuocsx.setBounds(701, 171, 80, 32);
		panel_1.add(lblnuocsx);
		
		JDateChooser datehansd = new JDateChooser();
		datehansd.setBounds(803, 133, 178, 32);
		datehansd.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel_1.add(datehansd);
		
		JDateChooser datengaysx = new JDateChooser();
		datengaysx.setBounds(473, 131, 190, 32);
		datengaysx.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel_1.add(datengaysx);
		
		txttenthuoc = new JTextField();
		txttenthuoc.setBounds(143, 88, 172, 32);
		txttenthuoc.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel_1.add(txttenthuoc);
		txttenthuoc.setColumns(10);
		
		txtloaithuoc = new JTextField();
		txtloaithuoc.setBounds(473, 90, 190, 32);
		txtloaithuoc.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel_1.add(txtloaithuoc);
		txtloaithuoc.setColumns(10);
		
		txtsoluong = new JTextField();
		txtsoluong.setBounds(803, 90, 178, 32);
		txtsoluong.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel_1.add(txtsoluong);
		txtsoluong.setColumns(10);
		
		txtdongia = new JTextField();
		txtdongia.setBounds(143, 133, 172, 32);
		txtdongia.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel_1.add(txtdongia);
		txtdongia.setColumns(10);
		
		txttenncc = new JTextField();
		txttenncc.setBounds(143, 176, 172, 32);
		txttenncc.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel_1.add(txttenncc);
		txttenncc.setColumns(10);
		
		txtdiachi = new JTextField();
		txtdiachi.setBounds(474, 173, 189, 32);
		txtdiachi.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel_1.add(txtdiachi);
		txtdiachi.setColumns(10);
		
		txtnuocsx = new JTextField();
		txtnuocsx.setBounds(803, 174, 178, 32);
		txtnuocsx.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel_1.add(txtnuocsx);
		txtnuocsx.setColumns(10);
		panel_1.add(scrollPane);
		
		tbl = new JTable(modelthuoc);
		scrollPane.setViewportView(tbl);
		
		txttimkiemthuoc = new JTextField();
		txttimkiemthuoc.setBounds(573, 40, 228, 32);
		txttimkiemthuoc.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel_1.add(txttimkiemthuoc);
		txttimkiemthuoc.setColumns(10);
		
		JLabel jlbbg = new JLabel("");
		jlbbg.setIcon(new ImageIcon("data\\img\\bgbutton2.jpg"));
		jlbbg.setBounds(0, 0, 1025, 700);
		panel_1.add(jlbbg);
		
		

	}
}
