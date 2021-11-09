package app;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

public class FrmDSKH extends JFrame {

	private JPanel contentPane;
	private JTextField txtTim;
	private JTable tbldsThuoc;
	private JTable table;
	private JTable tbldsKH;
	private JTable table_1;

	

	/**
	 * Create the frame.
	 */
	public FrmDSKH() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1012, 672);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 998, 651);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, -12, 1003, 671);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTieude = new JLabel("Chi tiết thông tin khách hàng");
		lblTieude.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblTieude.setBounds(10, 20, 353, 48);
		panel_1.add(lblTieude);
		
		JLabel lblTim = new JLabel("Tìm kiếm:");
		lblTim.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblTim.setBounds(427, 34, 75, 28);
		panel_1.add(lblTim);
		
		txtTim = new JTextField();
		txtTim.setColumns(10);
		txtTim.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		txtTim.setBounds(512, 34, 206, 33);
		txtTim.setBorder(new LineBorder(new Color(91, 155, 213)));
		panel_1.add(txtTim);
		
		JButton btntim = new JButton("Tìm");
		btntim.setFont(new Font("Tahoma", Font.BOLD, 15));
		btntim.setBackground(new Color(41, 242, 255));
		btntim.setBounds(746, 35, 108, 33);
		panel_1.add(btntim);
		
		JLabel lblThuocdamua = new JLabel("Thuốc đã mua:");
		lblThuocdamua.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblThuocdamua.setBounds(168, 335, 112, 20);
		panel_1.add(lblThuocdamua);
		
		JLabel lblslthuoc = new JLabel("Số lượng thuốc đã mua:");
		lblslthuoc.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblslthuoc.setBounds(520, 331, 198, 28);
		panel_1.add(lblslthuoc);
		
		JPanel pThuoc = new JPanel();
		pThuoc.setBounds(10, 365, 983, 252);
		panel_1.add(pThuoc);
		pThuoc.setBorder(new TitledBorder(new LineBorder(new Color(91, 155, 213)), "Danh sách thuốc", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		pThuoc.setBackground(new Color(255,255,255,10));
		pThuoc.setLayout(null);
		
		JScrollPane dsThuoc = new JScrollPane();
		dsThuoc.setBounds(10, 20, 963, 222);
		pThuoc.add(dsThuoc);
		
		
		String column[] = { "Tên thuốc","Loại thuốc", "Nước sản xuất","Số lượng","Đơn giá","Tổng tiền"};
		DefaultTableModel modelthuoc = new DefaultTableModel(column, 0);
		tbldsThuoc = new JTable(modelthuoc);
		dsThuoc.setViewportView(tbldsThuoc);
		
		JTableHeader tbHeader1 = tbldsThuoc.getTableHeader();
		tbHeader1.setBackground(new Color(91, 155, 213,80));
		tbHeader1.setForeground(Color.CYAN);
		tbHeader1.setFont(new Font("SansSerif", Font.BOLD, 20));

//		
		tbldsThuoc.setSelectionBackground(new Color(91, 155, 213,30));
		tbldsThuoc.setSelectionForeground(new Color(91, 155, 213));
		tbldsThuoc.setRowHeight(30);

		
		JLabel lblThuocdamua1 = new JLabel("0");
		lblThuocdamua1.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblThuocdamua1.setForeground(Color.RED);
		lblThuocdamua1.setBounds(297, 333, 133, 20);
		panel_1.add(lblThuocdamua1);
		
		JLabel lblSLThuoc = new JLabel("0");
		lblSLThuoc.setForeground(Color.RED);
		lblSLThuoc.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblSLThuoc.setBounds(714, 333, 133, 20);
		panel_1.add(lblSLThuoc);
		
		JLabel lblthanhtien = new JLabel("0VNĐ");
		lblthanhtien.setForeground(Color.RED);
		lblthanhtien.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblthanhtien.setBounds(846, 627, 167, 20);
		panel_1.add(lblthanhtien);
		
		JLabel lblSubThanhTien = new JLabel("Thành tiền:");
		lblSubThanhTien.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblSubThanhTien.setBounds(736, 627, 101, 20);
		panel_1.add(lblSubThanhTien);
		
		JPanel pKH = new JPanel();
		pKH.setBounds(10, 79, 983, 246);
		panel_1.add(pKH);
		pKH.setBorder(new TitledBorder(new LineBorder(new Color(91, 155, 213)), "Danh sách khách hàng", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		pKH.setBackground(new Color(255,255,255,10));
		pKH.setLayout(null);
		
		JScrollPane dsKH = new JScrollPane();
		dsKH.setBounds(10, 20, 963, 201);
		pKH.add(dsKH);
		
		String columnKH[] = { "Mã khách hàng","Tên khách hàng", "Ngày sinh","Giới tính","Số điện thoại","Địa chỉ"};
		DefaultTableModel modelKhachhang = new DefaultTableModel(columnKH, 0);
		tbldsKH = new JTable(modelKhachhang);
		dsKH.setViewportView(tbldsKH);
		
		JTableHeader tbHeader = tbldsKH.getTableHeader();
		tbHeader.setBackground(new Color(91, 155, 213,80));
		tbHeader.setForeground(Color.CYAN);
		tbHeader.setFont(new Font("SansSerif", Font.BOLD, 20));
		
		
		tbldsKH.setSelectionBackground(new Color(91, 155, 213,30));
		tbldsKH.setSelectionForeground(new Color(91, 155, 213));
		tbldsKH.setRowHeight(30);
		
		JButton btnLammoi = new JButton("Làm mới");
		btnLammoi.setBackground(Color.CYAN);
		btnLammoi.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnLammoi.setBounds(875, 34, 108, 34);
		panel_1.add(btnLammoi);
		
		
	}
}
