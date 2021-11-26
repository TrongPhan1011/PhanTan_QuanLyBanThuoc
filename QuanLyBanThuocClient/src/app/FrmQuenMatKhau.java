package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmQuenMatKhau extends JFrame implements ActionListener {

	private JFrame frmHThngQun;
	private JTextField txttendangnhap;
	private JPasswordField txtsdt;
	private JButton btndoimatkhau;
	private JButton btnquaylai;
	private HoaDonDao hoaDonDao;
	private KhachHangDao khachHangDao;
	private LoaiThuocDao loaiThuocDao;
	private NhaCungCapDao NCCDao;
	private NhanVienDao nhanVienDao;
	private NuocSXDao nuocSXDao;
	private TaiKhoanDao tkDao;
	private ThuocDao thuocDao;
	private CTHDDao cthdDao;
	private TaiKhoan taiKhoan = null;
	private NhanVien nhanVien = null;
	private JPasswordField txtmatkhaumoi;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 * 
	 * @throws NotBoundException
	 * @throws RemoteException
	 * @throws MalformedURLException
	 */

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws NotBoundException
	 * @throws RemoteException
	 * @throws MalformedURLException
	 */
	public FrmQuenMatKhau() throws MalformedURLException, RemoteException, NotBoundException {

		setResizable(false);
		setTitle("Hệ thống quản lý nhà thuốc");
		setBounds(100, 100, 650, 391);
//		frmHThngQun.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

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

		JLabel lbldangnhap = new JLabel("Quên mật khẩu");
		lbldangnhap.setFont(new Font("SansSerif", Font.BOLD, 25));
		lbldangnhap.setBounds(434, 31, 185, 31);
		panel_1.add(lbldangnhap);

		JLabel lbltendangnhap = new JLabel("Tên đăng nhập");
		lbltendangnhap.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lbltendangnhap.setBounds(405, 103, 108, 24);
		panel_1.add(lbltendangnhap);

		JLabel lblsdt = new JLabel("Số điện thoại");
		lblsdt.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblsdt.setBounds(406, 164, 93, 21);
		panel_1.add(lblsdt);

		JLabel lblmatkhaumoi = new JLabel("Mật khẩu mới");
		lblmatkhaumoi.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblmatkhaumoi.setBounds(405, 219, 94, 24);
		panel_1.add(lblmatkhaumoi);

		txttendangnhap = new JTextField();
		txttendangnhap.setBounds(509, 102, 125, 31);
		txttendangnhap.setBorder(new LineBorder(new Color(91, 155, 213)));

		panel_1.add(txttendangnhap);
		txttendangnhap.setColumns(10);

		txtmatkhaumoi = new JPasswordField();
		txtmatkhaumoi.setBounds(509, 214, 125, 31);
		panel_1.add(txtmatkhaumoi);

		txtsdt = new JPasswordField();
		txtsdt.setBounds(509, 160, 125, 31);
		panel_1.add(txtsdt);
		txtsdt.setColumns(10);
		txtsdt.setBorder(new LineBorder(new Color(91, 155, 213)));

		btndoimatkhau = new JButton("Đổi mật khẩu");
		btndoimatkhau.setForeground(new Color(255, 255, 255));
		btndoimatkhau.setFont(new Font("SansSerif", Font.BOLD, 15));
		btndoimatkhau.setBackground(new Color(0, 153, 255));
		btndoimatkhau.setBounds(456, 275, 135, 31);
		btndoimatkhau.addActionListener(this);

		panel_1.add(btndoimatkhau);

		btnquaylai = new JButton("Quay lại");
		btnquaylai.setForeground(new Color(255, 255, 255));
		btnquaylai.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnquaylai.setBackground(new Color(0, 153, 255));
		btnquaylai.addActionListener(this);
		btnquaylai.setBounds(456, 317, 134, 30);
		panel_1.add(btnquaylai);

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
			return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
		}

		public boolean isBorderOpaque() {
			return true;
		}

		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
			g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object o = e.getSource();
		if (o.equals(btnquaylai)) {
			try {
				FrmDangNhap frmDangNhap = new FrmDangNhap();
				frmDangNhap.setVisible(true);
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
		if (o.equals(btndoimatkhau)) {
			String tendangnhap = txttendangnhap.getText();
			String sdt = txtsdt.getText();
			String matkhaumoi = txtmatkhaumoi.getText();
			try {
				nhanVien = nhanVienDao.getNhanVienTheoSoNV(tendangnhap);
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if (tendangnhap.equals("") || sdt.equals("") || matkhaumoi.equals("")) {
				JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin");
			} else {
				if (nhanVien.getSdt().equals(sdt)) {
					try {
						taiKhoan = tkDao.timtaikhoangtheoten(tendangnhap);
						taiKhoan.setMatKhau(matkhaumoi);
						tkDao.updateTaiKhoan(taiKhoan);
						JOptionPane.showMessageDialog(null, "Đã cập nhật mật khẩu mới");
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				} else {
					JOptionPane.showMessageDialog(null, "Cập nhật mật khẩu không thành công");
				}
			}

		}

	}
}
