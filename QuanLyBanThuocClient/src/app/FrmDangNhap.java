package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class FrmDangNhap extends JFrame {

	private JFrame frmHThngQun;
	private JTextField txttendangnhap;
	private JTextField txtmatkhau;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
					FrmDangNhap window = new FrmDangNhap();
					window.frmHThngQun.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmDangNhap() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHThngQun = new JFrame();
		frmHThngQun.setResizable(false);
		frmHThngQun.setTitle("Hệ thống quản lý nhà thuốc");
		frmHThngQun.setBounds(100, 100, 650, 391);
		frmHThngQun.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmHThngQun.getContentPane().add(panel, BorderLayout.CENTER);
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
		
		txtmatkhau = new JTextField();
		txtmatkhau.setBounds(509, 160, 125, 31);
		panel_1.add(txtmatkhau);
		txtmatkhau.setColumns(10);
		txtmatkhau.setBorder(new LineBorder(new Color(91, 155, 213)));
		
		JButton btndangnhap = new JButton("Đăng nhập");
		btndangnhap.setForeground(new Color(255, 255, 255));
		btndangnhap.setFont(new Font("SansSerif", Font.BOLD, 15));
		btndangnhap.setBackground(new Color(0, 153, 255));
		btndangnhap.setBounds(474, 228, 117, 31);
		
		panel_1.add(btndangnhap);
		
		JButton btnthoat = new JButton("Thoát");
		btnthoat.setForeground(new Color(255, 255, 255));
		btnthoat.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnthoat.setBackground(new Color(0, 153, 255));
		btnthoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnthoat.setBounds(475, 278, 116, 31);
		panel_1.add(btnthoat);
		
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
}
