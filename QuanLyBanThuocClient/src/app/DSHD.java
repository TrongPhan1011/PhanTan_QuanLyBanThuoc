package app;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import dao.CTHDDao;
import dao.HoaDonDao;
import dao.KhachHangDao;
import dao.LoaiThuocDao;
import dao.NhaCungCapDao;
import dao.NhanVienDao;
import dao.NuocSXDao;
import dao.TaiKhoanDao;
import dao.ThuocDao;
import entity.KhachHang;
import entity.NhanVien;
import entity.Thuoc;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

import javax.swing.ImageIcon;

public class DSHD extends JFrame implements  ActionListener,MouseListener,ItemListener{

	private JPanel contentPane;
	private JTextField txtTim;
	private JTable table;
	private JTable tbldsKH;
	private JTable table_1;
	private CTHDDao cthdDao;
	private HoaDonDao hoaDonDao;
	private KhachHangDao khachHangDao;
	private LoaiThuocDao loaiThuocDao;
	private NhaCungCapDao NCCDao;
	private NhanVienDao nhanVienDao;
	private TaiKhoanDao tkDao;
	private NuocSXDao nuocSXDao;
	private ThuocDao thuocDao;
	private DefaultTableModel modelthuoc;
	private DefaultTableModel modelKhachhang;
	private JButton btntim;
	private JButton btnLammoi;

	

	

	/**
	 * Create the frame.
	 * @throws NotBoundException 
	 * @throws RemoteException 
	 * @throws MalformedURLException 
	 */
	public DSHD(JFrame frm) throws MalformedURLException, RemoteException, NotBoundException {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1004, 683);
		setLocationRelativeTo(null);
		setTitle("Nhà thuốc T3");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String ip ="";
		try {
			ip = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		}
		
		cthdDao =  (CTHDDao) Naming.lookup("rmi://"+ip+":9999/cthdDao");
		hoaDonDao =  (HoaDonDao) Naming.lookup("rmi://"+ip+":9999/hoaDonDao");
		khachHangDao = (KhachHangDao) Naming.lookup("rmi://"+ip+":9999/khachHangDao");
		loaiThuocDao =  (LoaiThuocDao) Naming.lookup("rmi://"+ip+":9999/loaiThuocDao");
		NCCDao =  (NhaCungCapDao) Naming.lookup("rmi://"+ip+":9999/nhaCungCapDao");
		nhanVienDao =  (NhanVienDao) Naming.lookup("rmi://"+ip+":9999/nhanVienDao");
		nuocSXDao =  (NuocSXDao) Naming.lookup("rmi://"+ip+":9999/nuocSXDao");
		tkDao =  (TaiKhoanDao) Naming.lookup("rmi://"+ip+":9999/taiKhoanDao");
		thuocDao =  (ThuocDao) Naming.lookup("rmi://"+ip+":9999/thuocDao");
		
		IconFontSwing.register(FontAwesome.getIconFont());
		Icon icThem = IconFontSwing.buildIcon(FontAwesome.PLUS, 20, new Color(0, 176, 80));
		Icon icNgay = IconFontSwing.buildIcon(FontAwesome.CALENDAR, 20, new Color(91, 155, 213));
		Icon icTim = IconFontSwing.buildIcon(FontAwesome.SEARCH, 20, Color.black);
		Icon icLamMoi = IconFontSwing.buildIcon(FontAwesome.REFRESH, 20, Color.blue);
		Icon icDS = IconFontSwing.buildIcon(FontAwesome.LIST_OL, 20, Color.orange);
		Icon icXoa = IconFontSwing.buildIcon(FontAwesome.TIMES, 20, Color.red);
		Icon icSua = IconFontSwing.buildIcon(FontAwesome.WRENCH, 20, Color.darkGray);
		Icon icThanhToan = IconFontSwing.buildIcon(FontAwesome.CART_PLUS, 25, new Color(0, 176, 80));
		
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
		
