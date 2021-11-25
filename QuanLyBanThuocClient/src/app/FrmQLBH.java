package app;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import entity.LoaiThuoc;
import entity.Thuoc;

public class FrmQLBH extends JPanel implements ActionListener,MouseListener,ItemListener {

	/**
	 * 
	 */
	private JFrame fMain;
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JTextField txtTimKiem;
	private JTextField txtTenKH;
	private JTextField txtSDT;
	private JTextField txtSoLuong;
	private JTable table;
	private DefaultTableModel modelThuoc;
	private JTable tblThuoc;
	private JButton btnDSKH;
	private JDateChooser chooserNgaySinh;
	private CTHDDao cthdDao;
	private JComboBox<String> cboLoaiThuoc;
	private JComboBox<String> cboTenThuoc;
	private HoaDonDao hoaDonDao;
	private KhachHangDao khachHangDao;
	private LoaiThuocDao loaiThuocDao;
	private NhaCungCapDao NCCDao;
	private NhanVienDao nhanVienDao;
	private NuocSXDao nuocSXDao;
	private TaiKhoanDao tkDao;
	private ThuocDao thuocDao;
	private JButton btnTim;
	private JComboBox<String> cboGioiTinh;
	private JButton btnThemKH;
	private JButton btnLamMoiKH;
	private JRadioButton rdoGiamSL;
	private JButton btnThemThuoc;
	private JButton btnXoaThuoc;
	private JButton btnLamMoiGD;
	private JLabel lblThanhTien;
	private JButton btnThanhToan;
	private Date now;
	private DecimalFormat dfTable;
	private DecimalFormat df;
	private Regex regex;



	/**
	 * Create the application.
	 * @throws NotBoundException 
	 * @throws RemoteException 
	 * @throws MalformedURLException 
	 */


