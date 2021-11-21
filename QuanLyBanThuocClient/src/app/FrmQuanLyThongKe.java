package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

import javax.swing.border.EtchedBorder;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class FrmQuanLyThongKe extends JPanel{

	private JFrame frame;


	/**
	 * Create the application.
	 */
	public FrmQuanLyThongKe() {
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
		pMain.setBounds(0, 25, 1031, 675);
		add(pMain);
		pMain.setLayout(null);
		
		JLabel lblQLTK = new JLabel("Quản lý thống kê");
		lblQLTK.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblQLTK.setBounds(10, 11, 221, 33);
		pMain.add(lblQLTK);
		
		JLabel lblNgay = new JLabel("Thời gian:");
		lblNgay.setFont(new Font("SansSerif", Font.BOLD, 17));
		lblNgay.setBounds(565, 11, 89, 33);
		pMain.add(lblNgay);
		
		JLabel lblNgayTK = new JLabel("10/10/2021");
		lblNgayTK.setForeground(Color.RED);
		lblNgayTK.setFont(lblNgayTK.getFont().deriveFont(lblNgayTK.getFont().getStyle() | Font.BOLD | Font.ITALIC, 17f));
		lblNgayTK.setBounds(664, 11, 111, 33);
		pMain.add(lblNgayTK);
		JPanel pThongTinTK = new JPanel();
		
		pThongTinTK.setBorder(new TitledBorder(new LineBorder(new Color(91, 155, 213), 2), "Ch\u1ECDn m\u1EE5c th\u1ED1ng k\u00EA", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pThongTinTK.setBackground(Color.WHITE);
		pThongTinTK.setBounds(10, 46, 242, 583);
		pMain.add(pThongTinTK);
		
		JDateChooser chooserNgaySinh = new JDateChooser();
		chooserNgaySinh.getCalendarButton().setFont(new Font("SansSerif", Font.PLAIN, 15));
		chooserNgaySinh.setBounds(80, 97, 154, 32);
		pThongTinTK.add(chooserNgaySinh);
		chooserNgaySinh.setBorder(BorderFactory.createLineBorder(new Color(91, 155, 213)));
		chooserNgaySinh.setDateFormatString("dd/MM/yyyy");
		chooserNgaySinh.setFont(new Font("SansSerif",Font.PLAIN, 15));
		
		pThongTinTK.setLayout(null);
		
		JRadioButton rdoThongKeTheoNgay = new JRadioButton("Thống kê theo ngày");
		rdoThongKeTheoNgay.setBackground(Color.WHITE);
		rdoThongKeTheoNgay.setFont(new Font("SansSerif", Font.BOLD, 15));
		rdoThongKeTheoNgay.setBounds(10, 46, 224, 32);
		pThongTinTK.add(rdoThongKeTheoNgay);
		
		JRadioButton rdoThongKeTheoThang = new JRadioButton("Thống kê theo tháng");
		rdoThongKeTheoThang.setBackground(Color.WHITE);
		rdoThongKeTheoThang.setFont(new Font("SansSerif", Font.BOLD, 15));
		rdoThongKeTheoThang.setBounds(10, 175, 224, 32);
		pThongTinTK.add(rdoThongKeTheoThang);
		
		JComboBox cboThang = new JComboBox();
		cboThang.setBackground(Color.WHITE);
		cboThang.setFont(new Font("SansSerif", Font.PLAIN, 15));
		cboThang.setBounds(80, 226, 154, 31);
		cboThang.setBorder(new LineBorder(new Color(91, 155, 213)));
		pThongTinTK.add(cboThang);
		
		JComboBox cboThangNam = new JComboBox();
		cboThangNam.setFont(new Font("SansSerif", Font.PLAIN, 15));
		cboThangNam.setBorder(new LineBorder(new Color(91, 155, 213)));
		cboThangNam.setBackground(Color.WHITE);
		cboThangNam.setBounds(80, 268, 154, 31);
		pThongTinTK.add(cboThangNam);
		
		JLabel lblSubNgay = new JLabel("Ngày:");
		lblSubNgay.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblSubNgay.setBounds(10, 97, 67, 32);
		pThongTinTK.add(lblSubNgay);
		
		JLabel lblSubThang = new JLabel("Tháng:");
		lblSubThang.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblSubThang.setBounds(10, 225, 67, 32);
		pThongTinTK.add(lblSubThang);
		
		JRadioButton rdoThongKeTheoThang_1 = new JRadioButton("Thống kê theo năm");
		rdoThongKeTheoThang_1.setBackground(Color.WHITE);
		rdoThongKeTheoThang_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		rdoThongKeTheoThang_1.setBounds(10, 343, 224, 32);
		pThongTinTK.add(rdoThongKeTheoThang_1);
		
		JLabel lblSubNam = new JLabel("Năm:");
		lblSubNam.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblSubNam.setBounds(10, 393, 67, 32);
		pThongTinTK.add(lblSubNam);
		
		JComboBox cboNam = new JComboBox();
		cboNam.setFont(new Font("SansSerif", Font.PLAIN, 15));
		cboNam.setBorder(new LineBorder(new Color(91, 155, 213)));
		cboNam.setBackground(Color.WHITE);
		cboNam.setBounds(80, 394, 154, 31);
		pThongTinTK.add(cboNam);
		
		JButton btnThongKe = new JButton("Thống kê");
		btnThongKe.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnThongKe.setBackground(new Color(41, 242, 255));
		btnThongKe.setBounds(10, 474, 224, 34);
		pThongTinTK.add(btnThongKe);
		
		JPanel pDoanhThu = new JPanel();
		pDoanhThu.setBackground(Color.WHITE);
		pDoanhThu.setBounds(262, 55, 249, 89);
		pMain.add(pDoanhThu);
		pDoanhThu.setBorder(new LineBorder(new Color(91, 155, 213), 2));
		pDoanhThu.setLayout(null);
		
		JButton btnDoanhThu = new JButton("100,000 VNĐ");
		btnDoanhThu.setBackground(Color.WHITE);
		btnDoanhThu.setFont(new Font("SansSerif", Font.BOLD, 16));
		btnDoanhThu.setBounds(88, 11, 151, 53);
		pDoanhThu.add(btnDoanhThu);
		
		JLabel lblSubDoanhThu = new JLabel("Thống kê doanh thu");
		lblSubDoanhThu.setFont(new Font("SansSerif", Font.ITALIC, 12));
		lblSubDoanhThu.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubDoanhThu.setBounds(88, 64, 151, 14);
		lblSubDoanhThu.setForeground(new Color(91, 155, 213));
		pDoanhThu.add(lblSubDoanhThu);
		
		JPanel pThuoc = new JPanel();
		pThuoc.setLayout(null);
		pThuoc.setBorder(new LineBorder(new Color(91, 155, 213), 2));
		pThuoc.setBackground(Color.WHITE);
		pThuoc.setBounds(570, 55, 249, 89);
		pMain.add(pThuoc);
		
		JButton btnThuoc = new JButton("100");
		btnThuoc.setFont(new Font("SansSerif", Font.BOLD, 16));
		btnThuoc.setBackground(Color.WHITE);
		btnThuoc.setBounds(88, 11, 151, 53);
		pThuoc.add(btnThuoc);
		
		JLabel lblSubThuoc = new JLabel("Thống kê thuốc đã bán");
		lblSubThuoc.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubThuoc.setFont(new Font("SansSerif", Font.ITALIC, 12));
		lblSubThuoc.setBounds(88, 64, 151, 14);
		lblSubThuoc.setForeground(new Color(91, 155, 213));
		pThuoc.add(lblSubThuoc);
		
		JPanel pBieuDo = new JPanel();
		pBieuDo.setLayout(null);
		pBieuDo.setBorder(new TitledBorder(new LineBorder(new Color(91, 155, 213), 2), "Bi\u1EC3u \u0111\u1ED3 th\u1ED1ng k\u00EA", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pBieuDo.setBackground(Color.WHITE);
		pBieuDo.setBounds(262, 153, 746, 476);
		pMain.add(pBieuDo);
		
		JLabel lblTenBieuDo = new JLabel("Thống kê doanh thu");
		lblTenBieuDo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTenBieuDo.setFont(new Font("SansSerif", Font.ITALIC, 15));
		lblTenBieuDo.setBounds(545, 640, 151, 14);
		lblTenBieuDo.setForeground(new Color(91, 155, 213));
		pMain.add(lblTenBieuDo);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setBounds(0, 0, 1031, 675);
		lblBackground.setIcon(new ImageIcon("data\\img\\bg.png"));
		pMain.add(lblBackground);
		
		
	}
}
