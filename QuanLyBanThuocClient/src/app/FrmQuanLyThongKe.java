package app;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import com.toedter.calendar.JDateChooser;

import dao.HoaDonDao;
import entity.CTHD;
import entity.HoaDon;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

public class FrmQuanLyThongKe extends JPanel implements ActionListener,MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8036228643460468738L;
	private JFrame frame;
	private HoaDonDao hoaDonDao;
	private Date now;
	private JButton btnThuoc;
	private JButton btnDoanhThu;
	private JButton btnLamMoi;
	private JDateChooser chooserNgayDen;
	private JButton btnThongKe;
	private JDateChooser chooserNgayBatDau;
	private DecimalFormat df;
	private SimpleDateFormat sf;
	private JPanel pBieuDo;
	private JLabel lblNgayTK;


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
	@SuppressWarnings("deprecation")
	private void initialize() throws MalformedURLException, RemoteException, NotBoundException {
		
		String ip ="";
		try {
			ip = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		}
		 
		hoaDonDao =  (HoaDonDao) Naming.lookup("rmi://"+ip+":9999/hoaDonDao");
	
		
		frame = new JFrame();
		frame.setBounds(0, 0, 1031, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		JPanel pMain = new JPanel();
		pMain.setBackground(Color.WHITE);
		pMain.setBounds(0, 25, 1031, 675);
		add(pMain);
		pMain.setLayout(null);
		
		JLabel lblQLTK = new JLabel("Qu???n l?? th???ng k??");
		lblQLTK.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblQLTK.setBounds(10, 11, 221, 33);
		pMain.add(lblQLTK);
		
		JLabel lblNgay = new JLabel("Th???i gian th???ng k??:");
		lblNgay.setFont(new Font("SansSerif", Font.BOLD, 17));
		lblNgay.setBounds(450, 11, 204, 33);
		pMain.add(lblNgay);
		
		lblNgayTK = new JLabel("");
		lblNgayTK.setForeground(Color.RED);
		lblNgayTK.setFont(lblNgayTK.getFont().deriveFont(lblNgayTK.getFont().getStyle() | Font.BOLD | Font.ITALIC, 17f));
		lblNgayTK.setBounds(628, 11, 294, 33);
		pMain.add(lblNgayTK);
		JPanel pThongTinTK = new JPanel();
		
		pThongTinTK.setBorder(new TitledBorder(new LineBorder(new Color(91, 155, 213), 2), "Ch???n th???i gian", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pThongTinTK.setBackground(Color.WHITE);
		pThongTinTK.setBounds(10, 46, 480, 106);
		pMain.add(pThongTinTK);
		
		chooserNgayBatDau = new JDateChooser();
		chooserNgayBatDau.getCalendarButton().setFont(new Font("SansSerif", Font.PLAIN, 15));
		chooserNgayBatDau.setBounds(65, 18, 154, 32);
		pThongTinTK.add(chooserNgayBatDau);
		chooserNgayBatDau.setBorder(BorderFactory.createLineBorder(new Color(91, 155, 213)));
		chooserNgayBatDau.setDateFormatString("dd/MM/yyyy");
		chooserNgayBatDau.setFont(new Font("SansSerif",Font.PLAIN, 15));
		
		pThongTinTK.setLayout(null);
		
		JLabel lblSubNgay = new JLabel("T???:");
		lblSubNgay.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblSubNgay.setBounds(10, 18, 67, 32);
		pThongTinTK.add(lblSubNgay);
		
		 btnThongKe = new JButton("Th???ng k??");
		 btnThongKe.setToolTipText("Th???ng k??");
		btnThongKe.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnThongKe.setBackground(new Color(41, 242, 255));
		btnThongKe.setBounds(261, 18, 209, 34);
		pThongTinTK.add(btnThongKe);
		
		JLabel lbln = new JLabel("?????n:");
		lbln.setFont(new Font("SansSerif", Font.BOLD, 15));
		lbln.setBounds(10, 63, 67, 32);
		pThongTinTK.add(lbln);
		
		 chooserNgayDen = new JDateChooser();
		chooserNgayDen.getCalendarButton().setFont(new Font("SansSerif", Font.PLAIN, 15));
		chooserNgayDen.setBounds(66, 63, 154, 32);
		pThongTinTK.add(chooserNgayDen);
		chooserNgayDen.setBorder(BorderFactory.createLineBorder(new Color(91, 155, 213)));
		chooserNgayDen.setDateFormatString("dd/MM/yyyy");
		chooserNgayDen.setFont(new Font("SansSerif",Font.PLAIN, 15));
		
		btnLamMoi = new JButton("L??m m???i");
		btnLamMoi.setToolTipText("L??m m???i giao di???n");
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
		
		btnDoanhThu = new JButton("");
		btnDoanhThu.setToolTipText("Th???ng k?? doanh thu");
		btnDoanhThu.setBackground(Color.WHITE);
		btnDoanhThu.setFont(new Font("SansSerif", Font.BOLD, 16));
		btnDoanhThu.setBounds(88, 11, 151, 53);
		pDoanhThu.add(btnDoanhThu);
		
		JLabel lblSubDoanhThu = new JLabel("Th???ng k?? doanh thu");
		lblSubDoanhThu.setFont(new Font("SansSerif", Font.ITALIC, 12));
		lblSubDoanhThu.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubDoanhThu.setBounds(88, 72, 151, 14);
		lblSubDoanhThu.setForeground(new Color(91, 155, 213));
		pDoanhThu.add(lblSubDoanhThu);
		
		JLabel lblICDoanhThu = new JLabel("");
		lblICDoanhThu.setBounds(10, 11, 76, 53);
		pDoanhThu.add(lblICDoanhThu);
		
		JPanel pThuoc = new JPanel();
		pThuoc.setLayout(null);
		pThuoc.setBorder(new LineBorder(new Color(91, 155, 213), 2));
		pThuoc.setBackground(Color.WHITE);
		pThuoc.setBounds(759, 53, 249, 97);
		pMain.add(pThuoc);
		
		btnThuoc = new JButton("");
		btnThuoc.setToolTipText("Th???ng k?? thu???c ???? b??n ");
		btnThuoc.setFont(new Font("SansSerif", Font.BOLD, 16));
		btnThuoc.setBackground(Color.WHITE);
		btnThuoc.setBounds(88, 11, 151, 53);
		pThuoc.add(btnThuoc);
		
		JLabel lblSubThuoc = new JLabel("Th???ng k?? thu???c ???? b??n");
		lblSubThuoc.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubThuoc.setFont(new Font("SansSerif", Font.ITALIC, 12));
		lblSubThuoc.setBounds(88, 72, 151, 14);
		lblSubThuoc.setForeground(new Color(91, 155, 213));
		pThuoc.add(lblSubThuoc);
		
		JLabel lblICDSL = new JLabel("");
		lblICDSL.setBounds(10, 11, 76, 53);
		pThuoc.add(lblICDSL);
		
		pBieuDo = new JPanel();
		pBieuDo.setToolTipText("Bi???u ????? th???ng k??");
		pBieuDo.setLayout(null);
		pBieuDo.setBorder(new TitledBorder(new LineBorder(new Color(91, 155, 213), 2), "Bi\u1EC3u \u0111\u1ED3 th\u1ED1ng k\u00EA", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pBieuDo.setBackground(Color.WHITE);
		pBieuDo.setBounds(10, 163, 998, 466);
		pMain.add(pBieuDo);
		
		JLabel lblTenBieuDo = new JLabel("Bi???u ????? th???ng k??");
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
		
		IconFontSwing.register(FontAwesome.getIconFont());
		Icon icSL = IconFontSwing.buildIcon(FontAwesome.MEDKIT, 70, Color.orange);
		Icon icNgay = IconFontSwing.buildIcon(FontAwesome.CALENDAR, 20, new Color(91, 155, 213));
		Icon icLamMoi = IconFontSwing.buildIcon(FontAwesome.REFRESH, 20, Color.blue);
		Icon icMoney = IconFontSwing.buildIcon(FontAwesome.MONEY, 70, new Color(0, 176, 80));
		Icon icBarchar = IconFontSwing.buildIcon(FontAwesome.BAR_CHART, 25, new Color(0, 176, 80));
		
		chooserNgayBatDau.setIcon((ImageIcon) icNgay);
		chooserNgayDen.setIcon((ImageIcon) icNgay);
		btnLamMoi.setIcon(icLamMoi);
		btnThongKe.setIcon(icBarchar);
		lblICDoanhThu.setIcon(icMoney);
		lblICDSL.setIcon(icSL);
		
		
		df = new DecimalFormat("###,### VN??");
		sf = new SimpleDateFormat("dd/MM/yyy");

		
		btnThongKe.addActionListener(this);
		btnLamMoi.addActionListener(this);
		btnDoanhThu.addActionListener(this);
		btnThuoc.addActionListener(this);
		
		
	}
	
	public void loadThongKe() throws RemoteException {
		Date ngayden = chooserNgayBatDau.getDate();
		Date ngayKT = chooserNgayDen.getDate();
		if(ngayden.compareTo(ngayKT) <= 0) {
			loadbtn(getDSHD());
			
			lblNgayTK.setText(sf.format(ngayden)+" - "+sf.format(ngayKT));
			
		}
		else JOptionPane.showMessageDialog(this, "Ng??y b???t ?????u ph???i nh??? h??n ng??y k???t th??c!");
		
	}
	
	public void addChart() throws RemoteException {
		if(!lblNgayTK.getText().equalsIgnoreCase("")) {
			pBieuDo.removeAll();
			pBieuDo.revalidate();
			pBieuDo.repaint();
			ChartPanel chartPanel = new ChartPanel(createChart());
			chartPanel.setLocation(10, 22);
			chartPanel.setSize(978, 433);
	        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
	        pBieuDo.add(chartPanel);
	 	}else JOptionPane.showMessageDialog(this, "Vui l??ng th???ng k?? tr?????c khi xem bi???u ?????");
	}
	
	public  JFreeChart createChart() throws RemoteException {
        JFreeChart barChart = ChartFactory.createBarChart(
                "Bi???u ????? th???ng k?? doanh thu",
                "Ng??y", "T???ng ti???n",
                createDataset(), PlotOrientation.VERTICAL, false, false, false);
        return barChart;
    }
	
	 public CategoryDataset createDataset() throws RemoteException {
	        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	        
	        Date ngayden = chooserNgayBatDau.getDate();
			Date ngayKT = chooserNgayDen.getDate();
			long noDay = (ngayKT.getTime() - ngayden.getTime()) / (24 * 3600 * 1000);
			for(int i = 0;i<=noDay;i++) {
				List<HoaDon> ls = hoaDonDao.getHoaDonTheo1Ngay(ngayden);
				double tongtien =0;
				for(HoaDon hd : ls) {
					if(hd != null) {
						List<CTHD> lsCT = hd.getDsCTHD();
						for(CTHD ct : lsCT) {
							tongtien += ct.getTongTien();
						}
					}
				}
				
				dataset.addValue(tongtien, "S??? ti???n (VN??)", sf.format(ngayden));
				
				Calendar c = Calendar.getInstance();
				c.setTime(ngayden);
				c.add(Calendar.DATE, 1);  
				ngayden = c.getTime();
			}	

	        return dataset;
	}
	 
	 public void addChartThuoc() throws RemoteException {
			 if(!lblNgayTK.getText().equalsIgnoreCase("")) {
				pBieuDo.removeAll();
				pBieuDo.revalidate();
				pBieuDo.repaint();
				ChartPanel chartPanel = new ChartPanel(createChartThuoc());
				chartPanel.setLocation(10, 22);
				chartPanel.setSize(978, 433);
		        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
		        pBieuDo.add(chartPanel);
	        }else JOptionPane.showMessageDialog(this, "Vui l??ng th???ng k?? tr?????c khi xem bi???u ?????");
		}
	 
	 public  JFreeChart createChartThuoc() throws RemoteException {
	        JFreeChart barChart = ChartFactory.createBarChart(
	                "Bi???u ????? th???ng k?? s??? l?????ng thu???c ???? b??n",
	                "Ng??y", "S??? l?????ng thu???c",
	                datasetThuoc(), PlotOrientation.VERTICAL, false, false, false);
	        return barChart;
	    }
	 
	 public CategoryDataset datasetThuoc() throws RemoteException {
	        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	        
	        Date ngayden = chooserNgayBatDau.getDate();
			Date ngayKT = chooserNgayDen.getDate();
			long noDay = (ngayKT.getTime() - ngayden.getTime()) / (24 * 3600 * 1000);
			for(int i = 0;i<=noDay;i++) {
				List<HoaDon> ls = hoaDonDao.getHoaDonTheo1Ngay(ngayden);
				double tong =0;
				for(HoaDon hd : ls) {
					if(hd != null) {
						List<CTHD> lsCT = hd.getDsCTHD();
						for(CTHD ct : lsCT) {
							
							tong += ct.getSoLuong();
						}
					}
				}
				
				dataset.addValue(tong, "S??? l?????ng thu???c", sf.format(ngayden));
				
				Calendar c = Calendar.getInstance();
				c.setTime(ngayden);
				c.add(Calendar.DATE, 1);  
				ngayden = c.getTime();
			}	

	        return dataset;
	}
	
	public void loadbtn(List<HoaDon> ls) {
		
		double tongTien = 0;
		int soThuoc = 0;
		for(HoaDon hd : ls) {
			List<CTHD> lsCT = hd.getDsCTHD();
			for(CTHD ct : lsCT) {
				tongTien += ct.getTongTien();
				soThuoc += ct.getSoLuong();
			}
		}
		btnDoanhThu.setText(df.format(tongTien));
		btnThuoc.setText(soThuoc+"");
	}
	
	
	public List<HoaDon> getDSHD() throws RemoteException{
		Date ngayden = chooserNgayBatDau.getDate();
		Date ngayKT = chooserNgayDen.getDate();
		
		List<HoaDon> ls = hoaDonDao.getHoaDonTheoNgay(ngayden, ngayKT);
		return ls;
	}
	public void resetAll() {
		chooserNgayBatDau.setDate(now);
		chooserNgayDen.setDate(now);
		pBieuDo.removeAll();
		pBieuDo.revalidate();
		pBieuDo.repaint();
		btnDoanhThu.setText("0 VN??");
		btnThuoc.setText("0");
		lblNgayTK.setText("");
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o.equals(btnThongKe))
		{
			try {
				loadThongKe();
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(o.equals(btnDoanhThu)) {
			try {
				addChart();
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(o.equals(btnLamMoi)) {
			resetAll();
		}
		if(o.equals(btnThuoc)) {
			try {
				addChartThuoc();
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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
