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
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FrmQuanLyNhanVien extends JPanel {

	private JFrame frame;
	private JTextField textField;
	private JTextField txthoten;
	private JTextField txtdiachi;
	private JTextField txtchucvu;
	private JTextField txtsdt;
	private JTable table;


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
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(-62, -132, 1102, 848);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblQLNV = new JLabel("Quản lý nhân viên ");
		lblQLNV.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblQLNV.setBounds(91, 160, 236, 53);
		panel_1.add(lblQLNV);
		
		JLabel lblTim = new JLabel("Tìm kiếm:");
		lblTim.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblTim.setBounds(554, 176, 75, 28);
		panel_1.add(lblTim);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		textField.setBounds(665, 177, 228, 32);
		panel_1.add(textField);
		
		JButton btntim = new JButton("Tìm");
		btntim.setFont(new Font("Tahoma", Font.BOLD, 15));
		btntim.setBackground(new Color(41, 242, 255));
		btntim.setBounds(928, 176, 93, 33);
		panel_1.add(btntim);
		
		JLabel lblhoten = new JLabel("Họ và tên:");
		lblhoten.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblhoten.setBounds(120, 223, 107, 32);
		panel_1.add(lblhoten);
		
		txthoten = new JTextField();
		txthoten.setColumns(10);
		txthoten.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		txthoten.setBounds(198, 223, 172, 32);
		panel_1.add(txthoten);
		
		JLabel lblsdt = new JLabel("Số điện thoại:");
		lblsdt.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblsdt.setBounds(407, 223, 107, 32);
		panel_1.add(lblsdt);
		
		JLabel lblngaysinh = new JLabel("Ngày sinh:");
		lblngaysinh.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblngaysinh.setBounds(734, 219, 107, 32);
		panel_1.add(lblngaysinh);
		
		JDateChooser datengaysx = new JDateChooser();
		datengaysx.setBounds(831, 227, 190, 28);
		panel_1.add(datengaysx);
		
		JLabel lbldiachi = new JLabel("Địa chỉ:");
		lbldiachi.setFont(new Font("SansSerif", Font.BOLD, 15));
		lbldiachi.setBounds(120, 265, 107, 32);
		panel_1.add(lbldiachi);
		
		txtdiachi = new JTextField();
		txtdiachi.setColumns(10);
		txtdiachi.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		txtdiachi.setBounds(198, 265, 172, 33);
		panel_1.add(txtdiachi);
		
		JLabel lblgioitinh = new JLabel("Giới tính");
		lblgioitinh.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblgioitinh.setBounds(407, 265, 107, 32);
		panel_1.add(lblgioitinh);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(511, 265, 138, 32);
		panel_1.add(comboBox);
		
		JLabel lblchucvu = new JLabel("Chức vụ");
		lblchucvu.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblchucvu.setBounds(734, 265, 107, 32);
		panel_1.add(lblchucvu);
		
		txtchucvu = new JTextField();
		txtchucvu.setColumns(10);
		txtchucvu.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		txtchucvu.setBounds(831, 268, 188, 32);
		panel_1.add(txtchucvu);
		
		JButton btnthem = new JButton("Thêm");
		btnthem.setForeground(Color.BLACK);
		btnthem.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnthem.setBackground(Color.CYAN);
		btnthem.setBounds(274, 319, 107, 33);
		panel_1.add(btnthem);
		
		txtsdt = new JTextField();
		txtsdt.setColumns(10);
		txtsdt.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		txtsdt.setBounds(511, 223, 172, 32);
		panel_1.add(txtsdt);
		
		JButton btnsua = new JButton("Sửa");
		btnsua.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnsua.setBackground(Color.CYAN);
		btnsua.setBounds(424, 319, 89, 33);
		panel_1.add(btnsua);
		
		JButton btnlammoi = new JButton("Làm mới");
		btnlammoi.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnlammoi.setBackground(Color.CYAN);
		btnlammoi.setBounds(577, 319, 107, 33);
		panel_1.add(btnlammoi);
		
		JButton btnhuy = new JButton("Hủy tài khoản");
		btnhuy.setForeground(Color.BLACK);
		btnhuy.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnhuy.setBackground(Color.CYAN);
		btnhuy.setBounds(734, 319, 140, 33);
		panel_1.add(btnhuy);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(83, 379, 974, 397);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã sản phẩm", "Họ và tên", "Giới tính", "Ngày sinh", "Địa chỉ", "Chức vụ", "SĐT"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("data\\img\\bg.png"));
		lblNewLabel.setBounds(63, 136, 1052, 712);
		panel_1.add(lblNewLabel);
		
	//add(panel_1);
	}
}