	public FrmQLBH(JFrame fMain) throws MalformedURLException, RemoteException, NotBoundException {
		this.fMain = fMain;
		initialize(fMain);
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws NotBoundException 
	 * @throws RemoteException 
	 * @throws MalformedURLException 
	 */
	@SuppressWarnings("deprecation")
	public void initialize(JFrame fMain) throws MalformedURLException, RemoteException, NotBoundException {

//		cthdDao =  (CTHDDao) Naming.lookup("rmi://192.168.1.9:9999/cthdDao");
//		hoaDonDao =  (HoaDonDao) Naming.lookup("rmi://192.168.1.9:9999/hoaDonDao");
//		khachHangDao = (KhachHangDao) Naming.lookup("rmi://192.168.1.9:9999/khachHangDao");
//		loaiThuocDao =  (LoaiThuocDao) Naming.lookup("rmi://192.168.1.9:9999/loaiThuocDao");
//		NCCDao =  (NhaCungCapDao) Naming.lookup("rmi://192.168.1.9:9999/nhaCungCapDao");
//		nhanVienDao =  (NhanVienDao) Naming.lookup("rmi://192.168.1.9:9999/nhanVienDao");
//		nuocSXDao =  (NuocSXDao) Naming.lookup("rmi://192.168.1.9:9999/nuocSXDao");
//		tkDao =  (TaiKhoanDao) Naming.lookup("rmi://192.168.1.9:9999/taiKhoanDao");
//		thuocDao =  (ThuocDao) Naming.lookup("rmi://192.168.1.9:9999/thuocDao");
//		regex  = new Regex();
		
	


		
		cthdDao =  (CTHDDao) Naming.lookup("rmi://192.168.1.8:9999/cthdDao");
		hoaDonDao =  (HoaDonDao) Naming.lookup("rmi://192.168.1.8:9999/hoaDonDao");
	    khachHangDao = (KhachHangDao) Naming.lookup("rmi://192.168.1.8:9999/khachHangDao");
		loaiThuocDao =  (LoaiThuocDao) Naming.lookup("rmi://192.168.1.8:9999/loaiThuocDao");
		 NCCDao =  (NhaCungCapDao) Naming.lookup("rmi://192.168.1.8:9999/nhaCungCapDao");
		 nhanVienDao =  (NhanVienDao) Naming.lookup("rmi://192.168.1.8:9999/nhanVienDao");
		 nuocSXDao =  (NuocSXDao) Naming.lookup("rmi://192.168.1.8:9999/nuocSXDao");
		 tkDao =  (TaiKhoanDao) Naming.lookup("rmi://192.168.1.8:9999/taiKhoanDao");
		 thuocDao =  (ThuocDao) Naming.lookup("rmi://192.168.1.8:9999/thuocDao");
		 regex  = new Regex();
	
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

		btnTim = new JButton("Tìm");
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
		lblSDT.setBounds(10, 75, 133, 20);
		pKH.add(lblSDT);

		txtSDT = new JTextField();
		txtSDT.setFont(new Font("SansSerif", Font.PLAIN, 15));
		txtSDT.setColumns(10);
		txtSDT.setBounds(139, 70, 158, 31);
		txtSDT.setBorder(new LineBorder(new Color(91, 155, 213)));
		pKH.add(txtSDT);

		cboGioiTinh = new JComboBox<String>();
		cboGioiTinh.setEditable(true);
		cboGioiTinh.setBackground(Color.WHITE);
		cboGioiTinh.setFont(new Font("SansSerif", Font.PLAIN, 15));
		cboGioiTinh.setBounds(434, 70, 193, 31);
		cboGioiTinh.setBorder(new LineBorder(new Color(91, 155, 213)));
		pKH.add(cboGioiTinh);

		cboGioiTinh.addItem("Nam");
		cboGioiTinh.addItem("Nữ");



		JLabel lblGioiTinh = new JLabel("Giới tính:");
		lblGioiTinh.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblGioiTinh.setBounds(324, 78, 100, 20);
		pKH.add(lblGioiTinh);

		JLabel lblNgaySinh = new JLabel("Ngày sinh:");
		lblNgaySinh.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNgaySinh.setBounds(324, 28, 93, 20);
		pKH.add(lblNgaySinh);

		btnThemKH = new JButton("Thêm");
		btnThemKH.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnThemKH.setBounds(10, 165, 287, 34);
		btnThemKH.setBackground(new Color(41, 242, 255));
		pKH.add(btnThemKH);

		btnLamMoiKH = new JButton("Làm mới");
		btnLamMoiKH.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnLamMoiKH.setBackground(new Color(41, 242, 255));
		btnLamMoiKH.setBounds(324, 165, 303, 34);
		pKH.add(btnLamMoiKH);

		chooserNgaySinh = new JDateChooser();
		chooserNgaySinh.getCalendarButton().setFont(new Font("SansSerif", Font.PLAIN, 15));
		chooserNgaySinh.setBounds(434, 23, 193, 32);
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

		cboLoaiThuoc = new JComboBox<String>();
		cboLoaiThuoc.setBackground(Color.WHITE);
		cboLoaiThuoc.setFont(new Font("SansSerif", Font.PLAIN, 15));
		cboLoaiThuoc.setBounds(118, 24, 202, 31);
		cboLoaiThuoc.setBorder(new LineBorder(new Color(91, 155, 213)));
		pThuoc.add(cboLoaiThuoc);

		JLabel lblTenThuoc = new JLabel("Tên thuốc");
		lblTenThuoc.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblTenThuoc.setBounds(30, 65, 133, 20);
		pThuoc.add(lblTenThuoc);

		cboTenThuoc = new JComboBox<String>();
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

		rdoGiamSL = new JRadioButton("Giảm số lượng");
		rdoGiamSL.setBackground(new Color(222,240,250));
		rdoGiamSL.setFont(new Font("SansSerif", Font.BOLD, 15));
		rdoGiamSL.setBounds(118, 134, 142, 23);
		pThuoc.add(rdoGiamSL);

		btnThemThuoc = new JButton("Thêm thuốc");
		btnThemThuoc.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnThemThuoc.setBounds(30, 164, 133, 34);
		btnThemThuoc.setBackground(new Color(41, 242, 255));
		pThuoc.add(btnThemThuoc);

		btnXoaThuoc = new JButton("Xóa thuốc");
		btnXoaThuoc.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnXoaThuoc.setBackground(new Color(41, 242, 255));
		btnXoaThuoc.setBounds(187, 164, 133, 34);
		pThuoc.add(btnXoaThuoc);


		String col [] = {"STT","Tên thuốc", "Loại thuốc", "Số lượng", "Đơn giá","Tổng tiền"};
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

		tblThuoc.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
		tblThuoc.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
		tblThuoc.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);

		JScrollPane spMatHang = new JScrollPane(tblThuoc);
		spMatHang.setViewportBorder(null);
		spMatHang.setBounds(10, 292, 997, 328);
		spMatHang.setBorder(new LineBorder(new Color(91, 155, 213), 1, true));
		spMatHang.setBackground(Color.white);
		pMain.add(spMatHang);

		btnLamMoiGD = new JButton("Làm mới");
		btnLamMoiGD.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnLamMoiGD.setBackground(new Color(41, 242, 255));
		btnLamMoiGD.setBounds(238, 655, 209, 34);
		pMain.add(btnLamMoiGD);

		JLabel lblSubThanhTien = new JLabel("Thành tiền:");
		lblSubThanhTien.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblSubThanhTien.setBounds(733, 624, 101, 20);
		pMain.add(lblSubThanhTien);

		lblThanhTien = new JLabel("123 VNĐ");
		lblThanhTien.setForeground(new Color(255, 0, 0));
		lblThanhTien.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblThanhTien.setBounds(840, 624, 167, 20);
		pMain.add(lblThanhTien);

		btnThanhToan = new JButton("Thanh toán");
		btnThanhToan.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnThanhToan.setBackground(new Color(41, 242, 255));
		btnThanhToan.setBounds(733, 655, 274, 34);
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


		

		//ngày mặc định cho chooser
		LocalDate d = LocalDate.now();
		now = new Date(d.getYear()-1900,d.getMonthValue()-1,d.getDayOfMonth());
		chooserNgaySinh.setDate(now);

		//Load loại thuốc
		List<LoaiThuoc> lsLoaiThuoc = loaiThuocDao.getAllLoaiThuoc();
		for(LoaiThuoc lt : lsLoaiThuoc) {
			cboLoaiThuoc.addItem(lt.getTenLoai());
		}
		
		//Load tên thuốc
		String s = cboLoaiThuoc.getSelectedItem().toString();
		LoaiThuoc itemLT = null;
		List<Thuoc> dsThuoc = null;
		try {
			itemLT = loaiThuocDao.getLoaiThuocTheoTen(s);
			dsThuoc = thuocDao.getThuocTheoMaLoai(itemLT.getId());
		} catch (RemoteException e1) {
			e1.printStackTrace();
		}
		cboTenThuoc.removeAllItems();
		
		//Load ds Thuốc
		for (Thuoc t : dsThuoc)
		{

			cboTenThuoc.addItem(t.getTenThuoc());
		}
		
		dfTable = new DecimalFormat("###,###");
		df = new DecimalFormat("###,### VNĐ");


		//action
		btnDSKH.addActionListener(this);
		btnLamMoiKH.addActionListener(this);
		btnThemKH.addActionListener(this);
		btnThemThuoc.addActionListener(this);
		btnXoaThuoc.addActionListener(this);
		rdoGiamSL.addActionListener(this);
		btnLamMoiGD.addActionListener(this);

		cboLoaiThuoc.addItemListener(this);
		
		tblThuoc.addMouseListener(this);
		
		txtTenKH.setText("Phan Huu Trong");
		txtSDT.setText("0363435019");
		

	}