	    btntim = new JButton("Tìm");
		btntim.setFont(new Font("Tahoma", Font.BOLD, 15));
		btntim.setBackground(new Color(41, 242, 255));
		btntim.setBounds(746, 35, 108, 33);
		panel_1.add(btntim);
		
		
		String column[] = { "Tên thuốc","Loại thuốc", "Nước sản xuất","Số lượng","Đơn giá","Tổng tiền"};
	    modelthuoc = new DefaultTableModel(column, 0);
//		tbHeader1.setBackground(new Color(91, 155, 213,80));
//		tbHeader1.setForeground(Color.CYAN);
//		tbHeader1.setFont(new Font("SansSerif", Font.BOLD, 20));
//		
		JPanel pKH = new JPanel();
		pKH.setBounds(10, 79, 983, 552);
		panel_1.add(pKH);
		pKH.setBorder(new TitledBorder(new LineBorder(new Color(91, 155, 213)), "Danh sách khách hàng", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		pKH.setBackground(new Color(255,255,255,10));
		pKH.setLayout(null);
		
		JScrollPane dsKH = new JScrollPane();
		dsKH.setBounds(10, 20, 963, 522);
		pKH.add(dsKH);
		
		String columnKH[] = { "STT","Tên khách hàng", "Ngày sinh","Giới tính","Số điện thoại"};
	     modelKhachhang = new DefaultTableModel(columnKH, 0);
		tbldsKH = new JTable(modelKhachhang);
		dsKH.setViewportView(tbldsKH);
		
		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
		DefaultTableCellRenderer center = new DefaultTableCellRenderer();
		center.setHorizontalAlignment(JLabel.CENTER);

		tbldsKH.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
		tbldsKH.getColumnModel().getColumn(0).setCellRenderer(center);
		
		JTableHeader tbHeader = tbldsKH.getTableHeader();
		tbHeader.setBackground(new Color(91, 155, 213,80));
		tbHeader.setForeground(Color.CYAN);
		tbHeader.setFont(new Font("SansSerif", Font.BOLD, 20));
		
		
		tbldsKH.setSelectionBackground(new Color(91, 155, 213,30));
		tbldsKH.setSelectionForeground(new Color(91, 155, 213));
		tbldsKH.setRowHeight(30);
		
	    btnLammoi = new JButton("Làm mới");
		btnLammoi.setBackground(Color.CYAN);
		btnLammoi.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnLammoi.setBounds(885, 34, 108, 34);
		panel_1.add(btnLammoi);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("data\\img\\bg.png"));
		label.setBounds(0, 10, 1028, 661);
		
//		JLabel label1 = new JLabel("");
//		label1.setIcon(new ImageIcon("data\\img\\bg.png"));
//		label1.setBounds(0, 20, 1028, 651);

		
		panel_1.add(label);
		
		btntim.setIcon(icThem);
		btnLammoi.setIcon(icLamMoi);
		
		
		
		tbldsKH.addMouseListener(this);
		
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e)
			{
				frm.setVisible(true);
			}
		});
		loadData();
		//ACTION
		btntim.addActionListener(this);
		btnLammoi.addActionListener(this);
		
		
	}



	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		Object o = e.getSource();
		 String tenKH = null;
		if(o.equals(tbldsKH)) {
			int row = tbldsKH.getSelectedRow();
			String sdt = modelKhachhang.getValueAt(row, 4).toString();
			try {
				KhachHang kh = khachHangDao.getKHTheoSDT(sdt);
				FrmDSKH frmHD = new FrmDSKH(this,kh);
				
				frmHD.setVisible(true);
				
			} catch (RemoteException | MalformedURLException | NotBoundException e1) {
				e1.printStackTrace();
			}
			
			 
		}
		
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



	@Override
	public void actionPerformed(ActionEvent e) {
		Object o =  e.getSource();
	    if(o.equals(btntim)) {

	    	String tim = txtTim.getText().trim();
	    	if(tim.isEmpty()) {
	    		JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin tìm kiếm");
	    	}else {
	    	try {
				loadDataTim();
				
//				List<KhachHang> kh = khachHangDao.getAllKhachHang();
//				taiDuLieuLenBang(kh);
			} catch (RemoteException e1) {
				e1.printStackTrace();
			}
	    	}
			
	    }
	    if(o.equals(btnLammoi)) {
	    	try {
	    		modelKhachhang.setRowCount(0);
				loadData();
				txtTim.setText("");
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
		
	}
	private void taiDuLieuLenBang(List<KhachHang> dsKH) {
		modelKhachhang.getDataVector().removeAllElements();
		modelKhachhang.fireTableDataChanged();
		new Thread(() -> {

		

			for (KhachHang kh : dsKH) {
				
				SwingUtilities.invokeLater(() -> {
					DateFormat dfd = new SimpleDateFormat("dd/MM/yyyy");
					int i=0;
					i++;
					modelKhachhang.addRow(
							new Object[] { i, kh.getTenKhachHang(),dfd.format(kh.getNgaySinh()),
								 kh.getGioiTinh(), kh.getSdt()});

				});

			}
		}).start();
		;
	}
	private void loadData() throws RemoteException{
		 List<KhachHang> dsKH = khachHangDao.getAllKhachHang();
		 DateFormat dfd = new SimpleDateFormat("dd/MM/yyyy");
		 int i=0;
		 for(KhachHang kh : dsKH) {
			 i++;
			 modelKhachhang.addRow(new Object[] { i, kh.getTenKhachHang(),dfd.format(kh.getNgaySinh()),kh.getGioiTinh(),kh.getSdt()});
		 }
	}
	private void loadDataTim() throws RemoteException{
		
		String text = txtTim.getText();
		
		
		KhachHang kh = khachHangDao.getKHTheoSDT(text);
		DecimalFormat df = new DecimalFormat("###,###,###.####");
		DateFormat dfd = new SimpleDateFormat("dd/MM/yyyy");
		int i=1;
		modelKhachhang.setRowCount(0);
		modelKhachhang.addRow(new Object[] {i, kh.getTenKhachHang(),dfd.format(kh.getNgaySinh()),kh.getGioiTinh(),kh.getSdt()});	
		
//		for(KhachHang khachHang : dsKH) {
//			i++;
//			modelKhachhang.addRow(new Object[] {i, khachHang.getTenKhachHang(),dfd.format(khachHang.getNgaySinh()),khachHang.getGioiTinh(),khachHang.getSdt()});	
//		}
    
	
	}
}