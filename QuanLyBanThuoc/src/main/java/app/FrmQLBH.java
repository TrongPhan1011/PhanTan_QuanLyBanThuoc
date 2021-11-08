package app;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import com.toedter.calendar.JDateChooser;

public class FrmQLBH extends JPanel implements ActionListener,MouseListener {

	/**
	 * 
	 */
	private JFrame fMain;
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JTextField txtTimKiem;
	private JTextField txtTenKH;
	private JTextField txtSDT;
	private JTextField txtDiaChi;
	private JTextField txtSoLuong;
	private JTable table;
	private DefaultTableModel modelThuoc;
	private JTable tblThuoc;
	private JButton btnDSKH;
	private JDateChooser chooserNgaySinh;



	/**
	 * Create the application.
	 */


	public FrmQLBH(JFrame fMain) {
		// TODO Auto-generated constructor stub
		this.fMain = fMain;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1031, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		
		JPanel pMain = new JPanel();
		pMain.setBackground(Color.WHITE);
		pMain.setBounds(0, 0, 1031, 700);
		add(pMain);
		pMain.setLayout(null);

		JLabel lblQLBH = new JLabel("Quản lý bán hàng");
		lblQLBH.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblQLBH.setBounds(10, 32, 209, 33);
		pMain.add(lblQLBH);
		
		JLabel lblTim = new JLabel("Tìm kiếm:");
		lblTim.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblTim.setBounds(576, 43, 90, 18);
		pMain.add(lblTim);
		
		txtTimKiem = new JTextField();
		txtTimKiem.setBackground(Color.WHITE);
		txtTimKiem.setFont(new Font("SansSerif", Font.PLAIN, 15));
		txtTimKiem.setBounds(657, 36, 252, 33);
		pMain.add(txtTimKiem);
		txtTimKiem.setBorder(new LineBorder(new Color(91, 155, 213)));
		txtTimKiem.setColumns(10);
		
		JButton btnTim = new JButton("Tìm");
		btnTim.setBackground(new Color(41, 242, 255));
		btnTim.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnTim.setBounds(918, 35, 89, 35);
		pMain.add(btnTim);
		
		JPanel pKH = new JPanel();
		pKH.setBorder(new TitledBorder(new LineBorder(new Color(91, 155, 213)), "Th\u00F4ng tin kh\u00E1ch h\u00E0ng", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		pKH.setBackground(new Color(255,255,255,10));
		pKH.setBounds(10, 72, 637, 210);
		pMain.add(pKH);
		pKH.setLayout(null);
		
		JLabel lblTenKH = new JLabel("Tên khách hàng:");
		lblTenKH.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblTenKH.setBounds(10, 28, 133, 20);
		pKH.add(lblTenKH);
		
		txtTenKH = new JTextField();
		txtTenKH.setFont(new Font("SansSerif", Font.PLAIN, 15));
		txtTenKH.setBounds(139, 23, 158, 31);
		txtTenKH.setBorder(new LineBorder(new Color(91, 155, 213)));
		pKH.add(txtTenKH);
		txtTenKH.setColumns(10);
		
		JLabel lblSDT = new JLabel("Số điện thoại:");
		lblSDT.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblSDT.setBounds(10, 65, 133, 20);
		pKH.add(lblSDT);
		
		txtSDT = new JTextField();
		txtSDT.setFont(new Font("SansSerif", Font.PLAIN, 15));
		txtSDT.setColumns(10);
		txtSDT.setBounds(139, 60, 158, 31);
		txtSDT.setBorder(new LineBorder(new Color(91, 155, 213)));
		pKH.add(txtSDT);
		
		JLabel lblLoiKhchHng = new JLabel("Loại khách hàng:");
		lblLoiKhchHng.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblLoiKhchHng.setBounds(10, 99, 133, 20);
		pKH.add(lblLoiKhchHng);
		
		JComboBox cboLoaiKH = new JComboBox();
		cboLoaiKH.setBackground(Color.WHITE);
		cboLoaiKH.setFont(new Font("SansSerif", Font.PLAIN, 15));
		cboLoaiKH.setBounds(139, 96, 158, 31);
		cboLoaiKH.setBorder(new LineBorder(new Color(91, 155, 213)));
		pKH.add(cboLoaiKH);
		
		JLabel lblDiaChi = new JLabel("Địa chỉ:");
		lblDiaChi.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblDiaChi.setBounds(317, 65, 75, 20);
		pKH.add(lblDiaChi);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setFont(new Font("SansSerif", Font.PLAIN, 15));
		txtDiaChi.setColumns(10);
		txtDiaChi.setBounds(396, 60, 224, 31);
		txtDiaChi.setBorder(new LineBorder(new Color(91, 155, 213)));
		pKH.add(txtDiaChi);
		
		JComboBox cboGioiTinh = new JComboBox();
		cboGioiTinh.setBackground(Color.WHITE);
		cboGioiTinh.setFont(new Font("SansSerif", Font.PLAIN, 15));
		cboGioiTinh.setBounds(396, 96, 224, 31);
		cboGioiTinh.setBorder(new LineBorder(new Color(91, 155, 213)));
		pKH.add(cboGioiTinh);
		
		JLabel lblGioiTinh = new JLabel("Giới tính:");
		lblGioiTinh.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblGioiTinh.setBounds(317, 99, 133, 20);
		pKH.add(lblGioiTinh);
		
		JLabel lblNgaySinh = new JLabel("Ngày sinh:");
		lblNgaySinh.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNgaySinh.setBounds(317, 28, 93, 20);
		pKH.add(lblNgaySinh);
		
		JButton btnThemKH = new JButton("Thêm");
		btnThemKH.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnThemKH.setBounds(105, 165, 141, 34);
		btnThemKH.setBackground(new Color(41, 242, 255));
		pKH.add(btnThemKH);
		
		JButton btnSuaKH = new JButton("Sửa ");
		btnSuaKH.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnSuaKH.setBackground(new Color(41, 242, 255));
		btnSuaKH.setBounds(256, 165, 133, 34);
		pKH.add(btnSuaKH);
		
		JButton btnLamMoiKH = new JButton("Làm mới");
		btnLamMoiKH.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnLamMoiKH.setBackground(new Color(41, 242, 255));
		btnLamMoiKH.setBounds(399, 165, 133, 34);
		pKH.add(btnLamMoiKH);
		
		chooserNgaySinh = new JDateChooser();
		chooserNgaySinh.getCalendarButton().setFont(new Font("SansSerif", Font.PLAIN, 15));
		chooserNgaySinh.setBounds(396, 23, 224, 32);
		pKH.add(chooserNgaySinh);
		chooserNgaySinh.setBorder(BorderFactory.createLineBorder(new Color(91, 155, 213)));
		chooserNgaySinh.setDateFormatString("dd/MM/yyyy");
		
		
		chooserNgaySinh.setFont(new Font("SansSerif",Font.PLAIN, 15));
		
		
		//setBorder(new LineBorder(new Color(91, 155, 213)));
		JPanel pThuoc = new JPanel();
		pThuoc.setBackground(new Color(255,255,255,10));
		pThuoc.setBorder(new TitledBorder(new LineBorder(new Color(91, 155, 213)), "Th\u00F4ng tin thu\u1ED1c", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		pThuoc.setBounds(657, 72, 350, 210);
		pMain.add(pThuoc);
		pThuoc.setLayout(null);
		
		JLabel lblLoaiThuoc = new JLabel("Loại thuốc");
		lblLoaiThuoc.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblLoaiThuoc.setBounds(30, 27, 133, 20);
		pThuoc.add(lblLoaiThuoc);
		
		JComboBox cboLoaiThuoc = new JComboBox();
		cboLoaiThuoc.setBackground(Color.WHITE);
		cboLoaiThuoc.setFont(new Font("SansSerif", Font.PLAIN, 15));
		cboLoaiThuoc.setBounds(118, 24, 202, 31);
		cboLoaiThuoc.setBorder(new LineBorder(new Color(91, 155, 213)));
		pThuoc.add(cboLoaiThuoc);
		
		JLabel lblTenThuoc = new JLabel("Tên thuốc");
		lblTenThuoc.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblTenThuoc.setBounds(30, 65, 133, 20);
		pThuoc.add(lblTenThuoc);
		
		JComboBox cboTenThuoc = new JComboBox();
		cboTenThuoc.setBackground(Color.WHITE);
		cboTenThuoc.setFont(new Font("SansSerif", Font.PLAIN, 15));
		cboTenThuoc.setBounds(118, 60, 202, 31);
		cboTenThuoc.setBorder(new LineBorder(new Color(91, 155, 213)));
		pThuoc.add(cboTenThuoc);
		
		JLabel lblSoLuong = new JLabel("Số lượng");
		lblSoLuong.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblSoLuong.setBounds(30, 101, 75, 20);
		pThuoc.add(lblSoLuong);
		
		txtSoLuong = new JTextField();
		txtSoLuong.setFont(new Font("SansSerif", Font.PLAIN, 15));
		txtSoLuong.setColumns(10);
		txtSoLuong.setBounds(118, 96, 202, 31);
		txtSoLuong.setBorder(new LineBorder(new Color(91, 155, 213)));
		pThuoc.add(txtSoLuong);
		
		JRadioButton rdoGiamSL = new JRadioButton("Giảm số lượng");
		rdoGiamSL.setBackground(new Color(222,240,250));
		rdoGiamSL.setFont(new Font("SansSerif", Font.BOLD, 15));
		rdoGiamSL.setBounds(118, 134, 142, 23);
		pThuoc.add(rdoGiamSL);
		
		JButton btnThemThuoc = new JButton("Thêm thuốc");
		btnThemThuoc.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnThemThuoc.setBounds(30, 164, 133, 34);
		btnThemThuoc.setBackground(new Color(41, 242, 255));
		pThuoc.add(btnThemThuoc);
		
		JButton btnXoaThuoc = new JButton("Xóa thuốc");
		btnXoaThuoc.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnXoaThuoc.setBackground(new Color(41, 242, 255));
		btnXoaThuoc.setBounds(187, 164, 133, 34);
		pThuoc.add(btnXoaThuoc);
		

		String col [] = {"Tên thuốc", "Loại thuốc", "Số lượng", "Đơn giá","Tổng tiền"};
		modelThuoc = new DefaultTableModel(col,0);
		
		
		
		tblThuoc = new JTable(modelThuoc);
		tblThuoc.setBackground(Color.WHITE);
		tblThuoc.setFont(new Font("SansSerif", Font.PLAIN, 13));
		
		
		JTableHeader tbHeader = tblThuoc.getTableHeader();
		tbHeader.setBackground(new Color(91, 155, 213,80));
		tbHeader.setForeground(Color.CYAN);
		tbHeader.setFont(new Font("SansSerif", Font.BOLD, 20));
		
		
		tblThuoc.setSelectionBackground(new Color(91, 155, 213,30));
		tblThuoc.setSelectionForeground(new Color(91, 155, 213));
		tblThuoc.setRowHeight(30);
		
		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
		
		tblThuoc.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
		tblThuoc.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
		tblThuoc.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
		
		JScrollPane spMatHang = new JScrollPane(tblThuoc);
		spMatHang.setViewportBorder(null);
		spMatHang.setBounds(10, 292, 997, 328);
		spMatHang.setBorder(new LineBorder(new Color(91, 155, 213), 1, true));
		spMatHang.setBackground(Color.white);
		pMain.add(spMatHang);
		
		JButton btnLamMoiGD = new JButton("Làm mới giao diện");
		btnLamMoiGD.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnLamMoiGD.setBackground(new Color(41, 242, 255));
		btnLamMoiGD.setBounds(235, 655, 209, 34);
		pMain.add(btnLamMoiGD);
		
		JLabel lblSubThanhTien = new JLabel("Thành tiền:");
		lblSubThanhTien.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblSubThanhTien.setBounds(733, 624, 101, 20);
		pMain.add(lblSubThanhTien);
		
		JLabel lblThanhTien = new JLabel("123 VNĐ");
		lblThanhTien.setForeground(new Color(255, 0, 0));
		lblThanhTien.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblThanhTien.setBounds(840, 624, 167, 20);
		pMain.add(lblThanhTien);
		
		JButton btnThanhToan = new JButton("Thanh toán");
		btnThanhToan.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnThanhToan.setBackground(new Color(41, 242, 255));
		btnThanhToan.setBounds(812, 655, 195, 34);
		pMain.add(btnThanhToan);
		
		btnDSKH = new JButton("Danh sách khách hàng");
		btnDSKH.setBounds(10, 655, 218, 34);
		pMain.add(btnDSKH);
		btnDSKH.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnDSKH.setBackground(new Color(41, 242, 255));
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setBounds(0, 0, 1031, 700);
		lblBackground.setIcon(new ImageIcon("data\\img\\bg.png"));
		pMain.add(lblBackground);
		
		//test
		modelThuoc.addRow(new Object[] {"123","123"});
		modelThuoc.addRow(new Object[] {"123","123"});
		modelThuoc.addRow(new Object[] {"123","123"});
		modelThuoc.addRow(new Object[] {"123","123"});
		
		
		
		//action
		btnDSKH.addActionListener(this);
		
		
	}
	
	
	public void loadFrmDSKH() {
		FrmDSKH frmKH = new FrmDSKH();
		frmKH.setVisible(true);
		
		
		fMain.setVisible(false);

		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o.equals(btnDSKH)) {
			loadFrmDSKH();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
