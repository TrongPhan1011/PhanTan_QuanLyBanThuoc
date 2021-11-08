package app;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class FrmDSKH extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTable table_1;

	

	/**
	 * Create the frame.
	 */
	public FrmDSKH() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1012, 672);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		lblTieude.setBounds(10, 27, 353, 48);
		panel_1.add(lblTieude);
		
		JLabel lblTim = new JLabel("Tìm kiếm:");
		lblTim.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblTim.setBounds(475, 63, 75, 28);
		panel_1.add(lblTim);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		textField.setBounds(573, 63, 264, 33);
		panel_1.add(textField);
		
		JButton btntim = new JButton("Tìm");
		btntim.setFont(new Font("Tahoma", Font.BOLD, 15));
		btntim.setBackground(new Color(41, 242, 255));
		btntim.setBounds(871, 61, 108, 33);
		panel_1.add(btntim);
		
		JLabel lblbang1 = new JLabel("Danh sách khách hàng");
		lblbang1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblbang1.setBounds(385, 101, 170, 39);
		panel_1.add(lblbang1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 150, 969, 178);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 kh\u00E1ch h\u00E0ng", "T\u00EAn kh\u00E1ch h\u00E0ng", "Ng\u00E0y sinh", "Gi\u1EDBi t\u00EDnh", "S\u0110T", "\u0110\u1ECBa ch\u1EC9"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblbang2_1 = new JLabel("Thuốc đã mua");
		lblbang2_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblbang2_1.setBounds(407, 338, 112, 20);
		panel_1.add(lblbang2_1);
		
		JLabel lblbang2_2 = new JLabel("Số lượng thuốc đã mua");
		lblbang2_2.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblbang2_2.setBounds(371, 368, 198, 39);
		panel_1.add(lblbang2_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 420, 969, 214);
		panel_1.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"T\u00EAn thu\u1ED1c", "Lo\u1EA1i thu\u1ED1c", "Nh\u00E0 s\u1EA3n xu\u1EA5t", "S\u1ED1 l\u01B0\u1EE3ng", "\u0110\u01A1n gi\u00E1", "T\u1ED5ng ti\u1EC1n"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JLabel jlbbg = new JLabel("");
		jlbbg.setIcon(new ImageIcon("data\\img\\bg.png"));
		jlbbg.setBounds(0, -22, 1003, 683);
		panel_1.add(jlbbg);
	}
}
