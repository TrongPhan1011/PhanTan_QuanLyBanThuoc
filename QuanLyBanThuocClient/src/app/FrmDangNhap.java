package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

import dao.CTHDDao;
import dao.HoaDonDao;
import dao.KhachHangDao;
import dao.LoaiThuocDao;
import dao.NhaCungCapDao;
import dao.NhanVienDao;
import dao.NuocSXDao;
import dao.TaiKhoanDao;
import dao.ThuocDao;
import daoImpl.ImplTaiKhoan;
import entity.NhanVien;
import entity.TaiKhoan;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmDangNhap extends JFrame implements ActionListener {

	private JFrame frmHThngQun;
	private JTextField txttendangnhap;
	private JPasswordField txtmatkhau;
	private JButton btndangnhap;
	private JButton btnthoat;
	private HoaDonDao hoaDonDao;
	private KhachHangDao khachHangDao;
	private LoaiThuocDao loaiThuocDao;
	private NhaCungCapDao NCCDao;
	private NhanVienDao nhanVienDao;
	private NuocSXDao nuocSXDao;
	private TaiKhoanDao tkDao;
	private ThuocDao thuocDao;
	private CTHDDao cthdDao;
	private TaiKhoan taiKhoan=null;
	private NhanVien nhanVien=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
					FrmDangNhap window = new FrmDangNhap();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws NotBoundException 
	 * @throws RemoteException 
	 * @throws MalformedURLException 
	 */
//	public FrmDangNhap() throws MalformedURLException, RemoteException, NotBoundException {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 * @throws NotBoundException 
	 * @throws RemoteException 
	 * @throws MalformedURLException 
	 */
	public FrmDangNhap() throws MalformedURLException, RemoteException, NotBoundException {
		
		setResizable(false);
		setTitle("Hệ thống quản lý nhà thuốc");
		setBounds(100, 100, 650, 391);
//		frmHThngQun.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		IconFontSwing.register(FontAwesome.getIconFont());
//		cthdDao =  (CTHDDao) Naming.lookup("rmi://192.168.1.9:9999/cthdDao");
//		hoaDonDao =  (HoaDonDao) Naming.lookup("rmi://192.168.1.9:9999/hoaDonDao");
//		khachHangDao = (KhachHangDao) Naming.lookup("rmi://192.168.1.9:9999/khachHangDao");
//		loaiThuocDao =  (LoaiThuocDao) Naming.lookup("rmi://192.168.1.9:9999/loaiThuocDao");
//		NCCDao =  (NhaCungCapDao) Naming.lookup("rmi://192.168.1.9:9999/nhaCungCapDao");
//		nhanVienDao =  (NhanVienDao) Naming.lookup("rmi://192.168.1.9:9999/nhanVienDao");
//		nuocSXDao =  (NuocSXDao) Naming.lookup("rmi://192.168.1.9:9999/nuocSXDao");
//		tkDao =  (TaiKhoanDao) Naming.lookup("rmi://192.168.1.9:9999/taiKhoanDao");
//		thuocDao =  (ThuocDao) Naming.lookup("rmi://192.168.1.9:9999/thuocDao");
		
		
		cthdDao = (CTHDDao) Naming.lookup("rmi://192.168.1.6:9999/cthdDao");
		hoaDonDao = (HoaDonDao) Naming.lookup("rmi://192.168.1.6:9999/hoaDonDao");
		khachHangDao = (KhachHangDao) Naming.lookup("rmi://192.168.1.6:9999/khachHangDao");
		loaiThuocDao = (LoaiThuocDao) Naming.lookup("rmi://192.168.1.6:9999/loaiThuocDao");
		NCCDao = (NhaCungCapDao) Naming.lookup("rmi://192.168.1.6:9999/nhaCungCapDao");
		nhanVienDao = (NhanVienDao) Naming.lookup("rmi://192.168.1.6:9999/nhanVienDao");
		nuocSXDao = (NuocSXDao) Naming.lookup("rmi://192.168.1.6:9999/nuocSXDao");
		tkDao = (TaiKhoanDao) Naming.lookup("rmi://192.168.1.6:9999/taiKhoanDao");
		thuocDao = (ThuocDao) Naming.lookup("rmi://192.168.1.6:9999/thuocDao");
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 644, 371);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblhethong = new JLabel("");
		lblhethong.setIcon(new ImageIcon("C:\\Users\\Tai\\eclipse-workspace\\HeThongQuanLyThuoc\\img\\tieude2.png"));
		lblhethong.setFont(new Font("Source Code Pro ExtraLight", Font.PLAIN, 24));
		lblhethong.setBounds(30, 11, 325, 91);
		panel_1.add(lblhethong);
		
		JLabel txtquenmk = new JLabel("Quên mật khẩu ?");
		txtquenmk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					FrmQuenMatKhau frmQuenMatKhau=new FrmQuenMatKhau();
					frmQuenMatKhau.setVisible(true);
					frmQuenMatKhau.setResizable(false);
					frmQuenMatKhau.setTitle("Hệ thống quản lý nhà thuốc");
					frmQuenMatKhau.setBounds(100, 100, 650, 391);
//					frmHThngQun.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frmQuenMatKhau.setLocationRelativeTo(null);
					setVisible(false);
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NotBoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		txtquenmk.setFont(new Font("SansSerif", Font.PLAIN, 13));
		txtquenmk.setBounds(536, 202, 108, 15);
		panel_1.add(txtquenmk);
		
		JLabel lbldangnhap = new JLabel("Đăng nhập");
		lbldangnhap.setFont(new Font("SansSerif", Font.BOLD, 25));
		lbldangnhap.setBounds(449, 31, 131, 31);
		panel_1.add(lbldangnhap);
		
		JLabel lbltendangnhap = new JLabel("Tên đăng nhập");
		lbltendangnhap.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lbltendangnhap.setBounds(405, 103, 108, 24);
		panel_1.add(lbltendangnhap);
		
		JLabel lblmatkhau = new JLabel("Mật khẩu");
		lblmatkhau.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblmatkhau.setBounds(406, 164, 61, 21);
		panel_1.add(lblmatkhau);
		
		txttendangnhap = new JTextField();
		txttendangnhap.setBounds(509, 102, 125, 31);
		txttendangnhap.setBorder(new LineBorder(new Color(91, 155, 213)));
		
       
		panel_1.add(txttendangnhap);
		txttendangnhap.setColumns(10);
		
		txtmatkhau = new JPasswordField();
		txtmatkhau.setBounds(509, 160, 125, 31);
		panel_1.add(txtmatkhau);
		txtmatkhau.setColumns(10);
		txtmatkhau.setBorder(new LineBorder(new Color(91, 155, 213)));
		
		 btndangnhap = new JButton("Đăng nhập");
		btndangnhap.setForeground(new Color(255, 255, 255));
		btndangnhap.setFont(new Font("SansSerif", Font.BOLD, 15));
		btndangnhap.setBackground(new Color(0, 153, 255));
		btndangnhap.setBounds(474, 228, 117, 31);
		btndangnhap.addActionListener(this);
		
		panel_1.add(btndangnhap);
		
		 btnthoat = new JButton("Thoát");
		btnthoat.setForeground(new Color(255, 255, 255));
		btnthoat.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnthoat.setBackground(new Color(0, 153, 255));
		btnthoat.addActionListener(this);
		btnthoat.setBounds(475, 278, 116, 31);
		panel_1.add(btnthoat);
		

		Icon icThem = IconFontSwing.buildIcon(FontAwesome.PLUS, 20, new Color(0, 176, 80));
		Icon icNgay = IconFontSwing.buildIcon(FontAwesome.CALENDAR, 20, new Color(91, 155, 213));
		Icon icTim = IconFontSwing.buildIcon(FontAwesome.SEARCH, 20, Color.black);
		Icon icLamMoi = IconFontSwing.buildIcon(FontAwesome.REFRESH, 20, Color.blue);
		Icon icDS = IconFontSwing.buildIcon(FontAwesome.LIST_OL, 20, Color.orange);
		Icon icXoa = IconFontSwing.buildIcon(FontAwesome.TIMES, 20, Color.red);
		Icon icSua = IconFontSwing.buildIcon(FontAwesome.WRENCH, 20, Color.darkGray);
		Icon icThanhToan = IconFontSwing.buildIcon(FontAwesome.CART_PLUS, 25, new Color(0, 176, 80));
		Icon icDangnhap = IconFontSwing.buildIcon(FontAwesome.SIGN_IN, 20, Color.darkGray);
		Icon icThoat = IconFontSwing.buildIcon(FontAwesome.SIGN_OUT, 20, Color.darkGray);
		
		btndangnhap.setIcon(icDangnhap);
		btnthoat.setIcon(icThoat);
		
		
		
		JLabel lblbg = new JLabel("");
		lblbg.setIcon(new ImageIcon("C:\\Users\\Tai\\eclipse-workspace\\HeThongQuanLyThuoc\\img\\bg3.jpg"));
		lblbg.setBounds(0, 0, 400, 361);
		panel_1.add(lblbg);
		
		
	
	}
	private static class RoundedBorder implements Border {

	    private int radius;


	    RoundedBorder(int radius) {
	        this.radius = radius;
	    }


	    public Insets getBorderInsets(Component c) {
	        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
	    }


	    public boolean isBorderOpaque() {
	        return true;
	    }


	    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
	        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
	    }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object o=e.getSource();
		if(o.equals(btnthoat)) {
			System.exit(0);
		}
		if(o.equals(btndangnhap)) {
			String tendangnhap=txttendangnhap.getText().trim();
			String mk=txtmatkhau.getText().trim();
			
			try {
				taiKhoan = tkDao.timtaikhoangtheoten(tendangnhap);
				 nhanVien=nhanVienDao.getNhanVienTheoSoNV(tendangnhap);
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(taiKhoan==null) {
				JOptionPane.showMessageDialog(null, "Đăng nhập không thành công");
			}
			else {
				if(mk.equals(taiKhoan.getMatKhau())&&nhanVien.getTrangThaiLamViec().equalsIgnoreCase("Đang làm việc")) {
					
						try {
							FrmMain frmMain=new FrmMain(tendangnhap,nhanVien.getChucVu());
							frmMain.setVisible(true);
							frmMain.setResizable(false);
							frmMain.setBounds(0, 0, 1285, 700);
							frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							frmMain.setLocationRelativeTo(null);
						
							
							
							setVisible(false);
						} catch (MalformedURLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (NotBoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
					
				}
				else if(mk.equals(taiKhoan.getMatKhau())&&nhanVien.getTrangThaiLamViec().equalsIgnoreCase("Đã nghỉ việc")) {
					JOptionPane.showMessageDialog(null, "Tài khoản này không còn hoạt động");
				}
				else {
					JOptionPane.showMessageDialog(null, "Đăng nhập không thành công");
				}
			}
			
				
			
			
		}
		
	}
}
