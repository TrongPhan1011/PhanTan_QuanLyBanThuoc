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

public class FrmDangNhap extends JFrame {

	private JFrame frmHThngQun;
	private JTextField jtftendangnhap;
	private JTextField jtfmatkhau;

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
		
		JLabel jlbhethong = new JLabel("");
		jlbhethong.setIcon(new ImageIcon("C:\\Users\\Tai\\eclipse-workspace\\HeThongQuanLyThuoc\\img\\tieude2.png"));
		jlbhethong.setFont(new Font("Source Code Pro ExtraLight", Font.PLAIN, 24));
		jlbhethong.setBounds(30, 11, 325, 91);
		panel_1.add(jlbhethong);
		
		JLabel jlbdangnhap = new JLabel("Đăng nhập");
		jlbdangnhap.setFont(new Font("Tahoma", Font.PLAIN, 25));
		jlbdangnhap.setBounds(449, 31, 131, 31);
		panel_1.add(jlbdangnhap);
		
		JLabel jlbtendangnhap = new JLabel("Tên đăng nhập");
		jlbtendangnhap.setFont(new Font("Tahoma", Font.PLAIN, 13));
		jlbtendangnhap.setBounds(405, 103, 93, 24);
		panel_1.add(jlbtendangnhap);
		
		JLabel jlbmatkhau = new JLabel("Mật khẩu");
		jlbmatkhau.setFont(new Font("Tahoma", Font.PLAIN, 13));
		jlbmatkhau.setBounds(406, 164, 61, 21);
		panel_1.add(jlbmatkhau);
		
		jtftendangnhap = new JTextField();
		jtftendangnhap.setBounds(499, 101, 125, 31);
		jtftendangnhap.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
       
		panel_1.add(jtftendangnhap);
		jtftendangnhap.setColumns(10);
		
		jtfmatkhau = new JTextField();
		jtfmatkhau.setBounds(499, 160, 125, 31);
		panel_1.add(jtfmatkhau);
		jtfmatkhau.setColumns(10);
		jtfmatkhau.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
		
		JButton jbdangnhap = new JButton("Đăng nhập");
		jbdangnhap.setForeground(new Color(255, 255, 255));
		jbdangnhap.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbdangnhap.setBackground(new Color(0, 153, 255));
		jbdangnhap.setBounds(474, 228, 117, 31);
		
		panel_1.add(jbdangnhap);
		
		JButton jbthoat = new JButton("Thoát");
		jbthoat.setForeground(new Color(255, 255, 255));
		jbthoat.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbthoat.setBackground(new Color(0, 153, 255));
		jbthoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbthoat.setBounds(475, 278, 116, 31);
		panel_1.add(jbthoat);
		
		JLabel jlbbg = new JLabel("");
		jlbbg.setIcon(new ImageIcon("C:\\Users\\Tai\\eclipse-workspace\\HeThongQuanLyThuoc\\img\\bg3.jpg"));
		jlbbg.setBounds(0, 0, 400, 361);
		panel_1.add(jlbbg);
		
	
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
