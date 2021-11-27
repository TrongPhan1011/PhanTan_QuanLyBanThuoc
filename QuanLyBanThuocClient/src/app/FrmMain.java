package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class FrmMain extends JFrame implements ActionListener  {

	private JFrame frame;
	private JLabel jlbgetngay;
	private Panel pMain;
	FrmQuanLyThuoc QuanLyThuoc=new FrmQuanLyThuoc();
	FrmQuanLyThuoc frmQuanLyKhachHang=new FrmQuanLyThuoc();
	FrmQuanLyNhanVien frmQuanLyNhanVien=new FrmQuanLyNhanVien();
	FrmQuanLyThongKe frmQuanLyThongKe=new FrmQuanLyThongKe();
	
	private JButton btnquanlynhanvien;
	private JTabbedPane tabbedPane1;
	private FrmQuanLyThuoc quanLyThuoc;
	private static String manv;
	private static String chucvu;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
					FrmMain window = new FrmMain(manv,chucvu);
					window.frame.setVisible(true);
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
//	public FrmMain() throws MalformedURLException, RemoteException, NotBoundException {
//		initialize();
//		getTime();
//	}
	

	/**
	 * Initialize the contents of the frame.
	 * @throws NotBoundException 
	 * @throws RemoteException 
	 * @throws MalformedURLException 
	 */
	public FrmMain(String manv,String chucvu) throws MalformedURLException, RemoteException, NotBoundException {
	
		setResizable(false);
		setBounds(0, 0, 1285, 700);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 51, 51));
		panel_1.setBounds(0, 0, 254, 671);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		JLabel jlbmenu = new JLabel("MENU");
		jlbmenu.setBounds(60, 11, 130, 60);
		jlbmenu.setFont(new Font("Tahoma", Font.PLAIN, 49));
		jlbmenu.setForeground(new Color(255, 255, 204));
		panel_1.add(jlbmenu);
		
		JButton jbquanlythuoc = new JButton("Quản lý thuốc");
		jbquanlythuoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane1.setSelectedIndex(0);
			}
		});
		jbquanlythuoc.setFont(new Font("Tahoma", Font.BOLD, 21));
		jbquanlythuoc.setBackground(new Color(51, 204, 204));
		jbquanlythuoc.setForeground(new Color(255, 255, 255));
		jbquanlythuoc.setBounds(0, 93, 254, 60);
		panel_1.add(jbquanlythuoc);
		
		JButton jbquanlyhoadon = new JButton("Quản lý hóa đơn");
		jbquanlyhoadon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane1.setSelectedIndex(1);
			}
		});
		
		jbquanlyhoadon.setForeground(new Color(255, 255, 255));
		jbquanlyhoadon.setFont(new Font("Tahoma", Font.BOLD, 21));
		jbquanlyhoadon.setBackground(new Color(51, 204, 204));
		jbquanlyhoadon.setBounds(0, 165, 254, 60);
		panel_1.add(jbquanlyhoadon);
		
		btnquanlynhanvien = new JButton("Quản lý nhân viên");
		btnquanlynhanvien.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnquanlynhanvien.setForeground(new Color(255, 255, 255));
		btnquanlynhanvien.setBackground(new Color(51, 204, 204));
		btnquanlynhanvien.setBounds(0, 237, 254, 60);
		panel_1.add(btnquanlynhanvien);
		
		JButton btnquanlythongke = new JButton("Quản lý thống kê");
		btnquanlythongke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane1.setSelectedIndex(3);
			}
		});
		btnquanlythongke.setBackground(new Color(51, 204, 204));
		btnquanlythongke.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnquanlythongke.setForeground(new Color(255, 255, 255));
		btnquanlythongke.setBounds(0, 310, 254, 60);
		panel_1.add(btnquanlythongke);
		
		JButton jbtdangxuat = new JButton("Đăng xuất");
		jbtdangxuat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				try {
					FrmDangNhap frmDangNhap=new FrmDangNhap();
					frmDangNhap.setVisible(true);
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
		jbtdangxuat.setForeground(new Color(255, 255, 255));
		jbtdangxuat.setBackground(new Color(51, 204, 204));
		jbtdangxuat.setFont(new Font("Tahoma", Font.PLAIN, 21));
		jbtdangxuat.setBounds(0, 600, 254, 60);
		panel_1.add(jbtdangxuat);
		
		JLabel jlbmnv = new JLabel("Mã nhân viên:");
		jlbmnv.setFont(new Font("Tahoma", Font.PLAIN, 19));
		jlbmnv.setForeground(new Color(255, 255, 255));
		jlbmnv.setBounds(10, 556, 121, 33);
		panel_1.add(jlbmnv);
		
		JLabel jlbgetmanv = new JLabel(manv);
		jlbgetmanv.setForeground(new Color(255, 255, 255));
		jlbgetmanv.setFont(new Font("Tahoma", Font.PLAIN, 19));
		jlbgetmanv.setBounds(141, 565, 113, 14);
		panel_1.add(jlbgetmanv);
		
		JLabel jlbngay = new JLabel("Ngày:");
		jlbngay.setForeground(new Color(255, 255, 255));
		jlbngay.setFont(new Font("Tahoma", Font.PLAIN, 19));
		jlbngay.setBounds(10, 520, 59, 23);
		panel_1.add(jlbngay);
		
		 jlbgetngay = new JLabel("");
		jlbgetngay.setForeground(new Color(255, 255, 255));
		jlbgetngay.setFont(new Font("Tahoma", Font.PLAIN, 19));
		jlbgetngay.setBounds(70, 520, 184, 27);
		panel_1.add(jlbgetngay);
		
		 tabbedPane1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane1.setBounds(253, -49, 1026, 724);
		panel.add(tabbedPane1);
		
		quanLyThuoc = new FrmQuanLyThuoc();
		tabbedPane1.addTab("New tab", null, quanLyThuoc, null);

		FrmQLBH frmQLHD = new FrmQLBH(frame,manv);
		tabbedPane1.addTab("New tab", null, frmQLHD, null);
		
		tabbedPane1.addTab("New tab", null,frmQuanLyNhanVien , null);
	
		tabbedPane1.addTab("New tab", null, frmQuanLyThongKe, null); //frmQuanLyNhanVien
		
		tabbedPane1.addTab("New tab", null, frmQuanLyThongKe, null);
		
		if(chucvu.equalsIgnoreCase("Nhân viên bán hàng")) {
			remove(btnquanlynhanvien);
			btnquanlythongke.setBounds(0, 93, 254, 60);
		}
		getTime();
		
		btnquanlynhanvien.addActionListener(this);
	
		
		
	}
	

	public void getTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		LocalDate now=LocalDate.now();
		String s= now.toString();
		jlbgetngay.setText(s);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o.equals(btnquanlynhanvien)) {
			tabbedPane1.setSelectedIndex(2);
		

		}
	
	}
}