	public void loadFrmDSKH() {
		FrmDSKH frmKH = new FrmDSKH(fMain);
		frmKH.setVisible(true);

		fMain.setVisible(false);


	}

	
	public void resetKH() {
		txtTenKH.setText("");
		txtSDT.setText("");
		cboGioiTinh.setSelectedIndex(0);
		chooserNgaySinh.setDate(now);
	}
	
	public void resetAll() {
		resetKH();
		txtTimKiem.setText("");
		cboLoaiThuoc.setSelectedIndex(0);
		rdoGiamSL.setSelected(false);
		txtSoLuong.setText("");
		clearTable();
		lblThanhTien.setText("");
	}


	public int timRow() {
			int row = tblThuoc.getRowCount();
			for(int i=0;i<row;i++) {
				if(modelThuoc.getValueAt(i, 2).toString().equalsIgnoreCase(cboLoaiThuoc.getSelectedItem().toString())&&modelThuoc.getValueAt(i,1).toString().equalsIgnoreCase(cboTenThuoc.getSelectedItem().toString()))
				{
					return i;

				}
			}
			return -1;
	}
	
	public void clearTable() {
		while (tblThuoc.getRowCount() > 0) {
			modelThuoc.removeRow(0);
		}
	}
	
	public int getSTT() {
		
		return tblThuoc.getRowCount()+1;
	}
	
