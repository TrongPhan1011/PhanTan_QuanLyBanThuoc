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
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.demo.DateChooserPanel;

import dao.CTHDDao;
import dao.HoaDonDao;
import dao.KhachHangDao;
import dao.LoaiThuocDao;
import dao.NhaCungCapDao;
import dao.NhanVienDao;
import dao.NuocSXDao;
import dao.TaiKhoanDao;
import dao.ThuocDao;
import entity.HoaDon;

import javax.swing.border.EtchedBorder;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class FrmQuanLyThongKe extends JPanel{

	private JFrame frame;
	private CTHDDao cthdDao;
	private HoaDonDao hoaDonDao;
	private KhachHangDao khachHangDao;
	private LoaiThuocDao loaiThuocDao;
	private NhaCungCapDao NCCDao;
	private NhanVienDao nhanVienDao;
	private NuocSXDao nuocSXDao;
	private TaiKhoanDao tkDao;
	private ThuocDao thuocDao;
	private Regex regex;
	private Date now;


	/**
	 * Create the application.
	 * @throws NotBoundException 
	 * @throws RemoteException 
	 * @throws MalformedURLException 
	 */
	public FrmQuanLyThongKe() throws MalformedURLException, RemoteException, NotBoundException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws NotBoundException 
	 * @throws RemoteException 
	 * @throws MalformedURLException 
	 */
	private void initialize() throws MalformedURLException, RemoteException, NotBoundException {
		
		cthdDao =  (CTHDDao) Naming.lookup("rmi://192.168.1.9:9999/cthdDao");
		hoaDonDao =  (HoaDonDao) Naming.lookup("rmi://192.168.1.9:9999/hoaDonDao");
		khachHangDao = (KhachHangDao) Naming.lookup("rmi://192.168.1.9:9999/khachHangDao");
		loaiThuocDao =  (LoaiThuocDao) Naming.lookup("rmi://192.168.1.9:9999/loaiThuocDao");
		NCCDao =  (NhaCungCapDao) Naming.lookup("rmi://192.168.1.9:9999/nhaCungCapDao");
		nhanVienDao =  (NhanVienDao) Naming.lookup("rmi://192.168.1.9:9999/nhanVienDao");
		nuocSXDao =  (NuocSXDao) Naming.lookup("rmi://192.168.1.9:9999/nuocSXDao");
		tkDao =  (TaiKhoanDao) Naming.lookup("rmi://192.168.1.9:9999/taiKhoanDao");
		thuocDao =  (ThuocDao) Naming.lookup("rmi://192.168.1.9:9999/thuocDao");
		regex  = new Regex();
		
	


		
//		cthdDao =  (CTHDDao) Naming.lookup("rmi://192.168.1.8:9999/cthdDao");
//		hoaDonDao =  (HoaDonDao) Naming.lookup("rmi://192.168.1.8:9999/hoaDonDao");
//	    khachHangDao = (KhachHangDao) Naming.lookup("rmi://192.168.1.8:9999/khachHangDao");
//		loaiThuocDao =  (LoaiThuocDao) Naming.lookup("rmi://192.168.1.8:9999/loaiThuocDao");
//		 NCCDao =  (NhaCungCapDao) Naming.lookup("rmi://192.168.1.8:9999/nhaCungCapDao");
//		 nhanVienDao =  (NhanVienDao) Naming.lookup("rmi://192.168.1.8:9999/nhanVienDao");
//		 nuocSXDao =  (NuocSXDao) Naming.lookup("rmi://192.168.1.8:9999/nuocSXDao");
//		 tkDao =  (TaiKhoanDao) Naming.lookup("rmi://192.168.1.8:9999/taiKhoanDao");
//		 thuocDao =  (ThuocDao) Naming.lookup("rmi://192.168.1.8:9999/thuocDao");
//		 regex  = new Regex();
		
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
		
		pThongTinTK.setBorder(new TitledBorder(new LineBorder(new Color(91, 155, 213), 2), "Chọn thời gian", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pThongTinTK.setBackground(Color.WHITE);
		pThongTinTK.setBounds(10, 46, 480, 106);
		pMain.add(pThongTinTK);
		
		JDateChooser chooserNgayBatDau = new JDateChooser();
		chooserNgayBatDau.getCalendarButton().setFont(new Font("SansSerif", Font.PLAIN, 15));
		chooserNgayBatDau.setBounds(65, 18, 154, 32);
		pThongTinTK.add(chooserNgayBatDau);
		chooserNgayBatDau.setBorder(BorderFactory.createLineBorder(new Color(91, 155, 213)));
		chooserNgayBatDau.setDateFormatString("dd/MM/yyyy");
		chooserNgayBatDau.setFont(new Font("SansSerif",Font.PLAIN, 15));
		
		pThongTinTK.setLayout(null);
		
		JLabel lblSubNgay = new JLabel("Từ:");
		lblSubNgay.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblSubNgay.setBounds(10, 18, 67, 32);
		pThongTinTK.add(lblSubNgay);
		
		JButton btnThongKe = new JButton("Thống kê");
		btnThongKe.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnThongKe.setBackground(new Color(41, 242, 255));
		btnThongKe.setBounds(261, 18, 209, 34);
		pThongTinTK.add(btnThongKe);
		
		JLabel lbln = new JLabel("Đến:");
		lbln.setFont(new Font("SansSerif", Font.BOLD, 15));
		lbln.setBounds(10, 63, 67, 32);
		pThongTinTK.add(lbln);
		
		JDateChooser chooserNgayDen = new JDateChooser();
		chooserNgayDen.getCalendarButton().setFont(new Font("SansSerif", Font.PLAIN, 15));
		chooserNgayDen.setBounds(66, 63, 154, 32);
		pThongTinTK.add(chooserNgayDen);
		chooserNgayDen.setBorder(BorderFactory.createLineBorder(new Color(91, 155, 213)));
		chooserNgayDen.setDateFormatString("dd/MM/yyyy");
		chooserNgayDen.setFont(new Font("SansSerif",Font.PLAIN, 15));
		
		JButton btnLamMoi = new JButton("Làm mới");
		btnLamMoi.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnLamMoi.setBackground(new Color(41, 242, 255));
		btnLamMoi.setBounds(261, 61, 209, 34);
		pThongTinTK.add(btnLamMoi);
		
		JPanel pDoanhThu = new JPanel();
		pDoanhThu.setBackground(Color.WHITE);
		pDoanhThu.setBounds(500, 53, 249, 97);
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
		lblSubDoanhThu.setBounds(88, 72, 151, 14);
		lblSubDoanhThu.setForeground(new Color(91, 155, 213));
		pDoanhThu.add(lblSubDoanhThu);
		
		JPanel pThuoc = new JPanel();
		pThuoc.setLayout(null);
		pThuoc.setBorder(new LineBorder(new Color(91, 155, 213), 2));
		pThuoc.setBackground(Color.WHITE);
		pThuoc.setBounds(759, 53, 249, 97);
		pMain.add(pThuoc);
		
		JButton btnThuoc = new JButton("100");
		btnThuoc.setFont(new Font("SansSerif", Font.BOLD, 16));
		btnThuoc.setBackground(Color.WHITE);
		btnThuoc.setBounds(88, 11, 151, 53);
		pThuoc.add(btnThuoc);
		
		JLabel lblSubThuoc = new JLabel("Thống kê thuốc đã bán");
		lblSubThuoc.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubThuoc.setFont(new Font("SansSerif", Font.ITALIC, 12));
		lblSubThuoc.setBounds(88, 72, 151, 14);
		lblSubThuoc.setForeground(new Color(91, 155, 213));
		pThuoc.add(lblSubThuoc);
		
		JPanel pBieuDo = new JPanel();
		pBieuDo.setLayout(null);
		pBieuDo.setBorder(new TitledBorder(new LineBorder(new Color(91, 155, 213), 2), "Bi\u1EC3u \u0111\u1ED3 th\u1ED1ng k\u00EA", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pBieuDo.setBackground(Color.WHITE);
		pBieuDo.setBounds(10, 163, 998, 466);
		pMain.add(pBieuDo);
		
		JLabel lblTenBieuDo = new JLabel("Thống kê doanh thu");
		lblTenBieuDo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTenBieuDo.setFont(new Font("SansSerif", Font.ITALIC, 15));
		lblTenBieuDo.setBounds(10, 634, 998, 20);
		lblTenBieuDo.setForeground(new Color(91, 155, 213));
		pMain.add(lblTenBieuDo);
		
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setBounds(0, 0, 1031, 675);
		lblBackground.setIcon(new ImageIcon("data\\img\\bg.png"));
		pMain.add(lblBackground);
		
		LocalDate d = LocalDate.now();
		now = new Date(d.getYear()-1900,d.getMonthValue()-1,d.getDayOfMonth());
		
		chooserNgayBatDau.setDate(now);
		chooserNgayDen.setDate(now);
		
		List<HoaDon> ls = hoaDonDao.getHoaDonTheoNgay(now, now);
		System.out.println(ls);
//		Date d1 = chooserNgayBatDau.getDate();
//		Format sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		System.out.println(sf.format(now));
		
		
	}
}