	public void addToTable(Thuoc thuoc) {
		modelThuoc.addRow(new Object[] {
				getSTT(),thuoc.getTenThuoc(), thuoc.getLoaiThuoc().getTenLoai(),thuoc.getSoLuongTon(),dfTable.format(thuoc.getDonGia()), dfTable.format(thuoc.getSoLuongTon()*thuoc.getDonGia())
		});
	}
	
	public int getSoLuongThem() {
		int soLuong = 0;
		if(timRow()!=-1) {
			soLuong = Integer.parseInt(txtSoLuong.getText()) +  Integer.parseInt(modelThuoc.getValueAt(timRow(),3).toString());
		}
		else soLuong = Integer.parseInt(txtSoLuong.getText());
		return soLuong;
	}
	
	public int getSoLuongGiam() {
		int soLuong = 0;
		if(rdoGiamSL.isSelected()) {
			if(timRow()!=-1) {
				soLuong = - Integer.parseInt(txtSoLuong.getText()) +  Integer.parseInt(modelThuoc.getValueAt(timRow(),3).toString());
			}
			
		}
		return soLuong;
	}
	
	
	
	public void themKH() throws RemoteException {
		String tenKH = txtTenKH.getText();
		String  sdt = txtSDT.getText();
		Date ngaySinh = chooserNgaySinh.getDate();
		String gioiTinh  = cboGioiTinh.getSelectedItem().toString();
		
		KhachHang kh = new KhachHang(tenKH, gioiTinh, ngaySinh, sdt);
		KhachHang khTim = khachHangDao.getKHTheoSDT(sdt);
		if(ktRongKH()) {
			if(ktThongTinKH()) {
				if(khTim == null) {
					if(khachHangDao.addKhachHang(kh)) {
						JOptionPane.showMessageDialog(this, "Thêm khách hàng thành công");
					}
				}else JOptionPane.showMessageDialog(this, "Số điện thoại đã được đăng ký");
			}
		}
	}
	
	public void themThuoc() throws RemoteException {
		
		if(ktThongTinThuoc()) {
			String tenLoaiThuoc = cboLoaiThuoc.getSelectedItem().toString();
			String tenThuoc = cboTenThuoc.getSelectedItem().toString();
			
			LoaiThuoc loaiThuoc = loaiThuocDao.getLoaiThuocTheoTen(tenLoaiThuoc);
			Thuoc t = thuocDao.getThuocTheoTenVaMaLoai(tenThuoc, loaiThuoc.getId());
			int soLuongTon = t.getSoLuongTon();
			int soLuongMua = 0;
			t.setLoaiThuoc(loaiThuoc);
			if(!rdoGiamSL.isSelected())
				soLuongMua = getSoLuongThem();
			else
				soLuongMua =  getSoLuongGiam();
			if(soLuongTon >= soLuongMua) {
				if(timRow()!=-1) {
					modelThuoc.removeRow(timRow());
				}
				addToTable(t);
				double thanhTien = tinhThanhTien();
				lblThanhTien.setText(df.format(thanhTien));
			}
			else JOptionPane.showMessageDialog(this, "Số lượng tồn không đủ!\nSố lượng còn: "+ soLuongTon);
		}
		
		
	}
	
	public void removeThuoc() {
		int row = tblThuoc.getSelectedRow();
		if(row>=0) {
			modelThuoc.removeRow(timRow());
		}
		else JOptionPane.showMessageDialog(this, "Vui lòng chọn thuốc cần xóa");
	}
	
	public double tinhThanhTien() {
		int soRow = tblThuoc.getRowCount();
		double thanhTien = 0;
		for(int i = 0; i< soRow; i++) {
			try {
				double tongTien = Double.parseDouble(dfTable.parse(modelThuoc.getValueAt(i, 5).toString()).toString()) ;
				thanhTien += tongTien;
			} catch (ParseException e) {
				e.printStackTrace();
			} 
		}
		return thanhTien;
	}
	
	public boolean ktRongKH() {
		if(!regex.kiemTraRong(txtTenKH))
			return false;
		if(!regex.kiemTraRong(txtSDT))
			return false;
		return true;
	}
	public boolean ktThongTinKH() {
		if(ktRongKH()) {
			if(!regex.RegexTen(txtTenKH))
				return false;
			if(!regex.RegexSDT(txtSDT))
				return false;
			if(!regex.kiemTraNgaySinh(chooserNgaySinh))
				return false;
			
			
			return true;
		}
		return false;
	}
	public boolean ktThongTinThuoc() {
		
		if(regex.regexSoLuong(txtSoLuong))
		{
			int soLuong = Integer.parseInt(txtSoLuong.getText());
			if(soLuong > 0) {
				return true;
			}
			else JOptionPane.showMessageDialog(this, "Số lượng phải lớn hơn 0");
		}
		return false;
	}
	
	
	


	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o.equals(btnDSKH)) {
			loadFrmDSKH();
		}
		if(o.equals(btnLamMoiKH)) {
			resetKH();
		}
		if(o.equals(btnThemKH)) {
			try {
				themKH();
			} catch (RemoteException e1) {
				e1.printStackTrace();
			}
		}
		if(rdoGiamSL.isSelected()) {
			btnThemThuoc.setText("Giảm thuốc");
		}
		else btnThemThuoc.setText("Thêm thuốc");
		if(o.equals(btnThemThuoc)) {
			try {
				themThuoc();
			} catch (RemoteException e1) {
				e1.printStackTrace();
			}
		}
		if(o.equals(btnXoaThuoc)) {
			removeThuoc();
		}
		if(o.equals(btnLamMoiGD)) {
			resetAll();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int row = tblThuoc.getSelectedRow();
		cboLoaiThuoc.setSelectedItem(modelThuoc.getValueAt(row, 2));
		cboTenThuoc.setSelectedItem(modelThuoc.getValueAt(row, 1));
		txtSoLuong.setText(modelThuoc.getValueAt(row, 3).toString());
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
	public void itemStateChanged(ItemEvent e) {
		if(e.getItem() == cboLoaiThuoc.getSelectedItem()) {
			String s = cboLoaiThuoc.getSelectedItem().toString();
			LoaiThuoc lt = null;
			List<Thuoc> dsThuoc = null;
			try {
				lt = loaiThuocDao.getLoaiThuocTheoTen(s);
				dsThuoc = thuocDao.getThuocTheoMaLoai(lt.getId());
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			cboTenThuoc.removeAllItems();
			for (Thuoc t : dsThuoc)
			{

				cboTenThuoc.addItem(t.getTenThuoc());
			}
		}
	}
}
